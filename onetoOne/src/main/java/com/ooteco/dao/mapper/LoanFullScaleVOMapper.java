package com.ooteco.dao.mapper;

import com.ooteco.entity.loan.model.LoanFullScaleVO;
import com.ooteco.entity.loan.model.LoanFullScaleVOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoanFullScaleVOMapper {
    int countByExample(LoanFullScaleVOExample example);

    int deleteByExample(LoanFullScaleVOExample example);

    int deleteByPrimaryKey(String loanCode);

    int insert(LoanFullScaleVO record);

    int insertSelective(LoanFullScaleVO record);

    List<LoanFullScaleVO> selectByExample(LoanFullScaleVOExample example);

    LoanFullScaleVO selectByPrimaryKey(String loanCode);

    int updateByExampleSelective(@Param("record") LoanFullScaleVO record, @Param("example") LoanFullScaleVOExample example);

    int updateByExample(@Param("record") LoanFullScaleVO record, @Param("example") LoanFullScaleVOExample example);

    int updateByPrimaryKeySelective(LoanFullScaleVO record);

    int updateByPrimaryKey(LoanFullScaleVO record);
}