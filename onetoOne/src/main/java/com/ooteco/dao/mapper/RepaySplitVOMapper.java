package com.ooteco.dao.mapper;

import com.ooteco.entity.repay.model.RepaySplitVO;
import com.ooteco.entity.repay.model.RepaySplitVOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RepaySplitVOMapper {
    int countByExample(RepaySplitVOExample example);

    int deleteByExample(RepaySplitVOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RepaySplitVO record);

    int insertSelective(RepaySplitVO record);

    List<RepaySplitVO> selectByExample(RepaySplitVOExample example);

    RepaySplitVO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RepaySplitVO record, @Param("example") RepaySplitVOExample example);

    int updateByExample(@Param("record") RepaySplitVO record, @Param("example") RepaySplitVOExample example);

    int updateByPrimaryKeySelective(RepaySplitVO record);

    int updateByPrimaryKey(RepaySplitVO record);
}