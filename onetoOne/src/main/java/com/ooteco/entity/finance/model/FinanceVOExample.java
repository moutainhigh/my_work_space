package com.ooteco.entity.finance.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FinanceVOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FinanceVOExample() {
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

        public Criteria andFinanceCodeIsNull() {
            addCriterion("finance_code is null");
            return (Criteria) this;
        }

        public Criteria andFinanceCodeIsNotNull() {
            addCriterion("finance_code is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceCodeEqualTo(String value) {
            addCriterion("finance_code =", value, "financeCode");
            return (Criteria) this;
        }

        public Criteria andFinanceCodeNotEqualTo(String value) {
            addCriterion("finance_code <>", value, "financeCode");
            return (Criteria) this;
        }

        public Criteria andFinanceCodeGreaterThan(String value) {
            addCriterion("finance_code >", value, "financeCode");
            return (Criteria) this;
        }

        public Criteria andFinanceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("finance_code >=", value, "financeCode");
            return (Criteria) this;
        }

        public Criteria andFinanceCodeLessThan(String value) {
            addCriterion("finance_code <", value, "financeCode");
            return (Criteria) this;
        }

        public Criteria andFinanceCodeLessThanOrEqualTo(String value) {
            addCriterion("finance_code <=", value, "financeCode");
            return (Criteria) this;
        }

        public Criteria andFinanceCodeLike(String value) {
            addCriterion("finance_code like", value, "financeCode");
            return (Criteria) this;
        }

        public Criteria andFinanceCodeNotLike(String value) {
            addCriterion("finance_code not like", value, "financeCode");
            return (Criteria) this;
        }

        public Criteria andFinanceCodeIn(List<String> values) {
            addCriterion("finance_code in", values, "financeCode");
            return (Criteria) this;
        }

        public Criteria andFinanceCodeNotIn(List<String> values) {
            addCriterion("finance_code not in", values, "financeCode");
            return (Criteria) this;
        }

        public Criteria andFinanceCodeBetween(String value1, String value2) {
            addCriterion("finance_code between", value1, value2, "financeCode");
            return (Criteria) this;
        }

        public Criteria andFinanceCodeNotBetween(String value1, String value2) {
            addCriterion("finance_code not between", value1, value2, "financeCode");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateIsNull() {
            addCriterion("modify_date is null");
            return (Criteria) this;
        }

        public Criteria andModifyDateIsNotNull() {
            addCriterion("modify_date is not null");
            return (Criteria) this;
        }

        public Criteria andModifyDateEqualTo(Date value) {
            addCriterion("modify_date =", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotEqualTo(Date value) {
            addCriterion("modify_date <>", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateGreaterThan(Date value) {
            addCriterion("modify_date >", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_date >=", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateLessThan(Date value) {
            addCriterion("modify_date <", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateLessThanOrEqualTo(Date value) {
            addCriterion("modify_date <=", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateIn(List<Date> values) {
            addCriterion("modify_date in", values, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotIn(List<Date> values) {
            addCriterion("modify_date not in", values, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateBetween(Date value1, Date value2) {
            addCriterion("modify_date between", value1, value2, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotBetween(Date value1, Date value2) {
            addCriterion("modify_date not between", value1, value2, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andUserCodeIsNull() {
            addCriterion("user_code is null");
            return (Criteria) this;
        }

        public Criteria andUserCodeIsNotNull() {
            addCriterion("user_code is not null");
            return (Criteria) this;
        }

        public Criteria andUserCodeEqualTo(String value) {
            addCriterion("user_code =", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotEqualTo(String value) {
            addCriterion("user_code <>", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeGreaterThan(String value) {
            addCriterion("user_code >", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeGreaterThanOrEqualTo(String value) {
            addCriterion("user_code >=", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLessThan(String value) {
            addCriterion("user_code <", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLessThanOrEqualTo(String value) {
            addCriterion("user_code <=", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLike(String value) {
            addCriterion("user_code like", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotLike(String value) {
            addCriterion("user_code not like", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeIn(List<String> values) {
            addCriterion("user_code in", values, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotIn(List<String> values) {
            addCriterion("user_code not in", values, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeBetween(String value1, String value2) {
            addCriterion("user_code between", value1, value2, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotBetween(String value1, String value2) {
            addCriterion("user_code not between", value1, value2, "userCode");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andIdNumberIsNull() {
            addCriterion("id_number is null");
            return (Criteria) this;
        }

        public Criteria andIdNumberIsNotNull() {
            addCriterion("id_number is not null");
            return (Criteria) this;
        }

        public Criteria andIdNumberEqualTo(String value) {
            addCriterion("id_number =", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotEqualTo(String value) {
            addCriterion("id_number <>", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberGreaterThan(String value) {
            addCriterion("id_number >", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberGreaterThanOrEqualTo(String value) {
            addCriterion("id_number >=", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLessThan(String value) {
            addCriterion("id_number <", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLessThanOrEqualTo(String value) {
            addCriterion("id_number <=", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLike(String value) {
            addCriterion("id_number like", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotLike(String value) {
            addCriterion("id_number not like", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberIn(List<String> values) {
            addCriterion("id_number in", values, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotIn(List<String> values) {
            addCriterion("id_number not in", values, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberBetween(String value1, String value2) {
            addCriterion("id_number between", value1, value2, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotBetween(String value1, String value2) {
            addCriterion("id_number not between", value1, value2, "idNumber");
            return (Criteria) this;
        }

        public Criteria andFinanceMoneyIsNull() {
            addCriterion("finance_money is null");
            return (Criteria) this;
        }

        public Criteria andFinanceMoneyIsNotNull() {
            addCriterion("finance_money is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceMoneyEqualTo(BigDecimal value) {
            addCriterion("finance_money =", value, "financeMoney");
            return (Criteria) this;
        }

        public Criteria andFinanceMoneyNotEqualTo(BigDecimal value) {
            addCriterion("finance_money <>", value, "financeMoney");
            return (Criteria) this;
        }

        public Criteria andFinanceMoneyGreaterThan(BigDecimal value) {
            addCriterion("finance_money >", value, "financeMoney");
            return (Criteria) this;
        }

        public Criteria andFinanceMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("finance_money >=", value, "financeMoney");
            return (Criteria) this;
        }

        public Criteria andFinanceMoneyLessThan(BigDecimal value) {
            addCriterion("finance_money <", value, "financeMoney");
            return (Criteria) this;
        }

        public Criteria andFinanceMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("finance_money <=", value, "financeMoney");
            return (Criteria) this;
        }

        public Criteria andFinanceMoneyIn(List<BigDecimal> values) {
            addCriterion("finance_money in", values, "financeMoney");
            return (Criteria) this;
        }

        public Criteria andFinanceMoneyNotIn(List<BigDecimal> values) {
            addCriterion("finance_money not in", values, "financeMoney");
            return (Criteria) this;
        }

        public Criteria andFinanceMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("finance_money between", value1, value2, "financeMoney");
            return (Criteria) this;
        }

        public Criteria andFinanceMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("finance_money not between", value1, value2, "financeMoney");
            return (Criteria) this;
        }

        public Criteria andFinanceProductsIsNull() {
            addCriterion("finance_products is null");
            return (Criteria) this;
        }

        public Criteria andFinanceProductsIsNotNull() {
            addCriterion("finance_products is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceProductsEqualTo(String value) {
            addCriterion("finance_products =", value, "financeProducts");
            return (Criteria) this;
        }

        public Criteria andFinanceProductsNotEqualTo(String value) {
            addCriterion("finance_products <>", value, "financeProducts");
            return (Criteria) this;
        }

        public Criteria andFinanceProductsGreaterThan(String value) {
            addCriterion("finance_products >", value, "financeProducts");
            return (Criteria) this;
        }

        public Criteria andFinanceProductsGreaterThanOrEqualTo(String value) {
            addCriterion("finance_products >=", value, "financeProducts");
            return (Criteria) this;
        }

        public Criteria andFinanceProductsLessThan(String value) {
            addCriterion("finance_products <", value, "financeProducts");
            return (Criteria) this;
        }

        public Criteria andFinanceProductsLessThanOrEqualTo(String value) {
            addCriterion("finance_products <=", value, "financeProducts");
            return (Criteria) this;
        }

        public Criteria andFinanceProductsLike(String value) {
            addCriterion("finance_products like", value, "financeProducts");
            return (Criteria) this;
        }

        public Criteria andFinanceProductsNotLike(String value) {
            addCriterion("finance_products not like", value, "financeProducts");
            return (Criteria) this;
        }

        public Criteria andFinanceProductsIn(List<String> values) {
            addCriterion("finance_products in", values, "financeProducts");
            return (Criteria) this;
        }

        public Criteria andFinanceProductsNotIn(List<String> values) {
            addCriterion("finance_products not in", values, "financeProducts");
            return (Criteria) this;
        }

        public Criteria andFinanceProductsBetween(String value1, String value2) {
            addCriterion("finance_products between", value1, value2, "financeProducts");
            return (Criteria) this;
        }

        public Criteria andFinanceProductsNotBetween(String value1, String value2) {
            addCriterion("finance_products not between", value1, value2, "financeProducts");
            return (Criteria) this;
        }

        public Criteria andFinanceProductsIdIsNull() {
            addCriterion("finance_products_id is null");
            return (Criteria) this;
        }

        public Criteria andFinanceProductsIdIsNotNull() {
            addCriterion("finance_products_id is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceProductsIdEqualTo(Integer value) {
            addCriterion("finance_products_id =", value, "financeProductsId");
            return (Criteria) this;
        }

        public Criteria andFinanceProductsIdNotEqualTo(Integer value) {
            addCriterion("finance_products_id <>", value, "financeProductsId");
            return (Criteria) this;
        }

        public Criteria andFinanceProductsIdGreaterThan(Integer value) {
            addCriterion("finance_products_id >", value, "financeProductsId");
            return (Criteria) this;
        }

        public Criteria andFinanceProductsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("finance_products_id >=", value, "financeProductsId");
            return (Criteria) this;
        }

        public Criteria andFinanceProductsIdLessThan(Integer value) {
            addCriterion("finance_products_id <", value, "financeProductsId");
            return (Criteria) this;
        }

        public Criteria andFinanceProductsIdLessThanOrEqualTo(Integer value) {
            addCriterion("finance_products_id <=", value, "financeProductsId");
            return (Criteria) this;
        }

        public Criteria andFinanceProductsIdIn(List<Integer> values) {
            addCriterion("finance_products_id in", values, "financeProductsId");
            return (Criteria) this;
        }

        public Criteria andFinanceProductsIdNotIn(List<Integer> values) {
            addCriterion("finance_products_id not in", values, "financeProductsId");
            return (Criteria) this;
        }

        public Criteria andFinanceProductsIdBetween(Integer value1, Integer value2) {
            addCriterion("finance_products_id between", value1, value2, "financeProductsId");
            return (Criteria) this;
        }

        public Criteria andFinanceProductsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("finance_products_id not between", value1, value2, "financeProductsId");
            return (Criteria) this;
        }

        public Criteria andInvestmentHorizonIsNull() {
            addCriterion("investment_horizon is null");
            return (Criteria) this;
        }

        public Criteria andInvestmentHorizonIsNotNull() {
            addCriterion("investment_horizon is not null");
            return (Criteria) this;
        }

        public Criteria andInvestmentHorizonEqualTo(Integer value) {
            addCriterion("investment_horizon =", value, "investmentHorizon");
            return (Criteria) this;
        }

        public Criteria andInvestmentHorizonNotEqualTo(Integer value) {
            addCriterion("investment_horizon <>", value, "investmentHorizon");
            return (Criteria) this;
        }

        public Criteria andInvestmentHorizonGreaterThan(Integer value) {
            addCriterion("investment_horizon >", value, "investmentHorizon");
            return (Criteria) this;
        }

        public Criteria andInvestmentHorizonGreaterThanOrEqualTo(Integer value) {
            addCriterion("investment_horizon >=", value, "investmentHorizon");
            return (Criteria) this;
        }

        public Criteria andInvestmentHorizonLessThan(Integer value) {
            addCriterion("investment_horizon <", value, "investmentHorizon");
            return (Criteria) this;
        }

        public Criteria andInvestmentHorizonLessThanOrEqualTo(Integer value) {
            addCriterion("investment_horizon <=", value, "investmentHorizon");
            return (Criteria) this;
        }

        public Criteria andInvestmentHorizonIn(List<Integer> values) {
            addCriterion("investment_horizon in", values, "investmentHorizon");
            return (Criteria) this;
        }

        public Criteria andInvestmentHorizonNotIn(List<Integer> values) {
            addCriterion("investment_horizon not in", values, "investmentHorizon");
            return (Criteria) this;
        }

        public Criteria andInvestmentHorizonBetween(Integer value1, Integer value2) {
            addCriterion("investment_horizon between", value1, value2, "investmentHorizon");
            return (Criteria) this;
        }

        public Criteria andInvestmentHorizonNotBetween(Integer value1, Integer value2) {
            addCriterion("investment_horizon not between", value1, value2, "investmentHorizon");
            return (Criteria) this;
        }

        public Criteria andMonthPeriodIsNull() {
            addCriterion("month_period is null");
            return (Criteria) this;
        }

        public Criteria andMonthPeriodIsNotNull() {
            addCriterion("month_period is not null");
            return (Criteria) this;
        }

        public Criteria andMonthPeriodEqualTo(Integer value) {
            addCriterion("month_period =", value, "monthPeriod");
            return (Criteria) this;
        }

        public Criteria andMonthPeriodNotEqualTo(Integer value) {
            addCriterion("month_period <>", value, "monthPeriod");
            return (Criteria) this;
        }

        public Criteria andMonthPeriodGreaterThan(Integer value) {
            addCriterion("month_period >", value, "monthPeriod");
            return (Criteria) this;
        }

        public Criteria andMonthPeriodGreaterThanOrEqualTo(Integer value) {
            addCriterion("month_period >=", value, "monthPeriod");
            return (Criteria) this;
        }

        public Criteria andMonthPeriodLessThan(Integer value) {
            addCriterion("month_period <", value, "monthPeriod");
            return (Criteria) this;
        }

        public Criteria andMonthPeriodLessThanOrEqualTo(Integer value) {
            addCriterion("month_period <=", value, "monthPeriod");
            return (Criteria) this;
        }

        public Criteria andMonthPeriodIn(List<Integer> values) {
            addCriterion("month_period in", values, "monthPeriod");
            return (Criteria) this;
        }

        public Criteria andMonthPeriodNotIn(List<Integer> values) {
            addCriterion("month_period not in", values, "monthPeriod");
            return (Criteria) this;
        }

        public Criteria andMonthPeriodBetween(Integer value1, Integer value2) {
            addCriterion("month_period between", value1, value2, "monthPeriod");
            return (Criteria) this;
        }

        public Criteria andMonthPeriodNotBetween(Integer value1, Integer value2) {
            addCriterion("month_period not between", value1, value2, "monthPeriod");
            return (Criteria) this;
        }

        public Criteria andFinanceDateIsNull() {
            addCriterion("finance_date is null");
            return (Criteria) this;
        }

        public Criteria andFinanceDateIsNotNull() {
            addCriterion("finance_date is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceDateEqualTo(Date value) {
            addCriterionForJDBCDate("finance_date =", value, "financeDate");
            return (Criteria) this;
        }

        public Criteria andFinanceDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("finance_date <>", value, "financeDate");
            return (Criteria) this;
        }

        public Criteria andFinanceDateGreaterThan(Date value) {
            addCriterionForJDBCDate("finance_date >", value, "financeDate");
            return (Criteria) this;
        }

        public Criteria andFinanceDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("finance_date >=", value, "financeDate");
            return (Criteria) this;
        }

        public Criteria andFinanceDateLessThan(Date value) {
            addCriterionForJDBCDate("finance_date <", value, "financeDate");
            return (Criteria) this;
        }

        public Criteria andFinanceDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("finance_date <=", value, "financeDate");
            return (Criteria) this;
        }

        public Criteria andFinanceDateIn(List<Date> values) {
            addCriterionForJDBCDate("finance_date in", values, "financeDate");
            return (Criteria) this;
        }

        public Criteria andFinanceDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("finance_date not in", values, "financeDate");
            return (Criteria) this;
        }

        public Criteria andFinanceDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("finance_date between", value1, value2, "financeDate");
            return (Criteria) this;
        }

        public Criteria andFinanceDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("finance_date not between", value1, value2, "financeDate");
            return (Criteria) this;
        }

        public Criteria andRedemptionDateIsNull() {
            addCriterion("redemption_date is null");
            return (Criteria) this;
        }

        public Criteria andRedemptionDateIsNotNull() {
            addCriterion("redemption_date is not null");
            return (Criteria) this;
        }

        public Criteria andRedemptionDateEqualTo(Date value) {
            addCriterionForJDBCDate("redemption_date =", value, "redemptionDate");
            return (Criteria) this;
        }

        public Criteria andRedemptionDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("redemption_date <>", value, "redemptionDate");
            return (Criteria) this;
        }

        public Criteria andRedemptionDateGreaterThan(Date value) {
            addCriterionForJDBCDate("redemption_date >", value, "redemptionDate");
            return (Criteria) this;
        }

        public Criteria andRedemptionDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("redemption_date >=", value, "redemptionDate");
            return (Criteria) this;
        }

        public Criteria andRedemptionDateLessThan(Date value) {
            addCriterionForJDBCDate("redemption_date <", value, "redemptionDate");
            return (Criteria) this;
        }

        public Criteria andRedemptionDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("redemption_date <=", value, "redemptionDate");
            return (Criteria) this;
        }

        public Criteria andRedemptionDateIn(List<Date> values) {
            addCriterionForJDBCDate("redemption_date in", values, "redemptionDate");
            return (Criteria) this;
        }

        public Criteria andRedemptionDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("redemption_date not in", values, "redemptionDate");
            return (Criteria) this;
        }

        public Criteria andRedemptionDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("redemption_date between", value1, value2, "redemptionDate");
            return (Criteria) this;
        }

        public Criteria andRedemptionDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("redemption_date not between", value1, value2, "redemptionDate");
            return (Criteria) this;
        }

        public Criteria andRealRedemptionDateIsNull() {
            addCriterion("real_redemption_date is null");
            return (Criteria) this;
        }

        public Criteria andRealRedemptionDateIsNotNull() {
            addCriterion("real_redemption_date is not null");
            return (Criteria) this;
        }

        public Criteria andRealRedemptionDateEqualTo(Date value) {
            addCriterionForJDBCDate("real_redemption_date =", value, "realRedemptionDate");
            return (Criteria) this;
        }

        public Criteria andRealRedemptionDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("real_redemption_date <>", value, "realRedemptionDate");
            return (Criteria) this;
        }

        public Criteria andRealRedemptionDateGreaterThan(Date value) {
            addCriterionForJDBCDate("real_redemption_date >", value, "realRedemptionDate");
            return (Criteria) this;
        }

        public Criteria andRealRedemptionDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("real_redemption_date >=", value, "realRedemptionDate");
            return (Criteria) this;
        }

        public Criteria andRealRedemptionDateLessThan(Date value) {
            addCriterionForJDBCDate("real_redemption_date <", value, "realRedemptionDate");
            return (Criteria) this;
        }

        public Criteria andRealRedemptionDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("real_redemption_date <=", value, "realRedemptionDate");
            return (Criteria) this;
        }

        public Criteria andRealRedemptionDateIn(List<Date> values) {
            addCriterionForJDBCDate("real_redemption_date in", values, "realRedemptionDate");
            return (Criteria) this;
        }

        public Criteria andRealRedemptionDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("real_redemption_date not in", values, "realRedemptionDate");
            return (Criteria) this;
        }

        public Criteria andRealRedemptionDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("real_redemption_date between", value1, value2, "realRedemptionDate");
            return (Criteria) this;
        }

        public Criteria andRealRedemptionDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("real_redemption_date not between", value1, value2, "realRedemptionDate");
            return (Criteria) this;
        }

        public Criteria andRealRateIsNull() {
            addCriterion("real_rate is null");
            return (Criteria) this;
        }

        public Criteria andRealRateIsNotNull() {
            addCriterion("real_rate is not null");
            return (Criteria) this;
        }

        public Criteria andRealRateEqualTo(BigDecimal value) {
            addCriterion("real_rate =", value, "realRate");
            return (Criteria) this;
        }

        public Criteria andRealRateNotEqualTo(BigDecimal value) {
            addCriterion("real_rate <>", value, "realRate");
            return (Criteria) this;
        }

        public Criteria andRealRateGreaterThan(BigDecimal value) {
            addCriterion("real_rate >", value, "realRate");
            return (Criteria) this;
        }

        public Criteria andRealRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("real_rate >=", value, "realRate");
            return (Criteria) this;
        }

        public Criteria andRealRateLessThan(BigDecimal value) {
            addCriterion("real_rate <", value, "realRate");
            return (Criteria) this;
        }

        public Criteria andRealRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("real_rate <=", value, "realRate");
            return (Criteria) this;
        }

        public Criteria andRealRateIn(List<BigDecimal> values) {
            addCriterion("real_rate in", values, "realRate");
            return (Criteria) this;
        }

        public Criteria andRealRateNotIn(List<BigDecimal> values) {
            addCriterion("real_rate not in", values, "realRate");
            return (Criteria) this;
        }

        public Criteria andRealRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_rate between", value1, value2, "realRate");
            return (Criteria) this;
        }

        public Criteria andRealRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_rate not between", value1, value2, "realRate");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
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