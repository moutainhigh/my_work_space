package com.ooteco.service.biz;

import com.ooteco.dao.mapper.FinanceLoanMatchVOMapper;
import com.ooteco.dao.mapper.ext.FinanceLoanMatchExtVOMapper;
import com.ooteco.entity.finance.model.FinanceSplitVO;
import com.ooteco.entity.finance.model.FinanceVO;
import com.ooteco.entity.finance.model.PreRedemptionVO;
import com.ooteco.entity.match.model.*;
import com.ooteco.entity.match.model.resp.*;
import com.ooteco.entity.repay.model.RepaySplitVO;
import com.ooteco.utils.BigDecimalUtils;
import com.ooteco.utils.Constant;
import com.ooteco.utils.DateUtils;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Service("financeLoanMatchVOServiceBiz")
public class FinanceLoanMatchVOServiceBiz {

    @Resource
    private FinanceLoanMatchVOMapper financeLoanMatchVOMapper;
    @Resource
    private FinanceLoanMatchExtVOMapper financeLoanMatchExtVOMapper;
    @Resource
    private RepaySplitVOServiceBiz repaySplitVOServiceBiz;
    @Resource
    private FinanceSplitVOServiceBiz financeSplitVOServiceBiz;
    @Resource
    private MatchHistoryVOServiceBiz matchHistoryVOServiceBiz;
    @Resource
    private JHJFinanceRequestServiceBiz jhjFinanceRequestServiceBiz;
    @Resource
    private FinanceVOServiceBiz financeVOServiceBiz;

    @Transactional
    public MatchResp match(FinanceSplitVO financeSplit){
        List<RepaySplitVO> suitableRepaySplits;
        if(jhjFinanceRequestServiceBiz.isSuperAccount(financeSplit.getUserCode())){
            suitableRepaySplits = repaySplitVOServiceBiz.getAfterAllotRemainSuitableRepays(financeSplit);
        }else{
            suitableRepaySplits = repaySplitVOServiceBiz.getFinanceSuitableRepays(financeSplit);
        }
        List<RepaySplitAllotResult> allotResults = allot(financeSplit, Constant.defaultAllotment, suitableRepaySplits);
        if(!allotResults.isEmpty()){
            List<MatchDetail> matchDetails = financeAndLoanDataHandle(allotResults, financeSplit);
            financeSplitVOServiceBiz.updateRecordComplete(financeSplit);
            return new MatchResp(financeSplit.getFinanceCode(), matchDetails);
        }
        return null;
    }

    public List<FinanceLoanMatchVO> getPrepayLoanMatchedFinance(String loanCode, Date prepayDate){
        FinanceLoanMatchVOExample example = new FinanceLoanMatchVOExample();
        FinanceLoanMatchVOExample.Criteria criteria = example.createCriteria();
        criteria.andLoanCodeEqualTo(loanCode)
                .andLoanExpireDateGreaterThan(prepayDate)
                .andStatusEqualTo("1");
        example.setOrderByClause(" finance_code ");
        return financeLoanMatchVOMapper.selectByExample(example);
    }

    public int updatePrepayLoanMatchedFinance(String loanCode, Date prepayDate){
        return financeLoanMatchExtVOMapper.updatePrepayLoanMatchedFinance(loanCode, prepayDate);
    }

    public int insert(FinanceLoanMatchVO financeLoanMatch){
        return financeLoanMatchVOMapper.insertSelective(financeLoanMatch);
    }

    @Transactional
    public List<MatchDetail> financeAndLoanDataHandle(List<RepaySplitAllotResult> allotResults, FinanceSplitVO financeSplit){
        List<MatchDetail> matchDetails = new ArrayList<>();
        for(RepaySplitAllotResult allotResult : allotResults){
            FinanceLoanMatchVO matchVO = insert(allotResult, financeSplit);
            List<MatchHistoryVO> matchHistories = matchHistoryVOServiceBiz.getRepayRecentlyHistory(
                    matchVO.getRepayId(), matchVO.getLoanStartDate(), matchVO.getLoanExpireDate());
            repaySplitVOServiceBiz.updateAfterAllot(allotResult, financeSplit.getPeriod());
            MatchDetail matchDetail = new MatchDetail(matchVO);
            if(matchHistories.size() != 0){//TODO 转让人是个集合,目前只返回一个
                MatchHistoryVO matchHistory = matchHistories.get(0);
                matchDetail.type = "2";
                int alienatePeriod;
                BigDecimal alienatePrincipal;
                if(allotResult.getRepaySplit().getExpireDate().getTime() < matchHistory.getLoanExpireDate().getTime()){
                    alienatePeriod = DateUtils.getDiffDays(allotResult.getRepaySplit().getExpireDate(), allotResult.getRepaySplit().getStartDate());
                }else{
                    alienatePeriod = DateUtils.getDiffDays(matchHistory.getLoanExpireDate(), allotResult.getRepaySplit().getStartDate());
                }
                if(allotResult.getAllotAmount().compareTo(matchHistory.getAllotAmount()) < 0){
                    alienatePrincipal = allotResult.getAllotAmount();
                }else {
                    alienatePrincipal = matchHistory.getAllotAmount();
                }
                matchDetail.alienator = matchHistory.getFinanceUserCode();
                matchDetail.alienatorPrincipal = alienatePrincipal;
                matchDetail.alienatorInterest = BigDecimalUtils.getInterest(
                        matchHistory.getLoanRate()
                        , alienatePeriod
                        , alienatePrincipal);
            }
            matchDetails.add(matchDetail);
        }
        financeSplitVOServiceBiz.updateRecordComplete(financeSplit);
        return matchDetails;
    }

    public List<MatchDetail> getFinanceMatchDetail(String financeCode){
        List<MatchDetail> matchDetails = new ArrayList<>();
        List<FinanceLoanMatchVO> matchRecords = getFinanceMatchRecord(financeCode);
        for(FinanceLoanMatchVO record : matchRecords){
            matchDetails.add(new MatchDetail(record));
        }
        return matchDetails;
    }

    public List<FinanceLoanMatchVO> getFinanceMatchRecord(String financeCode){
        FinanceLoanMatchVOExample example = new FinanceLoanMatchVOExample();
        FinanceLoanMatchVOExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo("1")
                .andFinanceCodeEqualTo(financeCode);
        return financeLoanMatchVOMapper.selectByExample(example);
    }

    public void updatePreRedeemFinanceMatchRecords(PreRedemptionVO preRedemption){
        financeLoanMatchExtVOMapper
                .updatePreRedeemFinanceMatchedLoan(preRedemption.getFinanceCode(), preRedemption.getRedemptionDate());
    }

    public List<FinanceLoanMatchVO> getPreRedeemFinanceMatchRecords(PreRedemptionVO preRedemption){
        FinanceLoanMatchVOExample example = new FinanceLoanMatchVOExample();
        FinanceLoanMatchVOExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo("1")
                .andFinanceCodeEqualTo(preRedemption.getFinanceCode())
                .andLoanExpireDateGreaterThan(preRedemption.getRedemptionDate());
        return financeLoanMatchVOMapper.selectByExample(example);
    }

    private FinanceLoanMatchVO insert(RepaySplitAllotResult allotResult, FinanceSplitVO financeSplit){
        FinanceLoanMatchVO matchResult = new FinanceLoanMatchVO();
        RepaySplitVO repaySplit = allotResult.getRepaySplit();
        matchResult.setAllotAmount(allotResult.getAllotAmount());
        matchResult.setRepayId(repaySplit.getRepayId());
        matchResult.setRepaySplitId(repaySplit.getId());
        matchResult.setFinanceSplitId(financeSplit.getId());
        matchResult.setLoanCode(repaySplit.getLoanCode());
        matchResult.setLoanRate(repaySplit.getLoanRate());
        matchResult.setLoanUserCode(repaySplit.getUserCode());
        matchResult.setFinanceCode(financeSplit.getFinanceCode());
        matchResult.setLoanStartDate(repaySplit.getStartDate());
        matchResult.setFinanceUserCode(financeSplit.getUserCode());
        if(allotResult.getRepaySplit().getExpireDate().getTime() <= financeSplit.getExpireDate().getTime()){
            matchResult.setLoanExpireDate(allotResult.getRepaySplit().getExpireDate());
        }else {
            matchResult.setLoanExpireDate(financeSplit.getExpireDate());
        }
        matchResult.setPeriodsTime(repaySplit.getPeriodsTime());
        matchResult.setFinanceProductsId(financeSplit.getFinanceProductsId());
        financeLoanMatchVOMapper.insertSelective(matchResult);
        return matchResult;
    }

    public List<RepaySplitAllotResult> getRecordableAllotSplit(List<RepaySplitVO> repaySplits){
        List<RepaySplitAllotResult> allotResults = new ArrayList<>();
        for(RepaySplitVO repaySplit : repaySplits){
            allotResults.add(new RepaySplitAllotResult(repaySplit, repaySplit.getPrincipal()));
        }
        return allotResults;
    }

    public List<MatchResultResp> getLoanMatchedFinance(String loanCode){
        FinanceLoanMatchVOExample example = new FinanceLoanMatchVOExample();
        FinanceLoanMatchVOExample.Criteria criteria = example.createCriteria();
        criteria.andLoanCodeEqualTo(loanCode)
                .andStatusEqualTo("1");
        List<FinanceLoanMatchVO> list = financeLoanMatchVOMapper.selectByExample(example);
        List<MatchResultResp> results = new ArrayList<>();
        for(FinanceLoanMatchVO matchVO : list){
            results.add(getMatchResultResp(matchVO));
        }
        return results;
    }

    public FinanceMatchLoanListResp getFinanceMatchLoanListResp(String financeCode){
        FinanceVO finance = financeVOServiceBiz.getFinance(financeCode);
        Date financeDate = finance.getFinanceDate();
        List<MatchResultResp> list = getFinanceMatchedLoan(financeCode);
        FinanceMatchLoanListResp financeMatchLoanListResp = new FinanceMatchLoanListResp();
        financeMatchLoanListResp.setList(list);
        if(CollectionUtils.isNotEmpty(list)){
            DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
            Date minLoanStartDate = null;
            try {
                minLoanStartDate = dateFormat.parse(list.get(0).startDate);
                int diffDays = DateUtils.getDiffDays(financeDate, minLoanStartDate);
                if(diffDays > 0){
                    financeMatchLoanListResp.setHasSubsidy(Boolean.TRUE);
                    financeMatchLoanListResp.setSubsidyStartDate(financeDate);
                    financeMatchLoanListResp.setSubsidyEndDate(minLoanStartDate);
                }
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }else{
            FinanceSplitVO financeSplit = financeSplitVOServiceBiz.getFinanceSplitByFinanceCode(financeCode);
            int diffDays = DateUtils.getDiffDays(financeDate, financeSplit.getStartDate());
            if(diffDays > 0){
                financeMatchLoanListResp.setHasSubsidy(Boolean.TRUE);
                financeMatchLoanListResp.setSubsidyStartDate(financeDate);
                financeMatchLoanListResp.setSubsidyEndDate(financeSplit.getStartDate());
            }
        }
        return financeMatchLoanListResp;
    }

    public List<MatchResultResp> getFinanceMatchedLoan(String financeCode){
        FinanceLoanMatchVOExample example = new FinanceLoanMatchVOExample();
        FinanceLoanMatchVOExample.Criteria criteria = example.createCriteria();
        criteria.andFinanceCodeEqualTo(financeCode)
                .andStatusEqualTo("1");
        example.setOrderByClause("loan_start_date");
        List<FinanceLoanMatchVO> list = financeLoanMatchVOMapper.selectByExample(example);
        List<MatchResultResp> results = new ArrayList<>();
        for(FinanceLoanMatchVO matchVO : list){
            results.add(getMatchResultResp(matchVO));
        }
        return results;
    }

    @Transactional
    public List<MatchInfo> allotReleasedFinances(List<FinanceSplitVO> financeSplits){
        List<MatchInfo> matchInfoList = new ArrayList<>();
        for(FinanceSplitVO financeSplit : financeSplits){
            List<RepaySplitVO> suitableRepaySplits = repaySplitVOServiceBiz.getFinanceSuitableRepays(financeSplit);
            List<RepaySplitAllotResult> allotResults = allot(financeSplit, 1, suitableRepaySplits);
            if(allotResults.isEmpty()) {
                matchInfoList.add(new MatchInfo(financeSplit.getFinanceCode(), null));
            }else {
                List<MatchDetail> matchDetails = financeAndLoanDataHandle(allotResults, financeSplit);
                matchDetails.addAll(getFinanceMatchDetail(financeSplit.getFinanceCode()));
                matchInfoList.add(new MatchInfo(financeSplit.getFinanceCode(), matchDetails));
                financeSplitVOServiceBiz.updateRecordComplete(financeSplit);
            }
        }
        return matchInfoList;
    }

    @Transactional(rollbackFor = Exception.class)
    public void allotUncompletedFinances(List<FinanceSplitVO> financeSplits){
        for(FinanceSplitVO financeSplit : financeSplits){
            List<RepaySplitVO> suitableRepaySplits = repaySplitVOServiceBiz.getFinanceSuitableRepays(financeSplit);
            List<RepaySplitAllotResult> allotResults = allot(financeSplit, 1, suitableRepaySplits);
            if(!allotResults.isEmpty()) {
                financeAndLoanDataHandle(allotResults, financeSplit);
                financeSplitVOServiceBiz.updateRecordComplete(financeSplit);
            }
        }
    }

    private List<RepaySplitAllotResult> allot(FinanceSplitVO financeSplit, int allotment, List<RepaySplitVO> repaySplits){
        List<RepaySplitAllotResult> suitableAllotResults = getRecordableAllotSplit(repaySplits);
        AllotInterimVO allotInterim = new AllotInterimVO(financeSplit.getAmount(), allotment);
        List<RepaySplitAllotResult> allotResults = allotInterim.allot(suitableAllotResults);
        if(allotInterim.hasAllotTotalAmount.compareTo(financeSplit.getAmount()) < 0){
            List<RepaySplitVO> lessThanFinancePeriodRepaySplits = repaySplitVOServiceBiz.getLessThanFinancePeriodRepays(financeSplit);
            List<RepaySplitAllotResult> lessThanFinancePeriodResults = getRecordableAllotSplit(lessThanFinancePeriodRepaySplits);
            AllotInterimVO allotInterim2 = new AllotInterimVO(financeSplit.getAmount().subtract(allotInterim.hasAllotTotalAmount), allotment);
            List<RepaySplitAllotResult> allotResults2 = allotInterim2.allot(lessThanFinancePeriodResults);
            if(allotInterim.hasAllotTotalAmount.add(allotInterim2.hasAllotTotalAmount).compareTo(financeSplit.getAmount()) < 0){
                return new ArrayList<>();
            }
            allotResults.addAll(allotResults2);
        }
        return allotResults;
    }

    public MatchResultResp getMatchResultResp(FinanceLoanMatchVO matchVO){
        List<MatchHistoryVO> matchHistories = matchHistoryVOServiceBiz.getRepayRecentlyHistory(
                matchVO.getRepayId(), matchVO.getLoanStartDate(), matchVO.getLoanExpireDate());
        MatchResultResp resp = new MatchResultResp(matchVO);
        if(matchHistories.size() != 0){//TODO 转让人是个集合,目前只返回一个
            MatchHistoryVO matchHistory = matchHistories.get(0);
            resp.type = "2";
            int alienatePeriod;
            BigDecimal alienatePrincipal;
            if(matchVO.getLoanExpireDate().getTime() < matchHistory.getLoanExpireDate().getTime()){
                alienatePeriod = DateUtils.getDiffDays(matchVO.getLoanExpireDate(), matchVO.getLoanStartDate());
            }else{
                alienatePeriod = DateUtils.getDiffDays(matchHistory.getLoanExpireDate(), matchVO.getLoanStartDate());
            }
            if(matchVO.getAllotAmount().compareTo(matchHistory.getAllotAmount()) < 0){
                alienatePrincipal = matchVO.getAllotAmount();
            }else {
                alienatePrincipal = matchHistory.getAllotAmount();
            }
            resp.alienator = matchHistory.getFinanceUserCode();
            resp.alienatorPrincipal = alienatePrincipal;
            resp.alienatorInterest = BigDecimalUtils.getInterest(
                    matchHistory.getLoanRate()
                    , alienatePeriod
                    , alienatePrincipal);
        }
        return resp;
    }


    public BigDecimal getSuperAccountPurchaseMoney(Date date){
        return financeLoanMatchExtVOMapper.getSuperAccountPurchaseMoney(date);
    }

    public BigDecimal getTotalMatchAmount(){
        return financeLoanMatchExtVOMapper.getTotalMatchAmount();
    }
}
