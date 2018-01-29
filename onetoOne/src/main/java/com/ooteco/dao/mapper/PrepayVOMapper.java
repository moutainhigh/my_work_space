package com.ooteco.dao.mapper;

import com.ooteco.entity.repay.model.PrepayVO;
import com.ooteco.entity.repay.model.PrepayVOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PrepayVOMapper {
    int countByExample(PrepayVOExample example);

    int deleteByExample(PrepayVOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PrepayVO record);

    int insertSelective(PrepayVO record);

    List<PrepayVO> selectByExample(PrepayVOExample example);

    PrepayVO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PrepayVO record, @Param("example") PrepayVOExample example);

    int updateByExample(@Param("record") PrepayVO record, @Param("example") PrepayVOExample example);

    int updateByPrimaryKeySelective(PrepayVO record);

    int updateByPrimaryKey(PrepayVO record);
}