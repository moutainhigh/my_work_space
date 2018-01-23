package com.match.dao.impl;

import com.match.dao.LoanChannelDao;
import com.match.dao.base.impl.MysqlBaseDaoImpl;
import com.match.domain.LoanChannel;
import org.springframework.stereotype.Repository;

@Repository("loanChannelDao")
public class LoanChannelDaoImpl extends MysqlBaseDaoImpl<LoanChannel> implements LoanChannelDao{

    private final static String NAMESPACE = "com.match.dao.LoanChannelDao";

    @Override
    public String getNameSpace(String statement) {
        return NAMESPACE + "." + statement;
    }
}
