package com.ooteco.dao.mapper;

import com.ooteco.entity.financeDayValue.model.FinanceDayValueVO;
import com.ooteco.entity.financeDayValue.model.FinanceDayValueVOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinanceDayValueVOMapper {
    int countByExample(FinanceDayValueVOExample example);

    int deleteByExample(FinanceDayValueVOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FinanceDayValueVO record);

    int insertSelective(FinanceDayValueVO record);

    List<FinanceDayValueVO> selectByExample(FinanceDayValueVOExample example);

    FinanceDayValueVO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FinanceDayValueVO record, @Param("example") FinanceDayValueVOExample example);

    int updateByExample(@Param("record") FinanceDayValueVO record, @Param("example") FinanceDayValueVOExample example);

    int updateByPrimaryKeySelective(FinanceDayValueVO record);

    int updateByPrimaryKey(FinanceDayValueVO record);
}