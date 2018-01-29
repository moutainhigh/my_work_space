package com.ooteco.entity.financeDayValue.model.resp;

import java.math.BigDecimal;

public class FinanceResidueLimitResp {

    private BigDecimal financeLimit;
    private Integer financeProductsId;

    public FinanceResidueLimitResp(Integer financeProductsId, BigDecimal financeLimit){
        this.financeLimit = financeLimit;
        this.financeProductsId = financeProductsId;
    }

    public BigDecimal getFinanceLimit() {
        if(financeLimit == null || financeLimit.compareTo(new BigDecimal(0)) < 0){
            return new BigDecimal(0);
        }
        return financeLimit;
    }

    public void setFinanceLimit(BigDecimal financeLimit) {
        this.financeLimit = financeLimit;
    }

    public Integer getFinanceProductsId() {
        return financeProductsId;
    }

    public void setFinanceProductsId(Integer financeProductsId) {
        this.financeProductsId = financeProductsId;
    }
}
