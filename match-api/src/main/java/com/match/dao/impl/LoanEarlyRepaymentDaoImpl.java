package com.match.dao.impl;

import com.match.dao.LoanEarlyRepaymentDao;
import com.match.dao.base.impl.MysqlBaseDaoImpl;
import com.match.domain.LoanEarlyRepayment;
import org.springframework.stereotype.Repository;

@Repository("loanEarlyRepaymentDao")
public class LoanEarlyRepaymentDaoImpl extends MysqlBaseDaoImpl<LoanEarlyRepayment> implements LoanEarlyRepaymentDao{

    private final static String NAMESPACE = "com.match.dao.LoanEarlyRepaymentDao";

    @Override
    public String getNameSpace(String statement) {
        return NAMESPACE + "." + statement;
    }
}
