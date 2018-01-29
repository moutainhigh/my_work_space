package com.ooteco.service.impl;

import com.ooteco.dao.mapper.FinanceDayValueVOMapper;
import com.ooteco.dao.mapper.ext.FinanceDayValueVOExtMapper;
import com.ooteco.entity.finance.model.FinanceSplitVO;
import com.ooteco.entity.financeDayValue.model.FinanceDayValueVO;
import com.ooteco.entity.financeDayValue.model.FinanceDayValueVOExample;
import com.ooteco.entity.match.model.FinanceLoanMatchVO;
import com.ooteco.entity.repay.model.RepaySplitVO;
import com.ooteco.entity.repay.model.RepayVO;
import com.ooteco.service.FinanceDayValueVOService;
import com.ooteco.service.biz.FinanceLoanMatchVOServiceBiz;
import com.ooteco.service.biz.FinanceSplitVOServiceBiz;
import com.ooteco.service.biz.RepaySplitVOServiceBiz;
import com.ooteco.service.biz.RepayVOServiceBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by zk on 2017/7/19.
 */
@Service("financeDayValueVOService")
public class FinanceDayValueVOServiceImpl implements FinanceDayValueVOService {

    @Autowired
    FinanceDayValueVOMapper financeDayValueVOMapper;
    @Autowired
    FinanceDayValueVOExtMapper financeDayValueVOExtMapper;
    @Autowired
    RepayVOServiceBiz repayVOServiceBiz;
    @Autowired
    FinanceLoanMatchVOServiceBiz financeLoanMatchVOServiceBiz;
    @Autowired
    RepaySplitVOServiceBiz repaySplitVOServiceBiz;
    @Resource
    private FinanceSplitVOServiceBiz financeSplitVOServiceBiz;

    @Override
    public void insert(FinanceDayValueVO dayValueVO) {
        financeDayValueVOMapper.insert(dayValueVO);
    }

    @Override
    public List<FinanceDayValueVO> findHistoryFinanceDayValueVO(Date date) {
        FinanceDayValueVOExample example = new FinanceDayValueVOExample();
        FinanceDayValueVOExample.Criteria criteria = example.createCriteria();
        criteria.andTimeEqualTo(date);
        return financeDayValueVOMapper.selectByExample(example);
    }

    @Override
    public BigDecimal findMinNetAmount(Date beginDate, Date endDate) {
        return financeDayValueVOExtMapper.findMinNetAmount(beginDate,endDate);
    }

    @Override
    public BigDecimal findMinPracticalNetAmount(Date beginDate, Date endDate) {
        return financeDayValueVOExtMapper.findMinPracticalNetAmount(beginDate,endDate);
    }

    @Override
    public List<FinanceDayValueVO> findFinanceDayValueVOList(Date beginDate, Date endDate) {
        FinanceDayValueVOExample example = new FinanceDayValueVOExample();
        FinanceDayValueVOExample.Criteria criteria = example.createCriteria();
        criteria.andTimeGreaterThanOrEqualTo(beginDate);
        criteria.andTimeLessThanOrEqualTo(beginDate);
        return financeDayValueVOMapper.selectByExample(example);
    }

    @Override
    public void update(Date beginDate, Date endDate, BigDecimal money) {
        financeDayValueVOExtMapper.update(beginDate,endDate,money);
    }

    @Override
    public void addMoney(Date beginDate, Date endDate, BigDecimal money) {
        financeDayValueVOExtMapper.addMoney(beginDate,endDate,money);
    }

    @Override
    public void initFinanceDayValue(int type) {
        Calendar calendar = Calendar.getInstance();

        Date beginDate = repayVOServiceBiz.findMinDate();
        Date endDate = repayVOServiceBiz.findMaxDate();

        calendar.setTime(endDate);
        calendar.add(Calendar.DATE,180);

        endDate = calendar.getTime();
        while(beginDate.getTime() <= endDate.getTime()){
            calendar.setTime(beginDate);
            if(type!=1){
                calendar.add(Calendar.DATE, type);
            }
            FinanceDayValueVO financeDayValueVO = new FinanceDayValueVO();
            financeDayValueVO.setTime(beginDate);
            financeDayValueVO.setType(type);
            //实际净额
            BigDecimal practicalNetAmount = financeDayValueVOExtMapper.financeDayValue(new java.text.SimpleDateFormat("yyyyMMdd").format(beginDate));
            financeDayValueVO.setPracticalNetAmount(practicalNetAmount==null?new BigDecimal(0):practicalNetAmount);
            insert(financeDayValueVO);
            calendar.setTime(beginDate);
            calendar.add(Calendar.DATE, type);
            beginDate = calendar.getTime();
        }

        List<FinanceSplitVO> financeSplits = financeSplitVOServiceBiz.getUncompletedFinance();
        for(FinanceSplitVO financeSplit : financeSplits){
            financeDayValueVOExtMapper.update(financeSplit.getStartDate(),financeSplit.getExpireDate(),financeSplit.getAmount());
        }
    }
}
