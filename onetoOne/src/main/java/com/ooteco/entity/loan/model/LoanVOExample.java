package com.ooteco.entity.loan.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class LoanVOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LoanVOExample() {
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

        public Criteria andCategoryIsNull() {
            addCriterion("category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(String value) {
            addCriterion("category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(String value) {
            addCriterion("category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(String value) {
            addCriterion("category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(String value) {
            addCriterion("category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(String value) {
            addCriterion("category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLike(String value) {
            addCriterion("category like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotLike(String value) {
            addCriterion("category not like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<String> values) {
            addCriterion("category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<String> values) {
            addCriterion("category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(String value1, String value2) {
            addCriterion("category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(String value1, String value2) {
            addCriterion("category not between", value1, value2, "category");
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

        public Criteria andLoanMoneyIsNull() {
            addCriterion("loan_money is null");
            return (Criteria) this;
        }

        public Criteria andLoanMoneyIsNotNull() {
            addCriterion("loan_money is not null");
            return (Criteria) this;
        }

        public Criteria andLoanMoneyEqualTo(BigDecimal value) {
            addCriterion("loan_money =", value, "loanMoney");
            return (Criteria) this;
        }

        public Criteria andLoanMoneyNotEqualTo(BigDecimal value) {
            addCriterion("loan_money <>", value, "loanMoney");
            return (Criteria) this;
        }

        public Criteria andLoanMoneyGreaterThan(BigDecimal value) {
            addCriterion("loan_money >", value, "loanMoney");
            return (Criteria) this;
        }

        public Criteria andLoanMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("loan_money >=", value, "loanMoney");
            return (Criteria) this;
        }

        public Criteria andLoanMoneyLessThan(BigDecimal value) {
            addCriterion("loan_money <", value, "loanMoney");
            return (Criteria) this;
        }

        public Criteria andLoanMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("loan_money <=", value, "loanMoney");
            return (Criteria) this;
        }

        public Criteria andLoanMoneyIn(List<BigDecimal> values) {
            addCriterion("loan_money in", values, "loanMoney");
            return (Criteria) this;
        }

        public Criteria andLoanMoneyNotIn(List<BigDecimal> values) {
            addCriterion("loan_money not in", values, "loanMoney");
            return (Criteria) this;
        }

        public Criteria andLoanMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("loan_money between", value1, value2, "loanMoney");
            return (Criteria) this;
        }

        public Criteria andLoanMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("loan_money not between", value1, value2, "loanMoney");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeIsNull() {
            addCriterion("repayment_type is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeIsNotNull() {
            addCriterion("repayment_type is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeEqualTo(String value) {
            addCriterion("repayment_type =", value, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeNotEqualTo(String value) {
            addCriterion("repayment_type <>", value, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeGreaterThan(String value) {
            addCriterion("repayment_type >", value, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("repayment_type >=", value, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeLessThan(String value) {
            addCriterion("repayment_type <", value, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeLessThanOrEqualTo(String value) {
            addCriterion("repayment_type <=", value, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeLike(String value) {
            addCriterion("repayment_type like", value, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeNotLike(String value) {
            addCriterion("repayment_type not like", value, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeIn(List<String> values) {
            addCriterion("repayment_type in", values, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeNotIn(List<String> values) {
            addCriterion("repayment_type not in", values, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeBetween(String value1, String value2) {
            addCriterion("repayment_type between", value1, value2, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeNotBetween(String value1, String value2) {
            addCriterion("repayment_type not between", value1, value2, "repaymentType");
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

        public Criteria andFundModelIsNull() {
            addCriterion("fund_model is null");
            return (Criteria) this;
        }

        public Criteria andFundModelIsNotNull() {
            addCriterion("fund_model is not null");
            return (Criteria) this;
        }

        public Criteria andFundModelEqualTo(String value) {
            addCriterion("fund_model =", value, "fundModel");
            return (Criteria) this;
        }

        public Criteria andFundModelNotEqualTo(String value) {
            addCriterion("fund_model <>", value, "fundModel");
            return (Criteria) this;
        }

        public Criteria andFundModelGreaterThan(String value) {
            addCriterion("fund_model >", value, "fundModel");
            return (Criteria) this;
        }

        public Criteria andFundModelGreaterThanOrEqualTo(String value) {
            addCriterion("fund_model >=", value, "fundModel");
            return (Criteria) this;
        }

        public Criteria andFundModelLessThan(String value) {
            addCriterion("fund_model <", value, "fundModel");
            return (Criteria) this;
        }

        public Criteria andFundModelLessThanOrEqualTo(String value) {
            addCriterion("fund_model <=", value, "fundModel");
            return (Criteria) this;
        }

        public Criteria andFundModelLike(String value) {
            addCriterion("fund_model like", value, "fundModel");
            return (Criteria) this;
        }

        public Criteria andFundModelNotLike(String value) {
            addCriterion("fund_model not like", value, "fundModel");
            return (Criteria) this;
        }

        public Criteria andFundModelIn(List<String> values) {
            addCriterion("fund_model in", values, "fundModel");
            return (Criteria) this;
        }

        public Criteria andFundModelNotIn(List<String> values) {
            addCriterion("fund_model not in", values, "fundModel");
            return (Criteria) this;
        }

        public Criteria andFundModelBetween(String value1, String value2) {
            addCriterion("fund_model between", value1, value2, "fundModel");
            return (Criteria) this;
        }

        public Criteria andFundModelNotBetween(String value1, String value2) {
            addCriterion("fund_model not between", value1, value2, "fundModel");
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

        public Criteria andRepaymentPlanDateIsNull() {
            addCriterion("repayment_plan_date is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlanDateIsNotNull() {
            addCriterion("repayment_plan_date is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlanDateEqualTo(Date value) {
            addCriterionForJDBCDate("repayment_plan_date =", value, "repaymentPlanDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlanDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("repayment_plan_date <>", value, "repaymentPlanDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlanDateGreaterThan(Date value) {
            addCriterionForJDBCDate("repayment_plan_date >", value, "repaymentPlanDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlanDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("repayment_plan_date >=", value, "repaymentPlanDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlanDateLessThan(Date value) {
            addCriterionForJDBCDate("repayment_plan_date <", value, "repaymentPlanDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlanDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("repayment_plan_date <=", value, "repaymentPlanDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlanDateIn(List<Date> values) {
            addCriterionForJDBCDate("repayment_plan_date in", values, "repaymentPlanDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlanDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("repayment_plan_date not in", values, "repaymentPlanDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlanDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("repayment_plan_date between", value1, value2, "repaymentPlanDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlanDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("repayment_plan_date not between", value1, value2, "repaymentPlanDate");
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

        public Criteria andAllInRateIsNull() {
            addCriterion("all_in_rate is null");
            return (Criteria) this;
        }

        public Criteria andAllInRateIsNotNull() {
            addCriterion("all_in_rate is not null");
            return (Criteria) this;
        }

        public Criteria andAllInRateEqualTo(BigDecimal value) {
            addCriterion("all_in_rate =", value, "allInRate");
            return (Criteria) this;
        }

        public Criteria andAllInRateNotEqualTo(BigDecimal value) {
            addCriterion("all_in_rate <>", value, "allInRate");
            return (Criteria) this;
        }

        public Criteria andAllInRateGreaterThan(BigDecimal value) {
            addCriterion("all_in_rate >", value, "allInRate");
            return (Criteria) this;
        }

        public Criteria andAllInRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("all_in_rate >=", value, "allInRate");
            return (Criteria) this;
        }

        public Criteria andAllInRateLessThan(BigDecimal value) {
            addCriterion("all_in_rate <", value, "allInRate");
            return (Criteria) this;
        }

        public Criteria andAllInRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("all_in_rate <=", value, "allInRate");
            return (Criteria) this;
        }

        public Criteria andAllInRateIn(List<BigDecimal> values) {
            addCriterion("all_in_rate in", values, "allInRate");
            return (Criteria) this;
        }

        public Criteria andAllInRateNotIn(List<BigDecimal> values) {
            addCriterion("all_in_rate not in", values, "allInRate");
            return (Criteria) this;
        }

        public Criteria andAllInRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("all_in_rate between", value1, value2, "allInRate");
            return (Criteria) this;
        }

        public Criteria andAllInRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("all_in_rate not between", value1, value2, "allInRate");
            return (Criteria) this;
        }

        public Criteria andLoanRateIsNull() {
            addCriterion("loan_rate is null");
            return (Criteria) this;
        }

        public Criteria andLoanRateIsNotNull() {
            addCriterion("loan_rate is not null");
            return (Criteria) this;
        }

        public Criteria andLoanRateEqualTo(BigDecimal value) {
            addCriterion("loan_rate =", value, "loanRate");
            return (Criteria) this;
        }

        public Criteria andLoanRateNotEqualTo(BigDecimal value) {
            addCriterion("loan_rate <>", value, "loanRate");
            return (Criteria) this;
        }

        public Criteria andLoanRateGreaterThan(BigDecimal value) {
            addCriterion("loan_rate >", value, "loanRate");
            return (Criteria) this;
        }

        public Criteria andLoanRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("loan_rate >=", value, "loanRate");
            return (Criteria) this;
        }

        public Criteria andLoanRateLessThan(BigDecimal value) {
            addCriterion("loan_rate <", value, "loanRate");
            return (Criteria) this;
        }

        public Criteria andLoanRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("loan_rate <=", value, "loanRate");
            return (Criteria) this;
        }

        public Criteria andLoanRateIn(List<BigDecimal> values) {
            addCriterion("loan_rate in", values, "loanRate");
            return (Criteria) this;
        }

        public Criteria andLoanRateNotIn(List<BigDecimal> values) {
            addCriterion("loan_rate not in", values, "loanRate");
            return (Criteria) this;
        }

        public Criteria andLoanRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("loan_rate between", value1, value2, "loanRate");
            return (Criteria) this;
        }

        public Criteria andLoanRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("loan_rate not between", value1, value2, "loanRate");
            return (Criteria) this;
        }

        public Criteria andPlatformRateIsNull() {
            addCriterion("platform_rate is null");
            return (Criteria) this;
        }

        public Criteria andPlatformRateIsNotNull() {
            addCriterion("platform_rate is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformRateEqualTo(BigDecimal value) {
            addCriterion("platform_rate =", value, "platformRate");
            return (Criteria) this;
        }

        public Criteria andPlatformRateNotEqualTo(BigDecimal value) {
            addCriterion("platform_rate <>", value, "platformRate");
            return (Criteria) this;
        }

        public Criteria andPlatformRateGreaterThan(BigDecimal value) {
            addCriterion("platform_rate >", value, "platformRate");
            return (Criteria) this;
        }

        public Criteria andPlatformRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("platform_rate >=", value, "platformRate");
            return (Criteria) this;
        }

        public Criteria andPlatformRateLessThan(BigDecimal value) {
            addCriterion("platform_rate <", value, "platformRate");
            return (Criteria) this;
        }

        public Criteria andPlatformRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("platform_rate <=", value, "platformRate");
            return (Criteria) this;
        }

        public Criteria andPlatformRateIn(List<BigDecimal> values) {
            addCriterion("platform_rate in", values, "platformRate");
            return (Criteria) this;
        }

        public Criteria andPlatformRateNotIn(List<BigDecimal> values) {
            addCriterion("platform_rate not in", values, "platformRate");
            return (Criteria) this;
        }

        public Criteria andPlatformRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("platform_rate between", value1, value2, "platformRate");
            return (Criteria) this;
        }

        public Criteria andPlatformRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("platform_rate not between", value1, value2, "platformRate");
            return (Criteria) this;
        }

        public Criteria andMRateIsNull() {
            addCriterion("m_rate is null");
            return (Criteria) this;
        }

        public Criteria andMRateIsNotNull() {
            addCriterion("m_rate is not null");
            return (Criteria) this;
        }

        public Criteria andMRateEqualTo(BigDecimal value) {
            addCriterion("m_rate =", value, "mRate");
            return (Criteria) this;
        }

        public Criteria andMRateNotEqualTo(BigDecimal value) {
            addCriterion("m_rate <>", value, "mRate");
            return (Criteria) this;
        }

        public Criteria andMRateGreaterThan(BigDecimal value) {
            addCriterion("m_rate >", value, "mRate");
            return (Criteria) this;
        }

        public Criteria andMRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("m_rate >=", value, "mRate");
            return (Criteria) this;
        }

        public Criteria andMRateLessThan(BigDecimal value) {
            addCriterion("m_rate <", value, "mRate");
            return (Criteria) this;
        }

        public Criteria andMRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("m_rate <=", value, "mRate");
            return (Criteria) this;
        }

        public Criteria andMRateIn(List<BigDecimal> values) {
            addCriterion("m_rate in", values, "mRate");
            return (Criteria) this;
        }

        public Criteria andMRateNotIn(List<BigDecimal> values) {
            addCriterion("m_rate not in", values, "mRate");
            return (Criteria) this;
        }

        public Criteria andMRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("m_rate between", value1, value2, "mRate");
            return (Criteria) this;
        }

        public Criteria andMRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("m_rate not between", value1, value2, "mRate");
            return (Criteria) this;
        }

        public Criteria andNRateIsNull() {
            addCriterion("n_rate is null");
            return (Criteria) this;
        }

        public Criteria andNRateIsNotNull() {
            addCriterion("n_rate is not null");
            return (Criteria) this;
        }

        public Criteria andNRateEqualTo(BigDecimal value) {
            addCriterion("n_rate =", value, "nRate");
            return (Criteria) this;
        }

        public Criteria andNRateNotEqualTo(BigDecimal value) {
            addCriterion("n_rate <>", value, "nRate");
            return (Criteria) this;
        }

        public Criteria andNRateGreaterThan(BigDecimal value) {
            addCriterion("n_rate >", value, "nRate");
            return (Criteria) this;
        }

        public Criteria andNRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("n_rate >=", value, "nRate");
            return (Criteria) this;
        }

        public Criteria andNRateLessThan(BigDecimal value) {
            addCriterion("n_rate <", value, "nRate");
            return (Criteria) this;
        }

        public Criteria andNRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("n_rate <=", value, "nRate");
            return (Criteria) this;
        }

        public Criteria andNRateIn(List<BigDecimal> values) {
            addCriterion("n_rate in", values, "nRate");
            return (Criteria) this;
        }

        public Criteria andNRateNotIn(List<BigDecimal> values) {
            addCriterion("n_rate not in", values, "nRate");
            return (Criteria) this;
        }

        public Criteria andNRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("n_rate between", value1, value2, "nRate");
            return (Criteria) this;
        }

        public Criteria andNRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("n_rate not between", value1, value2, "nRate");
            return (Criteria) this;
        }

        public Criteria andPayeeTypeIsNull() {
            addCriterion("payee_type is null");
            return (Criteria) this;
        }

        public Criteria andPayeeTypeIsNotNull() {
            addCriterion("payee_type is not null");
            return (Criteria) this;
        }

        public Criteria andPayeeTypeEqualTo(String value) {
            addCriterion("payee_type =", value, "payeeType");
            return (Criteria) this;
        }

        public Criteria andPayeeTypeNotEqualTo(String value) {
            addCriterion("payee_type <>", value, "payeeType");
            return (Criteria) this;
        }

        public Criteria andPayeeTypeGreaterThan(String value) {
            addCriterion("payee_type >", value, "payeeType");
            return (Criteria) this;
        }

        public Criteria andPayeeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("payee_type >=", value, "payeeType");
            return (Criteria) this;
        }

        public Criteria andPayeeTypeLessThan(String value) {
            addCriterion("payee_type <", value, "payeeType");
            return (Criteria) this;
        }

        public Criteria andPayeeTypeLessThanOrEqualTo(String value) {
            addCriterion("payee_type <=", value, "payeeType");
            return (Criteria) this;
        }

        public Criteria andPayeeTypeLike(String value) {
            addCriterion("payee_type like", value, "payeeType");
            return (Criteria) this;
        }

        public Criteria andPayeeTypeNotLike(String value) {
            addCriterion("payee_type not like", value, "payeeType");
            return (Criteria) this;
        }

        public Criteria andPayeeTypeIn(List<String> values) {
            addCriterion("payee_type in", values, "payeeType");
            return (Criteria) this;
        }

        public Criteria andPayeeTypeNotIn(List<String> values) {
            addCriterion("payee_type not in", values, "payeeType");
            return (Criteria) this;
        }

        public Criteria andPayeeTypeBetween(String value1, String value2) {
            addCriterion("payee_type between", value1, value2, "payeeType");
            return (Criteria) this;
        }

        public Criteria andPayeeTypeNotBetween(String value1, String value2) {
            addCriterion("payee_type not between", value1, value2, "payeeType");
            return (Criteria) this;
        }

        public Criteria andPayeeBankAccountNameIsNull() {
            addCriterion("payee_bank_account_name is null");
            return (Criteria) this;
        }

        public Criteria andPayeeBankAccountNameIsNotNull() {
            addCriterion("payee_bank_account_name is not null");
            return (Criteria) this;
        }

        public Criteria andPayeeBankAccountNameEqualTo(String value) {
            addCriterion("payee_bank_account_name =", value, "payeeBankAccountName");
            return (Criteria) this;
        }

        public Criteria andPayeeBankAccountNameNotEqualTo(String value) {
            addCriterion("payee_bank_account_name <>", value, "payeeBankAccountName");
            return (Criteria) this;
        }

        public Criteria andPayeeBankAccountNameGreaterThan(String value) {
            addCriterion("payee_bank_account_name >", value, "payeeBankAccountName");
            return (Criteria) this;
        }

        public Criteria andPayeeBankAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("payee_bank_account_name >=", value, "payeeBankAccountName");
            return (Criteria) this;
        }

        public Criteria andPayeeBankAccountNameLessThan(String value) {
            addCriterion("payee_bank_account_name <", value, "payeeBankAccountName");
            return (Criteria) this;
        }

        public Criteria andPayeeBankAccountNameLessThanOrEqualTo(String value) {
            addCriterion("payee_bank_account_name <=", value, "payeeBankAccountName");
            return (Criteria) this;
        }

        public Criteria andPayeeBankAccountNameLike(String value) {
            addCriterion("payee_bank_account_name like", value, "payeeBankAccountName");
            return (Criteria) this;
        }

        public Criteria andPayeeBankAccountNameNotLike(String value) {
            addCriterion("payee_bank_account_name not like", value, "payeeBankAccountName");
            return (Criteria) this;
        }

        public Criteria andPayeeBankAccountNameIn(List<String> values) {
            addCriterion("payee_bank_account_name in", values, "payeeBankAccountName");
            return (Criteria) this;
        }

        public Criteria andPayeeBankAccountNameNotIn(List<String> values) {
            addCriterion("payee_bank_account_name not in", values, "payeeBankAccountName");
            return (Criteria) this;
        }

        public Criteria andPayeeBankAccountNameBetween(String value1, String value2) {
            addCriterion("payee_bank_account_name between", value1, value2, "payeeBankAccountName");
            return (Criteria) this;
        }

        public Criteria andPayeeBankAccountNameNotBetween(String value1, String value2) {
            addCriterion("payee_bank_account_name not between", value1, value2, "payeeBankAccountName");
            return (Criteria) this;
        }

        public Criteria andPayeeBankAccountNoIsNull() {
            addCriterion("payee_bank_account_no is null");
            return (Criteria) this;
        }

        public Criteria andPayeeBankAccountNoIsNotNull() {
            addCriterion("payee_bank_account_no is not null");
            return (Criteria) this;
        }

        public Criteria andPayeeBankAccountNoEqualTo(String value) {
            addCriterion("payee_bank_account_no =", value, "payeeBankAccountNo");
            return (Criteria) this;
        }

        public Criteria andPayeeBankAccountNoNotEqualTo(String value) {
            addCriterion("payee_bank_account_no <>", value, "payeeBankAccountNo");
            return (Criteria) this;
        }

        public Criteria andPayeeBankAccountNoGreaterThan(String value) {
            addCriterion("payee_bank_account_no >", value, "payeeBankAccountNo");
            return (Criteria) this;
        }

        public Criteria andPayeeBankAccountNoGreaterThanOrEqualTo(String value) {
            addCriterion("payee_bank_account_no >=", value, "payeeBankAccountNo");
            return (Criteria) this;
        }

        public Criteria andPayeeBankAccountNoLessThan(String value) {
            addCriterion("payee_bank_account_no <", value, "payeeBankAccountNo");
            return (Criteria) this;
        }

        public Criteria andPayeeBankAccountNoLessThanOrEqualTo(String value) {
            addCriterion("payee_bank_account_no <=", value, "payeeBankAccountNo");
            return (Criteria) this;
        }

        public Criteria andPayeeBankAccountNoLike(String value) {
            addCriterion("payee_bank_account_no like", value, "payeeBankAccountNo");
            return (Criteria) this;
        }

        public Criteria andPayeeBankAccountNoNotLike(String value) {
            addCriterion("payee_bank_account_no not like", value, "payeeBankAccountNo");
            return (Criteria) this;
        }

        public Criteria andPayeeBankAccountNoIn(List<String> values) {
            addCriterion("payee_bank_account_no in", values, "payeeBankAccountNo");
            return (Criteria) this;
        }

        public Criteria andPayeeBankAccountNoNotIn(List<String> values) {
            addCriterion("payee_bank_account_no not in", values, "payeeBankAccountNo");
            return (Criteria) this;
        }

        public Criteria andPayeeBankAccountNoBetween(String value1, String value2) {
            addCriterion("payee_bank_account_no between", value1, value2, "payeeBankAccountNo");
            return (Criteria) this;
        }

        public Criteria andPayeeBankAccountNoNotBetween(String value1, String value2) {
            addCriterion("payee_bank_account_no not between", value1, value2, "payeeBankAccountNo");
            return (Criteria) this;
        }

        public Criteria andPayeeBankProvinceIsNull() {
            addCriterion("payee_bank_province is null");
            return (Criteria) this;
        }

        public Criteria andPayeeBankProvinceIsNotNull() {
            addCriterion("payee_bank_province is not null");
            return (Criteria) this;
        }

        public Criteria andPayeeBankProvinceEqualTo(String value) {
            addCriterion("payee_bank_province =", value, "payeeBankProvince");
            return (Criteria) this;
        }

        public Criteria andPayeeBankProvinceNotEqualTo(String value) {
            addCriterion("payee_bank_province <>", value, "payeeBankProvince");
            return (Criteria) this;
        }

        public Criteria andPayeeBankProvinceGreaterThan(String value) {
            addCriterion("payee_bank_province >", value, "payeeBankProvince");
            return (Criteria) this;
        }

        public Criteria andPayeeBankProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("payee_bank_province >=", value, "payeeBankProvince");
            return (Criteria) this;
        }

        public Criteria andPayeeBankProvinceLessThan(String value) {
            addCriterion("payee_bank_province <", value, "payeeBankProvince");
            return (Criteria) this;
        }

        public Criteria andPayeeBankProvinceLessThanOrEqualTo(String value) {
            addCriterion("payee_bank_province <=", value, "payeeBankProvince");
            return (Criteria) this;
        }

        public Criteria andPayeeBankProvinceLike(String value) {
            addCriterion("payee_bank_province like", value, "payeeBankProvince");
            return (Criteria) this;
        }

        public Criteria andPayeeBankProvinceNotLike(String value) {
            addCriterion("payee_bank_province not like", value, "payeeBankProvince");
            return (Criteria) this;
        }

        public Criteria andPayeeBankProvinceIn(List<String> values) {
            addCriterion("payee_bank_province in", values, "payeeBankProvince");
            return (Criteria) this;
        }

        public Criteria andPayeeBankProvinceNotIn(List<String> values) {
            addCriterion("payee_bank_province not in", values, "payeeBankProvince");
            return (Criteria) this;
        }

        public Criteria andPayeeBankProvinceBetween(String value1, String value2) {
            addCriterion("payee_bank_province between", value1, value2, "payeeBankProvince");
            return (Criteria) this;
        }

        public Criteria andPayeeBankProvinceNotBetween(String value1, String value2) {
            addCriterion("payee_bank_province not between", value1, value2, "payeeBankProvince");
            return (Criteria) this;
        }

        public Criteria andPayeeBankCityIsNull() {
            addCriterion("payee_bank_city is null");
            return (Criteria) this;
        }

        public Criteria andPayeeBankCityIsNotNull() {
            addCriterion("payee_bank_city is not null");
            return (Criteria) this;
        }

        public Criteria andPayeeBankCityEqualTo(String value) {
            addCriterion("payee_bank_city =", value, "payeeBankCity");
            return (Criteria) this;
        }

        public Criteria andPayeeBankCityNotEqualTo(String value) {
            addCriterion("payee_bank_city <>", value, "payeeBankCity");
            return (Criteria) this;
        }

        public Criteria andPayeeBankCityGreaterThan(String value) {
            addCriterion("payee_bank_city >", value, "payeeBankCity");
            return (Criteria) this;
        }

        public Criteria andPayeeBankCityGreaterThanOrEqualTo(String value) {
            addCriterion("payee_bank_city >=", value, "payeeBankCity");
            return (Criteria) this;
        }

        public Criteria andPayeeBankCityLessThan(String value) {
            addCriterion("payee_bank_city <", value, "payeeBankCity");
            return (Criteria) this;
        }

        public Criteria andPayeeBankCityLessThanOrEqualTo(String value) {
            addCriterion("payee_bank_city <=", value, "payeeBankCity");
            return (Criteria) this;
        }

        public Criteria andPayeeBankCityLike(String value) {
            addCriterion("payee_bank_city like", value, "payeeBankCity");
            return (Criteria) this;
        }

        public Criteria andPayeeBankCityNotLike(String value) {
            addCriterion("payee_bank_city not like", value, "payeeBankCity");
            return (Criteria) this;
        }

        public Criteria andPayeeBankCityIn(List<String> values) {
            addCriterion("payee_bank_city in", values, "payeeBankCity");
            return (Criteria) this;
        }

        public Criteria andPayeeBankCityNotIn(List<String> values) {
            addCriterion("payee_bank_city not in", values, "payeeBankCity");
            return (Criteria) this;
        }

        public Criteria andPayeeBankCityBetween(String value1, String value2) {
            addCriterion("payee_bank_city between", value1, value2, "payeeBankCity");
            return (Criteria) this;
        }

        public Criteria andPayeeBankCityNotBetween(String value1, String value2) {
            addCriterion("payee_bank_city not between", value1, value2, "payeeBankCity");
            return (Criteria) this;
        }

        public Criteria andPayeeBankNameIsNull() {
            addCriterion("payee_bank_name is null");
            return (Criteria) this;
        }

        public Criteria andPayeeBankNameIsNotNull() {
            addCriterion("payee_bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andPayeeBankNameEqualTo(String value) {
            addCriterion("payee_bank_name =", value, "payeeBankName");
            return (Criteria) this;
        }

        public Criteria andPayeeBankNameNotEqualTo(String value) {
            addCriterion("payee_bank_name <>", value, "payeeBankName");
            return (Criteria) this;
        }

        public Criteria andPayeeBankNameGreaterThan(String value) {
            addCriterion("payee_bank_name >", value, "payeeBankName");
            return (Criteria) this;
        }

        public Criteria andPayeeBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("payee_bank_name >=", value, "payeeBankName");
            return (Criteria) this;
        }

        public Criteria andPayeeBankNameLessThan(String value) {
            addCriterion("payee_bank_name <", value, "payeeBankName");
            return (Criteria) this;
        }

        public Criteria andPayeeBankNameLessThanOrEqualTo(String value) {
            addCriterion("payee_bank_name <=", value, "payeeBankName");
            return (Criteria) this;
        }

        public Criteria andPayeeBankNameLike(String value) {
            addCriterion("payee_bank_name like", value, "payeeBankName");
            return (Criteria) this;
        }

        public Criteria andPayeeBankNameNotLike(String value) {
            addCriterion("payee_bank_name not like", value, "payeeBankName");
            return (Criteria) this;
        }

        public Criteria andPayeeBankNameIn(List<String> values) {
            addCriterion("payee_bank_name in", values, "payeeBankName");
            return (Criteria) this;
        }

        public Criteria andPayeeBankNameNotIn(List<String> values) {
            addCriterion("payee_bank_name not in", values, "payeeBankName");
            return (Criteria) this;
        }

        public Criteria andPayeeBankNameBetween(String value1, String value2) {
            addCriterion("payee_bank_name between", value1, value2, "payeeBankName");
            return (Criteria) this;
        }

        public Criteria andPayeeBankNameNotBetween(String value1, String value2) {
            addCriterion("payee_bank_name not between", value1, value2, "payeeBankName");
            return (Criteria) this;
        }

        public Criteria andPayeeBankDeptIsNull() {
            addCriterion("payee_bank_dept is null");
            return (Criteria) this;
        }

        public Criteria andPayeeBankDeptIsNotNull() {
            addCriterion("payee_bank_dept is not null");
            return (Criteria) this;
        }

        public Criteria andPayeeBankDeptEqualTo(String value) {
            addCriterion("payee_bank_dept =", value, "payeeBankDept");
            return (Criteria) this;
        }

        public Criteria andPayeeBankDeptNotEqualTo(String value) {
            addCriterion("payee_bank_dept <>", value, "payeeBankDept");
            return (Criteria) this;
        }

        public Criteria andPayeeBankDeptGreaterThan(String value) {
            addCriterion("payee_bank_dept >", value, "payeeBankDept");
            return (Criteria) this;
        }

        public Criteria andPayeeBankDeptGreaterThanOrEqualTo(String value) {
            addCriterion("payee_bank_dept >=", value, "payeeBankDept");
            return (Criteria) this;
        }

        public Criteria andPayeeBankDeptLessThan(String value) {
            addCriterion("payee_bank_dept <", value, "payeeBankDept");
            return (Criteria) this;
        }

        public Criteria andPayeeBankDeptLessThanOrEqualTo(String value) {
            addCriterion("payee_bank_dept <=", value, "payeeBankDept");
            return (Criteria) this;
        }

        public Criteria andPayeeBankDeptLike(String value) {
            addCriterion("payee_bank_dept like", value, "payeeBankDept");
            return (Criteria) this;
        }

        public Criteria andPayeeBankDeptNotLike(String value) {
            addCriterion("payee_bank_dept not like", value, "payeeBankDept");
            return (Criteria) this;
        }

        public Criteria andPayeeBankDeptIn(List<String> values) {
            addCriterion("payee_bank_dept in", values, "payeeBankDept");
            return (Criteria) this;
        }

        public Criteria andPayeeBankDeptNotIn(List<String> values) {
            addCriterion("payee_bank_dept not in", values, "payeeBankDept");
            return (Criteria) this;
        }

        public Criteria andPayeeBankDeptBetween(String value1, String value2) {
            addCriterion("payee_bank_dept between", value1, value2, "payeeBankDept");
            return (Criteria) this;
        }

        public Criteria andPayeeBankDeptNotBetween(String value1, String value2) {
            addCriterion("payee_bank_dept not between", value1, value2, "payeeBankDept");
            return (Criteria) this;
        }

        public Criteria andPayeeIdTypeIsNull() {
            addCriterion("payee_id_type is null");
            return (Criteria) this;
        }

        public Criteria andPayeeIdTypeIsNotNull() {
            addCriterion("payee_id_type is not null");
            return (Criteria) this;
        }

        public Criteria andPayeeIdTypeEqualTo(String value) {
            addCriterion("payee_id_type =", value, "payeeIdType");
            return (Criteria) this;
        }

        public Criteria andPayeeIdTypeNotEqualTo(String value) {
            addCriterion("payee_id_type <>", value, "payeeIdType");
            return (Criteria) this;
        }

        public Criteria andPayeeIdTypeGreaterThan(String value) {
            addCriterion("payee_id_type >", value, "payeeIdType");
            return (Criteria) this;
        }

        public Criteria andPayeeIdTypeGreaterThanOrEqualTo(String value) {
            addCriterion("payee_id_type >=", value, "payeeIdType");
            return (Criteria) this;
        }

        public Criteria andPayeeIdTypeLessThan(String value) {
            addCriterion("payee_id_type <", value, "payeeIdType");
            return (Criteria) this;
        }

        public Criteria andPayeeIdTypeLessThanOrEqualTo(String value) {
            addCriterion("payee_id_type <=", value, "payeeIdType");
            return (Criteria) this;
        }

        public Criteria andPayeeIdTypeLike(String value) {
            addCriterion("payee_id_type like", value, "payeeIdType");
            return (Criteria) this;
        }

        public Criteria andPayeeIdTypeNotLike(String value) {
            addCriterion("payee_id_type not like", value, "payeeIdType");
            return (Criteria) this;
        }

        public Criteria andPayeeIdTypeIn(List<String> values) {
            addCriterion("payee_id_type in", values, "payeeIdType");
            return (Criteria) this;
        }

        public Criteria andPayeeIdTypeNotIn(List<String> values) {
            addCriterion("payee_id_type not in", values, "payeeIdType");
            return (Criteria) this;
        }

        public Criteria andPayeeIdTypeBetween(String value1, String value2) {
            addCriterion("payee_id_type between", value1, value2, "payeeIdType");
            return (Criteria) this;
        }

        public Criteria andPayeeIdTypeNotBetween(String value1, String value2) {
            addCriterion("payee_id_type not between", value1, value2, "payeeIdType");
            return (Criteria) this;
        }

        public Criteria andPayeeIdNoIsNull() {
            addCriterion("payee_id_no is null");
            return (Criteria) this;
        }

        public Criteria andPayeeIdNoIsNotNull() {
            addCriterion("payee_id_no is not null");
            return (Criteria) this;
        }

        public Criteria andPayeeIdNoEqualTo(String value) {
            addCriterion("payee_id_no =", value, "payeeIdNo");
            return (Criteria) this;
        }

        public Criteria andPayeeIdNoNotEqualTo(String value) {
            addCriterion("payee_id_no <>", value, "payeeIdNo");
            return (Criteria) this;
        }

        public Criteria andPayeeIdNoGreaterThan(String value) {
            addCriterion("payee_id_no >", value, "payeeIdNo");
            return (Criteria) this;
        }

        public Criteria andPayeeIdNoGreaterThanOrEqualTo(String value) {
            addCriterion("payee_id_no >=", value, "payeeIdNo");
            return (Criteria) this;
        }

        public Criteria andPayeeIdNoLessThan(String value) {
            addCriterion("payee_id_no <", value, "payeeIdNo");
            return (Criteria) this;
        }

        public Criteria andPayeeIdNoLessThanOrEqualTo(String value) {
            addCriterion("payee_id_no <=", value, "payeeIdNo");
            return (Criteria) this;
        }

        public Criteria andPayeeIdNoLike(String value) {
            addCriterion("payee_id_no like", value, "payeeIdNo");
            return (Criteria) this;
        }

        public Criteria andPayeeIdNoNotLike(String value) {
            addCriterion("payee_id_no not like", value, "payeeIdNo");
            return (Criteria) this;
        }

        public Criteria andPayeeIdNoIn(List<String> values) {
            addCriterion("payee_id_no in", values, "payeeIdNo");
            return (Criteria) this;
        }

        public Criteria andPayeeIdNoNotIn(List<String> values) {
            addCriterion("payee_id_no not in", values, "payeeIdNo");
            return (Criteria) this;
        }

        public Criteria andPayeeIdNoBetween(String value1, String value2) {
            addCriterion("payee_id_no between", value1, value2, "payeeIdNo");
            return (Criteria) this;
        }

        public Criteria andPayeeIdNoNotBetween(String value1, String value2) {
            addCriterion("payee_id_no not between", value1, value2, "payeeIdNo");
            return (Criteria) this;
        }

        public Criteria andPayeeOpeningBranchIsNull() {
            addCriterion("payee_opening_branch is null");
            return (Criteria) this;
        }

        public Criteria andPayeeOpeningBranchIsNotNull() {
            addCriterion("payee_opening_branch is not null");
            return (Criteria) this;
        }

        public Criteria andPayeeOpeningBranchEqualTo(String value) {
            addCriterion("payee_opening_branch =", value, "payeeOpeningBranch");
            return (Criteria) this;
        }

        public Criteria andPayeeOpeningBranchNotEqualTo(String value) {
            addCriterion("payee_opening_branch <>", value, "payeeOpeningBranch");
            return (Criteria) this;
        }

        public Criteria andPayeeOpeningBranchGreaterThan(String value) {
            addCriterion("payee_opening_branch >", value, "payeeOpeningBranch");
            return (Criteria) this;
        }

        public Criteria andPayeeOpeningBranchGreaterThanOrEqualTo(String value) {
            addCriterion("payee_opening_branch >=", value, "payeeOpeningBranch");
            return (Criteria) this;
        }

        public Criteria andPayeeOpeningBranchLessThan(String value) {
            addCriterion("payee_opening_branch <", value, "payeeOpeningBranch");
            return (Criteria) this;
        }

        public Criteria andPayeeOpeningBranchLessThanOrEqualTo(String value) {
            addCriterion("payee_opening_branch <=", value, "payeeOpeningBranch");
            return (Criteria) this;
        }

        public Criteria andPayeeOpeningBranchLike(String value) {
            addCriterion("payee_opening_branch like", value, "payeeOpeningBranch");
            return (Criteria) this;
        }

        public Criteria andPayeeOpeningBranchNotLike(String value) {
            addCriterion("payee_opening_branch not like", value, "payeeOpeningBranch");
            return (Criteria) this;
        }

        public Criteria andPayeeOpeningBranchIn(List<String> values) {
            addCriterion("payee_opening_branch in", values, "payeeOpeningBranch");
            return (Criteria) this;
        }

        public Criteria andPayeeOpeningBranchNotIn(List<String> values) {
            addCriterion("payee_opening_branch not in", values, "payeeOpeningBranch");
            return (Criteria) this;
        }

        public Criteria andPayeeOpeningBranchBetween(String value1, String value2) {
            addCriterion("payee_opening_branch between", value1, value2, "payeeOpeningBranch");
            return (Criteria) this;
        }

        public Criteria andPayeeOpeningBranchNotBetween(String value1, String value2) {
            addCriterion("payee_opening_branch not between", value1, value2, "payeeOpeningBranch");
            return (Criteria) this;
        }

        public Criteria andPurposeIsNull() {
            addCriterion("purpose is null");
            return (Criteria) this;
        }

        public Criteria andPurposeIsNotNull() {
            addCriterion("purpose is not null");
            return (Criteria) this;
        }

        public Criteria andPurposeEqualTo(String value) {
            addCriterion("purpose =", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotEqualTo(String value) {
            addCriterion("purpose <>", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeGreaterThan(String value) {
            addCriterion("purpose >", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeGreaterThanOrEqualTo(String value) {
            addCriterion("purpose >=", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLessThan(String value) {
            addCriterion("purpose <", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLessThanOrEqualTo(String value) {
            addCriterion("purpose <=", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLike(String value) {
            addCriterion("purpose like", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotLike(String value) {
            addCriterion("purpose not like", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeIn(List<String> values) {
            addCriterion("purpose in", values, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotIn(List<String> values) {
            addCriterion("purpose not in", values, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeBetween(String value1, String value2) {
            addCriterion("purpose between", value1, value2, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotBetween(String value1, String value2) {
            addCriterion("purpose not between", value1, value2, "purpose");
            return (Criteria) this;
        }

        public Criteria andBankAccountIsNull() {
            addCriterion("bank_account is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountIsNotNull() {
            addCriterion("bank_account is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountEqualTo(String value) {
            addCriterion("bank_account =", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotEqualTo(String value) {
            addCriterion("bank_account <>", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThan(String value) {
            addCriterion("bank_account >", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThanOrEqualTo(String value) {
            addCriterion("bank_account >=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThan(String value) {
            addCriterion("bank_account <", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThanOrEqualTo(String value) {
            addCriterion("bank_account <=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLike(String value) {
            addCriterion("bank_account like", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotLike(String value) {
            addCriterion("bank_account not like", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountIn(List<String> values) {
            addCriterion("bank_account in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotIn(List<String> values) {
            addCriterion("bank_account not in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountBetween(String value1, String value2) {
            addCriterion("bank_account between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotBetween(String value1, String value2) {
            addCriterion("bank_account not between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankMobileIsNull() {
            addCriterion("bank_mobile is null");
            return (Criteria) this;
        }

        public Criteria andBankMobileIsNotNull() {
            addCriterion("bank_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andBankMobileEqualTo(String value) {
            addCriterion("bank_mobile =", value, "bankMobile");
            return (Criteria) this;
        }

        public Criteria andBankMobileNotEqualTo(String value) {
            addCriterion("bank_mobile <>", value, "bankMobile");
            return (Criteria) this;
        }

        public Criteria andBankMobileGreaterThan(String value) {
            addCriterion("bank_mobile >", value, "bankMobile");
            return (Criteria) this;
        }

        public Criteria andBankMobileGreaterThanOrEqualTo(String value) {
            addCriterion("bank_mobile >=", value, "bankMobile");
            return (Criteria) this;
        }

        public Criteria andBankMobileLessThan(String value) {
            addCriterion("bank_mobile <", value, "bankMobile");
            return (Criteria) this;
        }

        public Criteria andBankMobileLessThanOrEqualTo(String value) {
            addCriterion("bank_mobile <=", value, "bankMobile");
            return (Criteria) this;
        }

        public Criteria andBankMobileLike(String value) {
            addCriterion("bank_mobile like", value, "bankMobile");
            return (Criteria) this;
        }

        public Criteria andBankMobileNotLike(String value) {
            addCriterion("bank_mobile not like", value, "bankMobile");
            return (Criteria) this;
        }

        public Criteria andBankMobileIn(List<String> values) {
            addCriterion("bank_mobile in", values, "bankMobile");
            return (Criteria) this;
        }

        public Criteria andBankMobileNotIn(List<String> values) {
            addCriterion("bank_mobile not in", values, "bankMobile");
            return (Criteria) this;
        }

        public Criteria andBankMobileBetween(String value1, String value2) {
            addCriterion("bank_mobile between", value1, value2, "bankMobile");
            return (Criteria) this;
        }

        public Criteria andBankMobileNotBetween(String value1, String value2) {
            addCriterion("bank_mobile not between", value1, value2, "bankMobile");
            return (Criteria) this;
        }

        public Criteria andRiskControlScoreIsNull() {
            addCriterion("risk_control_score is null");
            return (Criteria) this;
        }

        public Criteria andRiskControlScoreIsNotNull() {
            addCriterion("risk_control_score is not null");
            return (Criteria) this;
        }

        public Criteria andRiskControlScoreEqualTo(BigDecimal value) {
            addCriterion("risk_control_score =", value, "riskControlScore");
            return (Criteria) this;
        }

        public Criteria andRiskControlScoreNotEqualTo(BigDecimal value) {
            addCriterion("risk_control_score <>", value, "riskControlScore");
            return (Criteria) this;
        }

        public Criteria andRiskControlScoreGreaterThan(BigDecimal value) {
            addCriterion("risk_control_score >", value, "riskControlScore");
            return (Criteria) this;
        }

        public Criteria andRiskControlScoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("risk_control_score >=", value, "riskControlScore");
            return (Criteria) this;
        }

        public Criteria andRiskControlScoreLessThan(BigDecimal value) {
            addCriterion("risk_control_score <", value, "riskControlScore");
            return (Criteria) this;
        }

        public Criteria andRiskControlScoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("risk_control_score <=", value, "riskControlScore");
            return (Criteria) this;
        }

        public Criteria andRiskControlScoreIn(List<BigDecimal> values) {
            addCriterion("risk_control_score in", values, "riskControlScore");
            return (Criteria) this;
        }

        public Criteria andRiskControlScoreNotIn(List<BigDecimal> values) {
            addCriterion("risk_control_score not in", values, "riskControlScore");
            return (Criteria) this;
        }

        public Criteria andRiskControlScoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("risk_control_score between", value1, value2, "riskControlScore");
            return (Criteria) this;
        }

        public Criteria andRiskControlScoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("risk_control_score not between", value1, value2, "riskControlScore");
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