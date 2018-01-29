package com.ooteco.dao.mapper.ext;

import com.ooteco.entity.repay.model.RepaySplitVO;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface RepaySplitExtVOMapper {

    RepaySplitVO getSamePeriodMergedRepaySplit(@Param("repayId") Long repayId);

    List<RepaySplitVO> getFinanceSuitableRepays(@Param("startDate")Date startDate, @Param("expireDate") Date expireDate);

    List<RepaySplitVO> getAfterAllotRemainSuitableRepays(@Param("startDate")Date startDate, @Param("expireDate") Date expireDate);

    List<RepaySplitVO> getLessThanFinancePeriodRepays(@Param("startDate")Date startDate, @Param("expireDate") Date expireDate);

    Date findMinDate();

    Date findMaxDate();

    BigDecimal getTodayLimit();
}
