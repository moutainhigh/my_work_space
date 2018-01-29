package com.ooteco.entity.loanAllocation.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class LoanAllocation implements Serializable {
    private Integer id;

    private Integer financeId;

    private Integer loanId;

    private BigDecimal money;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFinanceId() {
        return financeId;
    }

    public void setFinanceId(Integer financeId) {
        this.financeId = financeId;
    }

    public Integer getLoanId() {
        return loanId;
    }

    public void setLoanId(Integer loanId) {
        this.loanId = loanId;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }
}