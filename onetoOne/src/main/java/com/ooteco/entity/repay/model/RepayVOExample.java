package com.ooteco.entity.repay.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RepayVOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RepayVOExample() {
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

        public Criteria andPeriodsTimeIsNull() {
            addCriterion("periods_time is null");
            return (Criteria) this;
        }

        public Criteria andPeriodsTimeIsNotNull() {
            addCriterion("periods_time is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodsTimeEqualTo(Integer value) {
            addCriterion("periods_time =", value, "periodsTime");
            return (Criteria) this;
        }

        public Criteria andPeriodsTimeNotEqualTo(Integer value) {
            addCriterion("periods_time <>", value, "periodsTime");
            return (Criteria) this;
        }

        public Criteria andPeriodsTimeGreaterThan(Integer value) {
            addCriterion("periods_time >", value, "periodsTime");
            return (Criteria) this;
        }

        public Criteria andPeriodsTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("periods_time >=", value, "periodsTime");
            return (Criteria) this;
        }

        public Criteria andPeriodsTimeLessThan(Integer value) {
            addCriterion("periods_time <", value, "periodsTime");
            return (Criteria) this;
        }

        public Criteria andPeriodsTimeLessThanOrEqualTo(Integer value) {
            addCriterion("periods_time <=", value, "periodsTime");
            return (Criteria) this;
        }

        public Criteria andPeriodsTimeIn(List<Integer> values) {
            addCriterion("periods_time in", values, "periodsTime");
            return (Criteria) this;
        }

        public Criteria andPeriodsTimeNotIn(List<Integer> values) {
            addCriterion("periods_time not in", values, "periodsTime");
            return (Criteria) this;
        }

        public Criteria andPeriodsTimeBetween(Integer value1, Integer value2) {
            addCriterion("periods_time between", value1, value2, "periodsTime");
            return (Criteria) this;
        }

        public Criteria andPeriodsTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("periods_time not between", value1, value2, "periodsTime");
            return (Criteria) this;
        }

        public Criteria andLoanStartDateIsNull() {
            addCriterion("loan_start_date is null");
            return (Criteria) this;
        }

        public Criteria andLoanStartDateIsNotNull() {
            addCriterion("loan_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andLoanStartDateEqualTo(Date value) {
            addCriterionForJDBCDate("loan_start_date =", value, "loanStartDate");
            return (Criteria) this;
        }

        public Criteria andLoanStartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("loan_start_date <>", value, "loanStartDate");
            return (Criteria) this;
        }

        public Criteria andLoanStartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("loan_start_date >", value, "loanStartDate");
            return (Criteria) this;
        }

        public Criteria andLoanStartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("loan_start_date >=", value, "loanStartDate");
            return (Criteria) this;
        }

        public Criteria andLoanStartDateLessThan(Date value) {
            addCriterionForJDBCDate("loan_start_date <", value, "loanStartDate");
            return (Criteria) this;
        }

        public Criteria andLoanStartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("loan_start_date <=", value, "loanStartDate");
            return (Criteria) this;
        }

        public Criteria andLoanStartDateIn(List<Date> values) {
            addCriterionForJDBCDate("loan_start_date in", values, "loanStartDate");
            return (Criteria) this;
        }

        public Criteria andLoanStartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("loan_start_date not in", values, "loanStartDate");
            return (Criteria) this;
        }

        public Criteria andLoanStartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("loan_start_date between", value1, value2, "loanStartDate");
            return (Criteria) this;
        }

        public Criteria andLoanStartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("loan_start_date not between", value1, value2, "loanStartDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateIsNull() {
            addCriterion("repayment_date is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateIsNotNull() {
            addCriterion("repayment_date is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateEqualTo(Date value) {
            addCriterionForJDBCDate("repayment_date =", value, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("repayment_date <>", value, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateGreaterThan(Date value) {
            addCriterionForJDBCDate("repayment_date >", value, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("repayment_date >=", value, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateLessThan(Date value) {
            addCriterionForJDBCDate("repayment_date <", value, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("repayment_date <=", value, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateIn(List<Date> values) {
            addCriterionForJDBCDate("repayment_date in", values, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("repayment_date not in", values, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("repayment_date between", value1, value2, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("repayment_date not between", value1, value2, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRealRepaymentDateIsNull() {
            addCriterion("real_repayment_date is null");
            return (Criteria) this;
        }

        public Criteria andRealRepaymentDateIsNotNull() {
            addCriterion("real_repayment_date is not null");
            return (Criteria) this;
        }

        public Criteria andRealRepaymentDateEqualTo(Date value) {
            addCriterionForJDBCDate("real_repayment_date =", value, "realRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andRealRepaymentDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("real_repayment_date <>", value, "realRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andRealRepaymentDateGreaterThan(Date value) {
            addCriterionForJDBCDate("real_repayment_date >", value, "realRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andRealRepaymentDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("real_repayment_date >=", value, "realRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andRealRepaymentDateLessThan(Date value) {
            addCriterionForJDBCDate("real_repayment_date <", value, "realRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andRealRepaymentDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("real_repayment_date <=", value, "realRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andRealRepaymentDateIn(List<Date> values) {
            addCriterionForJDBCDate("real_repayment_date in", values, "realRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andRealRepaymentDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("real_repayment_date not in", values, "realRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andRealRepaymentDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("real_repayment_date between", value1, value2, "realRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andRealRepaymentDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("real_repayment_date not between", value1, value2, "realRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andPrincipalIsNull() {
            addCriterion("principal is null");
            return (Criteria) this;
        }

        public Criteria andPrincipalIsNotNull() {
            addCriterion("principal is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipalEqualTo(BigDecimal value) {
            addCriterion("principal =", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotEqualTo(BigDecimal value) {
            addCriterion("principal <>", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalGreaterThan(BigDecimal value) {
            addCriterion("principal >", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("principal >=", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalLessThan(BigDecimal value) {
            addCriterion("principal <", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("principal <=", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalIn(List<BigDecimal> values) {
            addCriterion("principal in", values, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotIn(List<BigDecimal> values) {
            addCriterion("principal not in", values, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("principal between", value1, value2, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("principal not between", value1, value2, "principal");
            return (Criteria) this;
        }

        public Criteria andRealPrincipalIsNull() {
            addCriterion("real_principal is null");
            return (Criteria) this;
        }

        public Criteria andRealPrincipalIsNotNull() {
            addCriterion("real_principal is not null");
            return (Criteria) this;
        }

        public Criteria andRealPrincipalEqualTo(BigDecimal value) {
            addCriterion("real_principal =", value, "realPrincipal");
            return (Criteria) this;
        }

        public Criteria andRealPrincipalNotEqualTo(BigDecimal value) {
            addCriterion("real_principal <>", value, "realPrincipal");
            return (Criteria) this;
        }

        public Criteria andRealPrincipalGreaterThan(BigDecimal value) {
            addCriterion("real_principal >", value, "realPrincipal");
            return (Criteria) this;
        }

        public Criteria andRealPrincipalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("real_principal >=", value, "realPrincipal");
            return (Criteria) this;
        }

        public Criteria andRealPrincipalLessThan(BigDecimal value) {
            addCriterion("real_principal <", value, "realPrincipal");
            return (Criteria) this;
        }

        public Criteria andRealPrincipalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("real_principal <=", value, "realPrincipal");
            return (Criteria) this;
        }

        public Criteria andRealPrincipalIn(List<BigDecimal> values) {
            addCriterion("real_principal in", values, "realPrincipal");
            return (Criteria) this;
        }

        public Criteria andRealPrincipalNotIn(List<BigDecimal> values) {
            addCriterion("real_principal not in", values, "realPrincipal");
            return (Criteria) this;
        }

        public Criteria andRealPrincipalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_principal between", value1, value2, "realPrincipal");
            return (Criteria) this;
        }

        public Criteria andRealPrincipalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_principal not between", value1, value2, "realPrincipal");
            return (Criteria) this;
        }

        public Criteria andInterestIsNull() {
            addCriterion("interest is null");
            return (Criteria) this;
        }

        public Criteria andInterestIsNotNull() {
            addCriterion("interest is not null");
            return (Criteria) this;
        }

        public Criteria andInterestEqualTo(BigDecimal value) {
            addCriterion("interest =", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestNotEqualTo(BigDecimal value) {
            addCriterion("interest <>", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestGreaterThan(BigDecimal value) {
            addCriterion("interest >", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("interest >=", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestLessThan(BigDecimal value) {
            addCriterion("interest <", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestLessThanOrEqualTo(BigDecimal value) {
            addCriterion("interest <=", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestIn(List<BigDecimal> values) {
            addCriterion("interest in", values, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestNotIn(List<BigDecimal> values) {
            addCriterion("interest not in", values, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interest between", value1, value2, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interest not between", value1, value2, "interest");
            return (Criteria) this;
        }

        public Criteria andServiceChargeIsNull() {
            addCriterion("service_charge is null");
            return (Criteria) this;
        }

        public Criteria andServiceChargeIsNotNull() {
            addCriterion("service_charge is not null");
            return (Criteria) this;
        }

        public Criteria andServiceChargeEqualTo(BigDecimal value) {
            addCriterion("service_charge =", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeNotEqualTo(BigDecimal value) {
            addCriterion("service_charge <>", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeGreaterThan(BigDecimal value) {
            addCriterion("service_charge >", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("service_charge >=", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeLessThan(BigDecimal value) {
            addCriterion("service_charge <", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("service_charge <=", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeIn(List<BigDecimal> values) {
            addCriterion("service_charge in", values, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeNotIn(List<BigDecimal> values) {
            addCriterion("service_charge not in", values, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("service_charge between", value1, value2, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("service_charge not between", value1, value2, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andConsultingFeeIsNull() {
            addCriterion("consulting_fee is null");
            return (Criteria) this;
        }

        public Criteria andConsultingFeeIsNotNull() {
            addCriterion("consulting_fee is not null");
            return (Criteria) this;
        }

        public Criteria andConsultingFeeEqualTo(BigDecimal value) {
            addCriterion("consulting_fee =", value, "consultingFee");
            return (Criteria) this;
        }

        public Criteria andConsultingFeeNotEqualTo(BigDecimal value) {
            addCriterion("consulting_fee <>", value, "consultingFee");
            return (Criteria) this;
        }

        public Criteria andConsultingFeeGreaterThan(BigDecimal value) {
            addCriterion("consulting_fee >", value, "consultingFee");
            return (Criteria) this;
        }

        public Criteria andConsultingFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("consulting_fee >=", value, "consultingFee");
            return (Criteria) this;
        }

        public Criteria andConsultingFeeLessThan(BigDecimal value) {
            addCriterion("consulting_fee <", value, "consultingFee");
            return (Criteria) this;
        }

        public Criteria andConsultingFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("consulting_fee <=", value, "consultingFee");
            return (Criteria) this;
        }

        public Criteria andConsultingFeeIn(List<BigDecimal> values) {
            addCriterion("consulting_fee in", values, "consultingFee");
            return (Criteria) this;
        }

        public Criteria andConsultingFeeNotIn(List<BigDecimal> values) {
            addCriterion("consulting_fee not in", values, "consultingFee");
            return (Criteria) this;
        }

        public Criteria andConsultingFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("consulting_fee between", value1, value2, "consultingFee");
            return (Criteria) this;
        }

        public Criteria andConsultingFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("consulting_fee not between", value1, value2, "consultingFee");
            return (Criteria) this;
        }

        public Criteria andPrepaymentServiceChargeIsNull() {
            addCriterion("prepayment_service_charge is null");
            return (Criteria) this;
        }

        public Criteria andPrepaymentServiceChargeIsNotNull() {
            addCriterion("prepayment_service_charge is not null");
            return (Criteria) this;
        }

        public Criteria andPrepaymentServiceChargeEqualTo(BigDecimal value) {
            addCriterion("prepayment_service_charge =", value, "prepaymentServiceCharge");
            return (Criteria) this;
        }

        public Criteria andPrepaymentServiceChargeNotEqualTo(BigDecimal value) {
            addCriterion("prepayment_service_charge <>", value, "prepaymentServiceCharge");
            return (Criteria) this;
        }

        public Criteria andPrepaymentServiceChargeGreaterThan(BigDecimal value) {
            addCriterion("prepayment_service_charge >", value, "prepaymentServiceCharge");
            return (Criteria) this;
        }

        public Criteria andPrepaymentServiceChargeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("prepayment_service_charge >=", value, "prepaymentServiceCharge");
            return (Criteria) this;
        }

        public Criteria andPrepaymentServiceChargeLessThan(BigDecimal value) {
            addCriterion("prepayment_service_charge <", value, "prepaymentServiceCharge");
            return (Criteria) this;
        }

        public Criteria andPrepaymentServiceChargeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("prepayment_service_charge <=", value, "prepaymentServiceCharge");
            return (Criteria) this;
        }

        public Criteria andPrepaymentServiceChargeIn(List<BigDecimal> values) {
            addCriterion("prepayment_service_charge in", values, "prepaymentServiceCharge");
            return (Criteria) this;
        }

        public Criteria andPrepaymentServiceChargeNotIn(List<BigDecimal> values) {
            addCriterion("prepayment_service_charge not in", values, "prepaymentServiceCharge");
            return (Criteria) this;
        }

        public Criteria andPrepaymentServiceChargeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("prepayment_service_charge between", value1, value2, "prepaymentServiceCharge");
            return (Criteria) this;
        }

        public Criteria andPrepaymentServiceChargeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("prepayment_service_charge not between", value1, value2, "prepaymentServiceCharge");
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