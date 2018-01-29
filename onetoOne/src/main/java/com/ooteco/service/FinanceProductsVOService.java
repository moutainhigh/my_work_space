package com.ooteco.service;

import com.ooteco.entity.financeProducts.model.FinanceProductsVO;

import java.util.Date;
import java.util.List;

/**
 * Created by zk on 2017/7/18.
 */
public interface FinanceProductsVOService {
    List<FinanceProductsVO> findList();

    Date findMinRaiseDate();

    Date findMinCiDate();

    Date findMaxCiDate();

    List<FinanceProductsVO> findListByDay(Date date);

    List<FinanceProductsVO> findListByWeekDay(Date date);

    List<FinanceProductsVO> findHistoryDaysFinanceProductsVOList(Date date);
}
