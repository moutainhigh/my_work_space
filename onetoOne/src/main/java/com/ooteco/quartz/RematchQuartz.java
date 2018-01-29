package com.ooteco.quartz;

import com.ooteco.dao.mapper.FinanceSplitVOMapper;
import com.ooteco.dao.mapper.ext.FinanceDayValueVOExtMapper;
import com.ooteco.dao.mapper.ext.FinanceLoanMatchExtVOMapper;
import com.ooteco.entity.finance.model.FinanceSplitVO;
import com.ooteco.entity.match.model.FinanceLoanMatchExtVO;
import com.ooteco.lock.CapitalPoolLocker;
import com.ooteco.service.biz.FinanceLoanMatchVOServiceBiz;
import com.ooteco.service.biz.LoanFullScaleVOServiceBiz;
import com.ooteco.utils.DateUtils;
import org.apache.log4j.Logger;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RematchQuartz {

    @Resource
    private FinanceLoanMatchExtVOMapper financeLoanMatchExtVOMapper;
    @Resource
    private FinanceSplitVOMapper financeSplitVOMapper;
    @Resource
    private FinanceLoanMatchVOServiceBiz financeLoanMatchVOServiceBiz;
    @Resource
    private LoanFullScaleVOServiceBiz loanFullScaleVOServiceBiz;
    @Resource
    private FinanceDayValueVOExtMapper financeDayValueVOExtMapper;
    private Logger logger = Logger.getLogger(RematchQuartz.class);

    @Transactional(rollbackFor = Exception.class)
    public void rematch(){
        logger.debug("RematchQuartz.rematch开始获取锁");
        synchronized (CapitalPoolLocker.lock) {
            logger.debug("RematchQuartz.rematch取到锁");
            Date currentDate = DateUtils.getBeginTime(new Date());
            List<FinanceLoanMatchExtVO> list = financeLoanMatchExtVOMapper.getLoanExpireButFinanceNotExpireRecords(currentDate);
            if (list.size() > 0) {
                List<FinanceSplitVO> releasedFinances = new ArrayList<>();
                for (FinanceLoanMatchExtVO result : list) {
                    FinanceSplitVO financeSplit = new FinanceSplitVO();
                    financeSplit.setProcess(2);
                    financeSplit.setFinanceCode(result.getFinanceCode());
                    financeSplit.setStartDate(currentDate);
                    financeSplit.setExpireDate(result.getFinanceExpireDate());
                    financeSplit.setPeriod(DateUtils.getDiffDays(financeSplit.getStartDate(), financeSplit.getExpireDate()));
                    financeSplit.setAmount(result.getAllotAmount());
                    financeSplit.setFinanceProductsId(result.getFinanceProductsId());
                    financeSplit.setUserCode(result.getFinanceUserCode());
                    financeSplit.setRate(result.getLoanRate());
                    financeSplit.setPrepayLoanCode(result.getLoanCode());
                    releasedFinances.add(financeSplit);
                    financeDayValueVOExtMapper.update(financeSplit.getStartDate(),financeSplit.getExpireDate(),financeSplit.getAmount());
                    financeSplitVOMapper.insertSelective(financeSplit);
                }
                financeLoanMatchVOServiceBiz.allotReleasedFinances(releasedFinances);
            }
        }
        logger.debug("RematchQuartz.rematch处理成功");
        loanFullScaleVOServiceBiz.notifyLoanFullScale();
    }
}
