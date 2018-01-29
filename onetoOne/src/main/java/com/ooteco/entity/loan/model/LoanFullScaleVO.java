package com.ooteco.entity.loan.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class LoanFullScaleVO implements Serializable {
    private String loanCode;

    private Date createDate;

    private Date modifyDate;

    private BigDecimal amount;

    private Boolean isFull;

    private static final long serialVersionUID = 1L;

    public String getLoanCode() {
        return loanCode;
    }

    public void setLoanCode(String loanCode) {
        this.loanCode = loanCode == null ? null : loanCode.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Boolean getIsFull() {
        return isFull;
    }

    public void setIsFull(Boolean isFull) {
        this.isFull = isFull;
    }
}