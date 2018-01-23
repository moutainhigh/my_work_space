package com.match.dao.impl;

import com.match.dao.LoanPlanDao;
import com.match.dao.base.impl.MongoBaseDaoImpl;
import com.match.domain.LoanPlan;
import org.springframework.stereotype.Repository;

@Repository("loanPlanDao")
public class LoanPlanDaoImpl extends MongoBaseDaoImpl<LoanPlan> implements LoanPlanDao{

    @Override
    public Class<LoanPlan> getEntityClass() {
        return LoanPlan.class;
    }
}
