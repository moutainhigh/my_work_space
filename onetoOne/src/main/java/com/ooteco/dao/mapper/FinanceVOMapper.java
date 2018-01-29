package com.ooteco.dao.mapper;

import com.ooteco.entity.finance.model.FinanceVO;
import com.ooteco.entity.finance.model.FinanceVOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinanceVOMapper {
    int countByExample(FinanceVOExample example);

    int deleteByExample(FinanceVOExample example);

    int deleteByPrimaryKey(String financeCode);

    int insert(FinanceVO record);

    int insertSelective(FinanceVO record);

    List<FinanceVO> selectByExample(FinanceVOExample example);

    FinanceVO selectByPrimaryKey(String financeCode);

    int updateByExampleSelective(@Param("record") FinanceVO record, @Param("example") FinanceVOExample example);

    int updateByExample(@Param("record") FinanceVO record, @Param("example") FinanceVOExample example);

    int updateByPrimaryKeySelective(FinanceVO record);

    int updateByPrimaryKey(FinanceVO record);
}