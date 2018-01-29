package com.ooteco.dao.mapper;

import com.ooteco.entity.repay.model.RepayVO;
import com.ooteco.entity.repay.model.RepayVOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RepayVOMapper {
    int countByExample(RepayVOExample example);

    int deleteByExample(RepayVOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RepayVO record);

    int insertSelective(RepayVO record);

    List<RepayVO> selectByExample(RepayVOExample example);

    RepayVO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RepayVO record, @Param("example") RepayVOExample example);

    int updateByExample(@Param("record") RepayVO record, @Param("example") RepayVOExample example);

    int updateByPrimaryKeySelective(RepayVO record);

    int updateByPrimaryKey(RepayVO record);
}