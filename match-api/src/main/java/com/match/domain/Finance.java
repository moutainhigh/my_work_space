package com.match.domain;

import com.match.utils.StringUtil;

import java.math.BigDecimal;

/**
 * 理财订单(mongodb)
 */
public class Finance {
    
    private String id;
    
    private String financeCode; // 平台理财订单唯一标识
    
    private String channelFinanceCode; // 渠道理财唯一标识码（续期订单必须订单号不一样）
    
    private String channelCode; // 渠道号
    
    private String channelUserCode; // 用户唯一标识号
    
    private String channelFinanceProductName; // 理财产品名称
    
    private Integer channelFinanceProductId; // 理财产品id
    
    private Integer investmentHorizon; // 投资期限(天)
    
    private BigDecimal financeAmount; // 投资金额
    
    private Long beginDate; // 投资确认时间(开始时间)
    
    private Long endDate; // 理财赎回时间(到期时间)
    
    private Long realeEndDate; // 实际赎回时间
    
    private String userName; // 姓名
    
    private String mobile; // 手机
    
    private String idNumber; // 身份证号
    
    private BigDecimal rate; // 投资利率
    
    private BigDecimal increasedRate; // 加息利率
    
    private Integer isRenewing; // 是否自动续期,1-是，2-不是
    
    private Integer status; // 状态(1-未匹配，2-匹配中，3-匹配完成,4-等待赎回，5-赎回完成，99-已完成)
    
    private Integer matchedCount; // 匹配轮次
    
    private BigDecimal matchedAmount; // 已经匹配的金额(匹配过程中先更新该字段，再更新匹配结果到hbase中)
    
    private Long matchCompletionDate; // 匹配完成时间
    
    private Long createDate; // 创建时间
    
    private Long updateDate; // 修改时间
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getFinanceCode() {
        return financeCode;
    }
    
    public void setFinanceCode(String financeCode) {
        this.financeCode = financeCode;
    }
    
    public String getChannelFinanceCode() {
        return channelFinanceCode;
    }
    
    public void setChannelFinanceCode(String channelFinanceCode) {
        this.channelFinanceCode = channelFinanceCode;
    }
    
    public String getChannelCode() {
        return channelCode;
    }
    
    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }
    
    public String getChannelUserCode() {
        return channelUserCode;
    }
    
    public void setChannelUserCode(String channelUserCode) {
        this.channelUserCode = channelUserCode;
    }
    
    public String getChannelFinanceProductName() {
        return channelFinanceProductName;
    }
    
    public void setChannelFinanceProductName(String channelFinanceProductName) {
        this.channelFinanceProductName = channelFinanceProductName;
    }
    
    public Integer getChannelFinanceProductId() {
        return channelFinanceProductId;
    }
    
    public void setChannelFinanceProductId(Integer channelFinanceProductId) {
        this.channelFinanceProductId = channelFinanceProductId;
    }
    
    public Integer getInvestmentHorizon() {
        return investmentHorizon;
    }
    
    public void setInvestmentHorizon(Integer investmentHorizon) {
        this.investmentHorizon = investmentHorizon;
    }
    
    public BigDecimal getFinanceAmount() {
        return financeAmount;
    }
    
    public void setFinanceAmount(BigDecimal financeAmount) {
        this.financeAmount = financeAmount;
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
    
    public Long getRealeEndDate() {
        return realeEndDate;
    }
    
    public void setRealeEndDate(Long realeEndDate) {
        this.realeEndDate = realeEndDate;
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
    
    public String getIdNumber() {
        return idNumber;
    }
    
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
    
    public BigDecimal getRate() {
        return rate;
    }
    
    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }
    
    public BigDecimal getIncreasedRate() {
        return increasedRate;
    }
    
    public void setIncreasedRate(BigDecimal increasedRate) {
        this.increasedRate = increasedRate;
    }
    
    public Integer getIsRenewing() {
        return isRenewing;
    }
    
    public void setIsRenewing(Integer isRenewing) {
        this.isRenewing = isRenewing;
    }
    
    public Integer getStatus() {
        return status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }
    
    public Integer getMatchedCount() {
        return matchedCount;
    }
    
    public void setMatchedCount(Integer matchedCount) {
        this.matchedCount = matchedCount;
    }
    
    public BigDecimal getMatchedAmount() {
        return matchedAmount;
    }
    
    public void setMatchedAmount(BigDecimal matchedAmount) {
        this.matchedAmount = matchedAmount;
    }
    
    public Long getMatchCompletionDate() {
        return matchCompletionDate;
    }
    
    public void setMatchCompletionDate(Long matchCompletionDate) {
        this.matchCompletionDate = matchCompletionDate;
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
        return StringUtil.beanObject2String(this);
    }
}
