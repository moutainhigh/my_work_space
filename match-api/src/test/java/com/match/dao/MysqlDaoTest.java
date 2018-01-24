package com.match.dao;

import com.match.domain.FinanceChannel;
import com.match.domain.FinanceEarlyRedemption;
import com.match.domain.FinanceProduct;
import com.match.domain.LoanChannel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-config-test-dao.xml")
public class MysqlDaoTest {
    @Autowired
    private LoanChannelDao loanChannelDao;

    @Autowired
    private FinanceProductDao financeProductDao;

    @Autowired
    private FinanceEarlyRedemptionDao financeEarlyRedemptionDao;

    @Autowired
    private FinanceChannelDao financeChannelDao;

    @Autowired
    private LoanEarlyRepaymentDao loanEarlyRepaymentDao;

    @Test
    public void test(){
        loanChannelDao.selectEntryList(new LoanChannel());
        financeProductDao.selectEntryList(new FinanceProduct());
        financeEarlyRedemptionDao.selectEntryList(new FinanceEarlyRedemption());
        financeChannelDao.selectEntryList(new FinanceChannel());
//        loanEarlyRepaymentDao.selectEntryList(new LoanEarlyRepayment());
//        LoanChannel loanChannel = new LoanChannel();
//        loanChannel.setName("test1");
//        loanChannel.setLoanChannelCode("333");
//        loanChannel.setFinanceChannelCodes("111,222");
//        loanChannel.setCreateDate(System.currentTimeMillis());
//        loanChannelDao.insertEntry(loanChannel);
//        List<LoanChannel> channels = loanChannelDao.selectEntryList(new LoanChannel());
//        for (LoanChannel channel:channels
//             ) {
//            System.out.println(channel);
//        }

    }
}
