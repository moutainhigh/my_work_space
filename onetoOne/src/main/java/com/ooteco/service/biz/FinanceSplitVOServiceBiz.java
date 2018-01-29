package com.ooteco.service.biz;


import com.ooteco.dao.mapper.FinanceSplitVOMapper;
import com.ooteco.entity.finance.model.FinanceSplitVO;
import com.ooteco.entity.finance.model.FinanceSplitVOExample;
import com.ooteco.entity.finance.model.FinanceVO;
import com.ooteco.entity.finance.model.PreRedemptionVO;
import com.ooteco.utils.DateUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("financeSplitVOServiceBiz")
public class FinanceSplitVOServiceBiz {

    @Resource
    private FinanceSplitVOMapper financeSplitVOMapper;

    public int insertOriginalData(FinanceVO finance){
        FinanceSplitVO financeSplit = getFinanceSplit(finance);
        return insert(financeSplit);
    }

    public FinanceSplitVO getFinanceSplit(FinanceVO finance){
        FinanceSplitVO financeSplit = new FinanceSplitVO();
        financeSplit.setExpireDate(finance.getRedemptionDate());
        financeSplit.setAmount(finance.getFinanceMoney());
        financeSplit.setExpireDate(finance.getRedemptionDate());
        financeSplit.setFinanceCode(finance.getFinanceCode());
        financeSplit.setStartDate(finance.getFinanceDate());
        financeSplit.setFinanceProductsId(finance.getFinanceProductsId());
        financeSplit.setPeriod(DateUtils.getDiffDays(finance.getFinanceDate(), finance.getRedemptionDate()));
        financeSplit.setMonthPeriod(finance.getMonthPeriod());
        financeSplit.setRate(finance.getRealRate());
        financeSplit.setUserCode(finance.getUserCode());
        financeSplit.setType(finance.getType());
        return financeSplit;
    }

    public int updateRecordComplete(FinanceSplitVO financeSplit){
        FinanceSplitVO updateRecord = new FinanceSplitVO();
        updateRecord.setId(financeSplit.getId());
        updateRecord.setFinanceCode(financeSplit.getFinanceCode());
        updateRecord.setStartDate(financeSplit.getExpireDate());
        updateRecord.setStatus(1);
        return financeSplitVOMapper.updateByPrimaryKeySelective(updateRecord);
    }

    public int updatePreRedeemRecords(PreRedemptionVO preRedemption){
        FinanceSplitVO prepareUpdateRecord = new FinanceSplitVO();
        FinanceSplitVOExample example = new FinanceSplitVOExample();
        FinanceSplitVOExample.Criteria criteria = example.createCriteria();
        criteria.andFinanceCodeEqualTo(preRedemption.getFinanceCode())
                .andIsValidEqualTo(true);
        prepareUpdateRecord.setProcess(3);
        prepareUpdateRecord.setIsValid(false);
        return financeSplitVOMapper.updateByExampleSelective(prepareUpdateRecord, example);
    }

    public List<FinanceSplitVO> getPrepayLoanFinanceSplits(String loanCode){
        FinanceSplitVOExample example = new FinanceSplitVOExample();
        FinanceSplitVOExample.Criteria criteria = example.createCriteria();
        criteria.andIsValidEqualTo(true)
                .andPrepayLoanCodeEqualTo(loanCode)
                .andStatusEqualTo(0);
        return financeSplitVOMapper.selectByExample(example);
    }

    public List<FinanceSplitVO> getUncompletedFinance(){
        FinanceSplitVOExample example = new FinanceSplitVOExample();
        FinanceSplitVOExample.Criteria criteria = example.createCriteria();
        criteria.andIsValidEqualTo(true)
                .andStatusEqualTo(0)
                .andPrepayLoanCodeIsNotNull();
        return financeSplitVOMapper.selectByExample(example);
    }

    public FinanceSplitVO getFinanceSplit(String financeCode){
        FinanceSplitVOExample example = new FinanceSplitVOExample();
        FinanceSplitVOExample.Criteria criteria = example.createCriteria();
        criteria.andIsValidEqualTo(true)
                .andFinanceCodeEqualTo(financeCode)
                .andPrepayLoanCodeIsNull()
                .andStatusEqualTo(0);
        List<FinanceSplitVO> list = financeSplitVOMapper.selectByExample(example);
        return list.size() > 0 ? list.get(0) : null;
    }

    public int updateFinanceSplitNotMatch(String financeCode){
        FinanceSplitVOExample example = new FinanceSplitVOExample();
        FinanceSplitVOExample.Criteria criteria = example.createCriteria();
        criteria.andIsValidEqualTo(true)
                .andStatusEqualTo(0)
                .andPrepayLoanCodeIsNull()
                .andFinanceCodeEqualTo(financeCode);
        FinanceSplitVO financeSplit = new FinanceSplitVO();
        financeSplit.setPrepayLoanCode("0");
        return financeSplitVOMapper.updateByExampleSelective(financeSplit, example);
    }

    public int insert(FinanceSplitVO financeSplit){
        return financeSplitVOMapper.insertSelective(financeSplit);
    }

    public int updateFinanceSplitInvalid(String financeCode){
        FinanceSplitVOExample example = new FinanceSplitVOExample();
        FinanceSplitVOExample.Criteria criteria = example.createCriteria();
        criteria.andIsValidEqualTo(true)
                .andStatusEqualTo(0)
                .andPrepayLoanCodeIsNull()
                .andFinanceCodeEqualTo(financeCode);
        FinanceSplitVO financeSplit = new FinanceSplitVO();
        financeSplit.setIsValid(false);
        return financeSplitVOMapper.updateByExampleSelective(financeSplit, example);
    }

    public FinanceSplitVO getFinanceSplitByFinanceCode(String financeCode){
        FinanceSplitVOExample example = new FinanceSplitVOExample();
        FinanceSplitVOExample.Criteria criteria = example.createCriteria();
        criteria.andIsValidEqualTo(true)
                .andFinanceCodeEqualTo(financeCode)
                .andStatusEqualTo(0);
        List<FinanceSplitVO> list = financeSplitVOMapper.selectByExample(example);
        return list.size() > 0 ? list.get(0) : null;
    }
}
