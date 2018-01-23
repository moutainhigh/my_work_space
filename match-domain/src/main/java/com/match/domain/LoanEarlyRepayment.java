package com.match.domain;

import java.math.BigDecimal;

/**
*提前还款(mysql)
 **/
public class LoanEarlyRepayment {

    private Long id;
    private String channelCode;//渠道号
    private String loanCode;//贷款唯一标识码
    private Long repaymentDate;//还款日期
    private BigDecimal repaymentPrincipalAmount;//还款本金
    private BigDecimal interestAmount;//还款利息
    private BigDecimal serviceChargeAmount;//服务费
    private BigDecimal consultingAmount;//咨询费
    private BigDecimal prepaymentServiceChargeAmount;//提现还款手续费
    private String type;//类型(prepayment提前还款,badLoans坏账)
    private Long createDate;//创建时间
    private Long updateDate;//修改时间

    public LoanEarlyRepayment() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    public String getLoanCode() {
        return loanCode;
    }

    public void setLoanCode(String loanCode) {
        this.loanCode = loanCode;
    }


    public Long getRepaymentDate() {
        return repaymentDate;
    }

    public void setRepaymentDate(Long repaymentDate) {
        this.repaymentDate = repaymentDate;
    }

    public BigDecimal getRepaymentPrincipalAmount() {
        return repaymentPrincipalAmount;
    }

    public void setRepaymentPrincipalAmount(BigDecimal repaymentPrincipalAmount) {
        this.repaymentPrincipalAmount = repaymentPrincipalAmount;
    }

    public BigDecimal getInterestAmount() {
        return interestAmount;
    }

    public void setInterestAmount(BigDecimal interestAmount) {
        this.interestAmount = interestAmount;
    }

    public BigDecimal getServiceChargeAmount() {
        return serviceChargeAmount;
    }

    public void setServiceChargeAmount(BigDecimal serviceChargeAmount) {
        this.serviceChargeAmount = serviceChargeAmount;
    }

    public BigDecimal getConsultingAmount() {
        return consultingAmount;
    }

    public void setConsultingAmount(BigDecimal consultingAmount) {
        this.consultingAmount = consultingAmount;
    }

    public BigDecimal getPrepaymentServiceChargeAmount() {
        return prepaymentServiceChargeAmount;
    }

    public void setPrepaymentServiceChargeAmount(BigDecimal prepaymentServiceChargeAmount) {
        this.prepaymentServiceChargeAmount = prepaymentServiceChargeAmount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Long createDate) {
        this.createDate = createDate;
    }

    public Long getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Long updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LoanEarlyRepayment{");
        sb.append("id=").append(id);
        sb.append(", channelCode='").append(channelCode).append('\'');
        sb.append(", loanCode='").append(loanCode).append('\'');
        sb.append(", repaymentDate=").append(repaymentDate);
        sb.append(", repaymentPrincipalAmount=").append(repaymentPrincipalAmount);
        sb.append(", interestAmount=").append(interestAmount);
        sb.append(", serviceChargeAmount=").append(serviceChargeAmount);
        sb.append(", consultingAmount=").append(consultingAmount);
        sb.append(", prepaymentServiceChargeAmount=").append(prepaymentServiceChargeAmount);
        sb.append(", type='").append(type).append('\'');
        sb.append(", createDate=").append(createDate);
        sb.append(", updateDate=").append(updateDate);
        sb.append('}');
        return sb.toString();
    }
}
