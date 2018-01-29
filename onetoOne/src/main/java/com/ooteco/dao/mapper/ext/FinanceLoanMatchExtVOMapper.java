package com.ooteco.dao.mapper.ext;

import com.ooteco.entity.finance.model.FinanceSplitVO;
import com.ooteco.entity.loan.model.resp.LoanFullScaleDetail;
import com.ooteco.entity.match.model.FinanceLoanMatchExtVO;
import com.ooteco.entity.match.model.FinanceLoanMatchVO;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface FinanceLoanMatchExtVOMapper {

    int updatePrepayLoanMatchedFinance(@Param("loanCode")String loanCode, @Param("prepayDate")Date prepayDate);

    int updatePreRedeemFinanceMatchedLoan(@Param("financeCode")String financeCode, @Param("preRedeemDate")Date preRedeemDate);

    List<LoanFullScaleDetail> getFullScaleLoanAllotDetails(@Param("loanCode") String loanCOde);

    BigDecimal getSuperAccountPurchaseMoney(@Param("date") Date date);

    List<String> getNeverMatchedLoanCodes();

    List<FinanceLoanMatchExtVO> getLoanExpireButFinanceNotExpireRecords(@Param("currentDate") Date currentDate);

    BigDecimal getTotalMatchAmount();
}
