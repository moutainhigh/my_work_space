package com.ooteco.dao.mapper.ext;

import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface LoanFullScaleExtVOMapper {

    List<String> getFullScaleLoans();
}