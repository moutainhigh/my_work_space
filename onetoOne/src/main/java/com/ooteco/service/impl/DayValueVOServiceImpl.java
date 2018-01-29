package com.ooteco.service.impl;

import com.ooteco.dao.mapper.DayValueVOMapper;
import com.ooteco.entity.dayValue.model.DayValueVO;
import com.ooteco.entity.dayValue.model.DayValueVOExample;
import com.ooteco.service.DayValueVOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by zk on 2017/7/19.
 */
@Service("dayValueVOService")
public class DayValueVOServiceImpl implements DayValueVOService {

    @Autowired
    DayValueVOMapper dayValueVOMapper;

    @Override
    public void insert(DayValueVO dayValueVO) {
        dayValueVOMapper.insert(dayValueVO);
    }

    @Override
    public List<DayValueVO> findHistoryDayValueVO(Date date) {
        DayValueVOExample example = new DayValueVOExample();
        DayValueVOExample.Criteria criteria = example.createCriteria();
        criteria.andTimeEqualTo(date);
        return dayValueVOMapper.selectByExample(example);
    }


}
