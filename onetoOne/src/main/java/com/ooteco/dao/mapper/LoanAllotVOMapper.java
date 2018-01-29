package com.ooteco.dao.mapper;

import com.ooteco.entity.loan.model.LoanAllotVO;
import com.ooteco.entity.loan.model.LoanAllotVOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoanAllotVOMapper {
    int countByExample(LoanAllotVOExample example);

    int deleteByExample(LoanAllotVOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LoanAllotVO record);

    int insertSelective(LoanAllotVO record);

    List<LoanAllotVO> selectByExample(LoanAllotVOExample example);

    LoanAllotVO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LoanAllotVO record, @Param("example") LoanAllotVOExample example);

    int updateByExample(@Param("record") LoanAllotVO record, @Param("example") LoanAllotVOExample example);

    int updateByPrimaryKeySelective(LoanAllotVO record);

    int updateByPrimaryKey(LoanAllotVO record);
}