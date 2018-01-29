package com.ooteco.entity.match.model;

import java.util.List;

public class SuitableLoanData {

    public List<RepaySplitAllotResult> distinctUserLoans;

    public List<RepaySplitAllotResult> restUserLoans;

    public SuitableLoanData(List<RepaySplitAllotResult> distinctUserLoans, List<RepaySplitAllotResult> restUserLoans){
        this.distinctUserLoans = distinctUserLoans;
        this.restUserLoans = restUserLoans;
    }
}
