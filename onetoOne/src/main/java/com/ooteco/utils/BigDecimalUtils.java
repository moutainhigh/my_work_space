package com.ooteco.utils;

import java.math.BigDecimal;
import java.util.List;

public class BigDecimalUtils {

    public static BigDecimal getSumAmount(List<BigDecimal> amount){
        return amount.stream().reduce((a,b) -> a.add(b)).orElse(new BigDecimal(0));
    }

    public static BigDecimal getPrincipal(BigDecimal rate, int period, BigDecimal amount){
        BigDecimal denominator = rate.multiply(new BigDecimal(period)).add(Constant.yearlyDays);
        BigDecimal  molecule = amount.multiply(Constant.yearlyDays);
        return molecule.divide(denominator, Constant.amountUltimateRoundPrecision, BigDecimal.ROUND_HALF_UP);
    }

    public static BigDecimal getInterest(BigDecimal rate, int period, BigDecimal principal){
        return principal.multiply(rate)
                .multiply(new BigDecimal(period))
                .divide(Constant.yearlyDays, Constant.amountUltimateRoundPrecision, BigDecimal.ROUND_HALF_UP);
    }
}
