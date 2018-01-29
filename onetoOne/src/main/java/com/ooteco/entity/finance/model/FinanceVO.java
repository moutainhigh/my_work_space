package com.ooteco.entity.finance.model;

import com.ooteco.entity.req.BaseReq;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class FinanceVO extends BaseReq implements Serializable {
    @NotNull(message = "financeCode can't be null")
    private String financeCode;

    private Date createDate;

    private Date modifyDate;

    @NotNull(message = "userCode can't be null")
    private String userCode;

    private String name;

    private String mobile;

    private String idNumber;

    private Integer status;

    private Integer type;

    @NotNull(message = "financeMoney can't be null")
    private BigDecimal financeMoney;

    @NotNull(message = "financeProducts can't be null")
    private String financeProducts;

    @NotNull(message = "financeProductsId can't be null")
    private Integer financeProductsId;

    @NotNull(message = "investmentHorizon can't be null")
    private Integer investmentHorizon;

    @DateTimeFormat(pattern = "yyyyMMdd")
    @NotNull(message = "financeDate can't be null")
    private Date financeDate;

    @DateTimeFormat(pattern = "yyyyMMdd")
    @NotNull(message = "redemptionDate can't be null")
    private Date redemptionDate;

    private Date realRedemptionDate;

    @NotNull(message = "realRate can't be null")
    private BigDecimal realRate;

    private Integer monthPeriod;

    private static final long serialVersionUID = 1L;

    public Integer getMonthPeriod() {
        return monthPeriod;
    }

    public void setMonthPeriod(Integer monthPeriod) {
        this.monthPeriod = monthPeriod;
    }

    public String getFinanceCode() {
        return financeCode;
    }

    public void setFinanceCode(String financeCode) {
        this.financeCode = financeCode == null ? null : financeCode.trim();
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

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber == null ? null : idNumber.trim();
    }

    public BigDecimal getFinanceMoney() {
        return financeMoney;
    }

    public void setFinanceMoney(BigDecimal financeMoney) {
        this.financeMoney = financeMoney;
    }

    public String getFinanceProducts() {
        return financeProducts;
    }

    public void setFinanceProducts(String financeProducts) {
        this.financeProducts = financeProducts == null ? null : financeProducts.trim();
    }

    public Integer getFinanceProductsId() {
        return financeProductsId;
    }

    public void setFinanceProductsId(Integer financeProductsId) {
        this.financeProductsId = financeProductsId;
    }

    public Integer getInvestmentHorizon() {
        return investmentHorizon;
    }

    public void setInvestmentHorizon(Integer investmentHorizon) {
        this.investmentHorizon = investmentHorizon;
    }

    public Date getFinanceDate() {
        return financeDate;
    }

    public void setFinanceDate(Date financeDate) {
        this.financeDate = financeDate;
    }

    public Date getRedemptionDate() {
        return redemptionDate;
    }

    public void setRedemptionDate(Date redemptionDate) {
        this.redemptionDate = redemptionDate;
    }

    public Date getRealRedemptionDate() {
        return realRedemptionDate;
    }

    public void setRealRedemptionDate(Date realRedemptionDate) {
        this.realRedemptionDate = realRedemptionDate;
    }

    public BigDecimal getRealRate() {
        return realRate;
    }

    public void setRealRate(BigDecimal realRate) {
        this.realRate = realRate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getType() {
        return getStatus();
    }

    public void setType(Integer type) {
        this.type = type;
    }
}