package com.match.domain;

import java.math.BigDecimal;

/**
 * 资金匹配结果(hbase)
 */
public class FinanceMatch {

    private String rowkey;
    private String loanPlanCode;//平台还款计划唯一标识
    private Integer loanCode;//平台贷款唯一标识码
    private String channelLoanCode;//渠道贷款唯一标识码
    private Integer channelCode;//渠道号
    private Long beginDate;//贷款开始日期
    private Long endDate;//贷款到期日期
    private Long realEndDate;//贷款实际到期时间
    private BigDecimal matchedAmount;//本次匹配金额
    private Integer payeeIdType;//收款人证件类型(1-身份证,2-营业执照)
    private Integer payeeIdNo;//证件号码(个人为身份证，企业为营业执照/统一社会信用代码);
    private Integer status;//状态(1-未匹配,2-匹配中,3-匹配完成,4-还款完成,5-已逾期,99-已完成);



    public FinanceMatch() {

    }


    public String getRowkey() {
        return rowkey;
    }

    public void setRowkey(String rowkey) {
        this.rowkey = rowkey;
    }

    public String getLoanPlanCode() {
        return loanPlanCode;
    }

    public void setLoanPlanCode(String loanPlanCode) {
        this.loanPlanCode = loanPlanCode;
    }

    public Integer getLoanCode() {
        return loanCode;
    }

    public void setLoanCode(Integer loanCode) {
        this.loanCode = loanCode;
    }

    public String getChannelLoanCode() {
        return channelLoanCode;
    }

    public void setChannelLoanCode(String channelLoanCode) {
        this.channelLoanCode = channelLoanCode;
    }

    public Integer getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(Integer channelCode) {
        this.channelCode = channelCode;
    }

    public Long getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Long beginDate) {
        this.beginDate = beginDate;
    }

    public Long getEndDate() {
        return endDate;
    }

    public void setEndDate(Long endDate) {
        this.endDate = endDate;
    }

    public Long getRealEndDate() {
        return realEndDate;
    }

    public void setRealEndDate(Long realEndDate) {
        this.realEndDate = realEndDate;
    }

    public BigDecimal getMatchedAmount() {
        return matchedAmount;
    }

    public void setMatchedAmount(BigDecimal matchedAmount) {
        this.matchedAmount = matchedAmount;
    }

    public Integer getPayeeIdType() {
        return payeeIdType;
    }

    public void setPayeeIdType(Integer payeeIdType) {
        this.payeeIdType = payeeIdType;
    }

    public Integer getPayeeIdNo() {
        return payeeIdNo;
    }

    public void setPayeeIdNo(Integer payeeIdNo) {
        this.payeeIdNo = payeeIdNo;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FinanceMatch{");
        sb.append("rowkey='").append(rowkey).append('\'');
        sb.append("loanPlanCode='").append(loanPlanCode).append('\'');
        sb.append(", loanCode=").append(loanCode);
        sb.append(", channelLoanCode='").append(channelLoanCode).append('\'');
        sb.append(", channelCode=").append(channelCode);
        sb.append(", beginDate=").append(beginDate);
        sb.append(", endDate=").append(endDate);
        sb.append(", realEndDate=").append(realEndDate);
        sb.append(", matchedAmount=").append(matchedAmount);
        sb.append(", payeeIdType=").append(payeeIdType);
        sb.append(", payeeIdNo=").append(payeeIdNo);
        sb.append(", status=").append(status);
        sb.append('}');
        return sb.toString();
    }
}
