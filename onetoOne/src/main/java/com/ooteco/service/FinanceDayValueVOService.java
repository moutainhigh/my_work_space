package com.ooteco.service;

import com.ooteco.entity.dayValue.model.DayValueVO;
import com.ooteco.entity.financeDayValue.model.FinanceDayValueVO;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by zk on 2017/7/19.
 */
public interface FinanceDayValueVOService {
    void insert(FinanceDayValueVO financeDayValueVO);

    List<FinanceDayValueVO> findHistoryFinanceDayValueVO(Date date);

    BigDecimal findMinNetAmount(Date beginDate, Date endDate);

    BigDecimal findMinPracticalNetAmount(Date beginDate, Date endDate);

    List<FinanceDayValueVO> findFinanceDayValueVOList(Date beginDate, Date endDate);

    void update(Date beginDate, Date endDate, BigDecimal money);

    void addMoney(Date beginDate, Date endDate, BigDecimal money);

    void initFinanceDayValue(int type);
}
