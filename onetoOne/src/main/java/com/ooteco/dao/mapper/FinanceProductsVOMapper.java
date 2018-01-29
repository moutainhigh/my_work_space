package com.ooteco.dao.mapper;

import com.ooteco.entity.financeProducts.model.FinanceProductsVO;
import com.ooteco.entity.financeProducts.model.FinanceProductsVOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinanceProductsVOMapper {
    int countByExample(FinanceProductsVOExample example);

    int deleteByExample(FinanceProductsVOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FinanceProductsVO record);

    int insertSelective(FinanceProductsVO record);

    List<FinanceProductsVO> selectByExample(FinanceProductsVOExample example);

    FinanceProductsVO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FinanceProductsVO record, @Param("example") FinanceProductsVOExample example);

    int updateByExample(@Param("record") FinanceProductsVO record, @Param("example") FinanceProductsVOExample example);

    int updateByPrimaryKeySelective(FinanceProductsVO record);

    int updateByPrimaryKey(FinanceProductsVO record);
}