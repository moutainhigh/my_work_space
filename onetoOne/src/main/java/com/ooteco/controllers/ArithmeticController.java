package com.ooteco.controllers;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.ooteco.common.ResponseEntity;
import com.ooteco.dao.mapper.ext.FinanceDayValueVOExtMapper;
import com.ooteco.dao.mapper.ext.FinanceLoanMatchExtVOMapper;
import com.ooteco.dao.mapper.ext.FinanceSplitExtVOMapper;
import com.ooteco.entity.dayValue.model.DayValueVO;
import com.ooteco.entity.finance.model.*;
import com.ooteco.entity.finance.model.req.SupperAcctPurchaseReq;
import com.ooteco.entity.finance.model.req.SupperAcctRedeemReq;
import com.ooteco.entity.financeDayValue.model.req.FinanceDayValueExtVO;
import com.ooteco.entity.financeDayValue.model.resp.FinanceResidueLimitResp;
import com.ooteco.entity.financeProducts.model.FinanceProductsVO;
import com.ooteco.entity.jhj.resp.SuperAccount;
import com.ooteco.entity.loan.model.LoanVO;
import com.ooteco.entity.loan.model.req.ForecastVOReq;
import com.ooteco.entity.loanAllocation.model.LoanAllocation;
import com.ooteco.entity.match.model.resp.FinanceMatchLoanListResp;
import com.ooteco.entity.match.model.resp.MatchInfo;
import com.ooteco.entity.match.model.resp.MatchResp;
import com.ooteco.entity.match.model.resp.MatchResultResp;
import com.ooteco.entity.repay.model.PrepayVO;
import com.ooteco.entity.repay.model.RepayPlanVO;
import com.ooteco.entity.repay.model.RepayVO;
import com.ooteco.entity.repay.model.req.RepayPlanVOReq;
import com.ooteco.entity.repay.model.resp.EarlyRedemptionResp;
import com.ooteco.entity.tloan.model.TLoanVO;
import com.ooteco.entity.weekValue.model.WeekValueVO;
import com.ooteco.lock.CapitalPoolLocker;
import com.ooteco.service.*;
import com.ooteco.service.biz.*;
import com.ooteco.service.impl.TLoanVOServiceImpl;
import com.ooteco.utils.Constant;
import com.ooteco.utils.DateUtils;
import com.ooteco.utils.HttpRequest;
import org.apache.commons.collections.map.HashedMap;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller("arithmeticController")
@RequestMapping("api/ath")
public class ArithmeticController extends BaseController {

    @Autowired
    private FinanceProductsVOService financeProductsVOService;
    @Autowired
    private DayValueVOService dayValueVOService;
    @Autowired
    private FinanceDayValueVOService financeDayValueVOService;
    @Autowired
    private WeekValueVOService weekValueVOService;
    @Autowired
    private TLoanVOServiceImpl tLoanVOService;
    @Autowired
    private LoanAllocationService loanAllocationService;
    @Autowired
    private FinanceLoanSplitVOService financeLoanSplitVOService;
    @Autowired
    private LoanVOServiceBiz loanVOServiceBiz;
    @Autowired
    private RepayPlanVOServiceBiz repayPlanVOServiceBiz;
    @Autowired
    private FinanceVOServiceBiz financeVOServiceBiz;
    @Autowired
    private PrepayVOServiceBiz prepayVOServiceBiz;
    @Autowired
    private PreRedemptionVOServiceBiz preRedemptionVOServiceBiz;
    @Autowired
    private RepayVOServiceBiz repayVOServiceBiz;
    @Autowired
    private FinanceLoanMatchVOServiceBiz financeLoanMatchVOServiceBiz;
    @Autowired
    private JHJFinanceRequestServiceBiz jhjFinanceRequestServiceBiz;
    @Resource
    private FinanceLoanMatchExtVOMapper financeLoanMatchExtVOMapper;
    @Resource
    private FinanceSplitExtVOMapper financeSplitExtVOMapper;
    @Resource
    private LoanFullScaleVOServiceBiz loanFullScaleVOServiceBiz;
    @Resource
    private FinanceSplitVOServiceBiz financeSplitVOServiceBiz;
    @Resource
    private RepaySplitVOServiceBiz repaySplitVOServiceBiz;
    @Resource
    private FinanceDayValueVOExtMapper financeDayValueVOExtMapper;

    private Logger logger = Logger.getLogger(ArithmeticController.class);

    @RequestMapping(value = "/tomorrowDayValue", method = RequestMethod.GET)
    @ResponseBody
    public void tomorrowDayValue(int type) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.DATE, -1);
        Date beginDate = calendar.getTime();

        if (type != 1) {
            calendar.add(Calendar.DATE, type);
        }

        List<RepayVO> repayVOList = repayVOServiceBiz.findListByDay(beginDate);
        List<RepayVO> repayVORepaymentDateList = repayVOServiceBiz.findRepaymentDateList(beginDate);

        List<DayValueVO> dayValueVOList = dayValueVOService.findHistoryDayValueVO(calendar.getTime());
        DayValueVO dayValueVO = null;
        for (DayValueVO dayValueVOFor : dayValueVOList) {
            if (dayValueVOFor.getType() == type) {
                dayValueVO = dayValueVOFor;
            }
        }

        BigDecimal hDayValue = new BigDecimal("0");

        hDayValue = dayValueVO.gettValue();

        BigDecimal sumPrice = new BigDecimal("0");
        //计算每日金额
        for (RepayVO repayVO : repayVOList) {
            sumPrice = sumPrice.add(repayVO.getPrincipal().add(repayVO.getInterest()));
        }

        BigDecimal sumAlreadyPrice = new BigDecimal("0");
        //计算到期金额
        for (RepayVO repayVO : repayVORepaymentDateList) {
            sumAlreadyPrice = sumAlreadyPrice.add(repayVO.getPrincipal().add(repayVO.getInterest()));
        }

        String lmd = "0.94";
        dayValueVO = new DayValueVO();
        dayValueVO.setTime(beginDate);
        dayValueVO.setValue(sumPrice);
        dayValueVO.setSumPrice(sumPrice);
        dayValueVO.setSumHPrice(sumAlreadyPrice);
        dayValueVO.settValue(new BigDecimal(lmd).multiply(dayValueVO.getValue()).add((new BigDecimal("1").subtract(new BigDecimal(lmd))).multiply(hDayValue)));
        dayValueVO.setRangeValue(new BigDecimal(Double.parseDouble(String.valueOf(Math.abs(hDayValue.subtract(dayValueVO.getValue()).longValue()))) / Double.parseDouble(dayValueVO.getValue().toString())));

        System.out.println();
    }

    @RequestMapping(value = "/dayValue", method = RequestMethod.GET)
    @ResponseBody
    public void dayValue(int type) {
        Calendar calendar = Calendar.getInstance();

        Date minDate = repayVOServiceBiz.findMinDate();
        Date beginDate = repayVOServiceBiz.findMinDate();
        Date endDate = repayVOServiceBiz.findMaxDate();

        BigDecimal hDayValue = new BigDecimal("0.00");
        while (beginDate.getTime() <= endDate.getTime()) {
            calendar.setTime(beginDate);

            if (type != 1) {
                calendar.add(Calendar.DATE, type);
            }

            List<RepayVO> repayVOList = repayVOServiceBiz.findListByDay(beginDate);
            List<RepayVO> repayVORepaymentDateList = repayVOServiceBiz.findRepaymentDateList(beginDate);

            BigDecimal sumPrice = new BigDecimal("0");
            //计算每日金额
            for (RepayVO repayVO : repayVOList) {
                sumPrice = sumPrice.add(repayVO.getPrincipal().add(repayVO.getInterest()));
            }

            BigDecimal sumAlreadyPrice = new BigDecimal("0");
            //计算到期金额
            for (RepayVO repayVO : repayVORepaymentDateList) {
                sumAlreadyPrice = sumAlreadyPrice.add(repayVO.getPrincipal().add(repayVO.getInterest()));
            }

            String lmd = "0.94";
            DayValueVO dayValueVO = new DayValueVO();
            dayValueVO.setTime(beginDate);
            dayValueVO.setValue(sumPrice);
            dayValueVO.setSumPrice(sumPrice);
            dayValueVO.setSumHPrice(sumAlreadyPrice);
            dayValueVO.setType(type);
            if (minDate.getTime() == beginDate.getTime()) {
                dayValueVO.settValue(new BigDecimal(lmd).multiply(dayValueVO.getValue()).add((new BigDecimal("1").subtract(new BigDecimal(lmd))).multiply(dayValueVO.getValue())));
                //dayValueVO.setRangeValue(new BigDecimal(Math.abs((dayValueVO.getValue().subtract(dayValueVO.getValue())).divide(dayValueVO.getValue()).longValue())));
            } else {
                dayValueVO.settValue(new BigDecimal(lmd).multiply(dayValueVO.getValue()).add((new BigDecimal("1").subtract(new BigDecimal(lmd))).multiply(hDayValue)));
                //dayValueVO.setRangeValue(new BigDecimal(Double.parseDouble(String.valueOf(hDayValue.subtract(dayValueVO.getValue()).longValue()))/Double.parseDouble(dayValueVO.getValue().toString())));
            }

            hDayValue = dayValueVO.gettValue();

            dayValueVOService.insert(dayValueVO);

            calendar.setTime(beginDate);
            calendar.add(Calendar.DATE, type);
            beginDate = calendar.getTime();
        }
    }

    @RequestMapping(value = "/financeDayValue", method = RequestMethod.GET)
    @ResponseBody
    public void financeDayValue(int type) {
        financeDayValueVOService.initFinanceDayValue(type);
    }

    @RequestMapping(value = "/weekValue", method = RequestMethod.GET)
    @ResponseBody
    public void weekValue() {
        Date minCiDate = financeProductsVOService.findMinCiDate();
        Date beginDate = financeProductsVOService.findMinCiDate(); //起息日最小日期
        Date endDate = financeProductsVOService.findMaxCiDate(); //起息日最大日期
        BigDecimal sumPrice = new BigDecimal("0");
        BigDecimal hDayValue = new BigDecimal("0.00");
        BigDecimal sumAlreadyPrice = new BigDecimal("0");
        while (beginDate.getTime() != endDate.getTime()) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(beginDate);
            calendar.add(Calendar.DATE, -1);
            List<FinanceProductsVO> daysFinanceProductsVOList = financeProductsVOService.findListByWeekDay(beginDate);
            List<FinanceProductsVO> historyDaysFinanceProductsVOList = financeProductsVOService.findHistoryDaysFinanceProductsVOList(calendar.getTime());

            //计算每日净额
            for (FinanceProductsVO financeProductsVO : daysFinanceProductsVOList) {
                sumPrice = sumPrice.add(financeProductsVO.getSalesVolume());
            }

            for (FinanceProductsVO historyDaysFinanceProductsVO : historyDaysFinanceProductsVOList) {
                sumAlreadyPrice = sumAlreadyPrice.add(historyDaysFinanceProductsVO.getSalesVolume());
            }

            String lmd = "0.94";
            WeekValueVO weekValueVO = new WeekValueVO();
            weekValueVO.setTime(beginDate);
            weekValueVO.setValue(sumPrice.subtract(sumAlreadyPrice));
            weekValueVO.setSumPrice(sumPrice);
            weekValueVO.setSumHPrice(sumAlreadyPrice);
            if (minCiDate.getTime() == beginDate.getTime()) {
                weekValueVO.settValue(new BigDecimal(lmd).multiply(weekValueVO.getValue()).add((new BigDecimal("1").subtract(new BigDecimal(lmd))).multiply(weekValueVO.getValue())));
                weekValueVO.setRangeValue(new BigDecimal(Math.abs((weekValueVO.getValue().subtract(weekValueVO.getValue())).divide(weekValueVO.getValue(), 3).longValue())));
            } else {
                weekValueVO.settValue(new BigDecimal(lmd).multiply(weekValueVO.getValue()).add((new BigDecimal("1").subtract(new BigDecimal(lmd))).multiply(hDayValue)));
//                dayValueVO.setRangeValue(new BigDecimal(Double.parseDouble(String.valueOf(Math.abs(hDayValue.subtract(dayValueVO.getValue()).longValue())))/Double.parseDouble(dayValueVO.getValue().toString())));
                weekValueVO.setRangeValue(new BigDecimal(Double.parseDouble(String.valueOf(hDayValue.subtract(weekValueVO.getValue()).longValue())) / Double.parseDouble(weekValueVO.getValue().toString())));
//                dayValueVO.setRangeValue(new BigDecimal(Math.abs((hDayValue.subtract(dayValueVO.getValue())).divide(dayValueVO.getValue()).longValue())));
            }

            hDayValue = weekValueVO.gettValue();

            weekValueVOService.insert(weekValueVO);

            calendar.setTime(beginDate);
            calendar.add(Calendar.DATE, 7);
            beginDate = calendar.getTime();
        }
    }

    @RequestMapping(value = "/forecast", method = RequestMethod.GET)
    @ResponseBody
    public void forecast() {

    }

    @RequestMapping(value = "/loanAllot", method = RequestMethod.GET)
    @ResponseBody
    @Transactional
    public ResponseEntity loanAllot(Integer financeId, BigDecimal price, Integer phase) {
        ResponseEntity entity = ResponseEntity.failed();
        if (financeId == null || price == null || phase == null) {
            entity.setMsg("缺少参数");
            return entity;
        }
        BigDecimal lmd = new BigDecimal(6.00);
        List<Integer> alreadyAllocation = new ArrayList<>();
        while (price.compareTo(new BigDecimal("0")) > 0) {
            BigDecimal residuePrice = new BigDecimal("0.00");
            List<TLoanVO> tLoanVOs = tLoanVOService.findIsNotAllocationCompleteLists(alreadyAllocation, phase, lmd.intValue());
            BigDecimal avgPrice = price.divide(lmd, 3, RoundingMode.HALF_UP);
            lmd = new BigDecimal(0.00);
            LoanAllocation loanAllocation;
            for (TLoanVO tLoanVO : tLoanVOs) {
                alreadyAllocation.add(tLoanVO.getId());
                loanAllocation = new LoanAllocation();
                loanAllocation.setFinanceId(financeId);
                loanAllocation.setLoanId(tLoanVO.getId());
                if ((tLoanVO.getCapital().subtract(tLoanVO.getCapitalBalance())).compareTo(avgPrice) > 0) {
                    tLoanVO.setCapitalBalance(tLoanVO.getCapitalBalance().add(avgPrice));
                    loanAllocation.setMoney(avgPrice);
                } else {
                    loanAllocation.setMoney(tLoanVO.getCapital().subtract(tLoanVO.getCapitalBalance()));
                    residuePrice = residuePrice.add(avgPrice.subtract(tLoanVO.getCapital().subtract(tLoanVO.getCapitalBalance())));
                    tLoanVO.setCapitalBalance(tLoanVO.getCapital());
                    tLoanVO.setIsAllocationComplete(1l);
                    lmd = lmd.add(new BigDecimal(1.00));
                }
                tLoanVOService.update(tLoanVO);
                loanAllocationService.insert(loanAllocation);
            }
            price = residuePrice;

        }

        return entity;
    }

    @RequestMapping(value = "split", method = RequestMethod.POST)
    @ResponseBody
    public String split(String date) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        financeLoanSplitVOService.insert(dateFormat.parse(date));
        return "SUCCESS";
    }


    //贷款信息录入(确认是否放款)
    @RequestMapping(value = "loanEnter", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity loanEnter(@Valid LoanVO loan, BindingResult bindingResult, HttpServletRequest request) {
        if (bindingResult.hasErrors()) {
            return ResponseEntity.validateFailed(bindingResult.getAllErrors());
        }
        ResponseEntity entity = ResponseEntity.signError();
        if (!isSignMatched(request))
            return entity;
//        int count = repaySplitVOServiceBiz.repaySplitCount();
        if (loanVOServiceBiz.getLoanVO(loan.getLoanCode()) != null) {
            return ResponseEntity.failed(loan.getLoanCode() + "loanCode has exists");
        }
        logger.debug(loan.getLoanCode()+"loanEnter开始获取锁");
        synchronized (CapitalPoolLocker.lock) {
            logger.debug(loan.getLoanCode()+"loanEnter取到锁");
            loanVOServiceBiz.handleLoanData(loan);
        }
        logger.debug(loan.getLoanCode()+"loanEnter处理成功");
        loanFullScaleVOServiceBiz.notifyLoanFullScale();
//        if (count == 0) {
//            financeDayValueVOService.initFinanceDayValue(1);
//        }
        return ResponseEntity.success();
    }

    //还款计划录入
    @RequestMapping(value = "repaymentSchedule", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity repaymentSchedule(@Valid RepayPlanVOReq repayPlanVOReq, BindingResult bindingResult, HttpServletRequest request) {
        if (bindingResult.hasErrors()) {
            return ResponseEntity.validateFailed(bindingResult.getAllErrors());
        }
        if (!isSignMatched(request))
            return ResponseEntity.signError();
        JSONArray jsonArray = JSON.parseArray(repayPlanVOReq.getDetails());
        List<RepayVO> details = JSONArray.parseArray(jsonArray.toString(), RepayVO.class);
        RepayPlanVO repayPlan = JSON.parseObject(repayPlanVOReq.getRepayPlan(), RepayPlanVO.class);
        repayPlan.setType("1");
        repayPlanVOServiceBiz.insertRepayPlan(repayPlan, details);
        return ResponseEntity.success();
    }

    //提前还款
    @RequestMapping(value = "prepayment", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity prepayment(@Valid PrepayVO prepayVO, BindingResult bindingResult, HttpServletRequest request) {
        if (bindingResult.hasErrors()) {
            return ResponseEntity.validateFailed(bindingResult.getAllErrors());
        }
        if (!isSignMatched(request))
            return ResponseEntity.signError();
        if (loanVOServiceBiz.getLoanVO(prepayVO.getLoanCode()) == null) {
            return ResponseEntity.error("loanCode doesn't exists");
        }
        List<MatchInfo> list;
        logger.debug(prepayVO.getLoanCode()+"prepayment开始获取锁");
        synchronized (CapitalPoolLocker.lock) {
            logger.debug(prepayVO.getLoanCode()+"prepayment取到锁");
            list = prepayVOServiceBiz.handlePrepay(prepayVO);
        }
        logger.debug(prepayVO.getLoanCode()+"prepayment处理成功");
        loanFullScaleVOServiceBiz.notifyLoanFullScale();
        return ResponseEntity.success().addData("list", list);
    }

    //贷款额度预警及预测
    @RequestMapping(value = "loanLimitEarlyWarning", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity loanLimitEarlyWarning(@Valid ForecastVOReq forecastVOReq, BindingResult bindingResult, HttpServletRequest request) {
        if (bindingResult.hasErrors()) {
            return ResponseEntity.validateFailed(bindingResult.getAllErrors());
        }
        ResponseEntity entity = ResponseEntity.signError();
        if (!isSignMatched(request))
            return entity;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(forecastVOReq.getRepaymentDate());
        calendar.add(Calendar.DATE, -1);
        List<DayValueVO> dayValueVOs = dayValueVOService.findHistoryDayValueVO(calendar.getTime());
        entity = ResponseEntity.success();
        entity.addData("额度时间", forecastVOReq.getRepaymentDate());
        for (DayValueVO dayValueVO : dayValueVOs) {
            if (dayValueVO.getType() == 5) {
                entity.addData("五日均值预警线", calendar.getTime());
            } else if (dayValueVO.getType() == 2) {
                entity.addData("两日均值预警线", calendar.getTime());
            } else {
                entity.addData("贷款额度", dayValueVO.gettValue());
            }
        }

        return entity;
    }

    //理财录入(返回匹配贷款明细)
    @RequestMapping(value = "financeEnter", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity financeEnter(@Valid FinanceVO financeVO, BindingResult bindingResult, HttpServletRequest request) {
        if (bindingResult.hasErrors()) {
            return ResponseEntity.validateFailed(bindingResult.getAllErrors());
        }
        ResponseEntity entity = ResponseEntity.signError();
        if (!isSignMatched(request))
            return entity;
        if (financeVOServiceBiz.getFinance(financeVO.getFinanceCode()) != null) {
            return ResponseEntity.failed(financeVO.getFinanceCode() + "financeCode has exists");
        }
        synchronized (this){
            if(financeVO.getType() == null || financeVO.getType().equals(0)){
                BigDecimal limit;
                if(jhjFinanceRequestServiceBiz.isSuperAccount(financeVO.getUserCode())){
                    logger.debug("超级账户理财录入");
                    limit = financeLoanMatchVOServiceBiz.getSuperAccountPurchaseMoney(DateUtils.getBeginTime(new Date()));
                }else{
                    limit = financeDayValueVOService.findMinPracticalNetAmount(
                            financeVO.getFinanceDate(),
                            financeVO.getRedemptionDate());
                }
                BigDecimal realLimit = repaySplitVOServiceBiz.getTodayLimit();
                logger.debug(financeVO.getFinanceCode() + "录入时,理财端可购买额度是:" + limit + ", repay_split的额度是" + realLimit);
                if(limit.compareTo(financeVO.getFinanceMoney()) < 0){
                    return ResponseEntity.failed("暂未找到能匹配的贷款数据");
                }
            }

            financeVOServiceBiz.calculateRedemptionDateAndInsert(financeVO);
            //更新理财实际剩余额度
            financeDayValueVOService.update(financeVO.getFinanceDate(), financeVO.getRedemptionDate(), financeVO.getFinanceMoney());
        }
        return ResponseEntity.success();
    }

    //提前赎回
    @RequestMapping(value = "earlyRedemption", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity earlyRedemption(@Valid PreRedemptionVO preRedemptionVO, BindingResult bindingResult, HttpServletRequest request) {
        logger.info(preRedemptionVO.getFinanceCode() + "提前赎回");
        if (bindingResult.hasErrors())
            return ResponseEntity.validateFailed(bindingResult.getAllErrors());
        if (!isSignMatched(request))
            return ResponseEntity.signError();
        EarlyRedemptionResp resp;
        logger.debug(preRedemptionVO.getFinanceCode()+"earlyRedemption开始获取锁");
        synchronized (CapitalPoolLocker.lock) {
            logger.debug(preRedemptionVO.getFinanceCode()+"earlyRedemption取到锁");
            resp = preRedemptionVOServiceBiz.handlePreRedemption(preRedemptionVO);
        }
        logger.debug(preRedemptionVO.getFinanceCode()+"earlyRedemption处理成功");
        jhjFinanceRequestServiceBiz.notifyRedeem(preRedemptionVO.getFinanceCode());
        return ResponseEntity.success().addData(resp.getRespMap());
    }

    //贷款满标通知
    @RequestMapping(value = "soldOut", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity soldOut() {
        return null;
    }

    //理财额度预测
    @RequestMapping(value = "financeLimitForecast", method = {RequestMethod.POST, RequestMethod.GET})
    @ResponseBody
    public ResponseEntity financeLimitForecast(@DateTimeFormat(pattern = "yyyyMMdd") Date date, String period, String timeStamp, String sign, HttpServletRequest request) {
        if (date == null)
            return ResponseEntity.error("date can't be blank");
        if (!isSignMatched(request))
            return ResponseEntity.signError();
        ResponseEntity entity = ResponseEntity.success();
        entity.addData("limitDate", date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, -1);
        Date beginDate = calendar.getTime();
        calendar.setTime(beginDate);
        calendar.add(Calendar.DATE, 30);
        Date endDateMonth = calendar.getTime();
        BigDecimal month = financeDayValueVOService.findMinNetAmount(beginDate, endDateMonth);
        calendar.setTime(beginDate);
        calendar.add(Calendar.DATE, 90);
        Date endDateQuarter = calendar.getTime();
        BigDecimal quarter = financeDayValueVOService.findMinNetAmount(beginDate, endDateQuarter);
        calendar.setTime(beginDate);
        calendar.add(Calendar.DATE, 180);
        Date endDateHYear = calendar.getTime();
        BigDecimal hHYear = financeDayValueVOService.findMinNetAmount(beginDate, endDateHYear);

        String result = HttpRequest.sendPost(Constant.FINANCE_LIST_URL, "status=2&timeStamp=123&sign=27cc6a7b8e79cd523fde9c410ebd697c");

        com.alibaba.fastjson.JSONObject jsonObject = JSON.parseObject(result);
        com.alibaba.fastjson.JSONArray details = jsonObject.getJSONArray("data");
        List<Map<String, String>> list = new ArrayList<>();
        for (int i = 0; i < details.size(); i++) {
            com.alibaba.fastjson.JSONObject object = details.getJSONObject(i);
            Map map = new HashedMap();
            map.put("financeProductsId", object.get("financeProductsId"));
            if (object.get("status").equals("2") && object.get("periodsType").equals("M")) {
                if (object.get("periods").equals("1")) {
                    map.put("financeLimit", month.subtract(quarter).subtract(hHYear));
                } else if (object.get("periods").equals("3")) {
                    map.put("financeLimit", quarter.subtract(hHYear));
                } else if (object.get("periods").equals("6")) {
                    map.put("financeLimit", hHYear);
                }
            }
            list.add(map);
        }
        entity.addData("period", period == null ? "day" : period);
//        Map map1 = new HashedMap();
//        map1.put("financeProductsId","28764");
//        map1.put("financeLimit","3598");
//        Map map2 = new HashedMap();
//        map2.put("financeProductsId","2");
//        map2.put("financeLimit","2469");
//        Map map3 = new HashedMap();
//        map3.put("financeProductsId","3");
//        map3.put("financeLimit","2001");
//        list.add(map1);
//        list.add(map2);
//        list.add(map3);
        entity.addData("list", list);
        return entity;
    }

    //获取贷款对应匹配投资列表
    @RequestMapping(value = "getLoanMatchFinanceList", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity getLoanMateFinanceList(String loanCode, HttpServletRequest request) {
        if (StringUtils.isBlank(loanCode))
            return ResponseEntity.error("loanCode can't be blank");
        if (!isSignMatched(request)) {
            return ResponseEntity.signError();
        }
        List<MatchResultResp> list = financeLoanMatchVOServiceBiz.getLoanMatchedFinance(loanCode);
        return ResponseEntity.success()
                .addData("list", list);
    }

    //获取某笔投资匹配的贷款信息
    @RequestMapping(value = "getFinanceMatchLoanList", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity getFinanceMateLoanList(String financeCode, HttpServletRequest request) {
        if (StringUtils.isBlank(financeCode))
            return ResponseEntity.error("financeCode can't be blank");
        if (!isSignMatched(request)) {
            return ResponseEntity.signError();
        }
        FinanceMatchLoanListResp  resp = financeLoanMatchVOServiceBiz.getFinanceMatchLoanListResp(financeCode);
        return ResponseEntity.success()
                .addData(resp.getRespMap());
    }

    @RequestMapping(value = "financeProfit", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public ResponseEntity getFinanceProfit(PreRedemptionVO preRedemption, BindingResult bindingResult, HttpServletRequest request) {
        if (bindingResult.hasErrors())
            return ResponseEntity.validateFailed(bindingResult.getAllErrors());
        if (!isSignMatched(request)) {
            return ResponseEntity.signError();
        }
        FinanceProfitResp financeProfitResp = financeVOServiceBiz.getFinanceProfit(preRedemption);
        return ResponseEntity.success().addData(financeProfitResp.getRespMap());
    }

    @RequestMapping(value = "/financeResidueLimit", method = {RequestMethod.POST, RequestMethod.GET})
    @ResponseBody
    public ResponseEntity financeResidueLimit(HttpServletRequest request) {
        if (!isSignMatched(request))
            return ResponseEntity.signError();
        ResponseEntity entity = ResponseEntity.success();
        List<FinanceSplitVO> financeSplits = financeSplitVOServiceBiz.getUncompletedFinance();
        Date beginDate = DateUtils.getBeginTime(new Date());
        List<FinanceResidueLimitResp> list = new ArrayList<>();
        List<FinanceProductVO> financeProducts = jhjFinanceRequestServiceBiz.getFinanceProductsByStatus(FinanceEnum.ProductStatus.RAISING);
        for (FinanceProductVO financeProduct : financeProducts) {
            BigDecimal limitAmount = null;
            if (financeProduct.isMonthPeriodProduct() && financeSplits.isEmpty()) {
                limitAmount = financeDayValueVOService.findMinPracticalNetAmount(beginDate, DateUtils.addMonthCount(beginDate,
                        financeProduct.getPeriods()));
            }
            list.add(new FinanceResidueLimitResp(financeProduct.getFinanceProductsId(), limitAmount));
        }
        return entity.addData("list", list);
    }

    @RequestMapping(value = "/financeResidueLimitById", method = {RequestMethod.POST, RequestMethod.GET})
    @ResponseBody
    public ResponseEntity financeResidueLimitById(HttpServletRequest request, @Valid FinanceDayValueExtVO financeDayValueExtVO, BindingResult bindingResult) {
        if (!isSignMatched(request))
            return ResponseEntity.signError();
        if(bindingResult.hasErrors()){
            return ResponseEntity.validateFailed(bindingResult.getAllErrors());
        }
        BigDecimal limit = financeDayValueVOService.findMinPracticalNetAmount(
                financeDayValueExtVO.getFinanceDate(),
                financeDayValueExtVO.getRedemptionDate());
        List<FinanceSplitVO> financeSplits = financeSplitVOServiceBiz.getUncompletedFinance();
        logger.debug(financeDayValueExtVO.getFinanceProductsId() + "查询的额度是:" + limit);
        if(!financeSplits.isEmpty() || limit == null){
            logger.debug(financeDayValueExtVO.getFinanceProductsId() + "查询的额度时,存在未匹配完的理财,理财额度返回0");
            limit = new BigDecimal(0);
        }
        return ResponseEntity.success()
                .addData("financeProductsId",financeDayValueExtVO.getFinanceProductsId())
                .addData("financeResidueLimit",limit);
    }


    @RequestMapping(value = "/superAccountRedemption", method = {RequestMethod.POST, RequestMethod.GET})
    @ResponseBody
    public ResponseEntity superAccountRedemption() {
        //查询所有超级账户
        List<SuperAccount> superAccounts = jhjFinanceRequestServiceBiz.getSupperAcctBal();

        //查询昨日超级账户理财并赎回
        for (SuperAccount superAccount : superAccounts) {
            List<FinanceVO> financeVOs = financeVOServiceBiz.selectBySuperUser(superAccount.userCode);
            for (FinanceVO financeVO : financeVOs) {
                SupperAcctRedeemReq supperAcctRedeemReq = new SupperAcctRedeemReq(superAccount.userCode, new Date(), financeVO.getFinanceMoney());
                //超级账户赎回操作
                jhjFinanceRequestServiceBiz.superAcctRedeem(supperAcctRedeemReq);
            }
        }
        return ResponseEntity.success("超级账户赎回");
    }

    @RequestMapping(value = "/superAccountPurchase", method = {RequestMethod.POST, RequestMethod.GET})
    @ResponseBody
    public ResponseEntity superAccountPurchase() {
        ResponseEntity entity = ResponseEntity.success();
        //查询当天已匹配但未匹配完成的贷款金额汇总
        BigDecimal money = financeLoanMatchVOServiceBiz.getSuperAccountPurchaseMoney(DateUtils.getBeginTime(new Date()));
        entity.addData("value", money);
        if (money.compareTo(new BigDecimal("0")) <= 0) {
            return entity;
        }

        //查询理财期限为一月的理财 id
        String financeProductsId = "";
        String result = HttpRequest.sendPost(Constant.FINANCE_LIST_URL, "status=2&timeStamp=123&sign=27cc6a7b8e79cd523fde9c410ebd697c");

        com.alibaba.fastjson.JSONObject jsonObject = JSON.parseObject(result);
        com.alibaba.fastjson.JSONArray details = jsonObject.getJSONArray("data");
        for (int i = 0; i < details.size(); i++) {
            com.alibaba.fastjson.JSONObject object = details.getJSONObject(i);
            if (object.get("status").equals("2") && object.get("periodsType").equals("M") && object.get("periods").equals("1")) {
                financeProductsId = object.get("financeProductsId").toString();
            }
        }

        //超级账户吃标
        List<SuperAccount> superAccounts = jhjFinanceRequestServiceBiz.getSupperAcctBal();
        for (SuperAccount superAccount : superAccounts) {
            SupperAcctPurchaseReq supperAcctPurchaseReq;
            if (superAccount.balance.compareTo(money) >= 0) {
                supperAcctPurchaseReq = new SupperAcctPurchaseReq(superAccount.userCode, financeProductsId, money);
            } else {
                supperAcctPurchaseReq = new SupperAcctPurchaseReq(superAccount.userCode, financeProductsId, superAccount.balance);
                money = money.subtract(superAccount.balance);
            }
            jhjFinanceRequestServiceBiz.superAcctPurchase(supperAcctPurchaseReq);
        }
        return entity;
    }

    @RequestMapping(value = "/repaymentScheduleUpdate", method = {RequestMethod.POST, RequestMethod.GET})
    @ResponseBody
    public ResponseEntity repaymentScheduleUpdate() {
        List<String> loanCodes = financeLoanMatchExtVOMapper.getNeverMatchedLoanCodes();
        if (loanCodes.size() > 0) {
            repayPlanVOServiceBiz.handleOldRepayPlan(loanCodes);
            for (String loanCode : loanCodes) {
                jhjFinanceRequestServiceBiz.getLoanRepaymentPlan(loanCode);
            }
        }
        financeSplitExtVOMapper.updateUncompletedFinanceStartDate();
        return ResponseEntity.success();
    }

    @RequestMapping(value = "/getSign", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity getSign(HttpServletRequest request) {
        return ResponseEntity.success().addData("sign", getRequestSign(request));
    }

    @RequestMapping(value = "paymentResultNotify", method = {RequestMethod.POST, RequestMethod.GET})
    @ResponseBody
    @Transactional
    public ResponseEntity notifyPayResult(String financeCode, String paymentResult, HttpServletRequest request) {
        if (!isSignMatched(request)) {
            return ResponseEntity.signError();
        }
        FinanceSplitVO financeSplitVO = financeSplitVOServiceBiz.getFinanceSplit(financeCode);
        if (financeSplitVO == null) {
            return ResponseEntity.failed(financeCode + "financeCode not exists or has handled");
        }
        if (paymentResult.equals("failed")) {
            financeDayValueVOExtMapper.addMoney(financeSplitVO.getStartDate(), financeSplitVO.getExpireDate(), financeSplitVO.getAmount());
            financeSplitVOServiceBiz.updateFinanceSplitInvalid(financeCode);
        } else if (paymentResult.equals("success")) {
            MatchResp matchResp;
            logger.debug(financeCode+"paymentResultNotify开始获取锁");
            synchronized (CapitalPoolLocker.lock) {
                logger.debug(financeCode+"paymentResultNotify取到锁");
                matchResp = financeLoanMatchVOServiceBiz.match(financeSplitVO);
            }
            logger.debug(financeCode+"paymentResultNotify处理成功");
            if (matchResp == null) {
                financeSplitVOServiceBiz.updateFinanceSplitNotMatch(financeCode);
                return ResponseEntity.failed().addData("matchMsg", "暂未找到能匹配的贷款数据");
            }
            loanFullScaleVOServiceBiz.notifyLoanFullScale();
        }
        return ResponseEntity.success();
    }

    @RequestMapping(value = "regainRepayPlan", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity regainRepayPlan(String loanCode, HttpServletRequest request){
        if(!isSignMatched(request)){
            return ResponseEntity.signError();
        }
        if(StringUtils.isBlank(loanCode)){
            return ResponseEntity.error("参数不能为空!");
        }
        logger.debug(loanCode+"regainRepayPlan开始获取锁");
        synchronized (CapitalPoolLocker.lock) {
            logger.debug(loanCode+"regainRepayPlan取到锁");
            jhjFinanceRequestServiceBiz.getLoanRepaymentPlan(loanCode);
        }
        logger.debug(loanCode+"regainRepayPlan处理成功");
        return ResponseEntity.success();
    }
}
