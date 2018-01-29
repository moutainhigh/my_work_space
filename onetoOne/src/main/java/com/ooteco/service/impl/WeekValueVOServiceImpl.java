package com.ooteco.service.impl;

import com.ooteco.dao.mapper.WeekValueVOMapper;
import com.ooteco.entity.weekValue.model.WeekValueVO;
import com.ooteco.entity.weekValue.model.WeekValueVOExample;
import com.ooteco.service.WeekValueVOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by zk on 2017/8/4.
 */
@Service("weekValueVOService")
public class WeekValueVOServiceImpl implements WeekValueVOService {

    @Autowired
    WeekValueVOMapper weekValueVOMapper;

    @Override
    public void insert(WeekValueVO weekValueVO) {
        weekValueVOMapper.insert(weekValueVO);
    }

    @Override
    public WeekValueVO findHistoryDayValueVO(Date date) {
        WeekValueVOExample example = new WeekValueVOExample();
        WeekValueVOExample.Criteria criteria = example.createCriteria();
        criteria.andTimeEqualTo(date);
        return weekValueVOMapper.selectByExample(example).get(0);
    }
}
