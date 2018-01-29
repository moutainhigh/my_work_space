package com.ooteco.entity.match.model;

import com.ooteco.entity.repay.model.RepaySplitVO;

import java.math.BigDecimal;
import java.util.*;

public class AllotInterimVO {

//    public List<RepaySplitAllotResult> suitableResults;
    public List<RepaySplitAllotResult> restResults;
    public List<RepaySplitAllotResult> singleUserResults;
    public BigDecimal financeAmount;
    public BigDecimal averageAmount;
    public BigDecimal hasAllotTotalAmount;
    public List<RepaySplitAllotResult> allotResults;

    public AllotInterimVO(BigDecimal financeAmount, int allotment){
        averageAmount = getAverageAllotAmount(financeAmount, allotment);
        this.financeAmount = financeAmount;
        hasAllotTotalAmount = new BigDecimal(0);
        restResults = new ArrayList<>();
        allotResults = new ArrayList<>();
    }

    public List<RepaySplitAllotResult> allot(List<RepaySplitAllotResult> suitableResults){
        allotAlg(suitableResults);
        return statAllotResults(allotResults);
    }

    public void allotAlg(List<RepaySplitAllotResult> suitableResults){
        if(suitableResults.size() > 0){
            selectSingleUserResults(suitableResults);
            List<RepaySplitAllotResult> amountOverResults = new ArrayList<>();
            for(RepaySplitAllotResult singleUserResult : singleUserResults){
                BigDecimal needAllotAmount = averageAmount;
                BigDecimal remainAmount = singleUserResult.getAllotAmount();
                if(hasAllotTotalAmount.add(averageAmount).compareTo(financeAmount) > 0){
                    needAllotAmount = financeAmount.subtract(hasAllotTotalAmount);
                }
                int compareResult = needAllotAmount.compareTo(remainAmount);
                if(compareResult > 0){
                    allotResults.add(new RepaySplitAllotResult(singleUserResult.getRepaySplit()
                            , remainAmount));
                    hasAllotTotalAmount = hasAllotTotalAmount.add(remainAmount);
                }else {
                    allotResults.add(new RepaySplitAllotResult(singleUserResult.getRepaySplit()
                            , needAllotAmount));
                    hasAllotTotalAmount = hasAllotTotalAmount.add(needAllotAmount);
                    if(compareResult < 0){
                        amountOverResults.add(new RepaySplitAllotResult(singleUserResult.getRepaySplit(), remainAmount.subtract(needAllotAmount)));
                    }
                }
                if(hasAllotTotalAmount.compareTo(financeAmount) == 0){
                    break;
                }
            }
            if(hasAllotTotalAmount.compareTo(financeAmount) < 0){
                amountOverResults.addAll(restResults);
                allotAlg(amountOverResults);
            }
        }
    }

    private void selectSingleUserResults(List<RepaySplitAllotResult> results){
        Map<String,Integer> allotUserMap = new HashMap<>();
        singleUserResults = new ArrayList<>();
        restResults = new ArrayList<>();
        for(RepaySplitAllotResult result : results){
            RepaySplitVO repaySplit = result.getRepaySplit();
            String userCode = repaySplit.getUserCode();
            if(allotUserMap.get(userCode) == null){
                allotUserMap.put(userCode,1);
                singleUserResults.add(result);
            }else {
                restResults.add(result);
            }
        }
    }

    private BigDecimal getAverageAllotAmount(BigDecimal amount, int allotment){
        return amount.divide(new BigDecimal(allotment),0);
    }

    private List<RepaySplitAllotResult> statAllotResults(List<RepaySplitAllotResult> results){
        sortAllotResult(results);
        return groupAllotResult(results);
    }

    private void sortAllotResult(List<RepaySplitAllotResult> results){
        Collections.sort(results, new Comparator<RepaySplitAllotResult>() {
            @Override
            public int compare(RepaySplitAllotResult o1, RepaySplitAllotResult o2) {
                return (int)(o1.getRepaySplit().getId() - o2.getRepaySplit().getId());
            }
        });
    }

    private List<RepaySplitAllotResult> groupAllotResult(List<RepaySplitAllotResult> results){
        if(results.size() <= 1){
            return results;
        }
        BigDecimal groupSumAmount = null;
        RepaySplitVO preRepaySplit = null;
        List<RepaySplitAllotResult> groupResults = new ArrayList<>();
        RepaySplitAllotResult addedResult = null;
        for(int i=0;i<results.size();i++){
            RepaySplitAllotResult result = results.get(i);
            if(groupResults.size() == 0){
                addedResult = new RepaySplitAllotResult(result.getRepaySplit(), result.getAllotAmount());
                preRepaySplit = result.getRepaySplit();
                groupSumAmount = result.getAllotAmount();
                groupResults.add(addedResult);
                continue;
            }
            if(preRepaySplit.getId().equals(result.getRepaySplit().getId())){
                groupSumAmount = groupSumAmount.add(result.getAllotAmount());
                if(i == results.size() -1){
                    addedResult.setAllotAmount(groupSumAmount);
                }
            }else{
                addedResult.setAllotAmount(groupSumAmount);
                addedResult = new RepaySplitAllotResult(result.getRepaySplit(), result.getAllotAmount());
                preRepaySplit = result.getRepaySplit();
                groupSumAmount = result.getAllotAmount();
                groupResults.add(addedResult);
            }
        }
        return groupResults;
    }
}
