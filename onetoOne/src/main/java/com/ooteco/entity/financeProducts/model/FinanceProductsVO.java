package com.ooteco.entity.financeProducts.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class FinanceProductsVO implements Serializable {
    private Integer id;

    private Integer code;

    private String projectName;

    private Date raiseDate;

    private Date carryInterestDate;

    private Date expireDate;

    private Integer days;

    private String predictYearEarnings;

    private BigDecimal salesVolume;

    private BigDecimal expireInterest;

    private BigDecimal expireReturnedMoney;

    private Integer investCount;

    private String status;

    private String toAssetName;

    private Integer yearDays;

    private BigDecimal yearSalesVolume;

    private BigDecimal procedureRate;

    private BigDecimal procedurePrice;

    private BigDecimal assetRate;

    private BigDecimal expireAssetCashInterest;

    private BigDecimal interestDifferential;

    private BigDecimal yearSale;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public Date getRaiseDate() {
        return raiseDate;
    }

    public void setRaiseDate(Date raiseDate) {
        this.raiseDate = raiseDate;
    }

    public Date getCarryInterestDate() {
        return carryInterestDate;
    }

    public void setCarryInterestDate(Date carryInterestDate) {
        this.carryInterestDate = carryInterestDate;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public String getPredictYearEarnings() {
        return predictYearEarnings;
    }

    public void setPredictYearEarnings(String predictYearEarnings) {
        this.predictYearEarnings = predictYearEarnings == null ? null : predictYearEarnings.trim();
    }

    public BigDecimal getSalesVolume() {
        return salesVolume;
    }

    public void setSalesVolume(BigDecimal salesVolume) {
        this.salesVolume = salesVolume;
    }

    public BigDecimal getExpireInterest() {
        return expireInterest;
    }

    public void setExpireInterest(BigDecimal expireInterest) {
        this.expireInterest = expireInterest;
    }

    public BigDecimal getExpireReturnedMoney() {
        return expireReturnedMoney;
    }

    public void setExpireReturnedMoney(BigDecimal expireReturnedMoney) {
        this.expireReturnedMoney = expireReturnedMoney;
    }

    public Integer getInvestCount() {
        return investCount;
    }

    public void setInvestCount(Integer investCount) {
        this.investCount = investCount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getToAssetName() {
        return toAssetName;
    }

    public void setToAssetName(String toAssetName) {
        this.toAssetName = toAssetName == null ? null : toAssetName.trim();
    }

    public Integer getYearDays() {
        return yearDays;
    }

    public void setYearDays(Integer yearDays) {
        this.yearDays = yearDays;
    }

    public BigDecimal getYearSalesVolume() {
        return yearSalesVolume;
    }

    public void setYearSalesVolume(BigDecimal yearSalesVolume) {
        this.yearSalesVolume = yearSalesVolume;
    }

    public BigDecimal getProcedureRate() {
        return procedureRate;
    }

    public void setProcedureRate(BigDecimal procedureRate) {
        this.procedureRate = procedureRate;
    }

    public BigDecimal getProcedurePrice() {
        return procedurePrice;
    }

    public void setProcedurePrice(BigDecimal procedurePrice) {
        this.procedurePrice = procedurePrice;
    }

    public BigDecimal getAssetRate() {
        return assetRate;
    }

    public void setAssetRate(BigDecimal assetRate) {
        this.assetRate = assetRate;
    }

    public BigDecimal getExpireAssetCashInterest() {
        return expireAssetCashInterest;
    }

    public void setExpireAssetCashInterest(BigDecimal expireAssetCashInterest) {
        this.expireAssetCashInterest = expireAssetCashInterest;
    }

    public BigDecimal getInterestDifferential() {
        return interestDifferential;
    }

    public void setInterestDifferential(BigDecimal interestDifferential) {
        this.interestDifferential = interestDifferential;
    }

    public BigDecimal getYearSale() {
        return yearSale;
    }

    public void setYearSale(BigDecimal yearSale) {
        this.yearSale = yearSale;
    }
}