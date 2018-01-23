package com.match.dao.impl;

import com.match.dao.LoanMatchDao;
import com.match.dao.base.impl.HBaseBaseDaoImpl;
import com.match.domain.LoanMatch;
import org.springframework.stereotype.Repository;

@Repository("loanMatchDao")
public class LoanMatchDaoImpl extends HBaseBaseDaoImpl<LoanMatch> implements LoanMatchDao{

    @Override
    public Class<LoanMatch> getEntityClass() {
        return LoanMatch.class;
    }
}
