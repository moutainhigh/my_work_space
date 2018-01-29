package com.ooteco.entity.financeProducts.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FinanceProductsVOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FinanceProductsVOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(Integer value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(Integer value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(Integer value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(Integer value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(Integer value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<Integer> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<Integer> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(Integer value1, Integer value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNull() {
            addCriterion("project_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNotNull() {
            addCriterion("project_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNameEqualTo(String value) {
            addCriterion("project_name =", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotEqualTo(String value) {
            addCriterion("project_name <>", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThan(String value) {
            addCriterion("project_name >", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_name >=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThan(String value) {
            addCriterion("project_name <", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanOrEqualTo(String value) {
            addCriterion("project_name <=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLike(String value) {
            addCriterion("project_name like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotLike(String value) {
            addCriterion("project_name not like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameIn(List<String> values) {
            addCriterion("project_name in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotIn(List<String> values) {
            addCriterion("project_name not in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameBetween(String value1, String value2) {
            addCriterion("project_name between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotBetween(String value1, String value2) {
            addCriterion("project_name not between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andRaiseDateIsNull() {
            addCriterion("raise_date is null");
            return (Criteria) this;
        }

        public Criteria andRaiseDateIsNotNull() {
            addCriterion("raise_date is not null");
            return (Criteria) this;
        }

        public Criteria andRaiseDateEqualTo(Date value) {
            addCriterionForJDBCDate("raise_date =", value, "raiseDate");
            return (Criteria) this;
        }

        public Criteria andRaiseDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("raise_date <>", value, "raiseDate");
            return (Criteria) this;
        }

        public Criteria andRaiseDateGreaterThan(Date value) {
            addCriterionForJDBCDate("raise_date >", value, "raiseDate");
            return (Criteria) this;
        }

        public Criteria andRaiseDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("raise_date >=", value, "raiseDate");
            return (Criteria) this;
        }

        public Criteria andRaiseDateLessThan(Date value) {
            addCriterionForJDBCDate("raise_date <", value, "raiseDate");
            return (Criteria) this;
        }

        public Criteria andRaiseDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("raise_date <=", value, "raiseDate");
            return (Criteria) this;
        }

        public Criteria andRaiseDateIn(List<Date> values) {
            addCriterionForJDBCDate("raise_date in", values, "raiseDate");
            return (Criteria) this;
        }

        public Criteria andRaiseDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("raise_date not in", values, "raiseDate");
            return (Criteria) this;
        }

        public Criteria andRaiseDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("raise_date between", value1, value2, "raiseDate");
            return (Criteria) this;
        }

        public Criteria andRaiseDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("raise_date not between", value1, value2, "raiseDate");
            return (Criteria) this;
        }

        public Criteria andCarryInterestDateIsNull() {
            addCriterion("carry_interest_date is null");
            return (Criteria) this;
        }

        public Criteria andCarryInterestDateIsNotNull() {
            addCriterion("carry_interest_date is not null");
            return (Criteria) this;
        }

        public Criteria andCarryInterestDateEqualTo(Date value) {
            addCriterionForJDBCDate("carry_interest_date =", value, "carryInterestDate");
            return (Criteria) this;
        }

        public Criteria andCarryInterestDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("carry_interest_date <>", value, "carryInterestDate");
            return (Criteria) this;
        }

        public Criteria andCarryInterestDateGreaterThan(Date value) {
            addCriterionForJDBCDate("carry_interest_date >", value, "carryInterestDate");
            return (Criteria) this;
        }

        public Criteria andCarryInterestDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("carry_interest_date >=", value, "carryInterestDate");
            return (Criteria) this;
        }

        public Criteria andCarryInterestDateLessThan(Date value) {
            addCriterionForJDBCDate("carry_interest_date <", value, "carryInterestDate");
            return (Criteria) this;
        }

        public Criteria andCarryInterestDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("carry_interest_date <=", value, "carryInterestDate");
            return (Criteria) this;
        }

        public Criteria andCarryInterestDateIn(List<Date> values) {
            addCriterionForJDBCDate("carry_interest_date in", values, "carryInterestDate");
            return (Criteria) this;
        }

        public Criteria andCarryInterestDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("carry_interest_date not in", values, "carryInterestDate");
            return (Criteria) this;
        }

        public Criteria andCarryInterestDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("carry_interest_date between", value1, value2, "carryInterestDate");
            return (Criteria) this;
        }

        public Criteria andCarryInterestDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("carry_interest_date not between", value1, value2, "carryInterestDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateIsNull() {
            addCriterion("expire_date is null");
            return (Criteria) this;
        }

        public Criteria andExpireDateIsNotNull() {
            addCriterion("expire_date is not null");
            return (Criteria) this;
        }

        public Criteria andExpireDateEqualTo(Date value) {
            addCriterionForJDBCDate("expire_date =", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("expire_date <>", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateGreaterThan(Date value) {
            addCriterionForJDBCDate("expire_date >", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("expire_date >=", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateLessThan(Date value) {
            addCriterionForJDBCDate("expire_date <", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("expire_date <=", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateIn(List<Date> values) {
            addCriterionForJDBCDate("expire_date in", values, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("expire_date not in", values, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("expire_date between", value1, value2, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("expire_date not between", value1, value2, "expireDate");
            return (Criteria) this;
        }

        public Criteria andDaysIsNull() {
            addCriterion("days is null");
            return (Criteria) this;
        }

        public Criteria andDaysIsNotNull() {
            addCriterion("days is not null");
            return (Criteria) this;
        }

        public Criteria andDaysEqualTo(Integer value) {
            addCriterion("days =", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysNotEqualTo(Integer value) {
            addCriterion("days <>", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysGreaterThan(Integer value) {
            addCriterion("days >", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("days >=", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysLessThan(Integer value) {
            addCriterion("days <", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysLessThanOrEqualTo(Integer value) {
            addCriterion("days <=", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysIn(List<Integer> values) {
            addCriterion("days in", values, "days");
            return (Criteria) this;
        }

        public Criteria andDaysNotIn(List<Integer> values) {
            addCriterion("days not in", values, "days");
            return (Criteria) this;
        }

        public Criteria andDaysBetween(Integer value1, Integer value2) {
            addCriterion("days between", value1, value2, "days");
            return (Criteria) this;
        }

        public Criteria andDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("days not between", value1, value2, "days");
            return (Criteria) this;
        }

        public Criteria andPredictYearEarningsIsNull() {
            addCriterion("predict_year_earnings is null");
            return (Criteria) this;
        }

        public Criteria andPredictYearEarningsIsNotNull() {
            addCriterion("predict_year_earnings is not null");
            return (Criteria) this;
        }

        public Criteria andPredictYearEarningsEqualTo(String value) {
            addCriterion("predict_year_earnings =", value, "predictYearEarnings");
            return (Criteria) this;
        }

        public Criteria andPredictYearEarningsNotEqualTo(String value) {
            addCriterion("predict_year_earnings <>", value, "predictYearEarnings");
            return (Criteria) this;
        }

        public Criteria andPredictYearEarningsGreaterThan(String value) {
            addCriterion("predict_year_earnings >", value, "predictYearEarnings");
            return (Criteria) this;
        }

        public Criteria andPredictYearEarningsGreaterThanOrEqualTo(String value) {
            addCriterion("predict_year_earnings >=", value, "predictYearEarnings");
            return (Criteria) this;
        }

        public Criteria andPredictYearEarningsLessThan(String value) {
            addCriterion("predict_year_earnings <", value, "predictYearEarnings");
            return (Criteria) this;
        }

        public Criteria andPredictYearEarningsLessThanOrEqualTo(String value) {
            addCriterion("predict_year_earnings <=", value, "predictYearEarnings");
            return (Criteria) this;
        }

        public Criteria andPredictYearEarningsLike(String value) {
            addCriterion("predict_year_earnings like", value, "predictYearEarnings");
            return (Criteria) this;
        }

        public Criteria andPredictYearEarningsNotLike(String value) {
            addCriterion("predict_year_earnings not like", value, "predictYearEarnings");
            return (Criteria) this;
        }

        public Criteria andPredictYearEarningsIn(List<String> values) {
            addCriterion("predict_year_earnings in", values, "predictYearEarnings");
            return (Criteria) this;
        }

        public Criteria andPredictYearEarningsNotIn(List<String> values) {
            addCriterion("predict_year_earnings not in", values, "predictYearEarnings");
            return (Criteria) this;
        }

        public Criteria andPredictYearEarningsBetween(String value1, String value2) {
            addCriterion("predict_year_earnings between", value1, value2, "predictYearEarnings");
            return (Criteria) this;
        }

        public Criteria andPredictYearEarningsNotBetween(String value1, String value2) {
            addCriterion("predict_year_earnings not between", value1, value2, "predictYearEarnings");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeIsNull() {
            addCriterion("sales_volume is null");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeIsNotNull() {
            addCriterion("sales_volume is not null");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeEqualTo(BigDecimal value) {
            addCriterion("sales_volume =", value, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeNotEqualTo(BigDecimal value) {
            addCriterion("sales_volume <>", value, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeGreaterThan(BigDecimal value) {
            addCriterion("sales_volume >", value, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sales_volume >=", value, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeLessThan(BigDecimal value) {
            addCriterion("sales_volume <", value, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sales_volume <=", value, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeIn(List<BigDecimal> values) {
            addCriterion("sales_volume in", values, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeNotIn(List<BigDecimal> values) {
            addCriterion("sales_volume not in", values, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sales_volume between", value1, value2, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sales_volume not between", value1, value2, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andExpireInterestIsNull() {
            addCriterion("expire_interest is null");
            return (Criteria) this;
        }

        public Criteria andExpireInterestIsNotNull() {
            addCriterion("expire_interest is not null");
            return (Criteria) this;
        }

        public Criteria andExpireInterestEqualTo(BigDecimal value) {
            addCriterion("expire_interest =", value, "expireInterest");
            return (Criteria) this;
        }

        public Criteria andExpireInterestNotEqualTo(BigDecimal value) {
            addCriterion("expire_interest <>", value, "expireInterest");
            return (Criteria) this;
        }

        public Criteria andExpireInterestGreaterThan(BigDecimal value) {
            addCriterion("expire_interest >", value, "expireInterest");
            return (Criteria) this;
        }

        public Criteria andExpireInterestGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("expire_interest >=", value, "expireInterest");
            return (Criteria) this;
        }

        public Criteria andExpireInterestLessThan(BigDecimal value) {
            addCriterion("expire_interest <", value, "expireInterest");
            return (Criteria) this;
        }

        public Criteria andExpireInterestLessThanOrEqualTo(BigDecimal value) {
            addCriterion("expire_interest <=", value, "expireInterest");
            return (Criteria) this;
        }

        public Criteria andExpireInterestIn(List<BigDecimal> values) {
            addCriterion("expire_interest in", values, "expireInterest");
            return (Criteria) this;
        }

        public Criteria andExpireInterestNotIn(List<BigDecimal> values) {
            addCriterion("expire_interest not in", values, "expireInterest");
            return (Criteria) this;
        }

        public Criteria andExpireInterestBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("expire_interest between", value1, value2, "expireInterest");
            return (Criteria) this;
        }

        public Criteria andExpireInterestNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("expire_interest not between", value1, value2, "expireInterest");
            return (Criteria) this;
        }

        public Criteria andExpireReturnedMoneyIsNull() {
            addCriterion("expire_returned_money is null");
            return (Criteria) this;
        }

        public Criteria andExpireReturnedMoneyIsNotNull() {
            addCriterion("expire_returned_money is not null");
            return (Criteria) this;
        }

        public Criteria andExpireReturnedMoneyEqualTo(BigDecimal value) {
            addCriterion("expire_returned_money =", value, "expireReturnedMoney");
            return (Criteria) this;
        }

        public Criteria andExpireReturnedMoneyNotEqualTo(BigDecimal value) {
            addCriterion("expire_returned_money <>", value, "expireReturnedMoney");
            return (Criteria) this;
        }

        public Criteria andExpireReturnedMoneyGreaterThan(BigDecimal value) {
            addCriterion("expire_returned_money >", value, "expireReturnedMoney");
            return (Criteria) this;
        }

        public Criteria andExpireReturnedMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("expire_returned_money >=", value, "expireReturnedMoney");
            return (Criteria) this;
        }

        public Criteria andExpireReturnedMoneyLessThan(BigDecimal value) {
            addCriterion("expire_returned_money <", value, "expireReturnedMoney");
            return (Criteria) this;
        }

        public Criteria andExpireReturnedMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("expire_returned_money <=", value, "expireReturnedMoney");
            return (Criteria) this;
        }

        public Criteria andExpireReturnedMoneyIn(List<BigDecimal> values) {
            addCriterion("expire_returned_money in", values, "expireReturnedMoney");
            return (Criteria) this;
        }

        public Criteria andExpireReturnedMoneyNotIn(List<BigDecimal> values) {
            addCriterion("expire_returned_money not in", values, "expireReturnedMoney");
            return (Criteria) this;
        }

        public Criteria andExpireReturnedMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("expire_returned_money between", value1, value2, "expireReturnedMoney");
            return (Criteria) this;
        }

        public Criteria andExpireReturnedMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("expire_returned_money not between", value1, value2, "expireReturnedMoney");
            return (Criteria) this;
        }

        public Criteria andInvestCountIsNull() {
            addCriterion("invest_count is null");
            return (Criteria) this;
        }

        public Criteria andInvestCountIsNotNull() {
            addCriterion("invest_count is not null");
            return (Criteria) this;
        }

        public Criteria andInvestCountEqualTo(Integer value) {
            addCriterion("invest_count =", value, "investCount");
            return (Criteria) this;
        }

        public Criteria andInvestCountNotEqualTo(Integer value) {
            addCriterion("invest_count <>", value, "investCount");
            return (Criteria) this;
        }

        public Criteria andInvestCountGreaterThan(Integer value) {
            addCriterion("invest_count >", value, "investCount");
            return (Criteria) this;
        }

        public Criteria andInvestCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("invest_count >=", value, "investCount");
            return (Criteria) this;
        }

        public Criteria andInvestCountLessThan(Integer value) {
            addCriterion("invest_count <", value, "investCount");
            return (Criteria) this;
        }

        public Criteria andInvestCountLessThanOrEqualTo(Integer value) {
            addCriterion("invest_count <=", value, "investCount");
            return (Criteria) this;
        }

        public Criteria andInvestCountIn(List<Integer> values) {
            addCriterion("invest_count in", values, "investCount");
            return (Criteria) this;
        }

        public Criteria andInvestCountNotIn(List<Integer> values) {
            addCriterion("invest_count not in", values, "investCount");
            return (Criteria) this;
        }

        public Criteria andInvestCountBetween(Integer value1, Integer value2) {
            addCriterion("invest_count between", value1, value2, "investCount");
            return (Criteria) this;
        }

        public Criteria andInvestCountNotBetween(Integer value1, Integer value2) {
            addCriterion("invest_count not between", value1, value2, "investCount");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andToAssetNameIsNull() {
            addCriterion("to_asset_name is null");
            return (Criteria) this;
        }

        public Criteria andToAssetNameIsNotNull() {
            addCriterion("to_asset_name is not null");
            return (Criteria) this;
        }

        public Criteria andToAssetNameEqualTo(String value) {
            addCriterion("to_asset_name =", value, "toAssetName");
            return (Criteria) this;
        }

        public Criteria andToAssetNameNotEqualTo(String value) {
            addCriterion("to_asset_name <>", value, "toAssetName");
            return (Criteria) this;
        }

        public Criteria andToAssetNameGreaterThan(String value) {
            addCriterion("to_asset_name >", value, "toAssetName");
            return (Criteria) this;
        }

        public Criteria andToAssetNameGreaterThanOrEqualTo(String value) {
            addCriterion("to_asset_name >=", value, "toAssetName");
            return (Criteria) this;
        }

        public Criteria andToAssetNameLessThan(String value) {
            addCriterion("to_asset_name <", value, "toAssetName");
            return (Criteria) this;
        }

        public Criteria andToAssetNameLessThanOrEqualTo(String value) {
            addCriterion("to_asset_name <=", value, "toAssetName");
            return (Criteria) this;
        }

        public Criteria andToAssetNameLike(String value) {
            addCriterion("to_asset_name like", value, "toAssetName");
            return (Criteria) this;
        }

        public Criteria andToAssetNameNotLike(String value) {
            addCriterion("to_asset_name not like", value, "toAssetName");
            return (Criteria) this;
        }

        public Criteria andToAssetNameIn(List<String> values) {
            addCriterion("to_asset_name in", values, "toAssetName");
            return (Criteria) this;
        }

        public Criteria andToAssetNameNotIn(List<String> values) {
            addCriterion("to_asset_name not in", values, "toAssetName");
            return (Criteria) this;
        }

        public Criteria andToAssetNameBetween(String value1, String value2) {
            addCriterion("to_asset_name between", value1, value2, "toAssetName");
            return (Criteria) this;
        }

        public Criteria andToAssetNameNotBetween(String value1, String value2) {
            addCriterion("to_asset_name not between", value1, value2, "toAssetName");
            return (Criteria) this;
        }

        public Criteria andYearDaysIsNull() {
            addCriterion("year_days is null");
            return (Criteria) this;
        }

        public Criteria andYearDaysIsNotNull() {
            addCriterion("year_days is not null");
            return (Criteria) this;
        }

        public Criteria andYearDaysEqualTo(Integer value) {
            addCriterion("year_days =", value, "yearDays");
            return (Criteria) this;
        }

        public Criteria andYearDaysNotEqualTo(Integer value) {
            addCriterion("year_days <>", value, "yearDays");
            return (Criteria) this;
        }

        public Criteria andYearDaysGreaterThan(Integer value) {
            addCriterion("year_days >", value, "yearDays");
            return (Criteria) this;
        }

        public Criteria andYearDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("year_days >=", value, "yearDays");
            return (Criteria) this;
        }

        public Criteria andYearDaysLessThan(Integer value) {
            addCriterion("year_days <", value, "yearDays");
            return (Criteria) this;
        }

        public Criteria andYearDaysLessThanOrEqualTo(Integer value) {
            addCriterion("year_days <=", value, "yearDays");
            return (Criteria) this;
        }

        public Criteria andYearDaysIn(List<Integer> values) {
            addCriterion("year_days in", values, "yearDays");
            return (Criteria) this;
        }

        public Criteria andYearDaysNotIn(List<Integer> values) {
            addCriterion("year_days not in", values, "yearDays");
            return (Criteria) this;
        }

        public Criteria andYearDaysBetween(Integer value1, Integer value2) {
            addCriterion("year_days between", value1, value2, "yearDays");
            return (Criteria) this;
        }

        public Criteria andYearDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("year_days not between", value1, value2, "yearDays");
            return (Criteria) this;
        }

        public Criteria andYearSalesVolumeIsNull() {
            addCriterion("year_sales_volume is null");
            return (Criteria) this;
        }

        public Criteria andYearSalesVolumeIsNotNull() {
            addCriterion("year_sales_volume is not null");
            return (Criteria) this;
        }

        public Criteria andYearSalesVolumeEqualTo(BigDecimal value) {
            addCriterion("year_sales_volume =", value, "yearSalesVolume");
            return (Criteria) this;
        }

        public Criteria andYearSalesVolumeNotEqualTo(BigDecimal value) {
            addCriterion("year_sales_volume <>", value, "yearSalesVolume");
            return (Criteria) this;
        }

        public Criteria andYearSalesVolumeGreaterThan(BigDecimal value) {
            addCriterion("year_sales_volume >", value, "yearSalesVolume");
            return (Criteria) this;
        }

        public Criteria andYearSalesVolumeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("year_sales_volume >=", value, "yearSalesVolume");
            return (Criteria) this;
        }

        public Criteria andYearSalesVolumeLessThan(BigDecimal value) {
            addCriterion("year_sales_volume <", value, "yearSalesVolume");
            return (Criteria) this;
        }

        public Criteria andYearSalesVolumeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("year_sales_volume <=", value, "yearSalesVolume");
            return (Criteria) this;
        }

        public Criteria andYearSalesVolumeIn(List<BigDecimal> values) {
            addCriterion("year_sales_volume in", values, "yearSalesVolume");
            return (Criteria) this;
        }

        public Criteria andYearSalesVolumeNotIn(List<BigDecimal> values) {
            addCriterion("year_sales_volume not in", values, "yearSalesVolume");
            return (Criteria) this;
        }

        public Criteria andYearSalesVolumeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("year_sales_volume between", value1, value2, "yearSalesVolume");
            return (Criteria) this;
        }

        public Criteria andYearSalesVolumeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("year_sales_volume not between", value1, value2, "yearSalesVolume");
            return (Criteria) this;
        }

        public Criteria andProcedureRateIsNull() {
            addCriterion("procedure_rate is null");
            return (Criteria) this;
        }

        public Criteria andProcedureRateIsNotNull() {
            addCriterion("procedure_rate is not null");
            return (Criteria) this;
        }

        public Criteria andProcedureRateEqualTo(BigDecimal value) {
            addCriterion("procedure_rate =", value, "procedureRate");
            return (Criteria) this;
        }

        public Criteria andProcedureRateNotEqualTo(BigDecimal value) {
            addCriterion("procedure_rate <>", value, "procedureRate");
            return (Criteria) this;
        }

        public Criteria andProcedureRateGreaterThan(BigDecimal value) {
            addCriterion("procedure_rate >", value, "procedureRate");
            return (Criteria) this;
        }

        public Criteria andProcedureRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("procedure_rate >=", value, "procedureRate");
            return (Criteria) this;
        }

        public Criteria andProcedureRateLessThan(BigDecimal value) {
            addCriterion("procedure_rate <", value, "procedureRate");
            return (Criteria) this;
        }

        public Criteria andProcedureRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("procedure_rate <=", value, "procedureRate");
            return (Criteria) this;
        }

        public Criteria andProcedureRateIn(List<BigDecimal> values) {
            addCriterion("procedure_rate in", values, "procedureRate");
            return (Criteria) this;
        }

        public Criteria andProcedureRateNotIn(List<BigDecimal> values) {
            addCriterion("procedure_rate not in", values, "procedureRate");
            return (Criteria) this;
        }

        public Criteria andProcedureRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("procedure_rate between", value1, value2, "procedureRate");
            return (Criteria) this;
        }

        public Criteria andProcedureRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("procedure_rate not between", value1, value2, "procedureRate");
            return (Criteria) this;
        }

        public Criteria andProcedurePriceIsNull() {
            addCriterion("procedure_price is null");
            return (Criteria) this;
        }

        public Criteria andProcedurePriceIsNotNull() {
            addCriterion("procedure_price is not null");
            return (Criteria) this;
        }

        public Criteria andProcedurePriceEqualTo(BigDecimal value) {
            addCriterion("procedure_price =", value, "procedurePrice");
            return (Criteria) this;
        }

        public Criteria andProcedurePriceNotEqualTo(BigDecimal value) {
            addCriterion("procedure_price <>", value, "procedurePrice");
            return (Criteria) this;
        }

        public Criteria andProcedurePriceGreaterThan(BigDecimal value) {
            addCriterion("procedure_price >", value, "procedurePrice");
            return (Criteria) this;
        }

        public Criteria andProcedurePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("procedure_price >=", value, "procedurePrice");
            return (Criteria) this;
        }

        public Criteria andProcedurePriceLessThan(BigDecimal value) {
            addCriterion("procedure_price <", value, "procedurePrice");
            return (Criteria) this;
        }

        public Criteria andProcedurePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("procedure_price <=", value, "procedurePrice");
            return (Criteria) this;
        }

        public Criteria andProcedurePriceIn(List<BigDecimal> values) {
            addCriterion("procedure_price in", values, "procedurePrice");
            return (Criteria) this;
        }

        public Criteria andProcedurePriceNotIn(List<BigDecimal> values) {
            addCriterion("procedure_price not in", values, "procedurePrice");
            return (Criteria) this;
        }

        public Criteria andProcedurePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("procedure_price between", value1, value2, "procedurePrice");
            return (Criteria) this;
        }

        public Criteria andProcedurePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("procedure_price not between", value1, value2, "procedurePrice");
            return (Criteria) this;
        }

        public Criteria andAssetRateIsNull() {
            addCriterion("asset_rate is null");
            return (Criteria) this;
        }

        public Criteria andAssetRateIsNotNull() {
            addCriterion("asset_rate is not null");
            return (Criteria) this;
        }

        public Criteria andAssetRateEqualTo(BigDecimal value) {
            addCriterion("asset_rate =", value, "assetRate");
            return (Criteria) this;
        }

        public Criteria andAssetRateNotEqualTo(BigDecimal value) {
            addCriterion("asset_rate <>", value, "assetRate");
            return (Criteria) this;
        }

        public Criteria andAssetRateGreaterThan(BigDecimal value) {
            addCriterion("asset_rate >", value, "assetRate");
            return (Criteria) this;
        }

        public Criteria andAssetRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("asset_rate >=", value, "assetRate");
            return (Criteria) this;
        }

        public Criteria andAssetRateLessThan(BigDecimal value) {
            addCriterion("asset_rate <", value, "assetRate");
            return (Criteria) this;
        }

        public Criteria andAssetRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("asset_rate <=", value, "assetRate");
            return (Criteria) this;
        }

        public Criteria andAssetRateIn(List<BigDecimal> values) {
            addCriterion("asset_rate in", values, "assetRate");
            return (Criteria) this;
        }

        public Criteria andAssetRateNotIn(List<BigDecimal> values) {
            addCriterion("asset_rate not in", values, "assetRate");
            return (Criteria) this;
        }

        public Criteria andAssetRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("asset_rate between", value1, value2, "assetRate");
            return (Criteria) this;
        }

        public Criteria andAssetRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("asset_rate not between", value1, value2, "assetRate");
            return (Criteria) this;
        }

        public Criteria andExpireAssetCashInterestIsNull() {
            addCriterion("expire_asset_cash_interest is null");
            return (Criteria) this;
        }

        public Criteria andExpireAssetCashInterestIsNotNull() {
            addCriterion("expire_asset_cash_interest is not null");
            return (Criteria) this;
        }

        public Criteria andExpireAssetCashInterestEqualTo(BigDecimal value) {
            addCriterion("expire_asset_cash_interest =", value, "expireAssetCashInterest");
            return (Criteria) this;
        }

        public Criteria andExpireAssetCashInterestNotEqualTo(BigDecimal value) {
            addCriterion("expire_asset_cash_interest <>", value, "expireAssetCashInterest");
            return (Criteria) this;
        }

        public Criteria andExpireAssetCashInterestGreaterThan(BigDecimal value) {
            addCriterion("expire_asset_cash_interest >", value, "expireAssetCashInterest");
            return (Criteria) this;
        }

        public Criteria andExpireAssetCashInterestGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("expire_asset_cash_interest >=", value, "expireAssetCashInterest");
            return (Criteria) this;
        }

        public Criteria andExpireAssetCashInterestLessThan(BigDecimal value) {
            addCriterion("expire_asset_cash_interest <", value, "expireAssetCashInterest");
            return (Criteria) this;
        }

        public Criteria andExpireAssetCashInterestLessThanOrEqualTo(BigDecimal value) {
            addCriterion("expire_asset_cash_interest <=", value, "expireAssetCashInterest");
            return (Criteria) this;
        }

        public Criteria andExpireAssetCashInterestIn(List<BigDecimal> values) {
            addCriterion("expire_asset_cash_interest in", values, "expireAssetCashInterest");
            return (Criteria) this;
        }

        public Criteria andExpireAssetCashInterestNotIn(List<BigDecimal> values) {
            addCriterion("expire_asset_cash_interest not in", values, "expireAssetCashInterest");
            return (Criteria) this;
        }

        public Criteria andExpireAssetCashInterestBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("expire_asset_cash_interest between", value1, value2, "expireAssetCashInterest");
            return (Criteria) this;
        }

        public Criteria andExpireAssetCashInterestNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("expire_asset_cash_interest not between", value1, value2, "expireAssetCashInterest");
            return (Criteria) this;
        }

        public Criteria andInterestDifferentialIsNull() {
            addCriterion("interest_differential is null");
            return (Criteria) this;
        }

        public Criteria andInterestDifferentialIsNotNull() {
            addCriterion("interest_differential is not null");
            return (Criteria) this;
        }

        public Criteria andInterestDifferentialEqualTo(BigDecimal value) {
            addCriterion("interest_differential =", value, "interestDifferential");
            return (Criteria) this;
        }

        public Criteria andInterestDifferentialNotEqualTo(BigDecimal value) {
            addCriterion("interest_differential <>", value, "interestDifferential");
            return (Criteria) this;
        }

        public Criteria andInterestDifferentialGreaterThan(BigDecimal value) {
            addCriterion("interest_differential >", value, "interestDifferential");
            return (Criteria) this;
        }

        public Criteria andInterestDifferentialGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("interest_differential >=", value, "interestDifferential");
            return (Criteria) this;
        }

        public Criteria andInterestDifferentialLessThan(BigDecimal value) {
            addCriterion("interest_differential <", value, "interestDifferential");
            return (Criteria) this;
        }

        public Criteria andInterestDifferentialLessThanOrEqualTo(BigDecimal value) {
            addCriterion("interest_differential <=", value, "interestDifferential");
            return (Criteria) this;
        }

        public Criteria andInterestDifferentialIn(List<BigDecimal> values) {
            addCriterion("interest_differential in", values, "interestDifferential");
            return (Criteria) this;
        }

        public Criteria andInterestDifferentialNotIn(List<BigDecimal> values) {
            addCriterion("interest_differential not in", values, "interestDifferential");
            return (Criteria) this;
        }

        public Criteria andInterestDifferentialBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interest_differential between", value1, value2, "interestDifferential");
            return (Criteria) this;
        }

        public Criteria andInterestDifferentialNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interest_differential not between", value1, value2, "interestDifferential");
            return (Criteria) this;
        }

        public Criteria andYearSaleIsNull() {
            addCriterion("year_sale is null");
            return (Criteria) this;
        }

        public Criteria andYearSaleIsNotNull() {
            addCriterion("year_sale is not null");
            return (Criteria) this;
        }

        public Criteria andYearSaleEqualTo(BigDecimal value) {
            addCriterion("year_sale =", value, "yearSale");
            return (Criteria) this;
        }

        public Criteria andYearSaleNotEqualTo(BigDecimal value) {
            addCriterion("year_sale <>", value, "yearSale");
            return (Criteria) this;
        }

        public Criteria andYearSaleGreaterThan(BigDecimal value) {
            addCriterion("year_sale >", value, "yearSale");
            return (Criteria) this;
        }

        public Criteria andYearSaleGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("year_sale >=", value, "yearSale");
            return (Criteria) this;
        }

        public Criteria andYearSaleLessThan(BigDecimal value) {
            addCriterion("year_sale <", value, "yearSale");
            return (Criteria) this;
        }

        public Criteria andYearSaleLessThanOrEqualTo(BigDecimal value) {
            addCriterion("year_sale <=", value, "yearSale");
            return (Criteria) this;
        }

        public Criteria andYearSaleIn(List<BigDecimal> values) {
            addCriterion("year_sale in", values, "yearSale");
            return (Criteria) this;
        }

        public Criteria andYearSaleNotIn(List<BigDecimal> values) {
            addCriterion("year_sale not in", values, "yearSale");
            return (Criteria) this;
        }

        public Criteria andYearSaleBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("year_sale between", value1, value2, "yearSale");
            return (Criteria) this;
        }

        public Criteria andYearSaleNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("year_sale not between", value1, value2, "yearSale");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}