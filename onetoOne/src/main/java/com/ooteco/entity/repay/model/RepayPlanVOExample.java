package com.ooteco.entity.repay.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RepayPlanVOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RepayPlanVOExample() {
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

        public Criteria andRepaymentPlanIdIsNull() {
            addCriterion("repayment_plan_id is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlanIdIsNotNull() {
            addCriterion("repayment_plan_id is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlanIdEqualTo(Long value) {
            addCriterion("repayment_plan_id =", value, "repaymentPlanId");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlanIdNotEqualTo(Long value) {
            addCriterion("repayment_plan_id <>", value, "repaymentPlanId");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlanIdGreaterThan(Long value) {
            addCriterion("repayment_plan_id >", value, "repaymentPlanId");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlanIdGreaterThanOrEqualTo(Long value) {
            addCriterion("repayment_plan_id >=", value, "repaymentPlanId");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlanIdLessThan(Long value) {
            addCriterion("repayment_plan_id <", value, "repaymentPlanId");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlanIdLessThanOrEqualTo(Long value) {
            addCriterion("repayment_plan_id <=", value, "repaymentPlanId");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlanIdIn(List<Long> values) {
            addCriterion("repayment_plan_id in", values, "repaymentPlanId");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlanIdNotIn(List<Long> values) {
            addCriterion("repayment_plan_id not in", values, "repaymentPlanId");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlanIdBetween(Long value1, Long value2) {
            addCriterion("repayment_plan_id between", value1, value2, "repaymentPlanId");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlanIdNotBetween(Long value1, Long value2) {
            addCriterion("repayment_plan_id not between", value1, value2, "repaymentPlanId");
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

        public Criteria andLoanCodeIsNull() {
            addCriterion("loan_code is null");
            return (Criteria) this;
        }

        public Criteria andLoanCodeIsNotNull() {
            addCriterion("loan_code is not null");
            return (Criteria) this;
        }

        public Criteria andLoanCodeEqualTo(String value) {
            addCriterion("loan_code =", value, "loanCode");
            return (Criteria) this;
        }

        public Criteria andLoanCodeNotEqualTo(String value) {
            addCriterion("loan_code <>", value, "loanCode");
            return (Criteria) this;
        }

        public Criteria andLoanCodeGreaterThan(String value) {
            addCriterion("loan_code >", value, "loanCode");
            return (Criteria) this;
        }

        public Criteria andLoanCodeGreaterThanOrEqualTo(String value) {
            addCriterion("loan_code >=", value, "loanCode");
            return (Criteria) this;
        }

        public Criteria andLoanCodeLessThan(String value) {
            addCriterion("loan_code <", value, "loanCode");
            return (Criteria) this;
        }

        public Criteria andLoanCodeLessThanOrEqualTo(String value) {
            addCriterion("loan_code <=", value, "loanCode");
            return (Criteria) this;
        }

        public Criteria andLoanCodeLike(String value) {
            addCriterion("loan_code like", value, "loanCode");
            return (Criteria) this;
        }

        public Criteria andLoanCodeNotLike(String value) {
            addCriterion("loan_code not like", value, "loanCode");
            return (Criteria) this;
        }

        public Criteria andLoanCodeIn(List<String> values) {
            addCriterion("loan_code in", values, "loanCode");
            return (Criteria) this;
        }

        public Criteria andLoanCodeNotIn(List<String> values) {
            addCriterion("loan_code not in", values, "loanCode");
            return (Criteria) this;
        }

        public Criteria andLoanCodeBetween(String value1, String value2) {
            addCriterion("loan_code between", value1, value2, "loanCode");
            return (Criteria) this;
        }

        public Criteria andLoanCodeNotBetween(String value1, String value2) {
            addCriterion("loan_code not between", value1, value2, "loanCode");
            return (Criteria) this;
        }

        public Criteria andReturnAmtIsNull() {
            addCriterion("return_amt is null");
            return (Criteria) this;
        }

        public Criteria andReturnAmtIsNotNull() {
            addCriterion("return_amt is not null");
            return (Criteria) this;
        }

        public Criteria andReturnAmtEqualTo(BigDecimal value) {
            addCriterion("return_amt =", value, "returnAmt");
            return (Criteria) this;
        }

        public Criteria andReturnAmtNotEqualTo(BigDecimal value) {
            addCriterion("return_amt <>", value, "returnAmt");
            return (Criteria) this;
        }

        public Criteria andReturnAmtGreaterThan(BigDecimal value) {
            addCriterion("return_amt >", value, "returnAmt");
            return (Criteria) this;
        }

        public Criteria andReturnAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("return_amt >=", value, "returnAmt");
            return (Criteria) this;
        }

        public Criteria andReturnAmtLessThan(BigDecimal value) {
            addCriterion("return_amt <", value, "returnAmt");
            return (Criteria) this;
        }

        public Criteria andReturnAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("return_amt <=", value, "returnAmt");
            return (Criteria) this;
        }

        public Criteria andReturnAmtIn(List<BigDecimal> values) {
            addCriterion("return_amt in", values, "returnAmt");
            return (Criteria) this;
        }

        public Criteria andReturnAmtNotIn(List<BigDecimal> values) {
            addCriterion("return_amt not in", values, "returnAmt");
            return (Criteria) this;
        }

        public Criteria andReturnAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("return_amt between", value1, value2, "returnAmt");
            return (Criteria) this;
        }

        public Criteria andReturnAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("return_amt not between", value1, value2, "returnAmt");
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andIsValidIsNull() {
            addCriterion("is_valid is null");
            return (Criteria) this;
        }

        public Criteria andIsValidIsNotNull() {
            addCriterion("is_valid is not null");
            return (Criteria) this;
        }

        public Criteria andIsValidEqualTo(Boolean value) {
            addCriterion("is_valid =", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotEqualTo(Boolean value) {
            addCriterion("is_valid <>", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidGreaterThan(Boolean value) {
            addCriterion("is_valid >", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_valid >=", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLessThan(Boolean value) {
            addCriterion("is_valid <", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLessThanOrEqualTo(Boolean value) {
            addCriterion("is_valid <=", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidIn(List<Boolean> values) {
            addCriterion("is_valid in", values, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotIn(List<Boolean> values) {
            addCriterion("is_valid not in", values, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidBetween(Boolean value1, Boolean value2) {
            addCriterion("is_valid between", value1, value2, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_valid not between", value1, value2, "isValid");
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