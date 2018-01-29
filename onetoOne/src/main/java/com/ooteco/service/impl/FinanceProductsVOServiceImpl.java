package com.ooteco.service.impl;

import com.ooteco.dao.mapper.FinanceProductsVOMapper;
import com.ooteco.dao.mapper.ext.FinanceProductsExtVOMapper;
import com.ooteco.entity.financeProducts.model.FinanceProductsVO;
import com.ooteco.entity.financeProducts.model.FinanceProductsVOExample;
import com.ooteco.service.FinanceProductsVOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by zk on 2017/7/18.
 */
@Service("financeProductsVOService")
public class FinanceProductsVOServiceImpl implements FinanceProductsVOService {

    @Autowired
    FinanceProductsVOMapper financeProductsVOMapper;
    @Autowired
    FinanceProductsExtVOMapper financeProductsExtVOMapper;

    @Override
    public List<FinanceProductsVO> findList() {
        FinanceProductsVOExample example = new FinanceProductsVOExample();
        example.setOrderByClause(" id");
        return financeProductsVOMapper.selectByExample(example);
    }

    @Override
    public Date findMinRaiseDate() {
        return financeProductsExtVOMapper.findMinRaiseDate();
    }

    @Override
    public Date findMinCiDate() {
        return financeProductsExtVOMapper.findMinCiDate();
    }

    @Override
    public Date findMaxCiDate() {
        return financeProductsExtVOMapper.findMaxCiDate();
    }

    @Override
    public List<FinanceProductsVO> findListByDay(Date date) {
        FinanceProductsVOExample example = new FinanceProductsVOExample();
        FinanceProductsVOExample.Criteria criteria = example.createCriteria();
        criteria.andCarryInterestDateEqualTo(date);
        criteria.andStatusNotEqualTo("流标");
        return financeProductsVOMapper.selectByExample(example);
    }

    @Override
    public List<FinanceProductsVO> findListByWeekDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, 7);
        FinanceProductsVOExample example = new FinanceProductsVOExample();
        FinanceProductsVOExample.Criteria criteria = example.createCriteria();
        criteria.andCarryInterestDateBetween(date, calendar.getTime());
        criteria.andStatusNotEqualTo("流标");
        return financeProductsVOMapper.selectByExample(example);
    }

    @Override
    public List<FinanceProductsVO> findHistoryDaysFinanceProductsVOList(Date date) {
        FinanceProductsVOExample example = new FinanceProductsVOExample();
        FinanceProductsVOExample.Criteria criteria = example.createCriteria();
        criteria.andExpireDateEqualTo(date);
        criteria.andStatusNotEqualTo("流标");
        return financeProductsVOMapper.selectByExample(example);
    }
}
