package com.match.domain;

import java.math.BigDecimal;

/**
 * 资产匹配结果(hbase)
 */
public class LoanMatch {


    private String rowkey;
    private String financeCode;//平台理财订单唯一标识
    private Integer financeProductId;//平台理财订单唯一标识
    private String financeProductName;//理财产品名称
    private Integer periodsTime;//周期
    private Integer periodsType;//周期类型(D-天，M-月)
    private Long beginDate;//投资开始日期
    private Long endDate;//投资结束日期
    private Long realEndDate;//实际赎回时间
    private Integer status;//资金状态(1-未匹配，2-匹配中，3-匹配完成,4-等待赎回，5-赎回完成，99-已完成)
    private BigDecimal rate;//投资利率


    public LoanMatch() {
    }

    public String getRowkey() {
        return rowkey;
    }

    public void setRowkey(String rowkey) {
        this.rowkey = rowkey;
    }

    public String getFinanceCode() {
        return financeCode;
    }

    public void setFinanceCode(String financeCode) {
        this.financeCode = financeCode;
    }

    public Integer getFinanceProductId() {
        return financeProductId;
    }

    public void setFinanceProductId(Integer financeProductId) {
        this.financeProductId = financeProductId;
    }

    public String getFinanceProductName() {
        return financeProductName;
    }

    public void setFinanceProductName(String financeProductName) {
        this.financeProductName = financeProductName;
    }

    public Integer getPeriodsTime() {
        return periodsTime;
    }

    public void setPeriodsTime(Integer periodsTime) {
        this.periodsTime = periodsTime;
    }

    public Integer getPeriodsType() {
        return periodsType;
    }

    public void setPeriodsType(Integer periodsType) {
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

    public Long getRealEndDate() {
        return realEndDate;
    }

    public void setRealEndDate(Long realEndDate) {
        this.realEndDate = realEndDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FinanceMatch{");
        sb.append("rowkey='").append(rowkey).append('\'');
        sb.append("financeCode='").append(financeCode).append('\'');
        sb.append(", financeProductId=").append(financeProductId);
        sb.append(", financeProductName='").append(financeProductName).append('\'');
        sb.append(", periodsTime=").append(periodsTime);
        sb.append(", periodsType=").append(periodsType);
        sb.append(", beginDate=").append(beginDate);
        sb.append(", endDate=").append(endDate);
        sb.append(", realEndDate=").append(realEndDate);
        sb.append(", status=").append(status);
        sb.append(", rate=").append(rate);
        sb.append('}');
        return sb.toString();
    }






}
