package com.ooteco.entity.financialSale.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FinancialSaleVOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FinancialSaleVOExample() {
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

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("modify_time =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("modify_time <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("modify_time >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_time >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("modify_time <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("modify_time <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("modify_time in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("modify_time not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("modify_time between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("modify_time not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andTradeDateIsNull() {
            addCriterion("trade_date is null");
            return (Criteria) this;
        }

        public Criteria andTradeDateIsNotNull() {
            addCriterion("trade_date is not null");
            return (Criteria) this;
        }

        public Criteria andTradeDateEqualTo(Date value) {
            addCriterionForJDBCDate("trade_date =", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("trade_date <>", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateGreaterThan(Date value) {
            addCriterionForJDBCDate("trade_date >", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("trade_date >=", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateLessThan(Date value) {
            addCriterionForJDBCDate("trade_date <", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("trade_date <=", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateIn(List<Date> values) {
            addCriterionForJDBCDate("trade_date in", values, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("trade_date not in", values, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("trade_date between", value1, value2, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("trade_date not between", value1, value2, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andRaiseAmountIsNull() {
            addCriterion("raise_amount is null");
            return (Criteria) this;
        }

        public Criteria andRaiseAmountIsNotNull() {
            addCriterion("raise_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRaiseAmountEqualTo(BigDecimal value) {
            addCriterion("raise_amount =", value, "raiseAmount");
            return (Criteria) this;
        }

        public Criteria andRaiseAmountNotEqualTo(BigDecimal value) {
            addCriterion("raise_amount <>", value, "raiseAmount");
            return (Criteria) this;
        }

        public Criteria andRaiseAmountGreaterThan(BigDecimal value) {
            addCriterion("raise_amount >", value, "raiseAmount");
            return (Criteria) this;
        }

        public Criteria andRaiseAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("raise_amount >=", value, "raiseAmount");
            return (Criteria) this;
        }

        public Criteria andRaiseAmountLessThan(BigDecimal value) {
            addCriterion("raise_amount <", value, "raiseAmount");
            return (Criteria) this;
        }

        public Criteria andRaiseAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("raise_amount <=", value, "raiseAmount");
            return (Criteria) this;
        }

        public Criteria andRaiseAmountIn(List<BigDecimal> values) {
            addCriterion("raise_amount in", values, "raiseAmount");
            return (Criteria) this;
        }

        public Criteria andRaiseAmountNotIn(List<BigDecimal> values) {
            addCriterion("raise_amount not in", values, "raiseAmount");
            return (Criteria) this;
        }

        public Criteria andRaiseAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("raise_amount between", value1, value2, "raiseAmount");
            return (Criteria) this;
        }

        public Criteria andRaiseAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("raise_amount not between", value1, value2, "raiseAmount");
            return (Criteria) this;
        }

        public Criteria andExpireAmountIsNull() {
            addCriterion("expire_amount is null");
            return (Criteria) this;
        }

        public Criteria andExpireAmountIsNotNull() {
            addCriterion("expire_amount is not null");
            return (Criteria) this;
        }

        public Criteria andExpireAmountEqualTo(BigDecimal value) {
            addCriterion("expire_amount =", value, "expireAmount");
            return (Criteria) this;
        }

        public Criteria andExpireAmountNotEqualTo(BigDecimal value) {
            addCriterion("expire_amount <>", value, "expireAmount");
            return (Criteria) this;
        }

        public Criteria andExpireAmountGreaterThan(BigDecimal value) {
            addCriterion("expire_amount >", value, "expireAmount");
            return (Criteria) this;
        }

        public Criteria andExpireAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("expire_amount >=", value, "expireAmount");
            return (Criteria) this;
        }

        public Criteria andExpireAmountLessThan(BigDecimal value) {
            addCriterion("expire_amount <", value, "expireAmount");
            return (Criteria) this;
        }

        public Criteria andExpireAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("expire_amount <=", value, "expireAmount");
            return (Criteria) this;
        }

        public Criteria andExpireAmountIn(List<BigDecimal> values) {
            addCriterion("expire_amount in", values, "expireAmount");
            return (Criteria) this;
        }

        public Criteria andExpireAmountNotIn(List<BigDecimal> values) {
            addCriterion("expire_amount not in", values, "expireAmount");
            return (Criteria) this;
        }

        public Criteria andExpireAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("expire_amount between", value1, value2, "expireAmount");
            return (Criteria) this;
        }

        public Criteria andExpireAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("expire_amount not between", value1, value2, "expireAmount");
            return (Criteria) this;
        }

        public Criteria andRemainAmountIsNull() {
            addCriterion("remain_amount is null");
            return (Criteria) this;
        }

        public Criteria andRemainAmountIsNotNull() {
            addCriterion("remain_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRemainAmountEqualTo(BigDecimal value) {
            addCriterion("remain_amount =", value, "remainAmount");
            return (Criteria) this;
        }

        public Criteria andRemainAmountNotEqualTo(BigDecimal value) {
            addCriterion("remain_amount <>", value, "remainAmount");
            return (Criteria) this;
        }

        public Criteria andRemainAmountGreaterThan(BigDecimal value) {
            addCriterion("remain_amount >", value, "remainAmount");
            return (Criteria) this;
        }

        public Criteria andRemainAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("remain_amount >=", value, "remainAmount");
            return (Criteria) this;
        }

        public Criteria andRemainAmountLessThan(BigDecimal value) {
            addCriterion("remain_amount <", value, "remainAmount");
            return (Criteria) this;
        }

        public Criteria andRemainAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("remain_amount <=", value, "remainAmount");
            return (Criteria) this;
        }

        public Criteria andRemainAmountIn(List<BigDecimal> values) {
            addCriterion("remain_amount in", values, "remainAmount");
            return (Criteria) this;
        }

        public Criteria andRemainAmountNotIn(List<BigDecimal> values) {
            addCriterion("remain_amount not in", values, "remainAmount");
            return (Criteria) this;
        }

        public Criteria andRemainAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("remain_amount between", value1, value2, "remainAmount");
            return (Criteria) this;
        }

        public Criteria andRemainAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("remain_amount not between", value1, value2, "remainAmount");
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