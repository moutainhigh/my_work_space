package com.ooteco.entity.repay.model;

import com.ooteco.entity.req.BaseReq;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PrepayVO extends BaseReq implements Serializable {
    private Long id;

    private Date createDate;

    private Date modifyDate;

    @NotNull(message = "loanCode can't be null")
    private String loanCode;

    @DateTimeFormat(pattern = "yyyyMMdd")
    @NotNull(message = "repaymentDate can't be null")
    private Date repaymentDate;

    @NotNull(message = "repaymentPrincipal can't be null")
    private BigDecimal repaymentPrincipal;

    @NotNull(message = "repaymentInterest can't be null")
    private BigDecimal repaymentInterest;

    @NotNull(message = "serviceCharge can't be null")
    private BigDecimal serviceCharge;

    @NotNull(message = "consultingFee can't be null")
    private BigDecimal consultingFee;

    @NotNull(message = "type can't be null")
    private String type;

    @NotNull(message = "prepaymentServiceCharge can't be null")
    private BigDecimal prepaymentServiceCharge;

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

    public String getLoanCode() {
        return loanCode;
    }

    public void setLoanCode(String loanCode) {
        this.loanCode = loanCode == null ? null : loanCode.trim();
    }

    public Date getRepaymentDate() {
        return repaymentDate;
    }

    public void setRepaymentDate(Date repaymentDate) {
        this.repaymentDate = repaymentDate;
    }

    public BigDecimal getRepaymentPrincipal() {
        return repaymentPrincipal;
    }

    public void setRepaymentPrincipal(BigDecimal repaymentPrincipal) {
        this.repaymentPrincipal = repaymentPrincipal;
    }

    public BigDecimal getRepaymentInterest() {
        return repaymentInterest;
    }

    public void setRepaymentInterest(BigDecimal repaymentInterest) {
        this.repaymentInterest = repaymentInterest;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public BigDecimal getPrepaymentServiceCharge() {
        return prepaymentServiceCharge;
    }

    public void setPrepaymentServiceCharge(BigDecimal prepaymentServiceCharge) {
        this.prepaymentServiceCharge = prepaymentServiceCharge;
    }
}