package com.ooteco.service.biz;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ooteco.dao.mapper.FinanceProductVOMapper;
import com.ooteco.entity.finance.model.FinanceEnum;
import com.ooteco.entity.finance.model.FinanceProductVO;
import com.ooteco.entity.finance.model.req.SupperAcctPurchaseReq;
import com.ooteco.entity.finance.model.req.SupperAcctRedeemReq;
import com.ooteco.entity.jhj.resp.SuperAccount;
import com.ooteco.entity.loan.model.resp.LoanFullScaleResp;
import com.ooteco.entity.repay.model.RepayPlanVO;
import com.ooteco.entity.repay.model.RepayVO;
import com.ooteco.service.http.HttpRequestService;
import com.ooteco.utils.Constant;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("jhjFinanceRequestServiceBiz")
public class JHJFinanceRequestServiceBiz {

    private Logger logger = Logger.getLogger(JHJFinanceRequestServiceBiz.class);
    @Resource
    private FinanceProductVOMapper financeProductVOMapper;
    @Resource
    private RepayPlanVOServiceBiz repayPlanVOServiceBiz;

    public void getFinanceProductsAndInsert(FinanceEnum.ProductStatus status){
        List<FinanceProductVO> list = getFinanceProductsByStatus(status);
        for (FinanceProductVO product : list) {
            if (financeProductVOMapper.selectByPrimaryKey(product.getFinanceProductsId()) != null)
                financeProductVOMapper.insertSelective(product);
        }
    }

    public List<SuperAccount> getSupperAcctBal(){
        String result = HttpRequestService.sendGetRequest(Constant.SUPPER_ACCT_BAL_URL, new HashMap<>());
        List<SuperAccount> superAccounts = new ArrayList<>();
        if(isRequestSuccess(result)){
            superAccounts = JSONArray.parseArray(getResponseJsonArray(result).toString(), SuperAccount.class);
        }
        return superAccounts;
    }

    public List<FinanceProductVO> getFinanceProductsByStatus(FinanceEnum.ProductStatus status){
        String result = HttpRequestService.sendGetRequest(Constant.FINANCE_LIST_URL, getFinanceProductsByStatusRequestParam(status));
        List<FinanceProductVO> list = new ArrayList<>();
        if(isRequestSuccess(result)){
            JSONArray jsonArray = getResponseJsonArray(result);
            list = JSONArray.parseArray(jsonArray.toString(), FinanceProductVO.class);
        }
        return list;
    }

    public void superAcctPurchase(SupperAcctPurchaseReq req){
        logger.debug(req.toString()+" "+"吃标");
        String result = HttpRequestService.sendPostRequestWithObject(Constant.SUPPER_ACCT_PURCHASE_URL, req);
        if(!isRequestSuccess(result))
            logger.debug(req.toString()+"吃标请求失败,result:"+result);
        else
            logger.debug(req.toString()+"吃标请求成功");
    }

    public void notifyLoanFullScale(List<LoanFullScaleResp> loanFullScalesResp){
        for(LoanFullScaleResp loanFullScaleResp : loanFullScalesResp){
            logger.debug(loanFullScaleResp.loanCode + "满标通知");
            String result = HttpRequestService.sendPostRequest(Constant.LOAN_FULL_SCALE_NOTIFY_URL, loanFullScaleResp);
            if(!isRequestSuccess(result)){
                logger.debug(loanFullScaleResp.loanCode + "满标通知失败,result:" + result);
            }else
                logger.debug(loanFullScaleResp.loanCode + "满标通知成功");
        }
    }

    public void superAcctRedeem(SupperAcctRedeemReq req){
        logger.debug("提前赎回" + req.toString());
        String result = HttpRequestService.sendPostRequestWithObject(Constant.SUPPER_ACCT_REDEEM_URL, req);
        if(!isRequestSuccess(result)){
            logger.debug(req.financeCode + "赎回错误失败,result:" + result);
        }else
            logger.debug(req.financeCode);
    }

    @Transactional
    public void getLoanRepaymentPlan(String loanCode){
        logger.debug(loanCode+"获取还款计划");
        String result = HttpRequestService.sendGetRequest(Constant.LOAN_REPAYMENT_PLAN_URL, getLoanRepaymentPlanRequestParam(loanCode));
        JSONObject response = JSON.parseObject(result);
        if(response != null && response.getString("type").equals("success")){
            JSONObject content = response.getJSONObject("content");
            List<RepayVO> details = JSONArray.parseArray(content.getString("detailsStr"), RepayVO.class);

            RepayPlanVO repayPlan = new RepayPlanVO();
            repayPlan.setType("0");
            repayPlan.setRepaymentPlanId(content.getLongValue("repaymentPlanid"));
            repayPlan.setLoanCode(content.getString("loanCode"));
            repayPlan.setUserCode(content.getString("userCode"));
            repayPlan.setReturnAmt(content.getBigDecimal("returnAmt"));
            repayPlanVOServiceBiz.insertRepayPlan(repayPlan, details);
            logger.debug(loanCode+"获取还款计划成功");
        }else
            logger.debug(loanCode + "获取还款计划失败,result:"+result);
    }

    public void notifyRedeem(String financeCode){
        logger.debug(financeCode + "赎回通知");
        String result = HttpRequestService.sendPostRequest(Constant.PRE_REDEMPTION_SUCCESS_URL, getNotifyRedeemRequestParam(financeCode));
        if(!isRequestSuccess(result)){
            logger.debug(financeCode + "赎回通知失败,result:"+result);
        }else
            logger.debug(financeCode+"赎回通知成功");
    }

    public boolean isSuperAccount(String userCode){
        List<SuperAccount> superAccounts = getSupperAcctBal();
        for(SuperAccount superAccount : superAccounts){
            if(superAccount.userCode.equals(userCode))
                return true;
        }
        return false;
    }


    private boolean isRequestSuccess(String result){
        if(StringUtils.isBlank(result))
            return false;
        JSONObject jsonObject = (JSONObject) JSONObject.parse(result);
        if(!jsonObject.get("code").toString().equals("1"))
            return false;
        return true;
    }

    private JSONObject getResponseJsonObject(String result){
        JSONObject jsonObject = (JSONObject) JSONObject.parse(result);
        return jsonObject.getJSONObject("data");
    }

    private JSONArray getResponseJsonArray(String result){
        JSONObject jsonObject = (JSONObject) JSONObject.parse(result);
        return jsonObject.getJSONArray("data");
    }

    private Map<String, String> getFinanceProductsByStatusRequestParam(FinanceEnum.ProductStatus status){
        Map<String, String> param = new HashMap<>();
        param.put("status", status.value);
        return param;
    }

    private Map<String, String> getLoanRepaymentPlanRequestParam(String id){
        Map<String, String> param = new HashMap<>();
        param.put("id", id);
        return param;
    }

    private Map<String,String> getNotifyRedeemRequestParam(String financeCode){
        Map<String, String> param = new HashMap<>();
        param.put("financeCode", financeCode);
        return param;
    }

    public static void main(String[] args) {
        JHJFinanceRequestServiceBiz service = new JHJFinanceRequestServiceBiz();
        String str = "{\"code\":1,\"data\":\"\",\"msg\":\"处理成功!!!\",\"total\":0}";
        service.isRequestSuccess(str);
    }

}
