package com.ooteco.entity.match.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class FinanceLoanMatchVO implements Serializable {
    private Long id;

    private Date createDate;

    private Date modifyDate;

    private Long repayId;

    private Long repaySplitId;

    private Long financeSplitId;

    private Integer financeProductsId;

    private String loanCode;

    private BigDecimal loanRate;

    private String loanUserCode;

    private String financeUserCode;

    private Integer periodsTime;

    private String financeCode;

    private Date loanStartDate;

    private Date loanExpireDate;

    private BigDecimal allotAmount;

    private String status;

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

    public Long getRepayId() {
        return repayId;
    }

    public void setRepayId(Long repayId) {
        this.repayId = repayId;
    }

    public Long getRepaySplitId() {
        return repaySplitId;
    }

    public void setRepaySplitId(Long repaySplitId) {
        this.repaySplitId = repaySplitId;
    }

    public Long getFinanceSplitId() {
        return financeSplitId;
    }

    public void setFinanceSplitId(Long financeSplitId) {
        this.financeSplitId = financeSplitId;
    }

    public Integer getFinanceProductsId() {
        return financeProductsId;
    }

    public void setFinanceProductsId(Integer financeProductsId) {
        this.financeProductsId = financeProductsId;
    }

    public String getLoanCode() {
        return loanCode;
    }

    public void setLoanCode(String loanCode) {
        this.loanCode = loanCode == null ? null : loanCode.trim();
    }

    public BigDecimal getLoanRate() {
        return loanRate;
    }

    public void setLoanRate(BigDecimal loanRate) {
        this.loanRate = loanRate;
    }

    public String getLoanUserCode() {
        return loanUserCode;
    }

    public void setLoanUserCode(String loanUserCode) {
        this.loanUserCode = loanUserCode == null ? null : loanUserCode.trim();
    }

    public String getFinanceUserCode() {
        return financeUserCode;
    }

    public void setFinanceUserCode(String financeUserCode) {
        this.financeUserCode = financeUserCode == null ? null : financeUserCode.trim();
    }

    public Integer getPeriodsTime() {
        return periodsTime;
    }

    public void setPeriodsTime(Integer periodsTime) {
        this.periodsTime = periodsTime;
    }

    public String getFinanceCode() {
        return financeCode;
    }

    public void setFinanceCode(String financeCode) {
        this.financeCode = financeCode == null ? null : financeCode.trim();
    }

    public Date getLoanStartDate() {
        return loanStartDate;
    }

    public void setLoanStartDate(Date loanStartDate) {
        this.loanStartDate = loanStartDate;
    }

    public Date getLoanExpireDate() {
        return loanExpireDate;
    }

    public void setLoanExpireDate(Date loanExpireDate) {
        this.loanExpireDate = loanExpireDate;
    }

    public BigDecimal getAllotAmount() {
        return allotAmount;
    }

    public void setAllotAmount(BigDecimal allotAmount) {
        this.allotAmount = allotAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}