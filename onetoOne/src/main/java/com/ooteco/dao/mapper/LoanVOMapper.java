package com.ooteco.dao.mapper;

import com.ooteco.entity.loan.model.LoanVO;
import com.ooteco.entity.loan.model.LoanVOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoanVOMapper {
    int countByExample(LoanVOExample example);

    int deleteByExample(LoanVOExample example);

    int deleteByPrimaryKey(String loanCode);

    int insert(LoanVO record);

    int insertSelective(LoanVO record);

    List<LoanVO> selectByExample(LoanVOExample example);

    LoanVO selectByPrimaryKey(String loanCode);

    int updateByExampleSelective(@Param("record") LoanVO record, @Param("example") LoanVOExample example);

    int updateByExample(@Param("record") LoanVO record, @Param("example") LoanVOExample example);

    int updateByPrimaryKeySelective(LoanVO record);

    int updateByPrimaryKey(LoanVO record);
}