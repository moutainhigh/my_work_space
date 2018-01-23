package com.match.dao.impl;

import com.match.dao.FinanceProductDao;
import com.match.dao.base.impl.MysqlBaseDaoImpl;
import com.match.domain.FinanceProduct;
import org.springframework.stereotype.Repository;

@Repository("financeProductDao")
public class FinanceProductDaoImpl extends MysqlBaseDaoImpl<FinanceProduct> implements FinanceProductDao{

    private final static String NAMESPACE = "com.match.dao.FinanceProductDao";

    @Override
    public String getNameSpace(String statement) {
        return NAMESPACE + "." + statement;
    }
}
