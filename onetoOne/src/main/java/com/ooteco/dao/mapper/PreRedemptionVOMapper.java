package com.ooteco.dao.mapper;

import com.ooteco.entity.finance.model.PreRedemptionVO;
import com.ooteco.entity.finance.model.PreRedemptionVOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PreRedemptionVOMapper {
    int countByExample(PreRedemptionVOExample example);

    int deleteByExample(PreRedemptionVOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PreRedemptionVO record);

    int insertSelective(PreRedemptionVO record);

    List<PreRedemptionVO> selectByExample(PreRedemptionVOExample example);

    PreRedemptionVO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PreRedemptionVO record, @Param("example") PreRedemptionVOExample example);

    int updateByExample(@Param("record") PreRedemptionVO record, @Param("example") PreRedemptionVOExample example);

    int updateByPrimaryKeySelective(PreRedemptionVO record);

    int updateByPrimaryKey(PreRedemptionVO record);
}