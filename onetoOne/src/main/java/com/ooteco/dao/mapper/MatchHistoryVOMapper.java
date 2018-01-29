package com.ooteco.dao.mapper;

import com.ooteco.entity.match.model.MatchHistoryVO;
import com.ooteco.entity.match.model.MatchHistoryVOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MatchHistoryVOMapper {
    int countByExample(MatchHistoryVOExample example);

    int deleteByExample(MatchHistoryVOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MatchHistoryVO record);

    int insertSelective(MatchHistoryVO record);

    List<MatchHistoryVO> selectByExample(MatchHistoryVOExample example);

    MatchHistoryVO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MatchHistoryVO record, @Param("example") MatchHistoryVOExample example);

    int updateByExample(@Param("record") MatchHistoryVO record, @Param("example") MatchHistoryVOExample example);

    int updateByPrimaryKeySelective(MatchHistoryVO record);

    int updateByPrimaryKey(MatchHistoryVO record);
}