package com.ooteco.service.biz;


import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

@Service("loanSplitServiceBiz")
public class LoanSplitServiceBiz {

    @Resource
    private RepayVOServiceBiz repayVOServiceBiz;
    @Resource
    private TLoanVOServiceBiz tLoanVOServiceBiz;

//    public BigDecimal splitLoanAmount(Date date){
//        List<TLoanVO> records = tLoanVOServiceBiz.getSpecialDateLoanRecords(date);
//        for(TLoanVO loan : records)
//            computeLoanCapitalBalance(loan, date);
//        List<BigDecimal> amount = records.stream().map(r -> r.getCapitalBalance()).collect(Collectors.toList());
//        return splitAmount(amount);
//    }

//    public BigDecimal splitReplacementAmount(Date date){
//        List<RepayVO> records = repayVOServiceBiz.getRecordsByDate(date);
//        List<BigDecimal> amount = records.stream().map(r -> r.getAmount()).collect(Collectors.toList());
//        return splitAmount(amount);
//    }
//
//    private void computeLoanCapitalBalance(TLoanVO loan, Date date){
//        List<RepayVO> repays = splitLoanRecordToRepayRecords(loan);
//        BigDecimal capitalBalance = loan.getCapital();
//        for(RepayVO repay : repays){
//            if(repay.getRepayDate().getTime() <= date.getTime())
//                capitalBalance = capitalBalance.subtract(repay.getAmount());
//        }
//        loan.setCapitalBalance(capitalBalance);
//    }
//
//    private List<RepayVO> splitLoanRecordToRepayRecords(TLoanVO loan){
//        int term = loan.getPhase();
//        Date repayDate = loan.getStartDate();
//        BigDecimal amount = loan.getCapital().divide(new BigDecimal(term),4, BigDecimal.ROUND_HALF_UP);
//        List<RepayVO> list = new ArrayList<>();
//        for(int i=0; i<term; i++){
//            RepayVO repay = new RepayVO();
//            repay.setLoanId(loan.getId() + 0l);
//            repayDate = DateUtils.addOneMonth(repayDate);
//            repay.setRepayDate(repayDate);
//            repay.setAmount(amount);
//            list.add(repay);
//        }
//        return list;
//    }

    private BigDecimal splitAmount(List<BigDecimal> amount){
        return amount.stream().reduce((a,b) -> a.add(b)).orElse(new BigDecimal(0));
    }
}
