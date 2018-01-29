package com.ooteco.dao.mapper;

import com.ooteco.entity.loanAllocation.model.LoanAllocation;
import com.ooteco.entity.loanAllocation.model.LoanAllocationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoanAllocationMapper {
    int countByExample(LoanAllocationExample example);

    int deleteByExample(LoanAllocationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LoanAllocation record);

    int insertSelective(LoanAllocation record);

    List<LoanAllocation> selectByExample(LoanAllocationExample example);

    LoanAllocation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LoanAllocation record, @Param("example") LoanAllocationExample example);

    int updateByExample(@Param("record") LoanAllocation record, @Param("example") LoanAllocationExample example);

    int updateByPrimaryKeySelective(LoanAllocation record);

    int updateByPrimaryKey(LoanAllocation record);
}