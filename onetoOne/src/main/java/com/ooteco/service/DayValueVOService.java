package com.ooteco.service;

import com.ooteco.entity.dayValue.model.DayValueVO;

import java.util.Date;
import java.util.List;

/**
 * Created by zk on 2017/7/19.
 */
public interface DayValueVOService {
    void insert(DayValueVO dayValueVO);

    List<DayValueVO> findHistoryDayValueVO(Date date);
}
