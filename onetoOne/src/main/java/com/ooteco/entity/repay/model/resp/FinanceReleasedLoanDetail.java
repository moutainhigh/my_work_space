package com.ooteco.entity.repay.model.resp;

import java.math.BigDecimal;

public class FinanceReleasedLoanDetail {

    private Long matchCode;
    private BigDecimal amount;
    private BigDecimal principle;
    private BigDecimal interest;

    public Long getMatchCode() {
        return matchCode;
    }

    public void setMatchCode(Long matchCode) {
        this.matchCode = matchCode;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getPrinciple() {
        return principle;
    }

    public void setPrinciple(BigDecimal principle) {
        this.principle = principle;
    }

    public BigDecimal getInterest() {
        return interest;
    }

    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }
}
