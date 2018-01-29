package com.ooteco.dao.mapper;

import com.ooteco.entity.financialSale.model.FinancialSaleVO;
import com.ooteco.entity.financialSale.model.FinancialSaleVOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinancialSaleVOMapper {
    int countByExample(FinancialSaleVOExample example);

    int deleteByExample(FinancialSaleVOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FinancialSaleVO record);

    int insertSelective(FinancialSaleVO record);

    List<FinancialSaleVO> selectByExample(FinancialSaleVOExample example);

    FinancialSaleVO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FinancialSaleVO record, @Param("example") FinancialSaleVOExample example);

    int updateByExample(@Param("record") FinancialSaleVO record, @Param("example") FinancialSaleVOExample example);

    int updateByPrimaryKeySelective(FinancialSaleVO record);

    int updateByPrimaryKey(FinancialSaleVO record);
}