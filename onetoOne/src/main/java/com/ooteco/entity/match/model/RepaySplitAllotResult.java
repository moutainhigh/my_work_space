package com.ooteco.entity.match.model;

import com.ooteco.entity.repay.model.RepaySplitVO;

import java.math.BigDecimal;

public class RepaySplitAllotResult {

    private RepaySplitVO repaySplit;
    private BigDecimal allotAmount;

    public RepaySplitAllotResult(RepaySplitVO repaySplit, BigDecimal allotAmount){
        this.allotAmount = allotAmount;
        this.repaySplit = repaySplit;
    }

    public RepaySplitAllotResult(RepaySplitVO repaySplit){
        this.allotAmount = repaySplit.getPrincipal();
        this.repaySplit = repaySplit;
    }

    public RepaySplitVO getRepaySplit() {
        return repaySplit;
    }

    public void setRepaySplit(RepaySplitVO repaySplit) {
        this.repaySplit = repaySplit;
    }

    public BigDecimal getAllotAmount() {
        return allotAmount;
    }

    public void setAllotAmount(BigDecimal allotAmount) {
        this.allotAmount = allotAmount;
    }
}
