package com.ooteco.dao.mapper;

import com.ooteco.entity.dayValue.model.DayValueVO;
import com.ooteco.entity.dayValue.model.DayValueVOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DayValueVOMapper {
    int countByExample(DayValueVOExample example);

    int deleteByExample(DayValueVOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DayValueVO record);

    int insertSelective(DayValueVO record);

    List<DayValueVO> selectByExample(DayValueVOExample example);

    DayValueVO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DayValueVO record, @Param("example") DayValueVOExample example);

    int updateByExample(@Param("record") DayValueVO record, @Param("example") DayValueVOExample example);

    int updateByPrimaryKeySelective(DayValueVO record);

    int updateByPrimaryKey(DayValueVO record);
}