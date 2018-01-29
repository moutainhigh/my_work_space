package com.ooteco.dao.mapper;

import com.ooteco.entity.weekValue.model.WeekValueVO;
import com.ooteco.entity.weekValue.model.WeekValueVOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WeekValueVOMapper {
    int countByExample(WeekValueVOExample example);

    int deleteByExample(WeekValueVOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WeekValueVO record);

    int insertSelective(WeekValueVO record);

    List<WeekValueVO> selectByExample(WeekValueVOExample example);

    WeekValueVO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WeekValueVO record, @Param("example") WeekValueVOExample example);

    int updateByExample(@Param("record") WeekValueVO record, @Param("example") WeekValueVOExample example);

    int updateByPrimaryKeySelective(WeekValueVO record);

    int updateByPrimaryKey(WeekValueVO record);
}