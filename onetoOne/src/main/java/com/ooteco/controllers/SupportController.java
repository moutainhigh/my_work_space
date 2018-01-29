package com.ooteco.controllers;

import com.ooteco.common.ResponseEntity;
import com.ooteco.entity.finance.model.FinanceVO;
import com.ooteco.service.biz.FinanceLoanMatchVOServiceBiz;
import com.ooteco.service.biz.FinanceVOServiceBiz;
import com.ooteco.utils.DateUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;

@RestController
@RequestMapping("spt/ath")
public class SupportController {

    @Resource
    private FinanceVOServiceBiz financeVOServiceBiz;
    @Resource
    private FinanceLoanMatchVOServiceBiz financeLoanMatchVOServiceBiz;

    @CrossOrigin
    @RequestMapping(value = "last_match", method = RequestMethod.GET)
    public ResponseEntity getLastMatchAmount(){
        FinanceVO finance = financeVOServiceBiz.getLastMatchFinance();
        return ResponseEntity.success()
                .addData("amount", finance.getFinanceMoney())
                .addData("lastTime", DateUtils.formatDateToTimestamp(finance.getModifyDate()));
    }

    @RequestMapping(value = "amt", method = RequestMethod.GET)
    @CrossOrigin
    public ResponseEntity getQuotaAndMatchAmount(){
        BigDecimal quota = financeLoanMatchVOServiceBiz.getSuperAccountPurchaseMoney(DateUtils.getBeginTime(new Date()));
        BigDecimal matchAmount = financeLoanMatchVOServiceBiz.getTotalMatchAmount();
        return ResponseEntity.success()
                .addData("quota", quota)
                .addData("matchAmount", matchAmount);
    }
}
