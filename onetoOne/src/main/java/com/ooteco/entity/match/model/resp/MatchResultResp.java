package com.ooteco.entity.match.model.resp;

import com.ooteco.entity.match.model.FinanceLoanMatchVO;
import com.ooteco.utils.BigDecimalUtils;
import com.ooteco.utils.DateUtils;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class MatchResultResp {

    public String endDate;
    public String financeCode;
    public Integer financeProductsId;
    public String loanCode;
    public BigDecimal loanMoney;
    public Long matchCode;
    public String matchTime;
    public String startDate;
    public String userCode;
    public Integer periodsTime;
    public String alienator;
    public BigDecimal alienatorPrincipal;
    public BigDecimal alienatorInterest;
    public BigDecimal loanPrincipal;
    public BigDecimal loanInterest;
    public String type = "1";

    public MatchResultResp(FinanceLoanMatchVO matchVO){
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        DateFormat timeStampDateFormat = new SimpleDateFormat("yyyyMMddHHssmm");
        endDate = dateFormat.format(matchVO.getLoanExpireDate());
        startDate = dateFormat.format(matchVO.getLoanStartDate());
        financeCode = matchVO.getFinanceCode();
        financeProductsId = matchVO.getFinanceProductsId();
        loanCode = matchVO.getLoanCode();
        loanPrincipal = matchVO.getAllotAmount();
        loanInterest = BigDecimalUtils.getInterest(matchVO.getLoanRate()
                , DateUtils.getDiffDays(matchVO.getLoanStartDate(),matchVO.getLoanExpireDate()), loanPrincipal);
        loanMoney = loanPrincipal.add(loanInterest);
        matchCode = matchVO.getId();
        matchTime = timeStampDateFormat.format(matchVO.getCreateDate());
        userCode = matchVO.getLoanUserCode();
        periodsTime = matchVO.getPeriodsTime();
    }
}
