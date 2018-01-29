package com.ooteco.quartz;

import com.ooteco.entity.finance.model.FinanceVO;
import com.ooteco.entity.finance.model.req.SupperAcctRedeemReq;
import com.ooteco.entity.jhj.resp.SuperAccount;
import com.ooteco.service.biz.FinanceVOServiceBiz;
import com.ooteco.service.biz.JHJFinanceRequestServiceBiz;
import com.ooteco.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by zk on 2017/9/16.
 */
public class SuperAccountRedemptionQuartz {
    @Autowired
    private JHJFinanceRequestServiceBiz jhjFinanceRequestServiceBiz;
    @Autowired
    private FinanceVOServiceBiz financeVOServiceBiz;

    public void superAccountRedemption(){
        //查询所有超级账户
        List<SuperAccount> superAccounts = jhjFinanceRequestServiceBiz.getSupperAcctBal();
        //查询昨日超级账户理财并赎回
        for(SuperAccount superAccount : superAccounts){
            List<FinanceVO> financeVOs = financeVOServiceBiz.selectBySuperUser(superAccount.userCode);
            for(FinanceVO financeVO : financeVOs){
                SupperAcctRedeemReq supperAcctRedeemReq = new SupperAcctRedeemReq(financeVO.getFinanceCode(),new Date(),financeVO.getFinanceMoney());
                //超级账户赎回操作
                jhjFinanceRequestServiceBiz.superAcctRedeem(supperAcctRedeemReq);
            }
        }
    }
}
