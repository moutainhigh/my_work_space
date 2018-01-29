package com.ooteco.quartz;

import com.ooteco.dao.mapper.ext.FinanceDayValueVOExtMapper;
import com.ooteco.dao.mapper.ext.FinanceLoanMatchExtVOMapper;
import com.ooteco.dao.mapper.ext.FinanceSplitExtVOMapper;
import com.ooteco.entity.repay.model.RepaySplitVO;
import com.ooteco.lock.CapitalPoolLocker;
import com.ooteco.service.FinanceDayValueVOService;
import com.ooteco.service.biz.JHJFinanceRequestServiceBiz;
import com.ooteco.service.biz.RepayPlanVOServiceBiz;
import com.ooteco.service.biz.RepaySplitVOServiceBiz;
import org.apache.log4j.Logger;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

public class RepaymentScheduleUpdateQuartz {
    @Resource
    private FinanceLoanMatchExtVOMapper financeLoanMatchExtVOMapper;
    @Resource
    private RepayPlanVOServiceBiz repayPlanVOServiceBiz;
    @Resource
    private JHJFinanceRequestServiceBiz jhjFinanceRequestServiceBiz;
    @Resource
    private FinanceSplitExtVOMapper financeSplitExtVOMapper;
    @Resource
    private FinanceDayValueVOExtMapper financeDayValueVOExtMapper;
    @Resource
    private FinanceDayValueVOService financeDayValueVOService;
    @Resource
    private RepaySplitVOServiceBiz repaySplitVOServiceBiz;
    private Logger logger = Logger.getLogger(RepaymentScheduleUpdateQuartz.class);
    @Transactional(rollbackFor = Exception.class)
    public void update(){
        logger.debug("RepaymentScheduleUpdateQuartz.update开始获取锁");
        synchronized (CapitalPoolLocker.lock){
            logger.debug("RepaymentScheduleUpdateQuartz.update取到锁");
            List<String> loanCodes = financeLoanMatchExtVOMapper.getNeverMatchedLoanCodes();
            if(loanCodes.size() > 0){
                repayPlanVOServiceBiz.handleOldRepayPlan(loanCodes);
                for(String loanCode : loanCodes){
                    jhjFinanceRequestServiceBiz.getLoanRepaymentPlan(loanCode);
                }
            }
            financeSplitExtVOMapper.updateUncompletedFinanceStartDate();
            repaySplitVOServiceBiz.updateRemainRepaySplitStartDateToToday();
            //额度初始化
            financeDayValueVOExtMapper.deleteFinanceDayValue();
            financeDayValueVOService.initFinanceDayValue(1);
        }
        logger.debug("RepaymentScheduleUpdateQuartz.update处理成功");
    }
}
