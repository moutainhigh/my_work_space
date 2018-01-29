package com.ooteco.entity.repay.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class RepayVO implements Serializable {
    private Long id;

    private Long repaymentPlanId;

    private String loanCode;

    private Date createDate;

    private Date modifyDate;

    private Integer periodsTime;

    private Date loanStartDate;

    private Date repaymentDate;

    private Date realRepaymentDate;

    private BigDecimal principal;

    private BigDecimal realPrincipal;

    private BigDecimal interest;

    private BigDecimal serviceCharge;

    private BigDecimal consultingFee;

    private BigDecimal prepaymentServiceCharge;

    private String type;

    private String status;

    private Boolean isValid;

    private Date startDate;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRepaymentPlanId() {
        return repaymentPlanId;
    }

    public void setRepaymentPlanId(Long repaymentPlanId) {
        this.repaymentPlanId = repaymentPlanId;
    }

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

    public Integer getPeriodsTime() {
        return periodsTime;
    }

    public void setPeriodsTime(Integer periodsTime) {
        this.periodsTime = periodsTime;
    }

    public Date getLoanStartDate() {
        return loanStartDate;
    }

    public void setLoanStartDate(Date loanStartDate) {
        this.loanStartDate = loanStartDate;
    }

    public Date getRepaymentDate() {
        return repaymentDate;
    }

    public void setRepaymentDate(Date repaymentDate) {
        this.repaymentDate = repaymentDate;
    }

    public Date getRealRepaymentDate() {
        return realRepaymentDate;
    }

    public void setRealRepaymentDate(Date realRepaymentDate) {
        this.realRepaymentDate = realRepaymentDate;
    }

    public BigDecimal getPrincipal() {
        return principal;
    }

    public void setPrincipal(BigDecimal principal) {
        this.principal = principal;
    }

    public BigDecimal getRealPrincipal() {
        return realPrincipal;
    }

    public void setRealPrincipal(BigDecimal realPrincipal) {
        this.realPrincipal = realPrincipal;
    }

    public BigDecimal getInterest() {
        return interest;
    }

    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    public BigDecimal getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(BigDecimal serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public BigDecimal getConsultingFee() {
        return consultingFee;
    }

    public void setConsultingFee(BigDecimal consultingFee) {
        this.consultingFee = consultingFee;
    }

    public BigDecimal getPrepaymentServiceCharge() {
        return prepaymentServiceCharge;
    }

    public void setPrepaymentServiceCharge(BigDecimal prepaymentServiceCharge) {
        this.prepaymentServiceCharge = prepaymentServiceCharge;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Boolean getIsValid() {
        return isValid;
    }

    public void setIsValid(Boolean isValid) {
        this.isValid = isValid;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
}