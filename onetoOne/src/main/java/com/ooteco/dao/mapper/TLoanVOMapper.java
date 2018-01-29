package com.ooteco.dao.mapper;

import com.ooteco.entity.tloan.model.TLoanVO;
import com.ooteco.entity.tloan.model.TLoanVOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TLoanVOMapper {
    int countByExample(TLoanVOExample example);

    int deleteByExample(TLoanVOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TLoanVO record);

    int insertSelective(TLoanVO record);

    List<TLoanVO> selectByExample(TLoanVOExample example);

    TLoanVO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TLoanVO record, @Param("example") TLoanVOExample example);

    int updateByExample(@Param("record") TLoanVO record, @Param("example") TLoanVOExample example);

    int updateByPrimaryKeySelective(TLoanVO record);

    int updateByPrimaryKey(TLoanVO record);
}