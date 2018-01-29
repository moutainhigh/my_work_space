package com.ooteco.service.biz;

import com.ooteco.dao.mapper.LoanVOMapper;
import com.ooteco.entity.finance.model.FinanceSplitVO;
import com.ooteco.entity.loan.model.LoanVO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service("loanVOServiceBiz")
public class LoanVOServiceBiz {

    @Resource
    private LoanVOMapper loanVOMapper;
    @Resource
    private LoanFullScaleVOServiceBiz loanFullScaleVOServiceBiz;
    @Resource
    private JHJFinanceRequestServiceBiz jhjFinanceRequestServiceBiz;
    @Resource
    private FinanceSplitVOServiceBiz financeSplitVOServiceBiz;
    @Resource
    private FinanceLoanMatchVOServiceBiz financeLoanMatchVOServiceBiz;

    @Transactional
    public void batchInsert(List<LoanVO> loans){
        for(LoanVO loan : loans){
            insert(loan);
        }
    }

    @Transactional
    public void handleLoanData(LoanVO loan){
        insert(loan);
        jhjFinanceRequestServiceBiz.getLoanRepaymentPlan(loan.getLoanCode());
        loanFullScaleVOServiceBiz.insert(loan);
        List<FinanceSplitVO> financeSplits = financeSplitVOServiceBiz.getUncompletedFinance();
        financeLoanMatchVOServiceBiz.allotUncompletedFinances(financeSplits);
    }

    public LoanVO getLoanVO(String loanCode){
        return loanVOMapper.selectByPrimaryKey(loanCode);
    }

    public int insert(LoanVO loan){
        return loanVOMapper.insertSelective(loan);
    }
}
