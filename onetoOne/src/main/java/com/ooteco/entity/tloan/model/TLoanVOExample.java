package com.ooteco.entity.tloan.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TLoanVOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TLoanVOExample() {
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

        public Criteria andRefundIdIsNull() {
            addCriterion("refund_id is null");
            return (Criteria) this;
        }

        public Criteria andRefundIdIsNotNull() {
            addCriterion("refund_id is not null");
            return (Criteria) this;
        }

        public Criteria andRefundIdEqualTo(Integer value) {
            addCriterion("refund_id =", value, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdNotEqualTo(Integer value) {
            addCriterion("refund_id <>", value, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdGreaterThan(Integer value) {
            addCriterion("refund_id >", value, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("refund_id >=", value, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdLessThan(Integer value) {
            addCriterion("refund_id <", value, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdLessThanOrEqualTo(Integer value) {
            addCriterion("refund_id <=", value, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdIn(List<Integer> values) {
            addCriterion("refund_id in", values, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdNotIn(List<Integer> values) {
            addCriterion("refund_id not in", values, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdBetween(Integer value1, Integer value2) {
            addCriterion("refund_id between", value1, value2, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdNotBetween(Integer value1, Integer value2) {
            addCriterion("refund_id not between", value1, value2, "refundId");
            return (Criteria) this;
        }

        public Criteria andPhaseIsNull() {
            addCriterion("phase is null");
            return (Criteria) this;
        }

        public Criteria andPhaseIsNotNull() {
            addCriterion("phase is not null");
            return (Criteria) this;
        }

        public Criteria andPhaseEqualTo(Integer value) {
            addCriterion("phase =", value, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseNotEqualTo(Integer value) {
            addCriterion("phase <>", value, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseGreaterThan(Integer value) {
            addCriterion("phase >", value, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseGreaterThanOrEqualTo(Integer value) {
            addCriterion("phase >=", value, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseLessThan(Integer value) {
            addCriterion("phase <", value, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseLessThanOrEqualTo(Integer value) {
            addCriterion("phase <=", value, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseIn(List<Integer> values) {
            addCriterion("phase in", values, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseNotIn(List<Integer> values) {
            addCriterion("phase not in", values, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseBetween(Integer value1, Integer value2) {
            addCriterion("phase between", value1, value2, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseNotBetween(Integer value1, Integer value2) {
            addCriterion("phase not between", value1, value2, "phase");
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

        public Criteria andCapitalIsNull() {
            addCriterion("capital is null");
            return (Criteria) this;
        }

        public Criteria andCapitalIsNotNull() {
            addCriterion("capital is not null");
            return (Criteria) this;
        }

        public Criteria andCapitalEqualTo(BigDecimal value) {
            addCriterion("capital =", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalNotEqualTo(BigDecimal value) {
            addCriterion("capital <>", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalGreaterThan(BigDecimal value) {
            addCriterion("capital >", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("capital >=", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalLessThan(BigDecimal value) {
            addCriterion("capital <", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("capital <=", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalIn(List<BigDecimal> values) {
            addCriterion("capital in", values, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalNotIn(List<BigDecimal> values) {
            addCriterion("capital not in", values, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("capital between", value1, value2, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("capital not between", value1, value2, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalBalanceIsNull() {
            addCriterion("capital_balance is null");
            return (Criteria) this;
        }

        public Criteria andCapitalBalanceIsNotNull() {
            addCriterion("capital_balance is not null");
            return (Criteria) this;
        }

        public Criteria andCapitalBalanceEqualTo(BigDecimal value) {
            addCriterion("capital_balance =", value, "capitalBalance");
            return (Criteria) this;
        }

        public Criteria andCapitalBalanceNotEqualTo(BigDecimal value) {
            addCriterion("capital_balance <>", value, "capitalBalance");
            return (Criteria) this;
        }

        public Criteria andCapitalBalanceGreaterThan(BigDecimal value) {
            addCriterion("capital_balance >", value, "capitalBalance");
            return (Criteria) this;
        }

        public Criteria andCapitalBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("capital_balance >=", value, "capitalBalance");
            return (Criteria) this;
        }

        public Criteria andCapitalBalanceLessThan(BigDecimal value) {
            addCriterion("capital_balance <", value, "capitalBalance");
            return (Criteria) this;
        }

        public Criteria andCapitalBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("capital_balance <=", value, "capitalBalance");
            return (Criteria) this;
        }

        public Criteria andCapitalBalanceIn(List<BigDecimal> values) {
            addCriterion("capital_balance in", values, "capitalBalance");
            return (Criteria) this;
        }

        public Criteria andCapitalBalanceNotIn(List<BigDecimal> values) {
            addCriterion("capital_balance not in", values, "capitalBalance");
            return (Criteria) this;
        }

        public Criteria andCapitalBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("capital_balance between", value1, value2, "capitalBalance");
            return (Criteria) this;
        }

        public Criteria andCapitalBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("capital_balance not between", value1, value2, "capitalBalance");
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

        public Criteria andInterestBalanceIsNull() {
            addCriterion("interest_balance is null");
            return (Criteria) this;
        }

        public Criteria andInterestBalanceIsNotNull() {
            addCriterion("interest_balance is not null");
            return (Criteria) this;
        }

        public Criteria andInterestBalanceEqualTo(BigDecimal value) {
            addCriterion("interest_balance =", value, "interestBalance");
            return (Criteria) this;
        }

        public Criteria andInterestBalanceNotEqualTo(BigDecimal value) {
            addCriterion("interest_balance <>", value, "interestBalance");
            return (Criteria) this;
        }

        public Criteria andInterestBalanceGreaterThan(BigDecimal value) {
            addCriterion("interest_balance >", value, "interestBalance");
            return (Criteria) this;
        }

        public Criteria andInterestBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("interest_balance >=", value, "interestBalance");
            return (Criteria) this;
        }

        public Criteria andInterestBalanceLessThan(BigDecimal value) {
            addCriterion("interest_balance <", value, "interestBalance");
            return (Criteria) this;
        }

        public Criteria andInterestBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("interest_balance <=", value, "interestBalance");
            return (Criteria) this;
        }

        public Criteria andInterestBalanceIn(List<BigDecimal> values) {
            addCriterion("interest_balance in", values, "interestBalance");
            return (Criteria) this;
        }

        public Criteria andInterestBalanceNotIn(List<BigDecimal> values) {
            addCriterion("interest_balance not in", values, "interestBalance");
            return (Criteria) this;
        }

        public Criteria andInterestBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interest_balance between", value1, value2, "interestBalance");
            return (Criteria) this;
        }

        public Criteria andInterestBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interest_balance not between", value1, value2, "interestBalance");
            return (Criteria) this;
        }

        public Criteria andFeeIsNull() {
            addCriterion("fee is null");
            return (Criteria) this;
        }

        public Criteria andFeeIsNotNull() {
            addCriterion("fee is not null");
            return (Criteria) this;
        }

        public Criteria andFeeEqualTo(BigDecimal value) {
            addCriterion("fee =", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotEqualTo(BigDecimal value) {
            addCriterion("fee <>", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThan(BigDecimal value) {
            addCriterion("fee >", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fee >=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThan(BigDecimal value) {
            addCriterion("fee <", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fee <=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeIn(List<BigDecimal> values) {
            addCriterion("fee in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotIn(List<BigDecimal> values) {
            addCriterion("fee not in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee between", value1, value2, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee not between", value1, value2, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeBalanceIsNull() {
            addCriterion("fee_balance is null");
            return (Criteria) this;
        }

        public Criteria andFeeBalanceIsNotNull() {
            addCriterion("fee_balance is not null");
            return (Criteria) this;
        }

        public Criteria andFeeBalanceEqualTo(BigDecimal value) {
            addCriterion("fee_balance =", value, "feeBalance");
            return (Criteria) this;
        }

        public Criteria andFeeBalanceNotEqualTo(BigDecimal value) {
            addCriterion("fee_balance <>", value, "feeBalance");
            return (Criteria) this;
        }

        public Criteria andFeeBalanceGreaterThan(BigDecimal value) {
            addCriterion("fee_balance >", value, "feeBalance");
            return (Criteria) this;
        }

        public Criteria andFeeBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fee_balance >=", value, "feeBalance");
            return (Criteria) this;
        }

        public Criteria andFeeBalanceLessThan(BigDecimal value) {
            addCriterion("fee_balance <", value, "feeBalance");
            return (Criteria) this;
        }

        public Criteria andFeeBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fee_balance <=", value, "feeBalance");
            return (Criteria) this;
        }

        public Criteria andFeeBalanceIn(List<BigDecimal> values) {
            addCriterion("fee_balance in", values, "feeBalance");
            return (Criteria) this;
        }

        public Criteria andFeeBalanceNotIn(List<BigDecimal> values) {
            addCriterion("fee_balance not in", values, "feeBalance");
            return (Criteria) this;
        }

        public Criteria andFeeBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee_balance between", value1, value2, "feeBalance");
            return (Criteria) this;
        }

        public Criteria andFeeBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee_balance not between", value1, value2, "feeBalance");
            return (Criteria) this;
        }

        public Criteria andZxfeeIsNull() {
            addCriterion("zxfee is null");
            return (Criteria) this;
        }

        public Criteria andZxfeeIsNotNull() {
            addCriterion("zxfee is not null");
            return (Criteria) this;
        }

        public Criteria andZxfeeEqualTo(BigDecimal value) {
            addCriterion("zxfee =", value, "zxfee");
            return (Criteria) this;
        }

        public Criteria andZxfeeNotEqualTo(BigDecimal value) {
            addCriterion("zxfee <>", value, "zxfee");
            return (Criteria) this;
        }

        public Criteria andZxfeeGreaterThan(BigDecimal value) {
            addCriterion("zxfee >", value, "zxfee");
            return (Criteria) this;
        }

        public Criteria andZxfeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("zxfee >=", value, "zxfee");
            return (Criteria) this;
        }

        public Criteria andZxfeeLessThan(BigDecimal value) {
            addCriterion("zxfee <", value, "zxfee");
            return (Criteria) this;
        }

        public Criteria andZxfeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("zxfee <=", value, "zxfee");
            return (Criteria) this;
        }

        public Criteria andZxfeeIn(List<BigDecimal> values) {
            addCriterion("zxfee in", values, "zxfee");
            return (Criteria) this;
        }

        public Criteria andZxfeeNotIn(List<BigDecimal> values) {
            addCriterion("zxfee not in", values, "zxfee");
            return (Criteria) this;
        }

        public Criteria andZxfeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("zxfee between", value1, value2, "zxfee");
            return (Criteria) this;
        }

        public Criteria andZxfeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("zxfee not between", value1, value2, "zxfee");
            return (Criteria) this;
        }

        public Criteria andRateIsNull() {
            addCriterion("rate is null");
            return (Criteria) this;
        }

        public Criteria andRateIsNotNull() {
            addCriterion("rate is not null");
            return (Criteria) this;
        }

        public Criteria andRateEqualTo(BigDecimal value) {
            addCriterion("rate =", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotEqualTo(BigDecimal value) {
            addCriterion("rate <>", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThan(BigDecimal value) {
            addCriterion("rate >", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rate >=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThan(BigDecimal value) {
            addCriterion("rate <", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rate <=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateIn(List<BigDecimal> values) {
            addCriterion("rate in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotIn(List<BigDecimal> values) {
            addCriterion("rate not in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rate between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rate not between", value1, value2, "rate");
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
            addCriterion("start_date =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterion("start_date <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterion("start_date >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("start_date >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterion("start_date <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterion("start_date <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterion("start_date in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterion("start_date not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterion("start_date between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterion("start_date not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andPeriodDayIsNull() {
            addCriterion("period_day is null");
            return (Criteria) this;
        }

        public Criteria andPeriodDayIsNotNull() {
            addCriterion("period_day is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodDayEqualTo(Integer value) {
            addCriterion("period_day =", value, "periodDay");
            return (Criteria) this;
        }

        public Criteria andPeriodDayNotEqualTo(Integer value) {
            addCriterion("period_day <>", value, "periodDay");
            return (Criteria) this;
        }

        public Criteria andPeriodDayGreaterThan(Integer value) {
            addCriterion("period_day >", value, "periodDay");
            return (Criteria) this;
        }

        public Criteria andPeriodDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("period_day >=", value, "periodDay");
            return (Criteria) this;
        }

        public Criteria andPeriodDayLessThan(Integer value) {
            addCriterion("period_day <", value, "periodDay");
            return (Criteria) this;
        }

        public Criteria andPeriodDayLessThanOrEqualTo(Integer value) {
            addCriterion("period_day <=", value, "periodDay");
            return (Criteria) this;
        }

        public Criteria andPeriodDayIn(List<Integer> values) {
            addCriterion("period_day in", values, "periodDay");
            return (Criteria) this;
        }

        public Criteria andPeriodDayNotIn(List<Integer> values) {
            addCriterion("period_day not in", values, "periodDay");
            return (Criteria) this;
        }

        public Criteria andPeriodDayBetween(Integer value1, Integer value2) {
            addCriterion("period_day between", value1, value2, "periodDay");
            return (Criteria) this;
        }

        public Criteria andPeriodDayNotBetween(Integer value1, Integer value2) {
            addCriterion("period_day not between", value1, value2, "periodDay");
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
            addCriterion("end_date =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterion("end_date <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterion("end_date >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("end_date >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterion("end_date <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterion("end_date <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterion("end_date in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterion("end_date not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterion("end_date between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterion("end_date not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateFIsNull() {
            addCriterion("end_date_f is null");
            return (Criteria) this;
        }

        public Criteria andEndDateFIsNotNull() {
            addCriterion("end_date_f is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateFEqualTo(Date value) {
            addCriterion("end_date_f =", value, "endDateF");
            return (Criteria) this;
        }

        public Criteria andEndDateFNotEqualTo(Date value) {
            addCriterion("end_date_f <>", value, "endDateF");
            return (Criteria) this;
        }

        public Criteria andEndDateFGreaterThan(Date value) {
            addCriterion("end_date_f >", value, "endDateF");
            return (Criteria) this;
        }

        public Criteria andEndDateFGreaterThanOrEqualTo(Date value) {
            addCriterion("end_date_f >=", value, "endDateF");
            return (Criteria) this;
        }

        public Criteria andEndDateFLessThan(Date value) {
            addCriterion("end_date_f <", value, "endDateF");
            return (Criteria) this;
        }

        public Criteria andEndDateFLessThanOrEqualTo(Date value) {
            addCriterion("end_date_f <=", value, "endDateF");
            return (Criteria) this;
        }

        public Criteria andEndDateFIn(List<Date> values) {
            addCriterion("end_date_f in", values, "endDateF");
            return (Criteria) this;
        }

        public Criteria andEndDateFNotIn(List<Date> values) {
            addCriterion("end_date_f not in", values, "endDateF");
            return (Criteria) this;
        }

        public Criteria andEndDateFBetween(Date value1, Date value2) {
            addCriterion("end_date_f between", value1, value2, "endDateF");
            return (Criteria) this;
        }

        public Criteria andEndDateFNotBetween(Date value1, Date value2) {
            addCriterion("end_date_f not between", value1, value2, "endDateF");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusIsNull() {
            addCriterion("payment_status is null");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusIsNotNull() {
            addCriterion("payment_status is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusEqualTo(String value) {
            addCriterion("payment_status =", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusNotEqualTo(String value) {
            addCriterion("payment_status <>", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusGreaterThan(String value) {
            addCriterion("payment_status >", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusGreaterThanOrEqualTo(String value) {
            addCriterion("payment_status >=", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusLessThan(String value) {
            addCriterion("payment_status <", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusLessThanOrEqualTo(String value) {
            addCriterion("payment_status <=", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusLike(String value) {
            addCriterion("payment_status like", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusNotLike(String value) {
            addCriterion("payment_status not like", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusIn(List<String> values) {
            addCriterion("payment_status in", values, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusNotIn(List<String> values) {
            addCriterion("payment_status not in", values, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusBetween(String value1, String value2) {
            addCriterion("payment_status between", value1, value2, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusNotBetween(String value1, String value2) {
            addCriterion("payment_status not between", value1, value2, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentDateIsNull() {
            addCriterion("payment_date is null");
            return (Criteria) this;
        }

        public Criteria andPaymentDateIsNotNull() {
            addCriterion("payment_date is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentDateEqualTo(String value) {
            addCriterion("payment_date =", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateNotEqualTo(String value) {
            addCriterion("payment_date <>", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateGreaterThan(String value) {
            addCriterion("payment_date >", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateGreaterThanOrEqualTo(String value) {
            addCriterion("payment_date >=", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateLessThan(String value) {
            addCriterion("payment_date <", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateLessThanOrEqualTo(String value) {
            addCriterion("payment_date <=", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateLike(String value) {
            addCriterion("payment_date like", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateNotLike(String value) {
            addCriterion("payment_date not like", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateIn(List<String> values) {
            addCriterion("payment_date in", values, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateNotIn(List<String> values) {
            addCriterion("payment_date not in", values, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateBetween(String value1, String value2) {
            addCriterion("payment_date between", value1, value2, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateNotBetween(String value1, String value2) {
            addCriterion("payment_date not between", value1, value2, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andLockedIsNull() {
            addCriterion("locked is null");
            return (Criteria) this;
        }

        public Criteria andLockedIsNotNull() {
            addCriterion("locked is not null");
            return (Criteria) this;
        }

        public Criteria andLockedEqualTo(Long value) {
            addCriterion("locked =", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotEqualTo(Long value) {
            addCriterion("locked <>", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedGreaterThan(Long value) {
            addCriterion("locked >", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedGreaterThanOrEqualTo(Long value) {
            addCriterion("locked >=", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedLessThan(Long value) {
            addCriterion("locked <", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedLessThanOrEqualTo(Long value) {
            addCriterion("locked <=", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedIn(List<Long> values) {
            addCriterion("locked in", values, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotIn(List<Long> values) {
            addCriterion("locked not in", values, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedBetween(Long value1, Long value2) {
            addCriterion("locked between", value1, value2, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotBetween(Long value1, Long value2) {
            addCriterion("locked not between", value1, value2, "locked");
            return (Criteria) this;
        }

        public Criteria andBorrowingFormidIsNull() {
            addCriterion("borrowing_formId is null");
            return (Criteria) this;
        }

        public Criteria andBorrowingFormidIsNotNull() {
            addCriterion("borrowing_formId is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowingFormidEqualTo(Integer value) {
            addCriterion("borrowing_formId =", value, "borrowingFormid");
            return (Criteria) this;
        }

        public Criteria andBorrowingFormidNotEqualTo(Integer value) {
            addCriterion("borrowing_formId <>", value, "borrowingFormid");
            return (Criteria) this;
        }

        public Criteria andBorrowingFormidGreaterThan(Integer value) {
            addCriterion("borrowing_formId >", value, "borrowingFormid");
            return (Criteria) this;
        }

        public Criteria andBorrowingFormidGreaterThanOrEqualTo(Integer value) {
            addCriterion("borrowing_formId >=", value, "borrowingFormid");
            return (Criteria) this;
        }

        public Criteria andBorrowingFormidLessThan(Integer value) {
            addCriterion("borrowing_formId <", value, "borrowingFormid");
            return (Criteria) this;
        }

        public Criteria andBorrowingFormidLessThanOrEqualTo(Integer value) {
            addCriterion("borrowing_formId <=", value, "borrowingFormid");
            return (Criteria) this;
        }

        public Criteria andBorrowingFormidIn(List<Integer> values) {
            addCriterion("borrowing_formId in", values, "borrowingFormid");
            return (Criteria) this;
        }

        public Criteria andBorrowingFormidNotIn(List<Integer> values) {
            addCriterion("borrowing_formId not in", values, "borrowingFormid");
            return (Criteria) this;
        }

        public Criteria andBorrowingFormidBetween(Integer value1, Integer value2) {
            addCriterion("borrowing_formId between", value1, value2, "borrowingFormid");
            return (Criteria) this;
        }

        public Criteria andBorrowingFormidNotBetween(Integer value1, Integer value2) {
            addCriterion("borrowing_formId not between", value1, value2, "borrowingFormid");
            return (Criteria) this;
        }

        public Criteria andBorrowingProductidIsNull() {
            addCriterion("borrowing_productId is null");
            return (Criteria) this;
        }

        public Criteria andBorrowingProductidIsNotNull() {
            addCriterion("borrowing_productId is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowingProductidEqualTo(Integer value) {
            addCriterion("borrowing_productId =", value, "borrowingProductid");
            return (Criteria) this;
        }

        public Criteria andBorrowingProductidNotEqualTo(Integer value) {
            addCriterion("borrowing_productId <>", value, "borrowingProductid");
            return (Criteria) this;
        }

        public Criteria andBorrowingProductidGreaterThan(Integer value) {
            addCriterion("borrowing_productId >", value, "borrowingProductid");
            return (Criteria) this;
        }

        public Criteria andBorrowingProductidGreaterThanOrEqualTo(Integer value) {
            addCriterion("borrowing_productId >=", value, "borrowingProductid");
            return (Criteria) this;
        }

        public Criteria andBorrowingProductidLessThan(Integer value) {
            addCriterion("borrowing_productId <", value, "borrowingProductid");
            return (Criteria) this;
        }

        public Criteria andBorrowingProductidLessThanOrEqualTo(Integer value) {
            addCriterion("borrowing_productId <=", value, "borrowingProductid");
            return (Criteria) this;
        }

        public Criteria andBorrowingProductidIn(List<Integer> values) {
            addCriterion("borrowing_productId in", values, "borrowingProductid");
            return (Criteria) this;
        }

        public Criteria andBorrowingProductidNotIn(List<Integer> values) {
            addCriterion("borrowing_productId not in", values, "borrowingProductid");
            return (Criteria) this;
        }

        public Criteria andBorrowingProductidBetween(Integer value1, Integer value2) {
            addCriterion("borrowing_productId between", value1, value2, "borrowingProductid");
            return (Criteria) this;
        }

        public Criteria andBorrowingProductidNotBetween(Integer value1, Integer value2) {
            addCriterion("borrowing_productId not between", value1, value2, "borrowingProductid");
            return (Criteria) this;
        }

        public Criteria andBorrowingProductnameIsNull() {
            addCriterion("borrowing_productName is null");
            return (Criteria) this;
        }

        public Criteria andBorrowingProductnameIsNotNull() {
            addCriterion("borrowing_productName is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowingProductnameEqualTo(String value) {
            addCriterion("borrowing_productName =", value, "borrowingProductname");
            return (Criteria) this;
        }

        public Criteria andBorrowingProductnameNotEqualTo(String value) {
            addCriterion("borrowing_productName <>", value, "borrowingProductname");
            return (Criteria) this;
        }

        public Criteria andBorrowingProductnameGreaterThan(String value) {
            addCriterion("borrowing_productName >", value, "borrowingProductname");
            return (Criteria) this;
        }

        public Criteria andBorrowingProductnameGreaterThanOrEqualTo(String value) {
            addCriterion("borrowing_productName >=", value, "borrowingProductname");
            return (Criteria) this;
        }

        public Criteria andBorrowingProductnameLessThan(String value) {
            addCriterion("borrowing_productName <", value, "borrowingProductname");
            return (Criteria) this;
        }

        public Criteria andBorrowingProductnameLessThanOrEqualTo(String value) {
            addCriterion("borrowing_productName <=", value, "borrowingProductname");
            return (Criteria) this;
        }

        public Criteria andBorrowingProductnameLike(String value) {
            addCriterion("borrowing_productName like", value, "borrowingProductname");
            return (Criteria) this;
        }

        public Criteria andBorrowingProductnameNotLike(String value) {
            addCriterion("borrowing_productName not like", value, "borrowingProductname");
            return (Criteria) this;
        }

        public Criteria andBorrowingProductnameIn(List<String> values) {
            addCriterion("borrowing_productName in", values, "borrowingProductname");
            return (Criteria) this;
        }

        public Criteria andBorrowingProductnameNotIn(List<String> values) {
            addCriterion("borrowing_productName not in", values, "borrowingProductname");
            return (Criteria) this;
        }

        public Criteria andBorrowingProductnameBetween(String value1, String value2) {
            addCriterion("borrowing_productName between", value1, value2, "borrowingProductname");
            return (Criteria) this;
        }

        public Criteria andBorrowingProductnameNotBetween(String value1, String value2) {
            addCriterion("borrowing_productName not between", value1, value2, "borrowingProductname");
            return (Criteria) this;
        }

        public Criteria andTotalPhaseIsNull() {
            addCriterion("total_phase is null");
            return (Criteria) this;
        }

        public Criteria andTotalPhaseIsNotNull() {
            addCriterion("total_phase is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPhaseEqualTo(Integer value) {
            addCriterion("total_phase =", value, "totalPhase");
            return (Criteria) this;
        }

        public Criteria andTotalPhaseNotEqualTo(Integer value) {
            addCriterion("total_phase <>", value, "totalPhase");
            return (Criteria) this;
        }

        public Criteria andTotalPhaseGreaterThan(Integer value) {
            addCriterion("total_phase >", value, "totalPhase");
            return (Criteria) this;
        }

        public Criteria andTotalPhaseGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_phase >=", value, "totalPhase");
            return (Criteria) this;
        }

        public Criteria andTotalPhaseLessThan(Integer value) {
            addCriterion("total_phase <", value, "totalPhase");
            return (Criteria) this;
        }

        public Criteria andTotalPhaseLessThanOrEqualTo(Integer value) {
            addCriterion("total_phase <=", value, "totalPhase");
            return (Criteria) this;
        }

        public Criteria andTotalPhaseIn(List<Integer> values) {
            addCriterion("total_phase in", values, "totalPhase");
            return (Criteria) this;
        }

        public Criteria andTotalPhaseNotIn(List<Integer> values) {
            addCriterion("total_phase not in", values, "totalPhase");
            return (Criteria) this;
        }

        public Criteria andTotalPhaseBetween(Integer value1, Integer value2) {
            addCriterion("total_phase between", value1, value2, "totalPhase");
            return (Criteria) this;
        }

        public Criteria andTotalPhaseNotBetween(Integer value1, Integer value2) {
            addCriterion("total_phase not between", value1, value2, "totalPhase");
            return (Criteria) this;
        }

        public Criteria andPaseDueIsNull() {
            addCriterion("pase_due is null");
            return (Criteria) this;
        }

        public Criteria andPaseDueIsNotNull() {
            addCriterion("pase_due is not null");
            return (Criteria) this;
        }

        public Criteria andPaseDueEqualTo(Long value) {
            addCriterion("pase_due =", value, "paseDue");
            return (Criteria) this;
        }

        public Criteria andPaseDueNotEqualTo(Long value) {
            addCriterion("pase_due <>", value, "paseDue");
            return (Criteria) this;
        }

        public Criteria andPaseDueGreaterThan(Long value) {
            addCriterion("pase_due >", value, "paseDue");
            return (Criteria) this;
        }

        public Criteria andPaseDueGreaterThanOrEqualTo(Long value) {
            addCriterion("pase_due >=", value, "paseDue");
            return (Criteria) this;
        }

        public Criteria andPaseDueLessThan(Long value) {
            addCriterion("pase_due <", value, "paseDue");
            return (Criteria) this;
        }

        public Criteria andPaseDueLessThanOrEqualTo(Long value) {
            addCriterion("pase_due <=", value, "paseDue");
            return (Criteria) this;
        }

        public Criteria andPaseDueIn(List<Long> values) {
            addCriterion("pase_due in", values, "paseDue");
            return (Criteria) this;
        }

        public Criteria andPaseDueNotIn(List<Long> values) {
            addCriterion("pase_due not in", values, "paseDue");
            return (Criteria) this;
        }

        public Criteria andPaseDueBetween(Long value1, Long value2) {
            addCriterion("pase_due between", value1, value2, "paseDue");
            return (Criteria) this;
        }

        public Criteria andPaseDueNotBetween(Long value1, Long value2) {
            addCriterion("pase_due not between", value1, value2, "paseDue");
            return (Criteria) this;
        }

        public Criteria andIsCurrentRepaymentPhaseIsNull() {
            addCriterion("is_current_repayment_phase is null");
            return (Criteria) this;
        }

        public Criteria andIsCurrentRepaymentPhaseIsNotNull() {
            addCriterion("is_current_repayment_phase is not null");
            return (Criteria) this;
        }

        public Criteria andIsCurrentRepaymentPhaseEqualTo(Long value) {
            addCriterion("is_current_repayment_phase =", value, "isCurrentRepaymentPhase");
            return (Criteria) this;
        }

        public Criteria andIsCurrentRepaymentPhaseNotEqualTo(Long value) {
            addCriterion("is_current_repayment_phase <>", value, "isCurrentRepaymentPhase");
            return (Criteria) this;
        }

        public Criteria andIsCurrentRepaymentPhaseGreaterThan(Long value) {
            addCriterion("is_current_repayment_phase >", value, "isCurrentRepaymentPhase");
            return (Criteria) this;
        }

        public Criteria andIsCurrentRepaymentPhaseGreaterThanOrEqualTo(Long value) {
            addCriterion("is_current_repayment_phase >=", value, "isCurrentRepaymentPhase");
            return (Criteria) this;
        }

        public Criteria andIsCurrentRepaymentPhaseLessThan(Long value) {
            addCriterion("is_current_repayment_phase <", value, "isCurrentRepaymentPhase");
            return (Criteria) this;
        }

        public Criteria andIsCurrentRepaymentPhaseLessThanOrEqualTo(Long value) {
            addCriterion("is_current_repayment_phase <=", value, "isCurrentRepaymentPhase");
            return (Criteria) this;
        }

        public Criteria andIsCurrentRepaymentPhaseIn(List<Long> values) {
            addCriterion("is_current_repayment_phase in", values, "isCurrentRepaymentPhase");
            return (Criteria) this;
        }

        public Criteria andIsCurrentRepaymentPhaseNotIn(List<Long> values) {
            addCriterion("is_current_repayment_phase not in", values, "isCurrentRepaymentPhase");
            return (Criteria) this;
        }

        public Criteria andIsCurrentRepaymentPhaseBetween(Long value1, Long value2) {
            addCriterion("is_current_repayment_phase between", value1, value2, "isCurrentRepaymentPhase");
            return (Criteria) this;
        }

        public Criteria andIsCurrentRepaymentPhaseNotBetween(Long value1, Long value2) {
            addCriterion("is_current_repayment_phase not between", value1, value2, "isCurrentRepaymentPhase");
            return (Criteria) this;
        }

        public Criteria andRetailerGoodsIdIsNull() {
            addCriterion("retailer_goods_id is null");
            return (Criteria) this;
        }

        public Criteria andRetailerGoodsIdIsNotNull() {
            addCriterion("retailer_goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andRetailerGoodsIdEqualTo(Integer value) {
            addCriterion("retailer_goods_id =", value, "retailerGoodsId");
            return (Criteria) this;
        }

        public Criteria andRetailerGoodsIdNotEqualTo(Integer value) {
            addCriterion("retailer_goods_id <>", value, "retailerGoodsId");
            return (Criteria) this;
        }

        public Criteria andRetailerGoodsIdGreaterThan(Integer value) {
            addCriterion("retailer_goods_id >", value, "retailerGoodsId");
            return (Criteria) this;
        }

        public Criteria andRetailerGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("retailer_goods_id >=", value, "retailerGoodsId");
            return (Criteria) this;
        }

        public Criteria andRetailerGoodsIdLessThan(Integer value) {
            addCriterion("retailer_goods_id <", value, "retailerGoodsId");
            return (Criteria) this;
        }

        public Criteria andRetailerGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("retailer_goods_id <=", value, "retailerGoodsId");
            return (Criteria) this;
        }

        public Criteria andRetailerGoodsIdIn(List<Integer> values) {
            addCriterion("retailer_goods_id in", values, "retailerGoodsId");
            return (Criteria) this;
        }

        public Criteria andRetailerGoodsIdNotIn(List<Integer> values) {
            addCriterion("retailer_goods_id not in", values, "retailerGoodsId");
            return (Criteria) this;
        }

        public Criteria andRetailerGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("retailer_goods_id between", value1, value2, "retailerGoodsId");
            return (Criteria) this;
        }

        public Criteria andRetailerGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("retailer_goods_id not between", value1, value2, "retailerGoodsId");
            return (Criteria) this;
        }

        public Criteria andRetailerGoodsNameIsNull() {
            addCriterion("retailer_goods_name is null");
            return (Criteria) this;
        }

        public Criteria andRetailerGoodsNameIsNotNull() {
            addCriterion("retailer_goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andRetailerGoodsNameEqualTo(String value) {
            addCriterion("retailer_goods_name =", value, "retailerGoodsName");
            return (Criteria) this;
        }

        public Criteria andRetailerGoodsNameNotEqualTo(String value) {
            addCriterion("retailer_goods_name <>", value, "retailerGoodsName");
            return (Criteria) this;
        }

        public Criteria andRetailerGoodsNameGreaterThan(String value) {
            addCriterion("retailer_goods_name >", value, "retailerGoodsName");
            return (Criteria) this;
        }

        public Criteria andRetailerGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("retailer_goods_name >=", value, "retailerGoodsName");
            return (Criteria) this;
        }

        public Criteria andRetailerGoodsNameLessThan(String value) {
            addCriterion("retailer_goods_name <", value, "retailerGoodsName");
            return (Criteria) this;
        }

        public Criteria andRetailerGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("retailer_goods_name <=", value, "retailerGoodsName");
            return (Criteria) this;
        }

        public Criteria andRetailerGoodsNameLike(String value) {
            addCriterion("retailer_goods_name like", value, "retailerGoodsName");
            return (Criteria) this;
        }

        public Criteria andRetailerGoodsNameNotLike(String value) {
            addCriterion("retailer_goods_name not like", value, "retailerGoodsName");
            return (Criteria) this;
        }

        public Criteria andRetailerGoodsNameIn(List<String> values) {
            addCriterion("retailer_goods_name in", values, "retailerGoodsName");
            return (Criteria) this;
        }

        public Criteria andRetailerGoodsNameNotIn(List<String> values) {
            addCriterion("retailer_goods_name not in", values, "retailerGoodsName");
            return (Criteria) this;
        }

        public Criteria andRetailerGoodsNameBetween(String value1, String value2) {
            addCriterion("retailer_goods_name between", value1, value2, "retailerGoodsName");
            return (Criteria) this;
        }

        public Criteria andRetailerGoodsNameNotBetween(String value1, String value2) {
            addCriterion("retailer_goods_name not between", value1, value2, "retailerGoodsName");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountIsNull() {
            addCriterion("overdue_amount is null");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountIsNotNull() {
            addCriterion("overdue_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountEqualTo(BigDecimal value) {
            addCriterion("overdue_amount =", value, "overdueAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountNotEqualTo(BigDecimal value) {
            addCriterion("overdue_amount <>", value, "overdueAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountGreaterThan(BigDecimal value) {
            addCriterion("overdue_amount >", value, "overdueAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("overdue_amount >=", value, "overdueAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountLessThan(BigDecimal value) {
            addCriterion("overdue_amount <", value, "overdueAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("overdue_amount <=", value, "overdueAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountIn(List<BigDecimal> values) {
            addCriterion("overdue_amount in", values, "overdueAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountNotIn(List<BigDecimal> values) {
            addCriterion("overdue_amount not in", values, "overdueAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("overdue_amount between", value1, value2, "overdueAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("overdue_amount not between", value1, value2, "overdueAmount");
            return (Criteria) this;
        }

        public Criteria andIsAllocationCompleteIsNull() {
            addCriterion("is_allocation_complete is null");
            return (Criteria) this;
        }

        public Criteria andIsAllocationCompleteIsNotNull() {
            addCriterion("is_allocation_complete is not null");
            return (Criteria) this;
        }

        public Criteria andIsAllocationCompleteEqualTo(Long value) {
            addCriterion("is_allocation_complete =", value, "isAllocationComplete");
            return (Criteria) this;
        }

        public Criteria andIsAllocationCompleteNotEqualTo(Long value) {
            addCriterion("is_allocation_complete <>", value, "isAllocationComplete");
            return (Criteria) this;
        }

        public Criteria andIsAllocationCompleteGreaterThan(Long value) {
            addCriterion("is_allocation_complete >", value, "isAllocationComplete");
            return (Criteria) this;
        }

        public Criteria andIsAllocationCompleteGreaterThanOrEqualTo(Long value) {
            addCriterion("is_allocation_complete >=", value, "isAllocationComplete");
            return (Criteria) this;
        }

        public Criteria andIsAllocationCompleteLessThan(Long value) {
            addCriterion("is_allocation_complete <", value, "isAllocationComplete");
            return (Criteria) this;
        }

        public Criteria andIsAllocationCompleteLessThanOrEqualTo(Long value) {
            addCriterion("is_allocation_complete <=", value, "isAllocationComplete");
            return (Criteria) this;
        }

        public Criteria andIsAllocationCompleteIn(List<Long> values) {
            addCriterion("is_allocation_complete in", values, "isAllocationComplete");
            return (Criteria) this;
        }

        public Criteria andIsAllocationCompleteNotIn(List<Long> values) {
            addCriterion("is_allocation_complete not in", values, "isAllocationComplete");
            return (Criteria) this;
        }

        public Criteria andIsAllocationCompleteBetween(Long value1, Long value2) {
            addCriterion("is_allocation_complete between", value1, value2, "isAllocationComplete");
            return (Criteria) this;
        }

        public Criteria andIsAllocationCompleteNotBetween(Long value1, Long value2) {
            addCriterion("is_allocation_complete not between", value1, value2, "isAllocationComplete");
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