package com.ooteco.entity.repay.model.resp;

import com.ooteco.utils.BigDecimalUtils;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EarlyRedemptionResp {

    public BigDecimal totalAmount;
    public BigDecimal totalPrincipal;
    public BigDecimal totalInterest;
    public List<FinanceReleasedLoanDetail> details;

    public EarlyRedemptionResp(List<FinanceReleasedLoanDetail> details){
        this.details = details;
        if(details.size() > 0){
            this.totalAmount = new BigDecimal(0);
            this.totalInterest = new BigDecimal(0);
            this.totalPrincipal = new BigDecimal(0);
            for(FinanceReleasedLoanDetail detail : details){
                this.totalAmount = this.totalAmount.add(detail.getAmount());
                this.totalPrincipal = this.totalPrincipal.add(detail.getPrinciple());
                this.totalInterest = this.totalInterest.add(detail.getInterest());
            }
        }
    }

    public Map<String, Object> getRespMap(){
        Map<String, Object> respMap = new HashMap<>();
        respMap.put("totalAmount", totalAmount);
        respMap.put("totalInterest", totalInterest);
        respMap.put("totalPrincipal", totalPrincipal);
        respMap.put("details", details);
        return respMap;
    }
}
