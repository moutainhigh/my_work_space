package com.ooteco.entity.loan.model;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class LoanVO implements Serializable {
    @NotBlank(message = "loanCode can't be null")
    private String loanCode;
    private Date createDate;
    private Date modifyDate;
    @NotBlank(message = "userCode can't be null")
    private String userCode;
    @NotBlank(message = "category can't be null")
    private String category;
    private String name;
    private String mobile;
    @NotNull(message = "loanMoney can't be null")
    private BigDecimal loanMoney;
    private String repaymentType;
    @NotNull(message = "periods can't be null")
    private Integer periods;
    @NotBlank(message = "periodsType can't be null")
    private String periodsType;
    @DateTimeFormat(pattern = "yyyyMMdd")
    @NotNull(message = "repaymentPlanDate can't be null")
    private Date repaymentPlanDate;
    @DateTimeFormat(pattern = "yyyyMMdd")
    @NotNull(message = "expireDate can't be null")
    private Date expireDate;
    @NotNull(message = "allInRate can't be null")
    private BigDecimal allInRate;
    @NotNull(message = "loanRate can't be null")
    private BigDecimal loanRate;
    @NotNull(message = "platformRate can't be null")
    private BigDecimal platformRate;
    private String payeeType;
    private String payeeBankAccountName;
    private String payeeBankAccountNo;
    private String payeeBankProvince;
    private String payeeBankCity;
    private String payeeBankName;
    private String payeeBankDept;
    private String payeeIdType;
    private String payeeIdNo;
    private String payeeOpeningBranch;
    private String purpose;
    private String bankAccount;
    private String bankMobile;
    @NotNull(message = "riskControlScore can't be null")
    private BigDecimal riskControlScore;
    @DateTimeFormat(pattern = "yyyyMMdd")
    @NotNull(message = "loanStartDate can't be null")
    private Date loanStartDate;
    private String idNumber;
    @NotNull(message = "mRate can't be null")
    private BigDecimal mRate;
    @NotNull(message = "nRate can't be null")
    private BigDecimal nRate;
    private String fundModel;

    private static final long serialVersionUID = 1L;

    public String getLoanCode() {
        return loanCode;
    }

    public void setLoanCode(String loanCode) {
        this.loanCode = loanCode == null ? null : loanCode.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public BigDecimal getLoanMoney() {
        return loanMoney;
    }

    public void setLoanMoney(BigDecimal loanMoney) {
        this.loanMoney = loanMoney;
    }

    public String getRepaymentType() {
        return repaymentType;
    }

    public void setRepaymentType(String repaymentType) {
        this.repaymentType = repaymentType == null ? null : repaymentType.trim();
    }

    public Integer getPeriods() {
        return periods;
    }

    public void setPeriods(Integer periods) {
        this.periods = periods;
    }

    public String getPeriodsType() {
        return periodsType;
    }

    public void setPeriodsType(String periodsType) {
        this.periodsType = periodsType == null ? null : periodsType.trim();
    }

    public Date getRepaymentPlanDate() {
        return repaymentPlanDate;
    }

    public void setRepaymentPlanDate(Date repaymentPlanDate) {
        this.repaymentPlanDate = repaymentPlanDate;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public BigDecimal getAllInRate() {
        return allInRate;
    }

    public void setAllInRate(BigDecimal allInRate) {
        this.allInRate = allInRate;
    }

    public BigDecimal getLoanRate() {
        return loanRate;
    }

    public void setLoanRate(BigDecimal loanRate) {
        this.loanRate = loanRate;
    }

    public BigDecimal getPlatformRate() {
        return platformRate;
    }

    public void setPlatformRate(BigDecimal platformRate) {
        this.platformRate = platformRate;
    }

    public String getPayeeType() {
        return payeeType;
    }

    public void setPayeeType(String payeeType) {
        this.payeeType = payeeType == null ? null : payeeType.trim();
    }

    public String getPayeeBankAccountName() {
        return payeeBankAccountName;
    }

    public void setPayeeBankAccountName(String payeeBankAccountName) {
        this.payeeBankAccountName = payeeBankAccountName == null ? null : payeeBankAccountName.trim();
    }

    public String getPayeeBankAccountNo() {
        return payeeBankAccountNo;
    }

    public void setPayeeBankAccountNo(String payeeBankAccountNo) {
        this.payeeBankAccountNo = payeeBankAccountNo == null ? null : payeeBankAccountNo.trim();
    }

    public String getPayeeBankProvince() {
        return payeeBankProvince;
    }

    public void setPayeeBankProvince(String payeeBankProvince) {
        this.payeeBankProvince = payeeBankProvince == null ? null : payeeBankProvince.trim();
    }

    public String getPayeeBankCity() {
        return payeeBankCity;
    }

    public void setPayeeBankCity(String payeeBankCity) {
        this.payeeBankCity = payeeBankCity == null ? null : payeeBankCity.trim();
    }

    public String getPayeeBankName() {
        return payeeBankName;
    }

    public void setPayeeBankName(String payeeBankName) {
        this.payeeBankName = payeeBankName == null ? null : payeeBankName.trim();
    }

    public String getPayeeBankDept() {
        return payeeBankDept;
    }

    public void setPayeeBankDept(String payeeBankDept) {
        this.payeeBankDept = payeeBankDept == null ? null : payeeBankDept.trim();
    }

    public String getPayeeIdType() {
        return payeeIdType;
    }

    public void setPayeeIdType(String payeeIdType) {
        this.payeeIdType = payeeIdType == null ? null : payeeIdType.trim();
    }

    public String getPayeeIdNo() {
        return payeeIdNo;
    }

    public void setPayeeIdNo(String payeeIdNo) {
        this.payeeIdNo = payeeIdNo == null ? null : payeeIdNo.trim();
    }

    public String getPayeeOpeningBranch() {
        return payeeOpeningBranch;
    }

    public void setPayeeOpeningBranch(String payeeOpeningBranch) {
        this.payeeOpeningBranch = payeeOpeningBranch == null ? null : payeeOpeningBranch.trim();
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose == null ? null : purpose.trim();
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount == null ? null : bankAccount.trim();
    }

    public String getBankMobile() {
        return bankMobile;
    }

    public void setBankMobile(String bankMobile) {
        this.bankMobile = bankMobile == null ? null : bankMobile.trim();
    }

    public BigDecimal getRiskControlScore() {
        return riskControlScore;
    }

    public void setRiskControlScore(BigDecimal riskControlScore) {
        this.riskControlScore = riskControlScore;
    }

    public Date getLoanStartDate() {
        return loanStartDate;
    }

    public void setLoanStartDate(Date loanStartDate) {
        this.loanStartDate = loanStartDate;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber == null ? null : idNumber.trim();
    }

    public BigDecimal getmRate() {
        return mRate;
    }

    public void setmRate(BigDecimal mRate) {
        this.mRate = mRate;
    }

    public BigDecimal getnRate() {
        return nRate;
    }

    public void setnRate(BigDecimal nRate) {
        this.nRate = nRate;
    }

    public String getFundModel() {
        return fundModel;
    }

    public void setFundModel(String fundModel) {
        this.fundModel = fundModel;
    }
}