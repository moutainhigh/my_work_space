package com.match.dao.impl;

import com.match.dao.LoanDao;
import com.match.dao.base.impl.MongoBaseDaoImpl;
import com.wx.domain.matching.Loan;
import org.springframework.stereotype.Repository;

@Repository("loanDao")
public class LoanDaoImpl extends MongoBaseDaoImpl<Loan> implements LoanDao{

    @Override
    public Class<Loan> getEntityClass() {
        return Loan.class;
    }
}
