package com.ooteco.entity.finance.model;

import com.ooteco.entity.req.BaseReq;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PreRedemptionVO extends BaseReq implements Serializable {
    private Long id;

    private Date createDate;

    private Date modifyDate;
    @NotBlank(message = "financeCode can't be blank")
    private String financeCode;
    @DateTimeFormat(pattern = "yyyyMMdd")
    @NotNull(message = "redemptionDate can't be null")
    private Date redemptionDate;
    @NotNull(message = "financeProductsId can't be null")
    private Integer financeProductsId;
    @NotNull(message = "redemptionMoney can't be null")
    private BigDecimal redemptionMoney;
    @NotNull(message = "residueInvestmentHorizon can't be null")
    private Integer residueInvestmentHorizon;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getFinanceCode() {
        return financeCode;
    }

    public void setFinanceCode(String financeCode) {
        this.financeCode = financeCode == null ? null : financeCode.trim();
    }

    public Date getRedemptionDate() {
        return redemptionDate;
    }

    public void setRedemptionDate(Date redemptionDate) {
        this.redemptionDate = redemptionDate;
    }

    public Integer getFinanceProductsId() {
        return financeProductsId;
    }

    public void setFinanceProductsId(Integer financeProductsId) {
        this.financeProductsId = financeProductsId;
    }

    public BigDecimal getRedemptionMoney() {
        return redemptionMoney;
    }

    public void setRedemptionMoney(BigDecimal redemptionMoney) {
        this.redemptionMoney = redemptionMoney;
    }

    public Integer getResidueInvestmentHorizon() {
        return residueInvestmentHorizon;
    }

    public void setResidueInvestmentHorizon(Integer residueInvestmentHorizon) {
        this.residueInvestmentHorizon = residueInvestmentHorizon;
    }
}