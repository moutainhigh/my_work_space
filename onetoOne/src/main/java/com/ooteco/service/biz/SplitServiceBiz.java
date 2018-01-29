package com.ooteco.service.biz;

import com.ooteco.entity.split.model.FinanceLoanSplitVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

@Service("splitServiceBiz")
public class SplitServiceBiz {

    @Resource
    private LoanSplitServiceBiz loanSplitServiceBiz;
    @Resource
    private FinanceSplitVOServiceBiz financeSplitServiceBiz;

    public FinanceLoanSplitVO split(Date date){
        FinanceLoanSplitVO financeLoanSplitVO = new FinanceLoanSplitVO();
//        financeLoanSplitVO.setSplitDate(date);
//        financeLoanSplitVO.setLoanAmount(loanSplitServiceBiz.splitLoanAmount(date));
//        financeLoanSplitVO.setRepaymentAmount(loanSplitServiceBiz.splitReplacementAmount(date));
//        financeLoanSplitVO.setRaiseAmount(financeSplitServiceBiz.splitRaiseAmount(date));
//        financeLoanSplitVO.setRedemptionAmount(financeSplitServiceBiz.splitRedemptionAmount(date));
        return financeLoanSplitVO;
    }

}
