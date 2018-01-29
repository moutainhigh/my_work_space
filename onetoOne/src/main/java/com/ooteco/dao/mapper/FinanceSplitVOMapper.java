package com.ooteco.dao.mapper;

import com.ooteco.entity.finance.model.FinanceSplitVO;
import com.ooteco.entity.finance.model.FinanceSplitVOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinanceSplitVOMapper {
    int countByExample(FinanceSplitVOExample example);

    int deleteByExample(FinanceSplitVOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FinanceSplitVO record);

    int insertSelective(FinanceSplitVO record);

    List<FinanceSplitVO> selectByExample(FinanceSplitVOExample example);

    FinanceSplitVO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FinanceSplitVO record, @Param("example") FinanceSplitVOExample example);

    int updateByExample(@Param("record") FinanceSplitVO record, @Param("example") FinanceSplitVOExample example);

    int updateByPrimaryKeySelective(FinanceSplitVO record);

    int updateByPrimaryKey(FinanceSplitVO record);
}