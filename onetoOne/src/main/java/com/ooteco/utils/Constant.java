package com.ooteco.utils;

import java.math.BigDecimal;

public interface Constant {

    BigDecimal yearlyDays = new BigDecimal(360);
    int amountUltimateRoundPrecision = 6;
    int defaultAllotment = 10;

    /**
     * 生产
     */
//    String JHJ_FINANCE_BASE_URL = "https://zt.huijialicai.cn/p2p";
//    String JHJ_LOAN_BASE_URL = "https://dkapi.huijiadaikuan.com";

    /**
     * uat
     */
    String JHJ_FINANCE_BASE_URL = "http://test.api.huijialicai.cn/p2p";
    String JHJ_LOAN_BASE_URL = "http://test.loan.huijiahuzhu.com";

    /**
     * 测试
     */
//    String JHJ_FINANCE_BASE_URL = "http://123.56.13.24:6857/p2p";
//    String JHJ_LOAN_BASE_URL = "http://test.p2p.huijiadaikuan.com";


    String FINANCE_LIST_URL = JHJ_FINANCE_BASE_URL + "/api/finance/list";
    String SUPPER_ACCT_BAL_URL = JHJ_FINANCE_BASE_URL + "/api/ath/getSuperAccountBalance";
    String SUPPER_ACCT_REDEEM_URL = JHJ_FINANCE_BASE_URL + "/api/ath/getSuperAccountRedemption";
    String SUPPER_ACCT_PURCHASE_URL = JHJ_FINANCE_BASE_URL + "/api/ath/getSuperAccountPurchase";
    String LOAN_FULL_SCALE_NOTIFY_URL = JHJ_FINANCE_BASE_URL + "/api/loan/soldout";
    String LOAN_REPAYMENT_PLAN_URL = JHJ_LOAN_BASE_URL + "/api/customer/retailer_order/tenderesult/get_repaymentPhases";
    String PRE_REDEMPTION_SUCCESS_URL =  JHJ_FINANCE_BASE_URL + "/api/ath/redemptionSuccessNotify";
}
