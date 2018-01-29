package com.ooteco.entity.finance.model.req;

import java.math.BigDecimal;

public class SupperAcctPurchaseReq {

    public String userCode;
    public String financeProductsId;
    public BigDecimal financeMoney;

    public SupperAcctPurchaseReq(String userCode, String financeProductsId, BigDecimal financeMoney){
        this.userCode = userCode;
        this.financeMoney = financeMoney;
        this.financeProductsId = financeProductsId;
    }

    @Override
    public String toString(){
        return this.userCode+" "+this.financeProductsId+" "+this.financeMoney;
    }
}
