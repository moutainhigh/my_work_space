package com.ooteco.entity.match.model.resp;

import com.ooteco.entity.match.model.FinanceLoanMatchVO;
import com.ooteco.entity.repay.model.RepaySplitVO;
import com.ooteco.utils.BigDecimalUtils;
import com.ooteco.utils.Constant;
import com.ooteco.utils.DateUtils;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class MatchDetail {

    public Long matchCode;
    public String userCode;
    public String loanCode;
    public Long repayId;
    public BigDecimal loanPrincipal;
    public BigDecimal loanInterest;
    public String startDate;
    public String endDate;
    public String type;
    public String alienator;
    public BigDecimal alienatorPrincipal;
    public BigDecimal alienatorInterest;
    public int periodsTime;

    public MatchDetail(FinanceLoanMatchVO matchVO){
        type = "1";
        matchCode = matchVO.getId();
        userCode = matchVO.getLoanUserCode();
        loanCode = matchVO.getLoanCode();
        repayId = matchVO.getRepayId();
        int period = DateUtils.getDiffDays(matchVO.getLoanExpireDate(), matchVO.getLoanStartDate());
        loanPrincipal = matchVO.getAllotAmount();
        loanInterest = BigDecimalUtils.getInterest(matchVO.getLoanRate(),period,loanPrincipal);
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        startDate = dateFormat.format(matchVO.getLoanStartDate());
        endDate = dateFormat.format(matchVO.getLoanExpireDate());
        periodsTime = matchVO.getPeriodsTime();
    }

}
