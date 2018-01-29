package com.ooteco.service;

import com.ooteco.entity.weekValue.model.WeekValueVO;

import java.util.Date;

/**
 * Created by zk on 2017/8/4.
 */
public interface WeekValueVOService {
    void insert(WeekValueVO weekValueVO);

    WeekValueVO findHistoryDayValueVO(Date date);
}
