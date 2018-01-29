package com.ooteco.entity.financialSale.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class FinancialSaleVO implements Serializable {
    private Long id;

    private Date createTime;

    private Date modifyTime;

    private Date tradeDate;

    private BigDecimal raiseAmount;

    private BigDecimal expireAmount;

    private BigDecimal remainAmount;

    private BigDecimal dayValue;

    public BigDecimal getDayValue() {
        return dayValue;
    }

    public void setDayValue(BigDecimal dayValue) {
        this.dayValue = dayValue;
    }

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Date getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(Date tradeDate) {
        this.tradeDate = tradeDate;
    }

    public BigDecimal getRaiseAmount() {
        return raiseAmount;
    }

    public void setRaiseAmount(BigDecimal raiseAmount) {
        this.raiseAmount = raiseAmount;
    }

    public BigDecimal getExpireAmount() {
        return expireAmount;
    }

    public void setExpireAmount(BigDecimal expireAmount) {
        this.expireAmount = expireAmount;
    }

    public BigDecimal getRemainAmount() {
        return remainAmount;
    }

    public void setRemainAmount(BigDecimal remainAmount) {
        this.remainAmount = remainAmount;
    }
}