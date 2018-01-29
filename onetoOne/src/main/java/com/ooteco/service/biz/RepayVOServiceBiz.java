package com.ooteco.service.biz;


import com.ooteco.dao.mapper.LoanVOMapper;
import com.ooteco.dao.mapper.RepayVOMapper;
import com.ooteco.dao.mapper.ext.FinanceDayValueVOExtMapper;
import com.ooteco.dao.mapper.ext.RepayExtVOMapper;
import com.ooteco.entity.loan.model.LoanVO;
import com.ooteco.entity.repay.model.*;
import com.ooteco.utils.Constant;
import com.ooteco.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Service("repayVOServiceBiz")
public class RepayVOServiceBiz {

    @Resource
    private RepayVOMapper repayVOMapper;
    @Resource
    private LoanVOMapper loanVOMapper;
    @Resource
    private RepayExtVOMapper repayExtVOMapper;
    @Resource
    private RepaySplitVOServiceBiz repayVOSplitServiceBiz;
    @Autowired
    FinanceDayValueVOExtMapper financeDayValueVOExtMapper;

    public int updateRealRepayDate(PrepayVO prepay){
        RepayVOExample example = new RepayVOExample();
        RepayVOExample.Criteria criteria = example.createCriteria();
        criteria.andLoanCodeEqualTo(prepay.getLoanCode())
                .andStatusEqualTo(RepayEnum.Status.NORMAL.getValue())
                .andRepaymentDateGreaterThan(prepay.getRepaymentDate());
        RepayVO repay = new RepayVO();
        repay.setStatus(getRepayStatusByPrepayType(prepay.getType()));
        repay.setRealRepaymentDate(prepay.getRepaymentDate());
        return repayVOMapper.updateByExampleSelective(repay, example);
    }

    public int updateOldRepays(String loanCode){
        RepayVOExample example = new RepayVOExample();
        RepayVOExample.Criteria criteria = example.createCriteria();
        criteria.andLoanCodeEqualTo(loanCode)
                .andIsValidEqualTo(true);
        RepayVO repay = new RepayVO();
        repay.setIsValid(false);
        return repayVOMapper.updateByExampleSelective(repay, example);
    }



    @Transactional
    public void batchInsert(List<RepayVO> repays, RepayPlanVO repayPlan){
        LoanVO loan = loanVOMapper.selectByPrimaryKey(repayPlan.getLoanCode());
        BigDecimal remainPrincipal = new BigDecimal(0);
        Date loanStartDate = new Date();
        for(RepayVO repay : repays){
            if(repay.getPeriodsTime().equals(1)){
                if(repay.getLoanStartDate() != null)
                    loanStartDate = repay.getStartDate();
                break;
            }
        }
        for(int i=0;i<repays.size();i++) {
            RepayVO repay = repays.get(i);
            repay.setId(null);
            repay.setLoanCode(repayPlan.getLoanCode());
            repay.setRealRepaymentDate(repay.getRepaymentDate());
            repay.setType(repayPlan.getType());
            repay.setRealPrincipal(repay.getPrincipal());
            repay.setLoanStartDate(loanStartDate);
            if(repayPlan.getType().equals("0")){
                BigDecimal a = repay.getPrincipal().add(repay.getInterest())
                        .multiply(Constant.yearlyDays);
                BigDecimal b = loan.getLoanRate()
                        .multiply(new BigDecimal(DateUtils.getDiffDays(repay.getLoanStartDate(),repay.getRealRepaymentDate())))
                        .add(Constant.yearlyDays);
                BigDecimal principal = a.divide(b, Constant.amountUltimateRoundPrecision, BigDecimal.ROUND_HALF_UP);
                if(i==repays.size()-1){
                    principal = loan.getLoanMoney().subtract(remainPrincipal);
                }
                repay.setRealPrincipal(principal);
                remainPrincipal = remainPrincipal.add(principal);
                insert(repay);
                repayVOSplitServiceBiz.insertOriginalData(repay, loan);
                //更新理财实际剩余额度
                financeDayValueVOExtMapper.addMoney(DateUtils.getBeginTime(repay.getLoanStartDate()),repay.getRepaymentDate(),repay.getRealPrincipal());
            }else{
                insert(repay);
            }
        }
    }

    public int insert(RepayVO repay){
        return repayVOMapper.insertSelective(repay);
    }

    public int delete(List<String> codes){
        RepayVOExample example = new RepayVOExample();
        RepayVOExample.Criteria criteria = example.createCriteria();
        criteria.andLoanCodeIn(codes);
        return repayVOMapper.deleteByExample(example);
    }

    public int updateOldRepayInvalid(List<String> loanCodes){
        RepayVOExample example = new RepayVOExample();
        RepayVOExample.Criteria criteria = example.createCriteria();
        criteria.andLoanCodeIn(loanCodes)
                .andIsValidEqualTo(true)
                .andTypeEqualTo("0");
        RepayVO repay = new RepayVO();
        repay.setIsValid(false);
        return repayVOMapper.updateByExampleSelective(repay, example);
    }


//    public List<RepayVO> getRecordsByDate(Date date){
//        initExample();
//        criteria.andRepayDateEqualTo(date);
//        return repayVOMapper.selectByExample(example);
//    }
//
//    public List<RepayVO> getSpecialLoanRepay(Integer id){
//        initExample();
//        criteria.andLoanIdEqualTo(id+0l);
//        return repayVOMapper.selectByExample(example);
//    }
//
//    private void initExample(){
//        example = new RepayVOExample();
//        criteria = example.createCriteria();
//    }

    private String getRepayStatusByPrepayType(String prepayType){
        if(prepayType.equals("badLoans"))
            return RepayEnum.Status.BAD_DEBT.getValue();
        return RepayEnum.Status.PREPAY.getValue();
    }

    public List<RepayVO> findListByDay(Date beginDate){
        RepayVOExample example = new RepayVOExample();
        RepayVOExample.Criteria criteria = example.createCriteria();
        criteria.andLoanStartDateLessThanOrEqualTo(beginDate);
        criteria.andRepaymentDateGreaterThanOrEqualTo(beginDate);
        criteria.andTypeEqualTo("0");
        criteria.andIsValidEqualTo(true);
        return repayVOMapper.selectByExample(example);
    }

    public List<RepayVO> findRepaymentDateList(Date date){
        RepayVOExample example = new RepayVOExample();
        RepayVOExample.Criteria criteria = example.createCriteria();
        criteria.andRepaymentDateEqualTo(date);
        criteria.andTypeEqualTo("0");
        criteria.andIsValidEqualTo(true);
        return repayVOMapper.selectByExample(example);
    }

    public List<RepayVO> findRepaymentList(Date date,String loanCode){
        RepayVOExample example = new RepayVOExample();
        RepayVOExample.Criteria criteria = example.createCriteria();
        criteria.andRealRepaymentDateEqualTo(date);
        criteria.andIsValidEqualTo(true);
        criteria.andTypeEqualTo("0");
        criteria.andLoanCodeEqualTo(loanCode);
        return repayVOMapper.selectByExample(example);
    }

    public Date findMinDate(){
        return repayExtVOMapper.findMinDate();
    }

    public Date findMaxDate(){
        return repayExtVOMapper.findMaxDate();
    }
}
