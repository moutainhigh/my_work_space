package com.ooteco.entity.match.model;

import java.util.Date;

public class FinanceLoanMatchExtVO extends FinanceLoanMatchVO{

    private Date financeExpireDate;

    public Date getFinanceExpireDate() {
        return financeExpireDate;
    }

    public void setFinanceExpireDate(Date financeExpireDate) {
        this.financeExpireDate = financeExpireDate;
    }
}
