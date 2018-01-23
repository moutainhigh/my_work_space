package com.match.domain;

/**
 * 资金渠道信息(mysql)
 */
public class FinanceChannel {
    private Integer id;
    private String financeChannelCode;//渠道号
    private String name;//渠道名称
    private String loanChannelCodes;//接受资产渠道（,分隔）
    private Long createDate;//创建时间
    private Long updateDate;//修改时间


    public FinanceChannel() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFinanceChannelCode() {
        return financeChannelCode;
    }

    public void setFinanceChannelCode(String financeChannelCode) {
        this.financeChannelCode = financeChannelCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoanChannelCodes() {
        return loanChannelCodes;
    }

    public void setLoanChannelCodes(String loanChannelCodes) {
        this.loanChannelCodes = loanChannelCodes;
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
        final StringBuilder sb = new StringBuilder("FinanceChannel{");
        sb.append("id='").append(id).append('\'');
        sb.append("financeChannelCode='").append(financeChannelCode).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", loanChannelCodes='").append(loanChannelCodes).append('\'');
        sb.append(", createDate=").append(createDate);
        sb.append(", updateDate=").append(updateDate);
        sb.append('}');
        return sb.toString();
    }
}
