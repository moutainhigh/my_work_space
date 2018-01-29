package com.ooteco.dao.mapper.ext;

import com.ooteco.entity.financeDayValue.model.FinanceDayValueVO;
import com.ooteco.entity.financeDayValue.model.FinanceDayValueVOExample;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface FinanceDayValueVOExtMapper {
    BigDecimal findMinNetAmount(@Param("beginDate") Date beginDate,@Param("endDate") Date endDate);

    BigDecimal findMinPracticalNetAmount(@Param("beginDate") Date beginDate,@Param("endDate") Date endDate);

    void update(@Param("beginDate") Date startDate,@Param("endDate") Date date,@Param("money") BigDecimal money);

    void addMoney(@Param("beginDate") Date startDate,@Param("endDate") Date date,@Param("money") BigDecimal money);

    BigDecimal financeDayValue(@Param("date") String date);

    void deleteFinanceDayValue();
}