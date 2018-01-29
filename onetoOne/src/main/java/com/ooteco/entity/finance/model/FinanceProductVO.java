package com.ooteco.entity.finance.model;

import java.io.Serializable;
import java.util.Date;

public class FinanceProductVO implements Serializable {
    private Integer financeProductsId;

    private Date createDate;

    private Date modifyDate;

    private String productsName;

    private Integer periods;

    private String periodsType;

    private Date startDate;

    private Date endDate;

    private String status;

    private static final long serialVersionUID = 1L;

    public Integer getFinanceProductsId() {
        return financeProductsId;
    }

    public void setFinanceProductsId(Integer financeProductsId) {
        this.financeProductsId = financeProductsId;
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

    public String getProductsName() {
        return productsName;
    }

    public void setProductsName(String productsName) {
        this.productsName = productsName == null ? null : productsName.trim();
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
        this.periodsType = periodsType == null ? null : periodsType.trim();
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public boolean isMonthPeriodProduct(){
        return this.getPeriodsType().equals("M");
    }
}