package com.ooteco.quartz;

import com.ooteco.dao.mapper.ext.FinanceSplitExtVOMapper;
import com.ooteco.dao.mapper.ext.LoanVOExtMapper;
import com.ooteco.mail.MailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class CollectLoanAndFinanceInformationQuartz {

    @Resource private LoanVOExtMapper loanVOExtMapper;
    @Resource private FinanceSplitExtVOMapper financeSplitExtVOMapper;

    public void collect(){
        BigDecimal loanAmount = loanVOExtMapper.getCurrentTotalAmount();
        BigDecimal financeAmount = financeSplitExtVOMapper.getCurrentTotalAmount();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        String html = "<h2>贷款累计金额: " + numberFormat.format(loanAmount.doubleValue()) + "</h2>"
                + "<h2>理财累计金额: " + numberFormat.format(financeAmount.doubleValue()) + "</h2>"
                + "<p><u>数据统计时间:" +dateFormat.format(new Date()) + "</u></p>";
        MailService.send(html);
    }
}
