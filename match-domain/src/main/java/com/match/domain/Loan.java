package com.match.domain;

import java.math.BigDecimal;

/**
 *贷款订单(mongodb)
 * **/
public class Loan {
    private String id;
    private String loanCode;//平台贷款唯一标识码
    private String channelLoanCode;//渠道贷款唯一标识码
    private String channelCode;//渠道号
    private String userCode;//用户唯一识别码(贷款系统)
    private String userName;//姓名
    private String mobile;//手机号码
    private Integer category;//贷款类型(1-现金贷、2-消费贷、3-抵押贷、4-其他贷款)
    private String riskControlScore;//信用评级(风控意见)
    private BigDecimal loanAmount;//贷款金额
    private BigDecimal currentCapital;//当前本金价值
    private Integer repaymentType;//还款方式(1-先息后本，2-等额本金，3-等额本息)
    private Integer purpose;//贷款用途(日常消费，装修，旅游，进修，子女教育，医疗)
    private Integer periods;//贷款期限
    private String periodsType;//贷款期限单位（D-天，M-月,Y-年）
    private Long beginDate; //贷款开始日期
    private Long endDate; //贷款到期日期
    private BigDecimal allInRate;//综合利率
    private BigDecimal loanRate;//借款利率（即利率计算方式）
    private BigDecimal platformRate;//平台利率（手续费率）
    private Integer payeeType;//收款人类型(1-个人，2-法人)
    private String payeeBankAccountName; //收款人银行账户名
    private String payeeBankName;//收款人开户行(如:民生银行)
    private String payeeIdType;//收款人证件类型(1-身份证,2-营业执照)
    private String payeeIdNo;//证件号码(个人为身份证，企业为营业执照/统一社会信用代码)
    private String payeeOpeningBranch;//开户网点
    private String payeeIdNumber;//借款人身份证
    private String payeeBankAccount;//借款人银行账号
    private String payeeBankMobile;//借款人银行预留手机号
    private Integer status;//状态(1-未匹,2-匹配中,3-匹配完成,4-还款完成,99-已完成)
    private BigDecimal matchedAmount;//已经匹配的金额
    private Integer matchedCount;//匹配轮次
    private Integer isMatchFinish;//是否匹配完成 1-是，2-不是
    private Integer isCheck;//是否验证完成1-是，2-不是
    private Long mactchCompletionDate;//匹配完成时间
    private Long create_date;//创建时间
    private Long updateDate;//修改时间


    public Loan() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLoanCode() {
        return loanCode;
    }

    public void setLoanCode(String loanCode) {
        this.loanCode = loanCode;
    }

    public String getChannelLoanCode() {
        return channelLoanCode;
    }

    public void setChannelLoanCode(String channelLoanCode) {
        this.channelLoanCode = channelLoanCode;
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public String getRiskControlScore() {
        return riskControlScore;
    }

    public void setRiskControlScore(String riskControlScore) {
        this.riskControlScore = riskControlScore;
    }

    public BigDecimal getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(BigDecimal loanAmount) {
        this.loanAmount = loanAmount;
    }

    public BigDecimal getCurrentCapital() {
        return currentCapital;
    }

    public void setCurrentCapital(BigDecimal currentCapital) {
        this.currentCapital = currentCapital;
    }

    public Integer getRepaymentType() {
        return repaymentType;
    }

    public void setRepaymentType(Integer repaymentType) {
        this.repaymentType = repaymentType;
    }

    public Integer getPurpose() {
        return purpose;
    }

    public void setPurpose(Integer purpose) {
        this.purpose = purpose;
    }

    public Integer getPeriods() {
        return periods;
    }

    public void setPeriods(Integer periods) {
        this.periods = periods;
    }

    public String getPeriodsType() {
        return periodsType;
    }

    public void setPeriodsType(String periodsType) {
        this.periodsType = periodsType;
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

    public BigDecimal getAllInRate() {
        return allInRate;
    }

    public void setAllInRate(BigDecimal allInRate) {
        this.allInRate = allInRate;
    }

    public BigDecimal getLoanRate() {
        return loanRate;
    }

    public void setLoanRate(BigDecimal loanRate) {
        this.loanRate = loanRate;
    }

    public BigDecimal getPlatformRate() {
        return platformRate;
    }

    public void setPlatformRate(BigDecimal platformRate) {
        this.platformRate = platformRate;
    }

    public Integer getPayeeType() {
        return payeeType;
    }

    public void setPayeeType(Integer payeeType) {
        this.payeeType = payeeType;
    }

    public String getPayeeBankAccountName() {
        return payeeBankAccountName;
    }

    public void setPayeeBankAccountName(String payeeBankAccountName) {
        this.payeeBankAccountName = payeeBankAccountName;
    }

    public String getPayeeBankName() {
        return payeeBankName;
    }

    public void setPayeeBankName(String payeeBankName) {
        this.payeeBankName = payeeBankName;
    }

    public String getPayeeIdType() {
        return payeeIdType;
    }

    public void setPayeeIdType(String payeeIdType) {
        this.payeeIdType = payeeIdType;
    }

    public String getPayeeIdNo() {
        return payeeIdNo;
    }

    public void setPayeeIdNo(String payeeIdNo) {
        this.payeeIdNo = payeeIdNo;
    }

    public String getPayeeOpeningBranch() {
        return payeeOpeningBranch;
    }

    public void setPayeeOpeningBranch(String payeeOpeningBranch) {
        this.payeeOpeningBranch = payeeOpeningBranch;
    }

    public String getPayeeIdNumber() {
        return payeeIdNumber;
    }

    public void setPayeeIdNumber(String payeeIdNumber) {
        this.payeeIdNumber = payeeIdNumber;
    }

    public String getPayeeBankAccount() {
        return payeeBankAccount;
    }

    public void setPayeeBankAccount(String payeeBankAccount) {
        this.payeeBankAccount = payeeBankAccount;
    }

    public String getPayeeBankMobile() {
        return payeeBankMobile;
    }

    public void setPayeeBankMobile(String payeeBankMobile) {
        this.payeeBankMobile = payeeBankMobile;
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

    public Integer getMatchedCount() {
        return matchedCount;
    }

    public void setMatchedCount(Integer matchedCount) {
        this.matchedCount = matchedCount;
    }

    public Integer getIsMatchFinish() {
        return isMatchFinish;
    }

    public void setIsMatchFinish(Integer isMatchFinish) {
        this.isMatchFinish = isMatchFinish;
    }

    public Integer getIsCheck() {
        return isCheck;
    }

    public void setIsCheck(Integer isCheck) {
        this.isCheck = isCheck;
    }

    public Long getMactchCompletionDate() {
        return mactchCompletionDate;
    }

    public void setMactchCompletionDate(Long mactchCompletionDate) {
        this.mactchCompletionDate = mactchCompletionDate;
    }

    public Long getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Long create_date) {
        this.create_date = create_date;
    }

    public Long getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Long updateDate) {
        this.updateDate = updateDate;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Loan{");
        sb.append("id='").append(id).append('\'');
        sb.append("loanCode='").append(loanCode).append('\'');
        sb.append(", channelLoanCode='").append(channelLoanCode).append('\'');
        sb.append(", channelCode='").append(channelCode).append('\'');
        sb.append(", userCode='").append(userCode).append('\'');
        sb.append(", userName='").append(userName).append('\'');
        sb.append(", mobile='").append(mobile).append('\'');
        sb.append(", category=").append(category);
        sb.append(", riskControlScore='").append(riskControlScore).append('\'');
        sb.append(", loanAmount=").append(loanAmount);
        sb.append(", currentCapital=").append(currentCapital);
        sb.append(", repaymentType=").append(repaymentType);
        sb.append(", purpose=").append(purpose);
        sb.append(", periods=").append(periods);
        sb.append(", periodsType='").append(periodsType).append('\'');
        sb.append(", beginDate=").append(beginDate);
        sb.append(", endDate=").append(endDate);
        sb.append(", allInRate=").append(allInRate);
        sb.append(", loanRate=").append(loanRate);
        sb.append(", platformRate=").append(platformRate);
        sb.append(", payeeType=").append(payeeType);
        sb.append(", payeeBankAccountName='").append(payeeBankAccountName).append('\'');
        sb.append(", payeeBankName='").append(payeeBankName).append('\'');
        sb.append(", payeeIdType='").append(payeeIdType).append('\'');
        sb.append(", payeeIdNo='").append(payeeIdNo).append('\'');
        sb.append(", payeeOpeningBranch='").append(payeeOpeningBranch).append('\'');
        sb.append(", payeeIdNumber='").append(payeeIdNumber).append('\'');
        sb.append(", payeeBankAccount='").append(payeeBankAccount).append('\'');
        sb.append(", payeeBankMobile='").append(payeeBankMobile).append('\'');
        sb.append(", status=").append(status);
        sb.append(", matchedAmount=").append(matchedAmount);
        sb.append(", matchedCount=").append(matchedCount);
        sb.append(", isMatchFinish=").append(isMatchFinish);
        sb.append(", isCheck=").append(isCheck);
        sb.append(", mactchCompletionDate=").append(mactchCompletionDate);
        sb.append(", create_date=").append(create_date);
        sb.append(", updateDate=").append(updateDate);
        sb.append('}');
        return sb.toString();
    }
}
