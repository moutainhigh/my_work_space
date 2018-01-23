package com.match.domain;

import java.math.BigDecimal;

/**
 * 提前赎回(mysql)
 */
public class FinanceEarlyRedemption {
    private Long id;
    private String channelCode;//渠道号
    private String financeCode;//理财唯一标识号
    private Long redemptionDate;//赎回时间
    private Integer financeProductsId;//理财产品id
    private BigDecimal redemptionAmount;//赎回金额
    private Integer residueInvestmentHorizon;//剩余投资天数
    private Long createDate;//创建时间
    private Long updateDate;//修改时间


    public FinanceEarlyRedemption() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    public String getFinanceCode() {
        return financeCode;
    }

    public void setFinanceCode(String financeCode) {
        this.financeCode = financeCode;
    }

    public Long getRedemptionDate() {
        return redemptionDate;
    }

    public void setRedemptionDate(Long redemptionDate) {
        this.redemptionDate = redemptionDate;
    }

    public Integer getFinanceProductsId() {
        return financeProductsId;
    }

    public void setFinanceProductsId(Integer financeProductsId) {
        this.financeProductsId = financeProductsId;
    }

    public BigDecimal getRedemptionAmount() {
        return redemptionAmount;
    }

    public void setRedemptionAmount(BigDecimal redemptionAmount) {
        this.redemptionAmount = redemptionAmount;
    }

    public Integer getResidueInvestmentHorizon() {
        return residueInvestmentHorizon;
    }

    public void setResidueInvestmentHorizon(Integer residueInvestmentHorizon) {
        this.residueInvestmentHorizon = residueInvestmentHorizon;
    }

    public Long getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Long createDate) {
        this.createDate = createDate;
    }

    public Long getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Long updateDate) {
        this.updateDate = updateDate;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FinanceEarlyRedemption{");
        sb.append("id=").append(id);
        sb.append(", channelCode='").append(channelCode).append('\'');
        sb.append(", financeCode='").append(financeCode).append('\'');
        sb.append(", redemptionDate=").append(redemptionDate);
        sb.append(", financeProductsId=").append(financeProductsId);
        sb.append(", redemptionAmount=").append(redemptionAmount);
        sb.append(", residueInvestmentHorizon=").append(residueInvestmentHorizon);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateDate=").append(updateDate);
        sb.append('}');
        return sb.toString();
    }
}
