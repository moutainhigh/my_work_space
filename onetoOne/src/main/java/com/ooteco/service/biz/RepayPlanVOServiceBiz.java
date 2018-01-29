package com.ooteco.service.biz;

import com.ooteco.dao.mapper.RepayPlanVOMapper;
import com.ooteco.entity.repay.model.RepayPlanVO;
import com.ooteco.entity.repay.model.RepayPlanVOExample;
import com.ooteco.entity.repay.model.RepayVO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service("repayPlanVOServiceBiz")
public class RepayPlanVOServiceBiz {

    @Resource
    private RepayPlanVOMapper repayPlanVOMapper;
    @Resource
    private RepayVOServiceBiz repayVOServiceBiz;
    @Resource
    private RepaySplitVOServiceBiz repaySplitVOServiceBiz;

    @Transactional
    public void insertRepayPlan(RepayPlanVO repayPlan, List<RepayVO> details){
        repayPlan.setRepaymentPlanId(null);
        insert(repayPlan);
        repayVOServiceBiz.batchInsert(details, repayPlan);
    }

    public List<RepayPlanVO> getOldNotUpdateLoanRepayPlans(String loanCode){
        RepayPlanVOExample example = new RepayPlanVOExample();
        RepayPlanVOExample.Criteria criteria = example.createCriteria();
        criteria.andLoanCodeEqualTo(loanCode)
                .andIsValidEqualTo(true)
                .andTypeEqualTo("0");
        return repayPlanVOMapper.selectByExample(example);
    }

    public int updateOldRepayPlan(String loanCode){
        RepayPlanVOExample example = new RepayPlanVOExample();
        RepayPlanVOExample.Criteria criteria = example.createCriteria();
        criteria.andLoanCodeEqualTo(loanCode)
                .andIsValidEqualTo(true)
                .andTypeEqualTo("0");
        RepayPlanVO prepareUpdateRecord = new RepayPlanVO();
        prepareUpdateRecord.setIsValid(false);
        return repayPlanVOMapper.updateByExampleSelective(prepareUpdateRecord, example);
    }

    @Transactional
    public void handleOldRepayPlan(List<String> loanCodes){
        updateOldRepayPlanInvalid(loanCodes);
        repayVOServiceBiz.updateOldRepayInvalid(loanCodes);
        repaySplitVOServiceBiz.updateOldRepaySplitInvalid(loanCodes);
    }

    public int updateOldRepayPlanInvalid(List<String> loanCodes){
        RepayPlanVOExample example = new RepayPlanVOExample();
        RepayPlanVOExample.Criteria criteria = example.createCriteria();
        criteria.andLoanCodeIn(loanCodes)
                .andTypeEqualTo("0")
                .andIsValidEqualTo(true);
        RepayPlanVO repayPlan = new RepayPlanVO();
        repayPlan.setIsValid(false);
        return repayPlanVOMapper.updateByExampleSelective(repayPlan, example);
    }


    public int insert(RepayPlanVO repayPlan){
        return repayPlanVOMapper.insertSelective(repayPlan);
    }
}
