package com.ooteco.service.biz;

import com.ooteco.dao.mapper.FinanceVOMapper;
import com.ooteco.dao.mapper.ext.FinanceVOExtMapper;
import com.ooteco.entity.finance.model.FinanceProfitResp;
import com.ooteco.entity.finance.model.FinanceVO;
import com.ooteco.entity.finance.model.FinanceVOExample;
import com.ooteco.entity.finance.model.PreRedemptionVO;
import com.ooteco.utils.BigDecimalUtils;
import com.ooteco.utils.DateUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Service("financeVOServiceBiz")
public class FinanceVOServiceBiz {

    @Resource
    private FinanceVOMapper financeVOMapper;
    @Resource
    private FinanceSplitVOServiceBiz financeSplitVOServiceBiz;
    @Resource
    private FinanceVOExtMapper financeVOExtMapper;

    public int updateRealRedemptionDate(PreRedemptionVO preRedemption){
        FinanceVOExample example = new FinanceVOExample();
        FinanceVOExample.Criteria criteria = example.createCriteria();
        criteria.andFinanceCodeEqualTo(preRedemption.getFinanceCode());
        FinanceVO finance = new FinanceVO();
        finance.setRealRedemptionDate(preRedemption.getRedemptionDate());
        return financeVOMapper.updateByExampleSelective(finance, example);
    }

    public FinanceProfitResp getFinanceProfit(PreRedemptionVO preRedemption){
        FinanceVO finance = getFinance(preRedemption.getFinanceCode());
        if(finance == null) return new FinanceProfitResp();
        int investDays;
        if(preRedemption.getResidueInvestmentHorizon() == 0){
            investDays = finance.getInvestmentHorizon();
        }else{
            investDays = DateUtils.getDiffDays(finance.getFinanceDate(), preRedemption.getRedemptionDate());
        }
        BigDecimal interest = BigDecimalUtils.getInterest(finance.getRealRate(), investDays, finance.getFinanceMoney());
        return new FinanceProfitResp(finance.getFinanceMoney(), interest);
    }

    @Transactional
    public void calculateRedemptionDateAndInsert(FinanceVO finance){
        Date redemptionDate = DateUtils.addDays(finance.getFinanceDate(), finance.getInvestmentHorizon());
        finance.setRedemptionDate(redemptionDate);
        finance.setRealRedemptionDate(redemptionDate);
        finance.setRealRate(finance.getRealRate().divide(new BigDecimal(100)));
        insert(finance);
        financeSplitVOServiceBiz.insertOriginalData(finance);
    }

    public FinanceVO getFinance(String financeCode){
        return financeVOMapper.selectByPrimaryKey(financeCode);
    }

    public int insert(FinanceVO financeVO){
        return financeVOMapper.insertSelective(financeVO);
    }

    public List<FinanceVO> getFinanceByUserCode(String userCode,Date date){
        FinanceVOExample example = new FinanceVOExample();
        FinanceVOExample.Criteria criteria = example.createCriteria();
        criteria.andUserCodeEqualTo(userCode);
        criteria.andFinanceDateEqualTo(date);
        return financeVOMapper.selectByExample(example);
    }

    public List<FinanceVO> selectBySuperUser(String userCode){
        return financeVOExtMapper.selectBySuperUser(userCode);
    }

    public FinanceVO getLastMatchFinance(){
        return financeVOExtMapper.getLastMatchFinance();
    }
}
