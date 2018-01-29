package com.ooteco.dao.mapper;

import com.ooteco.entity.finance.model.FinanceProductVO;
import com.ooteco.entity.finance.model.FinanceProductVOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinanceProductVOMapper {
    int countByExample(FinanceProductVOExample example);

    int deleteByExample(FinanceProductVOExample example);

    int deleteByPrimaryKey(Integer financeProductsId);

    int insert(FinanceProductVO record);

    int insertSelective(FinanceProductVO record);

    List<FinanceProductVO> selectByExample(FinanceProductVOExample example);

    FinanceProductVO selectByPrimaryKey(Integer financeProductsId);

    int updateByExampleSelective(@Param("record") FinanceProductVO record, @Param("example") FinanceProductVOExample example);

    int updateByExample(@Param("record") FinanceProductVO record, @Param("example") FinanceProductVOExample example);

    int updateByPrimaryKeySelective(FinanceProductVO record);

    int updateByPrimaryKey(FinanceProductVO record);
}