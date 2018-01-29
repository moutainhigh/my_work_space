package com.ooteco.entity.finance.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class FinanceSplitVO implements Serializable {
    private Long id;

    private Date createDate;

    private Date modifyDate;

    private String financeCode;

    private Integer financeProductsId;

    private String userCode;

    private Date startDate;

    private Date expireDate;

    private Integer period;

    private Integer monthPeriod;

    private BigDecimal amount;

    private BigDecimal rate;

    private String prepayLoanCode;

    private Integer status;

    private Integer process;

    private Boolean isValid;

    private Integer type;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getFinanceCode() {
        return financeCode;
    }

    public void setFinanceCode(String financeCode) {
        this.financeCode = financeCode == null ? null : financeCode.trim();
    }

    public Integer getFinanceProductsId() {
        return financeProductsId;
    }

    public void setFinanceProductsId(Integer financeProductsId) {
        this.financeProductsId = financeProductsId;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public Integer getMonthPeriod() {
        return monthPeriod;
    }

    public void setMonthPeriod(Integer monthPeriod) {
        this.monthPeriod = monthPeriod;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public String getPrepayLoanCode() {
        return prepayLoanCode;
    }

    public void setPrepayLoanCode(String prepayLoanCode) {
        this.prepayLoanCode = prepayLoanCode == null ? null : prepayLoanCode.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getProcess() {
        return process;
    }

    public void setProcess(Integer process) {
        this.process = process;
    }

    public Boolean getIsValid() {
        return isValid;
    }

    public void setIsValid(Boolean isValid) {
        this.isValid = isValid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}