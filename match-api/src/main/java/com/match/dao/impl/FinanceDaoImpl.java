package com.match.dao.impl;

import com.match.dao.FinanceDao;
import com.match.dao.base.MongoBaseDao;
import com.match.dao.base.impl.MongoBaseDaoImpl;
import com.match.domain.Finance;
import org.springframework.stereotype.Repository;

/**
 *
 */
@Repository("financeDao")
public class FinanceDaoImpl extends MongoBaseDaoImpl<Finance> implements FinanceDao{

    @Override
    public Class<Finance> getEntityClass() {
        return Finance.class;
    }
}
