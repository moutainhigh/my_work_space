package com.match.dao;

import com.wx.domain.matching.Finance;
import com.wx.domain.matching.Loan;
import com.wx.domain.matching.LoanPlan;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.util.UUID;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-config-test.xml")
public class MongoDaoTest {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Autowired
    private LoanPlanDao loanPlanDao;

    @Test
    public void createCollections(){
//        mongoTemplate.createCollection(Finance.class);
//        mongoTemplate.createCollection(Loan.class);
        mongoTemplate.createCollection(LoanPlan.class);
    }


    @Test
    public void save(){
        long now = System.currentTimeMillis();
        LoanPlan loanPlan = new LoanPlan();
        loanPlan.setId(UUID.randomUUID().toString());
        loanPlan.setBeginDate(now);
        loanPlan.setEndDate(now + 365 * 24 * 60 * 60 * 1000L);
        loanPlan.setChannelCode("channel_code_1");
        loanPlan.setCurrentCapital(BigDecimal.valueOf(1000.002));
        loanPlan.setCapitalAmount(BigDecimal.valueOf(1000.002));
        loanPlan.setCurrentPeriodsTime(365);
        loanPlan.setChannelLoanCode("channel_loan_code_1");
        loanPlan.setInterestAmount(BigDecimal.valueOf(1000.002));
        loanPlan.setIsCheck(1);
        loanPlan.setIsMatchfinish(0);
        loanPlan.setLoanCode("loan_code_1");
        loanPlan.setLoanPlanCode("loan_plan_code_1");
        loanPlan.setOtherAmount(BigDecimal.valueOf(10.000000));
        loanPlan.setCreateDate(now);
        loanPlan.setTotalAmount(BigDecimal.valueOf(1000.002));
        loanPlan.setPeriods(10);
        loanPlan.setStatus(1);
        loanPlan.setUserCode("user_code_1");
        loanPlan.setPlatformAmount(BigDecimal.valueOf(1.002));
        loanPlan.setMatchedAmount(BigDecimal.valueOf(0.00));
        loanPlanDao.save(loanPlan);
    }

    @Test
    public void selectOne(){
       LoanPlan loanPlan = loanPlanDao.select("4d3048fb-7abe-4b41-9e5b-d8cef40fc3f2");
       System.out.println("loanPlan:"+loanPlan);
    }
}
