package com.ooteco.entity.match.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MatchHistoryVOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MatchHistoryVOExample() {
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

        public Criteria andLoanExpireDateIsNull() {
            addCriterion("loan_expire_date is null");
            return (Criteria) this;
        }

        public Criteria andLoanExpireDateIsNotNull() {
            addCriterion("loan_expire_date is not null");
            return (Criteria) this;
        }

        public Criteria andLoanExpireDateEqualTo(Date value) {
            addCriterionForJDBCDate("loan_expire_date =", value, "loanExpireDate");
            return (Criteria) this;
        }

        public Criteria andLoanExpireDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("loan_expire_date <>", value, "loanExpireDate");
            return (Criteria) this;
        }

        public Criteria andLoanExpireDateGreaterThan(Date value) {
            addCriterionForJDBCDate("loan_expire_date >", value, "loanExpireDate");
            return (Criteria) this;
        }

        public Criteria andLoanExpireDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("loan_expire_date >=", value, "loanExpireDate");
            return (Criteria) this;
        }

        public Criteria andLoanExpireDateLessThan(Date value) {
            addCriterionForJDBCDate("loan_expire_date <", value, "loanExpireDate");
            return (Criteria) this;
        }

        public Criteria andLoanExpireDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("loan_expire_date <=", value, "loanExpireDate");
            return (Criteria) this;
        }

        public Criteria andLoanExpireDateIn(List<Date> values) {
            addCriterionForJDBCDate("loan_expire_date in", values, "loanExpireDate");
            return (Criteria) this;
        }

        public Criteria andLoanExpireDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("loan_expire_date not in", values, "loanExpireDate");
            return (Criteria) this;
        }

        public Criteria andLoanExpireDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("loan_expire_date between", value1, value2, "loanExpireDate");
            return (Criteria) this;
        }

        public Criteria andLoanExpireDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("loan_expire_date not between", value1, value2, "loanExpireDate");
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

        public Criteria andFinanceUserCodeIsNull() {
            addCriterion("finance_user_code is null");
            return (Criteria) this;
        }

        public Criteria andFinanceUserCodeIsNotNull() {
            addCriterion("finance_user_code is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceUserCodeEqualTo(String value) {
            addCriterion("finance_user_code =", value, "financeUserCode");
            return (Criteria) this;
        }

        public Criteria andFinanceUserCodeNotEqualTo(String value) {
            addCriterion("finance_user_code <>", value, "financeUserCode");
            return (Criteria) this;
        }

        public Criteria andFinanceUserCodeGreaterThan(String value) {
            addCriterion("finance_user_code >", value, "financeUserCode");
            return (Criteria) this;
        }

        public Criteria andFinanceUserCodeGreaterThanOrEqualTo(String value) {
            addCriterion("finance_user_code >=", value, "financeUserCode");
            return (Criteria) this;
        }

        public Criteria andFinanceUserCodeLessThan(String value) {
            addCriterion("finance_user_code <", value, "financeUserCode");
            return (Criteria) this;
        }

        public Criteria andFinanceUserCodeLessThanOrEqualTo(String value) {
            addCriterion("finance_user_code <=", value, "financeUserCode");
            return (Criteria) this;
        }

        public Criteria andFinanceUserCodeLike(String value) {
            addCriterion("finance_user_code like", value, "financeUserCode");
            return (Criteria) this;
        }

        public Criteria andFinanceUserCodeNotLike(String value) {
            addCriterion("finance_user_code not like", value, "financeUserCode");
            return (Criteria) this;
        }

        public Criteria andFinanceUserCodeIn(List<String> values) {
            addCriterion("finance_user_code in", values, "financeUserCode");
            return (Criteria) this;
        }

        public Criteria andFinanceUserCodeNotIn(List<String> values) {
            addCriterion("finance_user_code not in", values, "financeUserCode");
            return (Criteria) this;
        }

        public Criteria andFinanceUserCodeBetween(String value1, String value2) {
            addCriterion("finance_user_code between", value1, value2, "financeUserCode");
            return (Criteria) this;
        }

        public Criteria andFinanceUserCodeNotBetween(String value1, String value2) {
            addCriterion("finance_user_code not between", value1, value2, "financeUserCode");
            return (Criteria) this;
        }

        public Criteria andRepayIdIsNull() {
            addCriterion("repay_id is null");
            return (Criteria) this;
        }

        public Criteria andRepayIdIsNotNull() {
            addCriterion("repay_id is not null");
            return (Criteria) this;
        }

        public Criteria andRepayIdEqualTo(Long value) {
            addCriterion("repay_id =", value, "repayId");
            return (Criteria) this;
        }

        public Criteria andRepayIdNotEqualTo(Long value) {
            addCriterion("repay_id <>", value, "repayId");
            return (Criteria) this;
        }

        public Criteria andRepayIdGreaterThan(Long value) {
            addCriterion("repay_id >", value, "repayId");
            return (Criteria) this;
        }

        public Criteria andRepayIdGreaterThanOrEqualTo(Long value) {
            addCriterion("repay_id >=", value, "repayId");
            return (Criteria) this;
        }

        public Criteria andRepayIdLessThan(Long value) {
            addCriterion("repay_id <", value, "repayId");
            return (Criteria) this;
        }

        public Criteria andRepayIdLessThanOrEqualTo(Long value) {
            addCriterion("repay_id <=", value, "repayId");
            return (Criteria) this;
        }

        public Criteria andRepayIdIn(List<Long> values) {
            addCriterion("repay_id in", values, "repayId");
            return (Criteria) this;
        }

        public Criteria andRepayIdNotIn(List<Long> values) {
            addCriterion("repay_id not in", values, "repayId");
            return (Criteria) this;
        }

        public Criteria andRepayIdBetween(Long value1, Long value2) {
            addCriterion("repay_id between", value1, value2, "repayId");
            return (Criteria) this;
        }

        public Criteria andRepayIdNotBetween(Long value1, Long value2) {
            addCriterion("repay_id not between", value1, value2, "repayId");
            return (Criteria) this;
        }

        public Criteria andRepaySplitIdIsNull() {
            addCriterion("repay_split_id is null");
            return (Criteria) this;
        }

        public Criteria andRepaySplitIdIsNotNull() {
            addCriterion("repay_split_id is not null");
            return (Criteria) this;
        }

        public Criteria andRepaySplitIdEqualTo(Long value) {
            addCriterion("repay_split_id =", value, "repaySplitId");
            return (Criteria) this;
        }

        public Criteria andRepaySplitIdNotEqualTo(Long value) {
            addCriterion("repay_split_id <>", value, "repaySplitId");
            return (Criteria) this;
        }

        public Criteria andRepaySplitIdGreaterThan(Long value) {
            addCriterion("repay_split_id >", value, "repaySplitId");
            return (Criteria) this;
        }

        public Criteria andRepaySplitIdGreaterThanOrEqualTo(Long value) {
            addCriterion("repay_split_id >=", value, "repaySplitId");
            return (Criteria) this;
        }

        public Criteria andRepaySplitIdLessThan(Long value) {
            addCriterion("repay_split_id <", value, "repaySplitId");
            return (Criteria) this;
        }

        public Criteria andRepaySplitIdLessThanOrEqualTo(Long value) {
            addCriterion("repay_split_id <=", value, "repaySplitId");
            return (Criteria) this;
        }

        public Criteria andRepaySplitIdIn(List<Long> values) {
            addCriterion("repay_split_id in", values, "repaySplitId");
            return (Criteria) this;
        }

        public Criteria andRepaySplitIdNotIn(List<Long> values) {
            addCriterion("repay_split_id not in", values, "repaySplitId");
            return (Criteria) this;
        }

        public Criteria andRepaySplitIdBetween(Long value1, Long value2) {
            addCriterion("repay_split_id between", value1, value2, "repaySplitId");
            return (Criteria) this;
        }

        public Criteria andRepaySplitIdNotBetween(Long value1, Long value2) {
            addCriterion("repay_split_id not between", value1, value2, "repaySplitId");
            return (Criteria) this;
        }

        public Criteria andFinanceSplitIdIsNull() {
            addCriterion("finance_split_id is null");
            return (Criteria) this;
        }

        public Criteria andFinanceSplitIdIsNotNull() {
            addCriterion("finance_split_id is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceSplitIdEqualTo(Long value) {
            addCriterion("finance_split_id =", value, "financeSplitId");
            return (Criteria) this;
        }

        public Criteria andFinanceSplitIdNotEqualTo(Long value) {
            addCriterion("finance_split_id <>", value, "financeSplitId");
            return (Criteria) this;
        }

        public Criteria andFinanceSplitIdGreaterThan(Long value) {
            addCriterion("finance_split_id >", value, "financeSplitId");
            return (Criteria) this;
        }

        public Criteria andFinanceSplitIdGreaterThanOrEqualTo(Long value) {
            addCriterion("finance_split_id >=", value, "financeSplitId");
            return (Criteria) this;
        }

        public Criteria andFinanceSplitIdLessThan(Long value) {
            addCriterion("finance_split_id <", value, "financeSplitId");
            return (Criteria) this;
        }

        public Criteria andFinanceSplitIdLessThanOrEqualTo(Long value) {
            addCriterion("finance_split_id <=", value, "financeSplitId");
            return (Criteria) this;
        }

        public Criteria andFinanceSplitIdIn(List<Long> values) {
            addCriterion("finance_split_id in", values, "financeSplitId");
            return (Criteria) this;
        }

        public Criteria andFinanceSplitIdNotIn(List<Long> values) {
            addCriterion("finance_split_id not in", values, "financeSplitId");
            return (Criteria) this;
        }

        public Criteria andFinanceSplitIdBetween(Long value1, Long value2) {
            addCriterion("finance_split_id between", value1, value2, "financeSplitId");
            return (Criteria) this;
        }

        public Criteria andFinanceSplitIdNotBetween(Long value1, Long value2) {
            addCriterion("finance_split_id not between", value1, value2, "financeSplitId");
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

        public Criteria andLoanUserCodeIsNull() {
            addCriterion("loan_user_code is null");
            return (Criteria) this;
        }

        public Criteria andLoanUserCodeIsNotNull() {
            addCriterion("loan_user_code is not null");
            return (Criteria) this;
        }

        public Criteria andLoanUserCodeEqualTo(String value) {
            addCriterion("loan_user_code =", value, "loanUserCode");
            return (Criteria) this;
        }

        public Criteria andLoanUserCodeNotEqualTo(String value) {
            addCriterion("loan_user_code <>", value, "loanUserCode");
            return (Criteria) this;
        }

        public Criteria andLoanUserCodeGreaterThan(String value) {
            addCriterion("loan_user_code >", value, "loanUserCode");
            return (Criteria) this;
        }

        public Criteria andLoanUserCodeGreaterThanOrEqualTo(String value) {
            addCriterion("loan_user_code >=", value, "loanUserCode");
            return (Criteria) this;
        }

        public Criteria andLoanUserCodeLessThan(String value) {
            addCriterion("loan_user_code <", value, "loanUserCode");
            return (Criteria) this;
        }

        public Criteria andLoanUserCodeLessThanOrEqualTo(String value) {
            addCriterion("loan_user_code <=", value, "loanUserCode");
            return (Criteria) this;
        }

        public Criteria andLoanUserCodeLike(String value) {
            addCriterion("loan_user_code like", value, "loanUserCode");
            return (Criteria) this;
        }

        public Criteria andLoanUserCodeNotLike(String value) {
            addCriterion("loan_user_code not like", value, "loanUserCode");
            return (Criteria) this;
        }

        public Criteria andLoanUserCodeIn(List<String> values) {
            addCriterion("loan_user_code in", values, "loanUserCode");
            return (Criteria) this;
        }

        public Criteria andLoanUserCodeNotIn(List<String> values) {
            addCriterion("loan_user_code not in", values, "loanUserCode");
            return (Criteria) this;
        }

        public Criteria andLoanUserCodeBetween(String value1, String value2) {
            addCriterion("loan_user_code between", value1, value2, "loanUserCode");
            return (Criteria) this;
        }

        public Criteria andLoanUserCodeNotBetween(String value1, String value2) {
            addCriterion("loan_user_code not between", value1, value2, "loanUserCode");
            return (Criteria) this;
        }

        public Criteria andAllotAmountIsNull() {
            addCriterion("allot_amount is null");
            return (Criteria) this;
        }

        public Criteria andAllotAmountIsNotNull() {
            addCriterion("allot_amount is not null");
            return (Criteria) this;
        }

        public Criteria andAllotAmountEqualTo(BigDecimal value) {
            addCriterion("allot_amount =", value, "allotAmount");
            return (Criteria) this;
        }

        public Criteria andAllotAmountNotEqualTo(BigDecimal value) {
            addCriterion("allot_amount <>", value, "allotAmount");
            return (Criteria) this;
        }

        public Criteria andAllotAmountGreaterThan(BigDecimal value) {
            addCriterion("allot_amount >", value, "allotAmount");
            return (Criteria) this;
        }

        public Criteria andAllotAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("allot_amount >=", value, "allotAmount");
            return (Criteria) this;
        }

        public Criteria andAllotAmountLessThan(BigDecimal value) {
            addCriterion("allot_amount <", value, "allotAmount");
            return (Criteria) this;
        }

        public Criteria andAllotAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("allot_amount <=", value, "allotAmount");
            return (Criteria) this;
        }

        public Criteria andAllotAmountIn(List<BigDecimal> values) {
            addCriterion("allot_amount in", values, "allotAmount");
            return (Criteria) this;
        }

        public Criteria andAllotAmountNotIn(List<BigDecimal> values) {
            addCriterion("allot_amount not in", values, "allotAmount");
            return (Criteria) this;
        }

        public Criteria andAllotAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("allot_amount between", value1, value2, "allotAmount");
            return (Criteria) this;
        }

        public Criteria andAllotAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("allot_amount not between", value1, value2, "allotAmount");
            return (Criteria) this;
        }

        public Criteria andIsRecentlyIsNull() {
            addCriterion("is_recently is null");
            return (Criteria) this;
        }

        public Criteria andIsRecentlyIsNotNull() {
            addCriterion("is_recently is not null");
            return (Criteria) this;
        }

        public Criteria andIsRecentlyEqualTo(Boolean value) {
            addCriterion("is_recently =", value, "isRecently");
            return (Criteria) this;
        }

        public Criteria andIsRecentlyNotEqualTo(Boolean value) {
            addCriterion("is_recently <>", value, "isRecently");
            return (Criteria) this;
        }

        public Criteria andIsRecentlyGreaterThan(Boolean value) {
            addCriterion("is_recently >", value, "isRecently");
            return (Criteria) this;
        }

        public Criteria andIsRecentlyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_recently >=", value, "isRecently");
            return (Criteria) this;
        }

        public Criteria andIsRecentlyLessThan(Boolean value) {
            addCriterion("is_recently <", value, "isRecently");
            return (Criteria) this;
        }

        public Criteria andIsRecentlyLessThanOrEqualTo(Boolean value) {
            addCriterion("is_recently <=", value, "isRecently");
            return (Criteria) this;
        }

        public Criteria andIsRecentlyIn(List<Boolean> values) {
            addCriterion("is_recently in", values, "isRecently");
            return (Criteria) this;
        }

        public Criteria andIsRecentlyNotIn(List<Boolean> values) {
            addCriterion("is_recently not in", values, "isRecently");
            return (Criteria) this;
        }

        public Criteria andIsRecentlyBetween(Boolean value1, Boolean value2) {
            addCriterion("is_recently between", value1, value2, "isRecently");
            return (Criteria) this;
        }

        public Criteria andIsRecentlyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_recently not between", value1, value2, "isRecently");
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