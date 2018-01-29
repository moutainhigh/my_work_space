package com.ooteco.entity.finance.model;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class FinanceProfitResp {

    public BigDecimal amount;
    public BigDecimal principal;
    public BigDecimal interest;

    public FinanceProfitResp(BigDecimal principal, BigDecimal interest){
        this.interest = interest;
        this.principal = principal;
        this.amount = this.principal.add(this.interest);
    }

    public FinanceProfitResp(){

    }

    public Map<String, Object> getRespMap(){
        Map<String, Object> respMap = new HashMap<>();
        respMap.put("amount", amount);
        respMap.put("interest" ,interest);
        respMap.put("principal", principal);
        return respMap;
    }
}
