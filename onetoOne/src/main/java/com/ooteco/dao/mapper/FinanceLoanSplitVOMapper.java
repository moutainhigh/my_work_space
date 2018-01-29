package com.ooteco.dao.mapper;

import com.ooteco.entity.split.model.FinanceLoanSplitVO;
import com.ooteco.entity.split.model.FinanceLoanSplitVOExample;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinanceLoanSplitVOMapper {
    int countByExample(FinanceLoanSplitVOExample example);

    int deleteByExample(FinanceLoanSplitVOExample example);

    int deleteByPrimaryKey(Date splitDate);

    int insert(FinanceLoanSplitVO record);

    int insertSelective(FinanceLoanSplitVO record);

    List<FinanceLoanSplitVO> selectByExample(FinanceLoanSplitVOExample example);

    FinanceLoanSplitVO selectByPrimaryKey(Date splitDate);

    int updateByExampleSelective(@Param("record") FinanceLoanSplitVO record, @Param("example") FinanceLoanSplitVOExample example);

    int updateByExample(@Param("record") FinanceLoanSplitVO record, @Param("example") FinanceLoanSplitVOExample example);

    int updateByPrimaryKeySelective(FinanceLoanSplitVO record);

    int updateByPrimaryKey(FinanceLoanSplitVO record);
}