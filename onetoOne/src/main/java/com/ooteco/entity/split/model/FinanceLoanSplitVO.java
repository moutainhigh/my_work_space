package com.ooteco.entity.split.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class FinanceLoanSplitVO implements Serializable {
    private Date splitDate;

    private BigDecimal loanAmount;

    private BigDecimal repaymentAmount;

    private BigDecimal raiseAmount;

    private BigDecimal redemptionAmount;

    private static final long serialVersionUID = 1L;

    public Date getSplitDate() {
        return splitDate;
    }

    public void setSplitDate(Date splitDate) {
        this.splitDate = splitDate;
    }

    public BigDecimal getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(BigDecimal loanAmount) {
        this.loanAmount = loanAmount;
    }

    public BigDecimal getRepaymentAmount() {
        return repaymentAmount;
    }

    public void setRepaymentAmount(BigDecimal repaymentAmount) {
        this.repaymentAmount = repaymentAmount;
    }

    public BigDecimal getRaiseAmount() {
        return raiseAmount;
    }

    public void setRaiseAmount(BigDecimal raiseAmount) {
        this.raiseAmount = raiseAmount;
    }

    public BigDecimal getRedemptionAmount() {
        return redemptionAmount;
    }

    public void setRedemptionAmount(BigDecimal redemptionAmount) {
        this.redemptionAmount = redemptionAmount;
    }
}