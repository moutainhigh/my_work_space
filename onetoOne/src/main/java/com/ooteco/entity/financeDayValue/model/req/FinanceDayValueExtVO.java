package com.ooteco.entity.financeDayValue.model.req;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

public class FinanceDayValueExtVO implements Serializable {

    @NotNull(message = "financeProductsId can't be null")
    private String financeProductsId;

    @DateTimeFormat(pattern = "yyyyMMdd")
    @NotNull(message = "financeDate can't be null")
    private Date financeDate;

    @DateTimeFormat(pattern = "yyyyMMdd")
    @NotNull(message = "redemptionDate can't be null")
    private Date redemptionDate;

    public String getFinanceProductsId() {
        return financeProductsId;
    }

    public void setFinanceProductsId(String financeProductsId) {
        this.financeProductsId = financeProductsId;
    }

    public Date getFinanceDate() {
        return financeDate;
    }

    public void setFinanceDate(Date financeDate) {
        this.financeDate = financeDate;
    }

    public Date getRedemptionDate() {
        return redemptionDate;
    }

    public void setRedemptionDate(Date redemptionDate) {
        this.redemptionDate = redemptionDate;
    }
}
