package com.match.dao.impl;

import com.match.dao.FinanceEarlyRedemptionDao;
import com.match.dao.base.impl.MysqlBaseDaoImpl;
import com.match.domain.FinanceEarlyRedemption;
import org.springframework.stereotype.Repository;

@Repository("financeEarlyRedemptionDao")
public class FinanceEarlyRedemptionDaoImpl extends MysqlBaseDaoImpl<FinanceEarlyRedemption> implements FinanceEarlyRedemptionDao{

    private final static String NAMESPACE = "com.match.dao.FinanceEarlyRedemptionDao";

    @Override
    public String getNameSpace(String statement) {
        return NAMESPACE + "." + statement;
    }


}
