package com.match.dao.impl;

import com.match.dao.FinanceChannelDao;
import com.match.dao.base.impl.MysqlBaseDaoImpl;
import com.match.domain.FinanceChannel;
import org.springframework.stereotype.Repository;

@Repository("financeChannelDao")
public class FinanceChannelDaoImpl extends MysqlBaseDaoImpl<FinanceChannel> implements FinanceChannelDao{

    private final static String NAMESPACE = "com.match.dao.FinanceChannelDao";

    @Override
    public String getNameSpace(String statement) {
        return NAMESPACE + "." + statement;
    }

}
