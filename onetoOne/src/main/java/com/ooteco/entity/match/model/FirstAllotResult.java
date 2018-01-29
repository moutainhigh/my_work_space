package com.ooteco.entity.match.model;

import java.math.BigDecimal;
import java.util.List;

public class FirstAllotResult {

    private BigDecimal totalAllotAmount;
    private List<RepaySplitAllotResult> allotResults;
    private List<RepaySplitAllotResult> suitableAllotResults;
    private List<BigDecimal> lessAllotAmounts;

    public FirstAllotResult(BigDecimal totalAllotAmount, List<RepaySplitAllotResult> allotResults
            , List<RepaySplitAllotResult> suitableAllotResults, List<BigDecimal> lessAllotAmounts){
        this.totalAllotAmount = totalAllotAmount;
        this.suitableAllotResults = suitableAllotResults;
        this.allotResults = allotResults;
        this.lessAllotAmounts = lessAllotAmounts;
    }

    public BigDecimal getTotalAllotAmount() {
        return totalAllotAmount;
    }

    public void setTotalAllotAmount(BigDecimal totalAllotAmount) {
        this.totalAllotAmount = totalAllotAmount;
    }

    public List<RepaySplitAllotResult> getAllotResults() {
        return allotResults;
    }

    public void setAllotResults(List<RepaySplitAllotResult> allotResults) {
        this.allotResults = allotResults;
    }

    public List<RepaySplitAllotResult> getSuitableAllotResults() {
        return suitableAllotResults;
    }

    public void setSuitableAllotResults(List<RepaySplitAllotResult> suitableAllotResults) {
        this.suitableAllotResults = suitableAllotResults;
    }

    public List<BigDecimal> getLessAllotAmounts() {
        return lessAllotAmounts;
    }

    public void setLessAllotAmounts(List<BigDecimal> lessAllotAmounts) {
        this.lessAllotAmounts = lessAllotAmounts;
    }
}
