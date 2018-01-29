package com.ooteco.dao.mapper;

import com.ooteco.entity.match.model.FinanceLoanMatchVO;
import com.ooteco.entity.match.model.FinanceLoanMatchVOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinanceLoanMatchVOMapper {
    int countByExample(FinanceLoanMatchVOExample example);

    int deleteByExample(FinanceLoanMatchVOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FinanceLoanMatchVO record);

    int insertSelective(FinanceLoanMatchVO record);

    List<FinanceLoanMatchVO> selectByExample(FinanceLoanMatchVOExample example);

    FinanceLoanMatchVO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FinanceLoanMatchVO record, @Param("example") FinanceLoanMatchVOExample example);

    int updateByExample(@Param("record") FinanceLoanMatchVO record, @Param("example") FinanceLoanMatchVOExample example);

    int updateByPrimaryKeySelective(FinanceLoanMatchVO record);

    int updateByPrimaryKey(FinanceLoanMatchVO record);
}