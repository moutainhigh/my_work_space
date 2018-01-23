package com.match.dao.impl;

import com.match.dao.FinanceMatchDao;
import com.match.dao.base.impl.HBaseBaseDaoImpl;
import com.match.domain.FinanceMatch;
import org.springframework.stereotype.Repository;

@Repository("financeMatchDao")
public class FinanceMatchDaoImpl extends HBaseBaseDaoImpl<FinanceMatch> implements FinanceMatchDao{

    @Override
    public Class<FinanceMatch> getEntityClass() {
        return FinanceMatch.class;
    }
}
