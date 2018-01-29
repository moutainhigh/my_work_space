package com.ooteco.entity.finance.model.req;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.math.BigDecimal;
import java.util.Date;

public class SupperAcctRedeemReq {

    public String financeCode;
    @JSONField(format = "yyyyMMdd")
    public Date redemptionDate;
    public BigDecimal financeMoney;

    public SupperAcctRedeemReq(String financeCode, Date redemptionDate, BigDecimal financeMoney){
        this.financeCode = financeCode;
        this.financeMoney = financeMoney;
        this.redemptionDate = redemptionDate;
    }

    @Override
    public String toString(){
        return financeCode + "\t" +redemptionDate + "\t" +financeMoney.toString();
    }
}
