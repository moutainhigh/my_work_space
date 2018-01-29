package com.ooteco.dao.mapper.ext;

import java.util.Date;

/**
 * Created by zk on 2017/8/30.
 */
public interface RepayExtVOMapper {
    Date findMinDate();

    Date findMaxDate();
}
