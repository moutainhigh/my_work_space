package com.ooteco.entity.tloan.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TLoanVO implements Serializable {
    private Integer id;

    private Integer refundId;

    private Integer phase;

    private String type;

    private BigDecimal capital;

    private BigDecimal capitalBalance;

    private BigDecimal interest;

    private BigDecimal interestBalance;

    private BigDecimal fee;

    private BigDecimal feeBalance;

    private BigDecimal zxfee;

    private BigDecimal rate;

    private Date startDate;

    private Integer periodDay;

    private Date endDate;

    private Date endDateF;

    private String paymentStatus;

    private String paymentDate;

    private Long locked;

    private Integer borrowingFormid;

    private Integer borrowingProductid;

    private String borrowingProductname;

    private Integer totalPhase;

    private Long paseDue;

    private Long isCurrentRepaymentPhase;

    private Integer retailerGoodsId;

    private String retailerGoodsName;

    private BigDecimal overdueAmount;

    private Long isAllocationComplete;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRefundId() {
        return refundId;
    }

    public void setRefundId(Integer refundId) {
        this.refundId = refundId;
    }

    public Integer getPhase() {
        return phase;
    }

    public void setPhase(Integer phase) {
        this.phase = phase;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public BigDecimal getCapital() {
        return capital;
    }

    public void setCapital(BigDecimal capital) {
        this.capital = capital;
    }

    public BigDecimal getCapitalBalance() {
        return capitalBalance;
    }

    public void setCapitalBalance(BigDecimal capitalBalance) {
        this.capitalBalance = capitalBalance;
    }

    public BigDecimal getInterest() {
        return interest;
    }

    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    public BigDecimal getInterestBalance() {
        return interestBalance;
    }

    public void setInterestBalance(BigDecimal interestBalance) {
        this.interestBalance = interestBalance;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public BigDecimal getFeeBalance() {
        return feeBalance;
    }

    public void setFeeBalance(BigDecimal feeBalance) {
        this.feeBalance = feeBalance;
    }

    public BigDecimal getZxfee() {
        return zxfee;
    }

    public void setZxfee(BigDecimal zxfee) {
        this.zxfee = zxfee;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Integer getPeriodDay() {
        return periodDay;
    }

    public void setPeriodDay(Integer periodDay) {
        this.periodDay = periodDay;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getEndDateF() {
        return endDateF;
    }

    public void setEndDateF(Date endDateF) {
        this.endDateF = endDateF;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus == null ? null : paymentStatus.trim();
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate == null ? null : paymentDate.trim();
    }

    public Long getLocked() {
        return locked;
    }

    public void setLocked(Long locked) {
        this.locked = locked;
    }

    public Integer getBorrowingFormid() {
        return borrowingFormid;
    }

    public void setBorrowingFormid(Integer borrowingFormid) {
        this.borrowingFormid = borrowingFormid;
    }

    public Integer getBorrowingProductid() {
        return borrowingProductid;
    }

    public void setBorrowingProductid(Integer borrowingProductid) {
        this.borrowingProductid = borrowingProductid;
    }

    public String getBorrowingProductname() {
        return borrowingProductname;
    }

    public void setBorrowingProductname(String borrowingProductname) {
        this.borrowingProductname = borrowingProductname == null ? null : borrowingProductname.trim();
    }

    public Integer getTotalPhase() {
        return totalPhase;
    }

    public void setTotalPhase(Integer totalPhase) {
        this.totalPhase = totalPhase;
    }

    public Long getPaseDue() {
        return paseDue;
    }

    public void setPaseDue(Long paseDue) {
        this.paseDue = paseDue;
    }

    public Long getIsCurrentRepaymentPhase() {
        return isCurrentRepaymentPhase;
    }

    public void setIsCurrentRepaymentPhase(Long isCurrentRepaymentPhase) {
        this.isCurrentRepaymentPhase = isCurrentRepaymentPhase;
    }

    public Integer getRetailerGoodsId() {
        return retailerGoodsId;
    }

    public void setRetailerGoodsId(Integer retailerGoodsId) {
        this.retailerGoodsId = retailerGoodsId;
    }

    public String getRetailerGoodsName() {
        return retailerGoodsName;
    }

    public void setRetailerGoodsName(String retailerGoodsName) {
        this.retailerGoodsName = retailerGoodsName == null ? null : retailerGoodsName.trim();
    }

    public BigDecimal getOverdueAmount() {
        return overdueAmount;
    }

    public void setOverdueAmount(BigDecimal overdueAmount) {
        this.overdueAmount = overdueAmount;
    }

    public Long getIsAllocationComplete() {
        return isAllocationComplete;
    }

    public void setIsAllocationComplete(Long isAllocationComplete) {
        this.isAllocationComplete = isAllocationComplete;
    }
}