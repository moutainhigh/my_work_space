package com.ooteco.entity.finance.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PreRedemptionVOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PreRedemptionVOExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andRedemptionMoneyIsNull() {
            addCriterion("redemption_money is null");
            return (Criteria) this;
        }

        public Criteria andRedemptionMoneyIsNotNull() {
            addCriterion("redemption_money is not null");
            return (Criteria) this;
        }

        public Criteria andRedemptionMoneyEqualTo(BigDecimal value) {
            addCriterion("redemption_money =", value, "redemptionMoney");
            return (Criteria) this;
        }

        public Criteria andRedemptionMoneyNotEqualTo(BigDecimal value) {
            addCriterion("redemption_money <>", value, "redemptionMoney");
            return (Criteria) this;
        }

        public Criteria andRedemptionMoneyGreaterThan(BigDecimal value) {
            addCriterion("redemption_money >", value, "redemptionMoney");
            return (Criteria) this;
        }

        public Criteria andRedemptionMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("redemption_money >=", value, "redemptionMoney");
            return (Criteria) this;
        }

        public Criteria andRedemptionMoneyLessThan(BigDecimal value) {
            addCriterion("redemption_money <", value, "redemptionMoney");
            return (Criteria) this;
        }

        public Criteria andRedemptionMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("redemption_money <=", value, "redemptionMoney");
            return (Criteria) this;
        }

        public Criteria andRedemptionMoneyIn(List<BigDecimal> values) {
            addCriterion("redemption_money in", values, "redemptionMoney");
            return (Criteria) this;
        }

        public Criteria andRedemptionMoneyNotIn(List<BigDecimal> values) {
            addCriterion("redemption_money not in", values, "redemptionMoney");
            return (Criteria) this;
        }

        public Criteria andRedemptionMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("redemption_money between", value1, value2, "redemptionMoney");
            return (Criteria) this;
        }

        public Criteria andRedemptionMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("redemption_money not between", value1, value2, "redemptionMoney");
            return (Criteria) this;
        }

        public Criteria andResidueInvestmentHorizonIsNull() {
            addCriterion("residue_investment_horizon is null");
            return (Criteria) this;
        }

        public Criteria andResidueInvestmentHorizonIsNotNull() {
            addCriterion("residue_investment_horizon is not null");
            return (Criteria) this;
        }

        public Criteria andResidueInvestmentHorizonEqualTo(Integer value) {
            addCriterion("residue_investment_horizon =", value, "residueInvestmentHorizon");
            return (Criteria) this;
        }

        public Criteria andResidueInvestmentHorizonNotEqualTo(Integer value) {
            addCriterion("residue_investment_horizon <>", value, "residueInvestmentHorizon");
            return (Criteria) this;
        }

        public Criteria andResidueInvestmentHorizonGreaterThan(Integer value) {
            addCriterion("residue_investment_horizon >", value, "residueInvestmentHorizon");
            return (Criteria) this;
        }

        public Criteria andResidueInvestmentHorizonGreaterThanOrEqualTo(Integer value) {
            addCriterion("residue_investment_horizon >=", value, "residueInvestmentHorizon");
            return (Criteria) this;
        }

        public Criteria andResidueInvestmentHorizonLessThan(Integer value) {
            addCriterion("residue_investment_horizon <", value, "residueInvestmentHorizon");
            return (Criteria) this;
        }

        public Criteria andResidueInvestmentHorizonLessThanOrEqualTo(Integer value) {
            addCriterion("residue_investment_horizon <=", value, "residueInvestmentHorizon");
            return (Criteria) this;
        }

        public Criteria andResidueInvestmentHorizonIn(List<Integer> values) {
            addCriterion("residue_investment_horizon in", values, "residueInvestmentHorizon");
            return (Criteria) this;
        }

        public Criteria andResidueInvestmentHorizonNotIn(List<Integer> values) {
            addCriterion("residue_investment_horizon not in", values, "residueInvestmentHorizon");
            return (Criteria) this;
        }

        public Criteria andResidueInvestmentHorizonBetween(Integer value1, Integer value2) {
            addCriterion("residue_investment_horizon between", value1, value2, "residueInvestmentHorizon");
            return (Criteria) this;
        }

        public Criteria andResidueInvestmentHorizonNotBetween(Integer value1, Integer value2) {
            addCriterion("residue_investment_horizon not between", value1, value2, "residueInvestmentHorizon");
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