package com.match.domain;

import java.math.BigDecimal;

/**
 * 还款计划(mongodb)
 */
public class LoanPlan {
    private String id;
    private String loanPlanCode;//平台还款计划唯一标识
    private String loanCode;//平台贷款唯一标识码
    private String channelCode;//渠道号
    private String channelLoanCode;//渠道贷款唯一标识码
    private BigDecimal totalAmount;//还款总金额
    private BigDecimal capitalAmount;//还款本金
    private BigDecimal currentCapital;//当前本金价值
    private BigDecimal interestAmount;//还款利息
    private BigDecimal platformAmount;//服务费
    private BigDecimal otherAmount;//其他费用
    private String userCode;//用户唯一标识
    private Integer periods;//还款期数
    private Integer currentPeriodsTime;//当前期次
    private Integer updateStatus;//还款计划更新状态(0-未更新 1-已更新)
    private Long beginDate;//开始时间
    private Long endDate;//结束时间
    private Long soldOutDate;//满标时间
    private Integer status;//状态(1-未匹配,2-匹配中,3-匹配完成,4-还款完成,5-已逾期，99-已完成)
    private BigDecimal matchedAmount;//已经匹配的金额
    private Integer isMatchfinish;//是否匹配完成 1-是，2-不是
    private Integer isCheck;//是否验证完成1-是，2-不是
    private Long createDate;//创建时间
    private Long updateDate;//修改时间


    public LoanPlan() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLoanPlanCode() {
        return loanPlanCode;
    }

    public void setLoanPlanCode(String loanPlanCode) {
        this.loanPlanCode = loanPlanCode;
    }

    public String getLoanCode() {
        return loanCode;
    }

    public void setLoanCode(String loanCode) {
        this.loanCode = loanCode;
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    public String getChannelLoanCode() {
        return channelLoanCode;
    }

    public void setChannelLoanCode(String channelLoanCode) {
        this.channelLoanCode = channelLoanCode;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getCapitalAmount() {
        return capitalAmount;
    }

    public void setCapitalAmount(BigDecimal capitalAmount) {
        this.capitalAmount = capitalAmount;
    }

    public BigDecimal getCurrentCapital() {
        return currentCapital;
    }

    public void setCurrentCapital(BigDecimal currentCapital) {
        this.currentCapital = currentCapital;
    }

    public BigDecimal getInterestAmount() {
        return interestAmount;
    }

    public void setInterestAmount(BigDecimal interestAmount) {
        this.interestAmount = interestAmount;
    }

    public BigDecimal getPlatformAmount() {
        return platformAmount;
    }

    public void setPlatformAmount(BigDecimal platformAmount) {
        this.platformAmount = platformAmount;
    }

    public BigDecimal getOtherAmount() {
        return otherAmount;
    }

    public void setOtherAmount(BigDecimal otherAmount) {
        this.otherAmount = otherAmount;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public Integer getPeriods() {
        return periods;
    }

    public void setPeriods(Integer periods) {
        this.periods = periods;
    }

    public Integer getCurrentPeriodsTime() {
        return currentPeriodsTime;
    }

    public void setCurrentPeriodsTime(Integer currentPeriodsTime) {
        this.currentPeriodsTime = currentPeriodsTime;
    }

    public Integer getUpdateStatus() {
        return updateStatus;
    }

    public void setUpdateStatus(Integer updateStatus) {
        this.updateStatus = updateStatus;
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

    public Long getSoldOutDate() {
        return soldOutDate;
    }

    public void setSoldOutDate(Long soldOutDate) {
        this.soldOutDate = soldOutDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public BigDecimal getMatchedAmount() {
        return matchedAmount;
    }

    public void setMatchedAmount(BigDecimal matchedAmount) {
        this.matchedAmount = matchedAmount;
    }

    public Integer getIsMatchfinish() {
        return isMatchfinish;
    }

    public void setIsMatchfinish(Integer isMatchfinish) {
        this.isMatchfinish = isMatchfinish;
    }

    public Integer getIsCheck() {
        return isCheck;
    }

    public void setIsCheck(Integer isCheck) {
        this.isCheck = isCheck;
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
        final StringBuilder sb = new StringBuilder("LoanPlan{");
        sb.append("id='").append(id).append('\'');
        sb.append("loanPlanCode='").append(loanPlanCode).append('\'');
        sb.append(", loanCode='").append(loanCode).append('\'');
        sb.append(", channelCode='").append(channelCode).append('\'');
        sb.append(", channelLoanCode='").append(channelLoanCode).append('\'');
        sb.append(", totalAmount=").append(totalAmount);
        sb.append(", capitalAmount=").append(capitalAmount);
        sb.append(", currentCapital=").append(currentCapital);
        sb.append(", interestAmount=").append(interestAmount);
        sb.append(", platformAmount=").append(platformAmount);
        sb.append(", otherAmount=").append(otherAmount);
        sb.append(", userCode='").append(userCode).append('\'');
        sb.append(", periods=").append(periods);
        sb.append(", currentPeriodsTime=").append(currentPeriodsTime);
        sb.append(", updateStatus=").append(updateStatus);
        sb.append(", beginDate=").append(beginDate);
        sb.append(", endDate=").append(endDate);
        sb.append(", soldOutDate=").append(soldOutDate);
        sb.append(", status=").append(status);
        sb.append(", matchedAmount=").append(matchedAmount);
        sb.append(", isMatchfinish=").append(isMatchfinish);
        sb.append(", isCheck=").append(isCheck);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateDate=").append(updateDate);
        sb.append('}');
        return sb.toString();
    }
}
