package com.ooteco.entity.financeDayValue.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class FinanceDayValueVO implements Serializable {
    private Integer id;

    private Date time;

    private BigDecimal value;

    private BigDecimal tValue;

    private BigDecimal sumPrice;

    private BigDecimal sumHPrice;

    private BigDecimal rangeValue;

    private BigDecimal forecastNetAmount;

    private BigDecimal practicalNetAmount;

    private Integer type;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public BigDecimal gettValue() {
        return tValue;
    }

    public void settValue(BigDecimal tValue) {
        this.tValue = tValue;
    }

    public BigDecimal getSumPrice() {
        return sumPrice;
    }

    public void setSumPrice(BigDecimal sumPrice) {
        this.sumPrice = sumPrice;
    }

    public BigDecimal getSumHPrice() {
        return sumHPrice;
    }

    public void setSumHPrice(BigDecimal sumHPrice) {
        this.sumHPrice = sumHPrice;
    }

    public BigDecimal getRangeValue() {
        return rangeValue;
    }

    public void setRangeValue(BigDecimal rangeValue) {
        this.rangeValue = rangeValue;
    }

    public BigDecimal getForecastNetAmount() {
        return forecastNetAmount;
    }

    public void setForecastNetAmount(BigDecimal forecastNetAmount) {
        this.forecastNetAmount = forecastNetAmount;
    }

    public BigDecimal getPracticalNetAmount() {
        return practicalNetAmount;
    }

    public void setPracticalNetAmount(BigDecimal practicalNetAmount) {
        this.practicalNetAmount = practicalNetAmount;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}