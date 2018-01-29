package com.ooteco.entity.split.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FinanceLoanSplitVOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FinanceLoanSplitVOExample() {
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

        public Criteria andSplitDateIsNull() {
            addCriterion("split_date is null");
            return (Criteria) this;
        }

        public Criteria andSplitDateIsNotNull() {
            addCriterion("split_date is not null");
            return (Criteria) this;
        }

        public Criteria andSplitDateEqualTo(Date value) {
            addCriterionForJDBCDate("split_date =", value, "splitDate");
            return (Criteria) this;
        }

        public Criteria andSplitDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("split_date <>", value, "splitDate");
            return (Criteria) this;
        }

        public Criteria andSplitDateGreaterThan(Date value) {
            addCriterionForJDBCDate("split_date >", value, "splitDate");
            return (Criteria) this;
        }

        public Criteria andSplitDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("split_date >=", value, "splitDate");
            return (Criteria) this;
        }

        public Criteria andSplitDateLessThan(Date value) {
            addCriterionForJDBCDate("split_date <", value, "splitDate");
            return (Criteria) this;
        }

        public Criteria andSplitDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("split_date <=", value, "splitDate");
            return (Criteria) this;
        }

        public Criteria andSplitDateIn(List<Date> values) {
            addCriterionForJDBCDate("split_date in", values, "splitDate");
            return (Criteria) this;
        }

        public Criteria andSplitDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("split_date not in", values, "splitDate");
            return (Criteria) this;
        }

        public Criteria andSplitDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("split_date between", value1, value2, "splitDate");
            return (Criteria) this;
        }

        public Criteria andSplitDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("split_date not between", value1, value2, "splitDate");
            return (Criteria) this;
        }

        public Criteria andLoanAmountIsNull() {
            addCriterion("loan_amount is null");
            return (Criteria) this;
        }

        public Criteria andLoanAmountIsNotNull() {
            addCriterion("loan_amount is not null");
            return (Criteria) this;
        }

        public Criteria andLoanAmountEqualTo(BigDecimal value) {
            addCriterion("loan_amount =", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountNotEqualTo(BigDecimal value) {
            addCriterion("loan_amount <>", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountGreaterThan(BigDecimal value) {
            addCriterion("loan_amount >", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("loan_amount >=", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountLessThan(BigDecimal value) {
            addCriterion("loan_amount <", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("loan_amount <=", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountIn(List<BigDecimal> values) {
            addCriterion("loan_amount in", values, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountNotIn(List<BigDecimal> values) {
            addCriterion("loan_amount not in", values, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("loan_amount between", value1, value2, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("loan_amount not between", value1, value2, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andRepaymentAmountIsNull() {
            addCriterion("repayment_amount is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentAmountIsNotNull() {
            addCriterion("repayment_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentAmountEqualTo(BigDecimal value) {
            addCriterion("repayment_amount =", value, "repaymentAmount");
            return (Criteria) this;
        }

        public Criteria andRepaymentAmountNotEqualTo(BigDecimal value) {
            addCriterion("repayment_amount <>", value, "repaymentAmount");
            return (Criteria) this;
        }

        public Criteria andRepaymentAmountGreaterThan(BigDecimal value) {
            addCriterion("repayment_amount >", value, "repaymentAmount");
            return (Criteria) this;
        }

        public Criteria andRepaymentAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("repayment_amount >=", value, "repaymentAmount");
            return (Criteria) this;
        }

        public Criteria andRepaymentAmountLessThan(BigDecimal value) {
            addCriterion("repayment_amount <", value, "repaymentAmount");
            return (Criteria) this;
        }

        public Criteria andRepaymentAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("repayment_amount <=", value, "repaymentAmount");
            return (Criteria) this;
        }

        public Criteria andRepaymentAmountIn(List<BigDecimal> values) {
            addCriterion("repayment_amount in", values, "repaymentAmount");
            return (Criteria) this;
        }

        public Criteria andRepaymentAmountNotIn(List<BigDecimal> values) {
            addCriterion("repayment_amount not in", values, "repaymentAmount");
            return (Criteria) this;
        }

        public Criteria andRepaymentAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repayment_amount between", value1, value2, "repaymentAmount");
            return (Criteria) this;
        }

        public Criteria andRepaymentAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repayment_amount not between", value1, value2, "repaymentAmount");
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

        public Criteria andRedemptionAmountIsNull() {
            addCriterion("redemption_amount is null");
            return (Criteria) this;
        }

        public Criteria andRedemptionAmountIsNotNull() {
            addCriterion("redemption_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRedemptionAmountEqualTo(BigDecimal value) {
            addCriterion("redemption_amount =", value, "redemptionAmount");
            return (Criteria) this;
        }

        public Criteria andRedemptionAmountNotEqualTo(BigDecimal value) {
            addCriterion("redemption_amount <>", value, "redemptionAmount");
            return (Criteria) this;
        }

        public Criteria andRedemptionAmountGreaterThan(BigDecimal value) {
            addCriterion("redemption_amount >", value, "redemptionAmount");
            return (Criteria) this;
        }

        public Criteria andRedemptionAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("redemption_amount >=", value, "redemptionAmount");
            return (Criteria) this;
        }

        public Criteria andRedemptionAmountLessThan(BigDecimal value) {
            addCriterion("redemption_amount <", value, "redemptionAmount");
            return (Criteria) this;
        }

        public Criteria andRedemptionAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("redemption_amount <=", value, "redemptionAmount");
            return (Criteria) this;
        }

        public Criteria andRedemptionAmountIn(List<BigDecimal> values) {
            addCriterion("redemption_amount in", values, "redemptionAmount");
            return (Criteria) this;
        }

        public Criteria andRedemptionAmountNotIn(List<BigDecimal> values) {
            addCriterion("redemption_amount not in", values, "redemptionAmount");
            return (Criteria) this;
        }

        public Criteria andRedemptionAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("redemption_amount between", value1, value2, "redemptionAmount");
            return (Criteria) this;
        }

        public Criteria andRedemptionAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("redemption_amount not between", value1, value2, "redemptionAmount");
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