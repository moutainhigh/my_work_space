package com.ooteco.dao.mapper.ext;

import com.ooteco.entity.finance.model.FinanceVO;
import com.ooteco.entity.finance.model.FinanceVOExample;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface FinanceVOExtMapper {
    List<FinanceVO> selectBySuperUser(@Param("userCode") String userCode);

    BigDecimal getFinanceResidueLimit(@Param("month") int month,@Param("date") String date);

    FinanceVO getLastMatchFinance();
}