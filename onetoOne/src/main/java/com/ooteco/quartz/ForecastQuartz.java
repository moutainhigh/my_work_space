package com.ooteco.quartz;

import com.alibaba.fastjson.JSON;
import com.ooteco.entity.finance.model.req.SupperAcctPurchaseReq;
import com.ooteco.entity.jhj.resp.SuperAccount;
import com.ooteco.service.biz.FinanceLoanMatchVOServiceBiz;
import com.ooteco.service.biz.JHJFinanceRequestServiceBiz;
import com.ooteco.utils.Constant;
import com.ooteco.utils.DateUtils;
import com.ooteco.utils.HttpRequest;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by zk on 2017/8/29.
 */
public class ForecastQuartz {
    @Autowired
    FinanceLoanMatchVOServiceBiz financeLoanMatchVOServiceBiz;
    @Autowired
    private JHJFinanceRequestServiceBiz jhjFinanceRequestServiceBiz;
    private Logger logger = Logger.getLogger(ForecastQuartz.class);

    public void superAccountPurchase(){
        //查询当天已匹配但未匹配完成的贷款金额汇总
        BigDecimal money = financeLoanMatchVOServiceBiz.getSuperAccountPurchaseMoney(DateUtils.getBeginTime(new Date()));
        logger.debug("需要吃标的金额" + money);
        if(money.compareTo(new BigDecimal("0")) <= 0){
            return;
        }

        //查询理财期限为一月的理财 id
        String financeProductsId = "";
        String result = HttpRequest.sendPost(Constant.FINANCE_LIST_URL,"status=2&timeStamp=123&sign=27cc6a7b8e79cd523fde9c410ebd697c");

        com.alibaba.fastjson.JSONObject jsonObject = JSON.parseObject(result);
        com.alibaba.fastjson.JSONArray details= jsonObject.getJSONArray("data");
        for(int i=0;i<details.size();i++){
            com.alibaba.fastjson.JSONObject object = details.getJSONObject(i);
            if(object.get("status").equals("2") && object.get("periodsType").equals("M") && object.get("periods").equals("1")){
                financeProductsId = object.get("financeProductsId").toString();
            }
        }

        //超级账户吃标
        List<SuperAccount> superAccounts = jhjFinanceRequestServiceBiz.getSupperAcctBal();
        for(SuperAccount superAccount : superAccounts){
            logger.debug("超级账户余额" + superAccount.balance);
            SupperAcctPurchaseReq supperAcctPurchaseReq;
            if(superAccount.balance.compareTo(money) >= 0){
                supperAcctPurchaseReq = new SupperAcctPurchaseReq(superAccount.userCode,financeProductsId,money);
            }else{
                supperAcctPurchaseReq = new SupperAcctPurchaseReq(superAccount.userCode,financeProductsId,superAccount.balance);
                money = money.subtract(superAccount.balance);
            }
            jhjFinanceRequestServiceBiz.superAcctPurchase(supperAcctPurchaseReq);
        }
    }
}
