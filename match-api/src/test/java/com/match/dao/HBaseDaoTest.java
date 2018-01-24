package com.match.dao;

import com.match.domain.LoanMatch;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.hadoop.hbase.HbaseTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-config-test.xml")
public class HBaseDaoTest {

    @Autowired
    private HbaseTemplate hbaseTemplate;

    @Autowired
    private LoanMatchDao loanMatchDao;



    @Test
    public void createTables(){

    }

    @Test
    public void get(){
        long testTime = System.currentTimeMillis();
        for (int i=0;i<=10;i++){
            List<LoanMatch> loanMatchs = loanMatchDao.get("loan_match","data","1111",null);
            long now = System.currentTimeMillis();
            System.out.println("第"+i+"次: ---- time ----"+ (now - testTime)+"ms");
            testTime = now;
        }

    }

    @Test
    public void save(){
        LoanMatch loanMatch = new LoanMatch();
        loanMatch.setFinanceCode("finance_code_1");
        loanMatch.setFinanceProductId(1);
        loanMatch.setFinanceProductName("理财产品1");
        loanMatch.setPeriodsTime(60);
        loanMatch.setPeriodsType(1);
        loanMatch.setRate(BigDecimal.valueOf(0.01));
        loanMatch.setRowkey("11111111");
        loanMatch.setRealEndDate(System.currentTimeMillis());
        loanMatch.setStatus(1);
        loanMatch.setBeginDate(System.currentTimeMillis());
        loanMatch.setEndDate(System.currentTimeMillis());
        loanMatchDao.put("loan_match","11111111","data",loanMatch);
    }







}
