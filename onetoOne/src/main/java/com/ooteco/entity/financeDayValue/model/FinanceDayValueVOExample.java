package com.ooteco.entity.financeDayValue.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FinanceDayValueVOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FinanceDayValueVOExample() {
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

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterionForJDBCDate("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterionForJDBCDate("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterionForJDBCDate("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andValueIsNull() {
            addCriterion("value is null");
            return (Criteria) this;
        }

        public Criteria andValueIsNotNull() {
            addCriterion("value is not null");
            return (Criteria) this;
        }

        public Criteria andValueEqualTo(BigDecimal value) {
            addCriterion("value =", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotEqualTo(BigDecimal value) {
            addCriterion("value <>", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThan(BigDecimal value) {
            addCriterion("value >", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("value >=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThan(BigDecimal value) {
            addCriterion("value <", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("value <=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueIn(List<BigDecimal> values) {
            addCriterion("value in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotIn(List<BigDecimal> values) {
            addCriterion("value not in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("value between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("value not between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andTValueIsNull() {
            addCriterion("t_value is null");
            return (Criteria) this;
        }

        public Criteria andTValueIsNotNull() {
            addCriterion("t_value is not null");
            return (Criteria) this;
        }

        public Criteria andTValueEqualTo(BigDecimal value) {
            addCriterion("t_value =", value, "tValue");
            return (Criteria) this;
        }

        public Criteria andTValueNotEqualTo(BigDecimal value) {
            addCriterion("t_value <>", value, "tValue");
            return (Criteria) this;
        }

        public Criteria andTValueGreaterThan(BigDecimal value) {
            addCriterion("t_value >", value, "tValue");
            return (Criteria) this;
        }

        public Criteria andTValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("t_value >=", value, "tValue");
            return (Criteria) this;
        }

        public Criteria andTValueLessThan(BigDecimal value) {
            addCriterion("t_value <", value, "tValue");
            return (Criteria) this;
        }

        public Criteria andTValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("t_value <=", value, "tValue");
            return (Criteria) this;
        }

        public Criteria andTValueIn(List<BigDecimal> values) {
            addCriterion("t_value in", values, "tValue");
            return (Criteria) this;
        }

        public Criteria andTValueNotIn(List<BigDecimal> values) {
            addCriterion("t_value not in", values, "tValue");
            return (Criteria) this;
        }

        public Criteria andTValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t_value between", value1, value2, "tValue");
            return (Criteria) this;
        }

        public Criteria andTValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t_value not between", value1, value2, "tValue");
            return (Criteria) this;
        }

        public Criteria andSumPriceIsNull() {
            addCriterion("sum_price is null");
            return (Criteria) this;
        }

        public Criteria andSumPriceIsNotNull() {
            addCriterion("sum_price is not null");
            return (Criteria) this;
        }

        public Criteria andSumPriceEqualTo(BigDecimal value) {
            addCriterion("sum_price =", value, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andSumPriceNotEqualTo(BigDecimal value) {
            addCriterion("sum_price <>", value, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andSumPriceGreaterThan(BigDecimal value) {
            addCriterion("sum_price >", value, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andSumPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sum_price >=", value, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andSumPriceLessThan(BigDecimal value) {
            addCriterion("sum_price <", value, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andSumPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sum_price <=", value, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andSumPriceIn(List<BigDecimal> values) {
            addCriterion("sum_price in", values, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andSumPriceNotIn(List<BigDecimal> values) {
            addCriterion("sum_price not in", values, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andSumPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sum_price between", value1, value2, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andSumPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sum_price not between", value1, value2, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andSumHPriceIsNull() {
            addCriterion("sum_h_price is null");
            return (Criteria) this;
        }

        public Criteria andSumHPriceIsNotNull() {
            addCriterion("sum_h_price is not null");
            return (Criteria) this;
        }

        public Criteria andSumHPriceEqualTo(BigDecimal value) {
            addCriterion("sum_h_price =", value, "sumHPrice");
            return (Criteria) this;
        }

        public Criteria andSumHPriceNotEqualTo(BigDecimal value) {
            addCriterion("sum_h_price <>", value, "sumHPrice");
            return (Criteria) this;
        }

        public Criteria andSumHPriceGreaterThan(BigDecimal value) {
            addCriterion("sum_h_price >", value, "sumHPrice");
            return (Criteria) this;
        }

        public Criteria andSumHPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sum_h_price >=", value, "sumHPrice");
            return (Criteria) this;
        }

        public Criteria andSumHPriceLessThan(BigDecimal value) {
            addCriterion("sum_h_price <", value, "sumHPrice");
            return (Criteria) this;
        }

        public Criteria andSumHPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sum_h_price <=", value, "sumHPrice");
            return (Criteria) this;
        }

        public Criteria andSumHPriceIn(List<BigDecimal> values) {
            addCriterion("sum_h_price in", values, "sumHPrice");
            return (Criteria) this;
        }

        public Criteria andSumHPriceNotIn(List<BigDecimal> values) {
            addCriterion("sum_h_price not in", values, "sumHPrice");
            return (Criteria) this;
        }

        public Criteria andSumHPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sum_h_price between", value1, value2, "sumHPrice");
            return (Criteria) this;
        }

        public Criteria andSumHPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sum_h_price not between", value1, value2, "sumHPrice");
            return (Criteria) this;
        }

        public Criteria andRangeValueIsNull() {
            addCriterion("range_value is null");
            return (Criteria) this;
        }

        public Criteria andRangeValueIsNotNull() {
            addCriterion("range_value is not null");
            return (Criteria) this;
        }

        public Criteria andRangeValueEqualTo(BigDecimal value) {
            addCriterion("range_value =", value, "rangeValue");
            return (Criteria) this;
        }

        public Criteria andRangeValueNotEqualTo(BigDecimal value) {
            addCriterion("range_value <>", value, "rangeValue");
            return (Criteria) this;
        }

        public Criteria andRangeValueGreaterThan(BigDecimal value) {
            addCriterion("range_value >", value, "rangeValue");
            return (Criteria) this;
        }

        public Criteria andRangeValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("range_value >=", value, "rangeValue");
            return (Criteria) this;
        }

        public Criteria andRangeValueLessThan(BigDecimal value) {
            addCriterion("range_value <", value, "rangeValue");
            return (Criteria) this;
        }

        public Criteria andRangeValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("range_value <=", value, "rangeValue");
            return (Criteria) this;
        }

        public Criteria andRangeValueIn(List<BigDecimal> values) {
            addCriterion("range_value in", values, "rangeValue");
            return (Criteria) this;
        }

        public Criteria andRangeValueNotIn(List<BigDecimal> values) {
            addCriterion("range_value not in", values, "rangeValue");
            return (Criteria) this;
        }

        public Criteria andRangeValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("range_value between", value1, value2, "rangeValue");
            return (Criteria) this;
        }

        public Criteria andRangeValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("range_value not between", value1, value2, "rangeValue");
            return (Criteria) this;
        }

        public Criteria andForecastNetAmountIsNull() {
            addCriterion("forecast_net_amount is null");
            return (Criteria) this;
        }

        public Criteria andForecastNetAmountIsNotNull() {
            addCriterion("forecast_net_amount is not null");
            return (Criteria) this;
        }

        public Criteria andForecastNetAmountEqualTo(BigDecimal value) {
            addCriterion("forecast_net_amount =", value, "forecastNetAmount");
            return (Criteria) this;
        }

        public Criteria andForecastNetAmountNotEqualTo(BigDecimal value) {
            addCriterion("forecast_net_amount <>", value, "forecastNetAmount");
            return (Criteria) this;
        }

        public Criteria andForecastNetAmountGreaterThan(BigDecimal value) {
            addCriterion("forecast_net_amount >", value, "forecastNetAmount");
            return (Criteria) this;
        }

        public Criteria andForecastNetAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("forecast_net_amount >=", value, "forecastNetAmount");
            return (Criteria) this;
        }

        public Criteria andForecastNetAmountLessThan(BigDecimal value) {
            addCriterion("forecast_net_amount <", value, "forecastNetAmount");
            return (Criteria) this;
        }

        public Criteria andForecastNetAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("forecast_net_amount <=", value, "forecastNetAmount");
            return (Criteria) this;
        }

        public Criteria andForecastNetAmountIn(List<BigDecimal> values) {
            addCriterion("forecast_net_amount in", values, "forecastNetAmount");
            return (Criteria) this;
        }

        public Criteria andForecastNetAmountNotIn(List<BigDecimal> values) {
            addCriterion("forecast_net_amount not in", values, "forecastNetAmount");
            return (Criteria) this;
        }

        public Criteria andForecastNetAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("forecast_net_amount between", value1, value2, "forecastNetAmount");
            return (Criteria) this;
        }

        public Criteria andForecastNetAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("forecast_net_amount not between", value1, value2, "forecastNetAmount");
            return (Criteria) this;
        }

        public Criteria andPracticalNetAmountIsNull() {
            addCriterion("practical_net_amount is null");
            return (Criteria) this;
        }

        public Criteria andPracticalNetAmountIsNotNull() {
            addCriterion("practical_net_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPracticalNetAmountEqualTo(BigDecimal value) {
            addCriterion("practical_net_amount =", value, "practicalNetAmount");
            return (Criteria) this;
        }

        public Criteria andPracticalNetAmountNotEqualTo(BigDecimal value) {
            addCriterion("practical_net_amount <>", value, "practicalNetAmount");
            return (Criteria) this;
        }

        public Criteria andPracticalNetAmountGreaterThan(BigDecimal value) {
            addCriterion("practical_net_amount >", value, "practicalNetAmount");
            return (Criteria) this;
        }

        public Criteria andPracticalNetAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("practical_net_amount >=", value, "practicalNetAmount");
            return (Criteria) this;
        }

        public Criteria andPracticalNetAmountLessThan(BigDecimal value) {
            addCriterion("practical_net_amount <", value, "practicalNetAmount");
            return (Criteria) this;
        }

        public Criteria andPracticalNetAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("practical_net_amount <=", value, "practicalNetAmount");
            return (Criteria) this;
        }

        public Criteria andPracticalNetAmountIn(List<BigDecimal> values) {
            addCriterion("practical_net_amount in", values, "practicalNetAmount");
            return (Criteria) this;
        }

        public Criteria andPracticalNetAmountNotIn(List<BigDecimal> values) {
            addCriterion("practical_net_amount not in", values, "practicalNetAmount");
            return (Criteria) this;
        }

        public Criteria andPracticalNetAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("practical_net_amount between", value1, value2, "practicalNetAmount");
            return (Criteria) this;
        }

        public Criteria andPracticalNetAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("practical_net_amount not between", value1, value2, "practicalNetAmount");
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