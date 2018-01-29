package com.ooteco;

import com.ooteco.dao.mapper.ext.FinanceLoanMatchExtVOMapper;
import com.ooteco.dao.mapper.ext.FinanceSplitExtVOMapper;
import com.ooteco.dao.mapper.ext.LoanVOExtMapper;
import com.ooteco.dao.mapper.ext.RepaySplitExtVOMapper;
import com.ooteco.entity.finance.model.FinanceVO;
import com.ooteco.entity.match.model.FinanceLoanMatchExtVO;
import com.ooteco.quartz.CollectLoanAndFinanceInformationQuartz;
import com.ooteco.service.FinanceLoanSplitVOService;
import com.ooteco.service.biz.*;
import com.ooteco.utils.DateUtils;
import org.junit.Test;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class FinanceLoanSplitServiceTest extends BaseJunit {

    @Resource
    private FinanceLoanSplitVOService financeLoanSplitVOService;
    @Resource
    private FinanceLoanMatchVOServiceBiz financeLoanMatchVOServiceBiz;
    @Resource
    private LoanFullScaleVOServiceBiz loanFullScaleVOServiceBiz;
    @Resource
    private FinanceLoanMatchExtVOMapper financeLoanMatchExtVOMapper;
    @Resource
    private RepaySplitVOServiceBiz repaySplitVOServiceBiz;
    @Resource
    private RepaySplitExtVOMapper repaySplitExtVOMapper;
    @Resource
    private FinanceSplitExtVOMapper financeSplitExtVOMapper;
    @Resource
    private CollectLoanAndFinanceInformationQuartz collectLoanAndFinanceInformationQuartz;
    @Resource
    private FinanceVOServiceBiz financeVOServiceBiz;

    @Test
    public void matchTest() {
        financeLoanMatchExtVOMapper.getLoanExpireButFinanceNotExpireRecords(new Date());
        System.out.println("");
    }

    @Test
    public void collect() {
        collectLoanAndFinanceInformationQuartz.collect();
    }

    @Test
    public void getLastMatchAmount() {
        FinanceVO finance = financeVOServiceBiz.getLastMatchFinance();
        System.out.println(finance.getFinanceMoney() + DateUtils.formatDateToTimestamp(finance.getModifyDate()));
    }

    @Test
    public void test() {
        repaySplitVOServiceBiz.updateRemainRepaySplitStartDateToToday();
    }

    @Test
    public void updateUncompletedFinanceStartDate(){
        financeSplitExtVOMapper.updateUncompletedFinanceStartDate();
    }

}
