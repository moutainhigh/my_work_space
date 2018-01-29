package com.ooteco.entity.finance.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FinanceProductVOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FinanceProductVOExample() {
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

        public Criteria andProductsNameIsNull() {
            addCriterion("products_name is null");
            return (Criteria) this;
        }

        public Criteria andProductsNameIsNotNull() {
            addCriterion("products_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductsNameEqualTo(String value) {
            addCriterion("products_name =", value, "productsName");
            return (Criteria) this;
        }

        public Criteria andProductsNameNotEqualTo(String value) {
            addCriterion("products_name <>", value, "productsName");
            return (Criteria) this;
        }

        public Criteria andProductsNameGreaterThan(String value) {
            addCriterion("products_name >", value, "productsName");
            return (Criteria) this;
        }

        public Criteria andProductsNameGreaterThanOrEqualTo(String value) {
            addCriterion("products_name >=", value, "productsName");
            return (Criteria) this;
        }

        public Criteria andProductsNameLessThan(String value) {
            addCriterion("products_name <", value, "productsName");
            return (Criteria) this;
        }

        public Criteria andProductsNameLessThanOrEqualTo(String value) {
            addCriterion("products_name <=", value, "productsName");
            return (Criteria) this;
        }

        public Criteria andProductsNameLike(String value) {
            addCriterion("products_name like", value, "productsName");
            return (Criteria) this;
        }

        public Criteria andProductsNameNotLike(String value) {
            addCriterion("products_name not like", value, "productsName");
            return (Criteria) this;
        }

        public Criteria andProductsNameIn(List<String> values) {
            addCriterion("products_name in", values, "productsName");
            return (Criteria) this;
        }

        public Criteria andProductsNameNotIn(List<String> values) {
            addCriterion("products_name not in", values, "productsName");
            return (Criteria) this;
        }

        public Criteria andProductsNameBetween(String value1, String value2) {
            addCriterion("products_name between", value1, value2, "productsName");
            return (Criteria) this;
        }

        public Criteria andProductsNameNotBetween(String value1, String value2) {
            addCriterion("products_name not between", value1, value2, "productsName");
            return (Criteria) this;
        }

        public Criteria andPeriodsIsNull() {
            addCriterion("periods is null");
            return (Criteria) this;
        }

        public Criteria andPeriodsIsNotNull() {
            addCriterion("periods is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodsEqualTo(Integer value) {
            addCriterion("periods =", value, "periods");
            return (Criteria) this;
        }

        public Criteria andPeriodsNotEqualTo(Integer value) {
            addCriterion("periods <>", value, "periods");
            return (Criteria) this;
        }

        public Criteria andPeriodsGreaterThan(Integer value) {
            addCriterion("periods >", value, "periods");
            return (Criteria) this;
        }

        public Criteria andPeriodsGreaterThanOrEqualTo(Integer value) {
            addCriterion("periods >=", value, "periods");
            return (Criteria) this;
        }

        public Criteria andPeriodsLessThan(Integer value) {
            addCriterion("periods <", value, "periods");
            return (Criteria) this;
        }

        public Criteria andPeriodsLessThanOrEqualTo(Integer value) {
            addCriterion("periods <=", value, "periods");
            return (Criteria) this;
        }

        public Criteria andPeriodsIn(List<Integer> values) {
            addCriterion("periods in", values, "periods");
            return (Criteria) this;
        }

        public Criteria andPeriodsNotIn(List<Integer> values) {
            addCriterion("periods not in", values, "periods");
            return (Criteria) this;
        }

        public Criteria andPeriodsBetween(Integer value1, Integer value2) {
            addCriterion("periods between", value1, value2, "periods");
            return (Criteria) this;
        }

        public Criteria andPeriodsNotBetween(Integer value1, Integer value2) {
            addCriterion("periods not between", value1, value2, "periods");
            return (Criteria) this;
        }

        public Criteria andPeriodsTypeIsNull() {
            addCriterion("periods_type is null");
            return (Criteria) this;
        }

        public Criteria andPeriodsTypeIsNotNull() {
            addCriterion("periods_type is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodsTypeEqualTo(String value) {
            addCriterion("periods_type =", value, "periodsType");
            return (Criteria) this;
        }

        public Criteria andPeriodsTypeNotEqualTo(String value) {
            addCriterion("periods_type <>", value, "periodsType");
            return (Criteria) this;
        }

        public Criteria andPeriodsTypeGreaterThan(String value) {
            addCriterion("periods_type >", value, "periodsType");
            return (Criteria) this;
        }

        public Criteria andPeriodsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("periods_type >=", value, "periodsType");
            return (Criteria) this;
        }

        public Criteria andPeriodsTypeLessThan(String value) {
            addCriterion("periods_type <", value, "periodsType");
            return (Criteria) this;
        }

        public Criteria andPeriodsTypeLessThanOrEqualTo(String value) {
            addCriterion("periods_type <=", value, "periodsType");
            return (Criteria) this;
        }

        public Criteria andPeriodsTypeLike(String value) {
            addCriterion("periods_type like", value, "periodsType");
            return (Criteria) this;
        }

        public Criteria andPeriodsTypeNotLike(String value) {
            addCriterion("periods_type not like", value, "periodsType");
            return (Criteria) this;
        }

        public Criteria andPeriodsTypeIn(List<String> values) {
            addCriterion("periods_type in", values, "periodsType");
            return (Criteria) this;
        }

        public Criteria andPeriodsTypeNotIn(List<String> values) {
            addCriterion("periods_type not in", values, "periodsType");
            return (Criteria) this;
        }

        public Criteria andPeriodsTypeBetween(String value1, String value2) {
            addCriterion("periods_type between", value1, value2, "periodsType");
            return (Criteria) this;
        }

        public Criteria andPeriodsTypeNotBetween(String value1, String value2) {
            addCriterion("periods_type not between", value1, value2, "periodsType");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("start_date is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("start_date is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterionForJDBCDate("start_date =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("start_date <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("start_date >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_date >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterionForJDBCDate("start_date <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_date <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterionForJDBCDate("start_date in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("start_date not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_date between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_date not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("end_date is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("end_date is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterionForJDBCDate("end_date =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("end_date <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterionForJDBCDate("end_date >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_date >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterionForJDBCDate("end_date <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_date <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterionForJDBCDate("end_date in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("end_date not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_date between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_date not between", value1, value2, "endDate");
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