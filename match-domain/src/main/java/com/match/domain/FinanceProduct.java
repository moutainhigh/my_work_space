package com.match.domain;

/**
 * 理财产品(mysql)
 */
public class FinanceProduct {
    private Long id; //主键
    private String channelCode;//渠道号
    private String name;//名称
    private Integer periodsTime;//周期
    private String periodsType;//周期类型(D-天，M-月)
    private Long beginDate;//开始日期
    private Long endDate;//结束时间(为空时表示长期)
    private Integer status;//状态(1-全部，2-募集中，3-暂停中，4-已结束)
    private Long createDate;//创建时间
    private Long updateDate;//修改时间

    public FinanceProduct() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPeriodsTime() {
        return periodsTime;
    }

    public void setPeriodsTime(Integer periodsTime) {
        this.periodsTime = periodsTime;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
        final StringBuilder sb = new StringBuilder("FinanceProduct{");
        sb.append("id=").append(id);
        sb.append(", channelCode='").append(channelCode).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", periodsTime=").append(periodsTime);
        sb.append(", periodsType='").append(periodsType).append('\'');
        sb.append(", beginDate=").append(beginDate);
        sb.append(", endDate=").append(endDate);
        sb.append(", status=").append(status);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateDate=").append(updateDate);
        sb.append('}');
        return sb.toString();
    }
}
