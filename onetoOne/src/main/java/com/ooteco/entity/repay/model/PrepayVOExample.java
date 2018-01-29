package com.ooteco.entity.repay.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PrepayVOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PrepayVOExample() {
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

        public Criteria andRepaymentPrincipalIsNull() {
            addCriterion("repayment_principal is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentPrincipalIsNotNull() {
            addCriterion("repayment_principal is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentPrincipalEqualTo(BigDecimal value) {
            addCriterion("repayment_principal =", value, "repaymentPrincipal");
            return (Criteria) this;
        }

        public Criteria andRepaymentPrincipalNotEqualTo(BigDecimal value) {
            addCriterion("repayment_principal <>", value, "repaymentPrincipal");
            return (Criteria) this;
        }

        public Criteria andRepaymentPrincipalGreaterThan(BigDecimal value) {
            addCriterion("repayment_principal >", value, "repaymentPrincipal");
            return (Criteria) this;
        }

        public Criteria andRepaymentPrincipalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("repayment_principal >=", value, "repaymentPrincipal");
            return (Criteria) this;
        }

        public Criteria andRepaymentPrincipalLessThan(BigDecimal value) {
            addCriterion("repayment_principal <", value, "repaymentPrincipal");
            return (Criteria) this;
        }

        public Criteria andRepaymentPrincipalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("repayment_principal <=", value, "repaymentPrincipal");
            return (Criteria) this;
        }

        public Criteria andRepaymentPrincipalIn(List<BigDecimal> values) {
            addCriterion("repayment_principal in", values, "repaymentPrincipal");
            return (Criteria) this;
        }

        public Criteria andRepaymentPrincipalNotIn(List<BigDecimal> values) {
            addCriterion("repayment_principal not in", values, "repaymentPrincipal");
            return (Criteria) this;
        }

        public Criteria andRepaymentPrincipalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repayment_principal between", value1, value2, "repaymentPrincipal");
            return (Criteria) this;
        }

        public Criteria andRepaymentPrincipalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repayment_principal not between", value1, value2, "repaymentPrincipal");
            return (Criteria) this;
        }

        public Criteria andRepaymentInterestIsNull() {
            addCriterion("repayment_interest is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentInterestIsNotNull() {
            addCriterion("repayment_interest is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentInterestEqualTo(BigDecimal value) {
            addCriterion("repayment_interest =", value, "repaymentInterest");
            return (Criteria) this;
        }

        public Criteria andRepaymentInterestNotEqualTo(BigDecimal value) {
            addCriterion("repayment_interest <>", value, "repaymentInterest");
            return (Criteria) this;
        }

        public Criteria andRepaymentInterestGreaterThan(BigDecimal value) {
            addCriterion("repayment_interest >", value, "repaymentInterest");
            return (Criteria) this;
        }

        public Criteria andRepaymentInterestGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("repayment_interest >=", value, "repaymentInterest");
            return (Criteria) this;
        }

        public Criteria andRepaymentInterestLessThan(BigDecimal value) {
            addCriterion("repayment_interest <", value, "repaymentInterest");
            return (Criteria) this;
        }

        public Criteria andRepaymentInterestLessThanOrEqualTo(BigDecimal value) {
            addCriterion("repayment_interest <=", value, "repaymentInterest");
            return (Criteria) this;
        }

        public Criteria andRepaymentInterestIn(List<BigDecimal> values) {
            addCriterion("repayment_interest in", values, "repaymentInterest");
            return (Criteria) this;
        }

        public Criteria andRepaymentInterestNotIn(List<BigDecimal> values) {
            addCriterion("repayment_interest not in", values, "repaymentInterest");
            return (Criteria) this;
        }

        public Criteria andRepaymentInterestBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repayment_interest between", value1, value2, "repaymentInterest");
            return (Criteria) this;
        }

        public Criteria andRepaymentInterestNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repayment_interest not between", value1, value2, "repaymentInterest");
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