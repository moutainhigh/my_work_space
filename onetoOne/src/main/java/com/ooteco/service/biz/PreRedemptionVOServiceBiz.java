package com.ooteco.service.biz;

import com.ooteco.dao.mapper.PreRedemptionVOMapper;
import com.ooteco.dao.mapper.ext.FinanceDayValueVOExtMapper;
import com.ooteco.entity.finance.model.FinanceVO;
import com.ooteco.entity.finance.model.PreRedemptionVO;
import com.ooteco.entity.match.model.FinanceLoanMatchVO;
import com.ooteco.entity.repay.model.RepaySplitVO;
import com.ooteco.entity.repay.model.resp.EarlyRedemptionResp;
import com.ooteco.entity.repay.model.resp.FinanceReleasedLoanDetail;
import com.ooteco.utils.BigDecimalUtils;
import com.ooteco.utils.Constant;
import com.ooteco.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service("preRedemptionVOServiceBiz")
public class PreRedemptionVOServiceBiz {

    @Resource
    private PreRedemptionVOMapper preRedemptionVOMapper;
    @Resource
    private FinanceVOServiceBiz financeVOServiceBiz;
    @Resource
    private FinanceSplitVOServiceBiz financeSplitVOServiceBiz;
    @Resource
    private FinanceLoanMatchVOServiceBiz financeLoanMatchVOServiceBiz;
    @Resource
    private MatchHistoryVOServiceBiz matchHistoryVOServiceBiz;
    @Resource
    private RepaySplitVOServiceBiz repaySplitVOServiceBiz;
    @Autowired
    FinanceDayValueVOExtMapper financeDayValueVOExtMapper;

    @Transactional
    public EarlyRedemptionResp handlePreRedemption(PreRedemptionVO preRedemption){
        insert(preRedemption);
        financeVOServiceBiz.updateRealRedemptionDate(preRedemption);
        financeSplitVOServiceBiz.updatePreRedeemRecords(preRedemption);
        return getReleasedLoan(preRedemption);
    }

    public int insert(PreRedemptionVO preRedemptionVO){
        return preRedemptionVOMapper.insertSelective(preRedemptionVO);
    }

    @Transactional
    public EarlyRedemptionResp getReleasedLoan(PreRedemptionVO preRedemption){
        List<FinanceLoanMatchVO> matchedResults = financeLoanMatchVOServiceBiz.getPreRedeemFinanceMatchRecords(preRedemption);
        if(matchedResults == null){
            return null;
        }
        FinanceVO finance = financeVOServiceBiz.getFinance(preRedemption.getFinanceCode());
        List<FinanceReleasedLoanDetail> releasedLoanDetails = new ArrayList<>();
        for(FinanceLoanMatchVO result : matchedResults){
            Date presentStartDate = preRedemption.getRedemptionDate();
            FinanceReleasedLoanDetail releasedLoanDetail = new FinanceReleasedLoanDetail();
            int period = DateUtils.getDiffDays(finance.getFinanceDate(), preRedemption.getRedemptionDate());
            releasedLoanDetail.setPrinciple(result.getAllotAmount());
            releasedLoanDetail.setMatchCode(result.getId());
            if(result.getLoanStartDate().getTime() > preRedemption.getRedemptionDate().getTime()){
                presentStartDate = result.getLoanStartDate();
            }
            releasedLoanDetail.setInterest(BigDecimalUtils.getInterest(finance.getRealRate(),period,result.getAllotAmount()));
            releasedLoanDetail.setAmount(releasedLoanDetail.getPrinciple().add(releasedLoanDetail.getInterest()));
            releasedLoanDetails.add(releasedLoanDetail);
            RepaySplitVO repaySplit = new RepaySplitVO();
            repaySplit.setStartDate(presentStartDate);
            repaySplit.setExpireDate(result.getLoanExpireDate());
            repaySplit.setLoanRate(result.getLoanRate());
            repaySplit.setProcess(3);
            repaySplit.setPeriod(DateUtils.getDiffDays(presentStartDate, result.getLoanExpireDate()));
            repaySplit.setPrincipal(result.getAllotAmount());
            repaySplit.setLoanCode(result.getLoanCode());
            repaySplit.setRepayId(result.getRepayId());
            repaySplit.setUserCode(result.getLoanUserCode());
            repaySplit.setPeriodsTime(result.getPeriodsTime());

            List<RepaySplitVO> lastSplitRemainRepaySplits = repaySplitVOServiceBiz.getLastSplitRemainRepaySplit(
                    repaySplit.getRepayId(), repaySplit.getStartDate(), repaySplit.getExpireDate());
            if(lastSplitRemainRepaySplits.size() > 0){
                if(lastSplitRemainRepaySplits.size() == 2){
                    RepaySplitVO lastSplit1 = lastSplitRemainRepaySplits.get(0);
                    RepaySplitVO lastSplit2 = lastSplitRemainRepaySplits.get(1);
                    RepaySplitVO prepareUpdateRepaySplit = new RepaySplitVO();
                    prepareUpdateRepaySplit.setId(lastSplit1.getId());
                    prepareUpdateRepaySplit.setProcess(3);
                    prepareUpdateRepaySplit.setPrincipal(lastSplit1.getPrincipal().add(repaySplit.getPrincipal()));
                    if(repaySplit.getPrincipal().equals(lastSplit2.getPrincipal())){
                        RepaySplitVO prepareUpdateRepaySplit2 = new RepaySplitVO();
                        prepareUpdateRepaySplit2.setId(lastSplit2.getId());
                        prepareUpdateRepaySplit2.setProcess(3);
                        prepareUpdateRepaySplit2.setIsValid(false);
                        repaySplitVOServiceBiz.updateById(prepareUpdateRepaySplit2);
                    }else {
                        RepaySplitVO prepareUpdateRepaySplit2 = new RepaySplitVO();
                        prepareUpdateRepaySplit2.setId(lastSplit2.getId());
                        prepareUpdateRepaySplit2.setProcess(3);
                        prepareUpdateRepaySplit2.setPrincipal(lastSplit2.getPrincipal().subtract(repaySplit.getPrincipal()));
                        repaySplitVOServiceBiz.updateById(prepareUpdateRepaySplit2);
                    }
                    repaySplitVOServiceBiz.updateById(prepareUpdateRepaySplit);
                }else {
                    RepaySplitVO lastSplit = lastSplitRemainRepaySplits.get(0);
                    RepaySplitVO prepareUpdateRepaySplit = new RepaySplitVO();
                    prepareUpdateRepaySplit.setId(lastSplit.getId());
                    prepareUpdateRepaySplit.setProcess(3);
                    if(lastSplit.getStartDate().getTime() == repaySplit.getStartDate().getTime()){
                        prepareUpdateRepaySplit.setPrincipal(repaySplit.getPrincipal().add(lastSplit.getPrincipal()));
                    }else{
                        prepareUpdateRepaySplit.setPrincipal(repaySplit.getPrincipal());
                        if(repaySplit.getPrincipal().compareTo(lastSplit.getPrincipal()) < 0){
                            repaySplit.setId(null);
                            repaySplit.setProcess(3);
                            repaySplit.setExpireDate(lastSplit.getExpireDate());
                            prepareUpdateRepaySplit.setPrincipal(lastSplit.getPrincipal().subtract(repaySplit.getPrincipal()));
                            repaySplitVOServiceBiz.insert(repaySplit);
                        }else{
                            prepareUpdateRepaySplit.setStartDate(repaySplit.getStartDate());
                            prepareUpdateRepaySplit.setExpireDate(lastSplit.getExpireDate());
                        }
                    }
                    repaySplitVOServiceBiz.updateById(prepareUpdateRepaySplit);
                }
            }else{
                repaySplitVOServiceBiz.insert(repaySplit);
            }
            matchHistoryVOServiceBiz.handleMatchHistories(result, finance.getUserCode());
        }
        financeLoanMatchVOServiceBiz.updatePreRedeemFinanceMatchRecords(preRedemption);

        //更新理财实际剩余额度
        financeDayValueVOExtMapper.addMoney(preRedemption.getRedemptionDate(),finance.getRedemptionDate(),preRedemption.getRedemptionMoney());

        return new EarlyRedemptionResp(releasedLoanDetails);
    }

    public void preRedeemPayFailFinance(String financeCode){
        FinanceVO finance = financeVOServiceBiz.getFinance(financeCode);
        PreRedemptionVO preRedemptionVO = new PreRedemptionVO();
        preRedemptionVO.setFinanceCode(financeCode);
        preRedemptionVO.setRedemptionDate(DateUtils.getBeginTime(new Date()));
        preRedemptionVO.setFinanceProductsId(finance.getFinanceProductsId());
        preRedemptionVO.setRedemptionMoney(finance.getFinanceMoney());
        preRedemptionVO.setResidueInvestmentHorizon(DateUtils.getDiffDays(finance.getFinanceDate(), preRedemptionVO.getRedemptionDate()));
        handlePreRedemption(preRedemptionVO);
    }
}
