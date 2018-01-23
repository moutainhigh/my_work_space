package com.match.domain;

/**
 * 资产渠道信息(mysql)
 */
public class LoanChannel {
    private Integer id;//渠道号
    private String loanChannelCode;//渠道号
    private String name;//渠道名称
    private String financeChannelCodes;//接受资金渠道（,分隔）
    private Long createDate;//创建时间
    private Long updateDate;//修改时间


    public LoanChannel() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoanChannelCode() {
        return loanChannelCode;
    }

    public void setLoanChannelCode(String loanChannelCode) {
        this.loanChannelCode = loanChannelCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFinanceChannelCodes() {
        return financeChannelCodes;
    }

    public void setFinanceChannelCodes(String financeChannelCodes) {
        this.financeChannelCodes = financeChannelCodes;
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
        final StringBuilder sb = new StringBuilder("LoanChannel{");
        sb.append("id='").append(id).append('\'');
        sb.append("loanChannelCode='").append(loanChannelCode).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", financeChannelCodes='").append(financeChannelCodes).append('\'');
        sb.append(", createDate=").append(createDate);
        sb.append(", updateDate=").append(updateDate);
        sb.append('}');
        return sb.toString();
    }
}
