package com.ooteco.service.biz;

import com.ooteco.dao.mapper.RepaySplitVOMapper;
import com.ooteco.dao.mapper.ext.RepaySplitExtVOMapper;
import com.ooteco.entity.finance.model.FinanceSplitVO;
import com.ooteco.entity.loan.model.LoanVO;
import com.ooteco.entity.match.model.RepaySplitAllotResult;
import com.ooteco.entity.repay.model.PrepayVO;
import com.ooteco.entity.repay.model.RepaySplitVO;
import com.ooteco.entity.repay.model.RepaySplitVOExample;
import com.ooteco.entity.repay.model.RepayVO;
import com.ooteco.utils.BigDecimalUtils;
import com.ooteco.utils.DateUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service("repaySplitVOServiceBiz")
public class RepaySplitVOServiceBiz {

    @Resource
    private RepaySplitVOMapper repaySplitVOMapper;
    @Resource
    private RepaySplitExtVOMapper repaySplitExtVOMapper;

    public BigDecimal getTodayLimit(){
        return repaySplitExtVOMapper.getTodayLimit();
    }

    public int updateRemainRepaySplitStartDateToToday(){
        RepaySplitVOExample example = new RepaySplitVOExample();
        RepaySplitVOExample.Criteria criteria = example.createCriteria();
        criteria.andIsValidEqualTo(true)
                .andStatusEqualTo(0)
                .andStartDateLessThan(DateUtils.getBeginTime(new Date()));
        RepaySplitVO repaySplit = new RepaySplitVO();
        repaySplit.setStartDate(new Date());
        return repaySplitVOMapper.updateByExampleSelective(repaySplit, example);
    }

    public List<RepaySplitVO> getFinanceSuitableRepays(FinanceSplitVO financeSplit){
        return repaySplitExtVOMapper.getFinanceSuitableRepays(financeSplit.getStartDate(), financeSplit.getExpireDate());
    }

    public List<RepaySplitVO> getAfterAllotRemainSuitableRepays(FinanceSplitVO financeSplit){
        return repaySplitExtVOMapper.getAfterAllotRemainSuitableRepays(financeSplit.getStartDate(), financeSplit.getExpireDate());
    }

    public List<RepaySplitVO> getLessThanFinancePeriodRepays(FinanceSplitVO financeSplit){
        return repaySplitExtVOMapper.getLessThanFinancePeriodRepays(financeSplit.getStartDate(), financeSplit.getExpireDate());
    }

    public int insertOriginalData(RepayVO repay, LoanVO loan){
        RepaySplitVO repaySplit = new RepaySplitVO();
        repaySplit.setLoanRate(loan.getLoanRate());
        repaySplit.setLoanCode(repay.getLoanCode());
        repaySplit.setExpireDate(repay.getRepaymentDate());
        repaySplit.setStartDate(repay.getLoanStartDate());
        repaySplit.setPrincipal(repay.getRealPrincipal());
        repaySplit.setRepayId(repay.getId());
        repaySplit.setUserCode(loan.getUserCode());
        repaySplit.setPeriodsTime(repay.getPeriodsTime());
        repaySplit.setPeriod(DateUtils.getDiffDays(repay.getRepaymentDate(), repay.getLoanStartDate()));
        return insert(repaySplit);
    }

    public int updateOldRepaySplits(String loanCode){
        RepaySplitVO prepareUpdateRecord = new RepaySplitVO();
        RepaySplitVOExample example = new RepaySplitVOExample();
        RepaySplitVOExample.Criteria criteria = example.createCriteria();
        criteria.andLoanCodeEqualTo(loanCode)
                .andIsValidEqualTo(true);
        prepareUpdateRecord.setIsValid(false);
        return repaySplitVOMapper.updateByExampleSelective(prepareUpdateRecord, example);
    }

    public int updatePrepayLoanRecords(PrepayVO prepay){
        RepaySplitVO prepareUpdateRecord = new RepaySplitVO();
        RepaySplitVOExample example = new RepaySplitVOExample();
        RepaySplitVOExample.Criteria criteria = example.createCriteria();
        criteria.andLoanCodeEqualTo(prepay.getLoanCode())
                .andIsValidEqualTo(true);
        prepareUpdateRecord.setProcess(4);
        prepareUpdateRecord.setIsValid(false);
        return repaySplitVOMapper.updateByExampleSelective(prepareUpdateRecord, example);
    }

    @Transactional
    public void updateAfterAllot(RepaySplitAllotResult result, int financePeriod){
        RepaySplitVO repaySplit = result.getRepaySplit();
        BigDecimal allotAmount = result.getAllotAmount();
        BigDecimal principal = repaySplit.getPrincipal();
        int remainAmountCompareResult = principal.compareTo(allotAmount);
        RepaySplitVO prepareUpdateRepaySplit = new RepaySplitVO();
        int remainPeriod = DateUtils.getDiffDays(repaySplit.getStartDate(), repaySplit.getExpireDate()) - financePeriod;
        BigDecimal remainAmount = principal.subtract(allotAmount);
        if(remainAmountCompareResult > 0){
            prepareUpdateRepaySplit.setId(repaySplit.getId());
            prepareUpdateRepaySplit.setPrincipal(remainAmount);
            if(remainPeriod > 0){
                RepaySplitVO allotRemainRepaySplit = new RepaySplitVO();
                BeanUtils.copyProperties(repaySplit,allotRemainRepaySplit);
                allotRemainRepaySplit.setId(null);
                allotRemainRepaySplit.setCreateDate(new Date());
                allotRemainRepaySplit.setStartDate(DateUtils.addDays(repaySplit.getStartDate(), financePeriod));
                allotRemainRepaySplit.setPeriod(DateUtils.getDiffDays(allotRemainRepaySplit.getStartDate(), repaySplit.getExpireDate()));
                allotRemainRepaySplit.setProcess(2);
                allotRemainRepaySplit.setPrincipal(allotAmount);
                allotRemainRepaySplit.setModifyDate(new Date());
                List<RepaySplitVO> samePeriodRepaySplits = getSamePeriodRepaySplits(
                        allotRemainRepaySplit.getRepayId(), allotRemainRepaySplit.getStartDate(), allotRemainRepaySplit.getExpireDate());
                if(samePeriodRepaySplits.size() > 0){
                    RepaySplitVO samePeriodRepaySplit = samePeriodRepaySplits.get(0);
                    RepaySplitVO mergePrincipalRepaySplit = new RepaySplitVO();
                    mergePrincipalRepaySplit.setId(samePeriodRepaySplit.getId());
                    mergePrincipalRepaySplit.setPrincipal(allotRemainRepaySplit.getPrincipal().add(samePeriodRepaySplit.getPrincipal()));
                    repaySplitVOMapper.updateByPrimaryKeySelective(mergePrincipalRepaySplit);
                }else{
                    repaySplitVOMapper.insertSelective(allotRemainRepaySplit);
                }
                prepareUpdateRepaySplit.setProcess(2);
            }
            repaySplitVOMapper.updateByPrimaryKeySelective(prepareUpdateRepaySplit);
        }else if(remainAmountCompareResult == 0){
            prepareUpdateRepaySplit.setId(repaySplit.getId());
            if(remainPeriod > 0){
                prepareUpdateRepaySplit.setStartDate(DateUtils.addDays(repaySplit.getStartDate(),financePeriod));
                prepareUpdateRepaySplit.setPeriod(remainPeriod);
                List<RepaySplitVO> samePeriodRepaySplits = getSamePeriodRepaySplits(
                        repaySplit.getRepayId(), prepareUpdateRepaySplit.getStartDate(), repaySplit.getExpireDate());
                if(samePeriodRepaySplits.size() > 0){
                    RepaySplitVO samePeriodRepaySplit = samePeriodRepaySplits.get(0);
                    RepaySplitVO mergePrincipalRepaySplit = new RepaySplitVO();
                    mergePrincipalRepaySplit.setId(samePeriodRepaySplit.getId());
                    mergePrincipalRepaySplit.setPrincipal(samePeriodRepaySplit.getPrincipal().add(repaySplit.getPrincipal()));
                    repaySplitVOMapper.updateByPrimaryKeySelective(mergePrincipalRepaySplit);
                    prepareUpdateRepaySplit.setIsValid(false);
                }
            }else{
                prepareUpdateRepaySplit.setStatus(1);
            }
            repaySplitVOMapper.updateByPrimaryKeySelective(prepareUpdateRepaySplit);
        }
    }

    public List<RepaySplitVO> getSamePeriodRepaySplits(Long repayId, Date startDate, Date expireDate){
        RepaySplitVOExample example = new RepaySplitVOExample();
        RepaySplitVOExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo(0)
                .andIsValidEqualTo(true)
                .andRepayIdEqualTo(repayId)
                .andStartDateEqualTo(startDate)
                .andExpireDateEqualTo(expireDate);
        return repaySplitVOMapper.selectByExample(example);
    }

    public List<RepaySplitVO> getLastSplitRemainRepaySplit(Long repayId, Date startDate, Date expireDate){
        RepaySplitVOExample example = new RepaySplitVOExample();
        RepaySplitVOExample.Criteria startDateCriteria = example.createCriteria();
        startDateCriteria.andStatusEqualTo(0)
                .andIsValidEqualTo(true)
                .andRepayIdEqualTo(repayId)
                .andStartDateEqualTo(startDate);
        RepaySplitVOExample.Criteria endDateCriteria = example.createCriteria();
        endDateCriteria.andStatusEqualTo(0)
                .andIsValidEqualTo(true)
                .andRepayIdEqualTo(repayId)
                .andStartDateEqualTo(expireDate);
        example.or(endDateCriteria);
        example.setOrderByClause(" start_date");
        return repaySplitVOMapper.selectByExample(example);
    }

    public int updateOldRepaySplitInvalid(List<String> loanCodes){
        RepaySplitVOExample example = new RepaySplitVOExample();
        RepaySplitVOExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo(0)
                .andIsValidEqualTo(true)
                .andLoanCodeIn(loanCodes);
        RepaySplitVO repaySplit = new RepaySplitVO();
        repaySplit.setIsValid(false);
        return repaySplitVOMapper.updateByExampleSelective(repaySplit, example);
    }

    public List<RepaySplitVO> getAll(){
        RepaySplitVOExample example = new RepaySplitVOExample();
        return repaySplitVOMapper.selectByExample(example);
    }

    public int updateById(RepaySplitVO record){
        return repaySplitVOMapper.updateByPrimaryKeySelective(record);
    }

    public int insert(RepaySplitVO repaySplit){
        return repaySplitVOMapper.insertSelective(repaySplit);
    }

    public List<RepaySplitVO> findListByDay(Date beginDate){
        RepaySplitVOExample example = new RepaySplitVOExample();
        RepaySplitVOExample.Criteria criteria = example.createCriteria();
        criteria.andStartDateLessThanOrEqualTo(beginDate);
        criteria.andExpireDateGreaterThanOrEqualTo(beginDate);
        criteria.andIsValidEqualTo(true);
        return repaySplitVOMapper.selectByExample(example);
    }

    public List<RepaySplitVO> findRepaymentDateList(Date date){
        RepaySplitVOExample example = new RepaySplitVOExample();
        RepaySplitVOExample.Criteria criteria = example.createCriteria();
        criteria.andExpireDateEqualTo(date);
        criteria.andIsValidEqualTo(true);
        return repaySplitVOMapper.selectByExample(example);
    }

    public int repaySplitCount(){
        return repaySplitVOMapper.countByExample(new RepaySplitVOExample());
    }

    public Date findMinDate(){
        return repaySplitExtVOMapper.findMinDate();
    }

    public Date findMaxDate(){
        return repaySplitExtVOMapper.findMaxDate();
    }
}
