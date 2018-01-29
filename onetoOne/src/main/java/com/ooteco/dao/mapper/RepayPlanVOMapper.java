package com.ooteco.dao.mapper;

import com.ooteco.entity.repay.model.RepayPlanVO;
import com.ooteco.entity.repay.model.RepayPlanVOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RepayPlanVOMapper {
    int countByExample(RepayPlanVOExample example);

    int deleteByExample(RepayPlanVOExample example);

    int deleteByPrimaryKey(Long repaymentPlanId);

    int insert(RepayPlanVO record);

    int insertSelective(RepayPlanVO record);

    List<RepayPlanVO> selectByExample(RepayPlanVOExample example);

    RepayPlanVO selectByPrimaryKey(Long repaymentPlanId);

    int updateByExampleSelective(@Param("record") RepayPlanVO record, @Param("example") RepayPlanVOExample example);

    int updateByExample(@Param("record") RepayPlanVO record, @Param("example") RepayPlanVOExample example);

    int updateByPrimaryKeySelective(RepayPlanVO record);

    int updateByPrimaryKey(RepayPlanVO record);
}