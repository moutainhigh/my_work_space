package com.match.dao;

import com.match.domain.LoanPlan;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.UUID;

public class DomainTest<T> {


    public void test(T t,Class<T> claz) throws Exception{
         Field[] fields = claz.getDeclaredFields();
         for (Field field:fields) {
             field.setAccessible(true);
             String fieldName = field.getName();
             String fieldValue = String.valueOf(field.get(t));
             System.out.println("fieldName:"+fieldName+"------"+"fieldValue:"+fieldValue);
         }
    }

    public static void main(String[] args) throws Exception{
        DomainTest<LoanPlan> domainTest = new DomainTest<>();
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
        domainTest.test(loanPlan,LoanPlan.class);
    }
}
