package com.ooteco.dao.mapper.ext;

import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.Date;

public interface FinanceSplitExtVOMapper {

    int insertPrepayFinance(@Param("prepayDate") Date prepayDate, @Param("loanCode") String loanCode);

    int updateUncompletedFinanceStartDate();

    BigDecimal getCurrentTotalAmount();
}
