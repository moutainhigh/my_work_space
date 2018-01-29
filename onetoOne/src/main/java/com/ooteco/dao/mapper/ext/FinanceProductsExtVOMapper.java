package com.ooteco.dao.mapper.ext;

import java.util.Date;

public interface FinanceProductsExtVOMapper {
    Date findMinRaiseDate();

    Date findMinCiDate();

    Date findMaxCiDate();
}