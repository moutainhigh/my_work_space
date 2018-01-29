package com.ooteco.service.biz;

import com.ooteco.dao.mapper.MatchHistoryVOMapper;
import com.ooteco.entity.match.model.FinanceLoanMatchVO;
import com.ooteco.entity.match.model.MatchHistoryVO;
import com.ooteco.entity.match.model.MatchHistoryVOExample;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Service("matchHistoryVOServiceBiz")
public class MatchHistoryVOServiceBiz {

    @Resource
    private MatchHistoryVOMapper matchHistoryVOMapper;


    public int insert(FinanceLoanMatchVO result, String financeUserCode){
       MatchHistoryVO matchHistory = getMatchHistoryByMatchResult(result,financeUserCode);
       return insert(matchHistory);
    }

    public int insert(MatchHistoryVO matchHistory){
        return matchHistoryVOMapper.insertSelective(matchHistory);
    }

    @Transactional
    public void handleMatchHistories(FinanceLoanMatchVO result, String financeUserCode){
        MatchHistoryVO matchHistory = getMatchHistoryByMatchResult(result,financeUserCode);
        List<MatchHistoryVO> previousMatchHistories = getRepayMatchHistories(matchHistory.getRepayId(), matchHistory.getLoanStartDate());
        for(MatchHistoryVO previousMatchHistory : previousMatchHistories){
            if(previousMatchHistory.getLoanExpireDate().getTime() <= matchHistory.getLoanExpireDate().getTime()){
                MatchHistoryVO prepareUpdateMatchHistory = new MatchHistoryVO();
                prepareUpdateMatchHistory.setId(prepareUpdateMatchHistory.getId());
                if(previousMatchHistory.getAllotAmount().compareTo(matchHistory.getAllotAmount()) <= 0){
                    prepareUpdateMatchHistory.setIsRecently(false);
                }else {
                    prepareUpdateMatchHistory.setAllotAmount(previousMatchHistory.getAllotAmount().subtract(matchHistory.getAllotAmount()));
                }
                matchHistoryVOMapper.updateByPrimaryKeySelective(prepareUpdateMatchHistory);
            }else{
                MatchHistoryVO prepareUpdateMatchHistory = new MatchHistoryVO();
                prepareUpdateMatchHistory.setId(prepareUpdateMatchHistory.getId());
                prepareUpdateMatchHistory.setLoanExpireDate(matchHistory.getLoanExpireDate());
                if(previousMatchHistory.getAllotAmount().compareTo(matchHistory.getAllotAmount()) <= 0){
                    prepareUpdateMatchHistory.setIsRecently(false);
                }else {
                    prepareUpdateMatchHistory.setAllotAmount(previousMatchHistory.getAllotAmount().subtract(matchHistory.getAllotAmount()));
                }
                matchHistoryVOMapper.updateByPrimaryKeySelective(prepareUpdateMatchHistory);
                MatchHistoryVO prepareInsertMatchHistory = previousMatchHistory;
                prepareInsertMatchHistory.setId(null);
                prepareInsertMatchHistory.setLoanStartDate(matchHistory.getLoanExpireDate());
                matchHistoryVOMapper.insertSelective(prepareInsertMatchHistory);
            }
        }
        updateRepayIsRecentlyValue(matchHistory.getRepayId(), matchHistory.getLoanStartDate());
        insert(matchHistory);
    }

    public List<MatchHistoryVO> getRepayRecentlyHistory(Long repaySplitId, Date startDate , Date expireDate){
        MatchHistoryVOExample example = new MatchHistoryVOExample();
        MatchHistoryVOExample.Criteria criteria = example.createCriteria();
        criteria.andRepayIdEqualTo(repaySplitId)
                .andIsRecentlyEqualTo(true)
                .andLoanStartDateLessThan(expireDate)
                .andLoanExpireDateGreaterThan(startDate);
        example.setOrderByClause(" create_date desc");
        return matchHistoryVOMapper.selectByExample(example);
    }

    public int updateRepayIsRecentlyValue(Long repayId, Date loanStartDate , Date loanExpireDate){
        MatchHistoryVOExample example = new MatchHistoryVOExample();
        MatchHistoryVOExample.Criteria criteria = example.createCriteria();
        criteria.andRepayIdEqualTo(repayId)
                .andIsRecentlyEqualTo(true)
                .andLoanStartDateGreaterThanOrEqualTo(loanStartDate)
                .andLoanStartDateLessThan(loanExpireDate);
        MatchHistoryVO matchHistory = new MatchHistoryVO();
        matchHistory.setIsRecently(false);
        return matchHistoryVOMapper.updateByExampleSelective(matchHistory, example);
    }

    private List<MatchHistoryVO> getRepayMatchHistories(Long repayId, Date startDate){
        MatchHistoryVOExample example = new MatchHistoryVOExample();
        MatchHistoryVOExample.Criteria criteria = example.createCriteria();
        criteria.andIsRecentlyEqualTo(true)
                .andLoanExpireDateGreaterThan(startDate)
                .andRepayIdEqualTo(repayId);
        return matchHistoryVOMapper.selectByExample(example);
    }

    private int updateRepayIsRecentlyValue(Long repayId, Date startDate){
        MatchHistoryVOExample example = new MatchHistoryVOExample();
        MatchHistoryVOExample.Criteria criteria = example.createCriteria();
        criteria.andIsRecentlyEqualTo(true)
                .andLoanExpireDateLessThanOrEqualTo(startDate)
                .andRepayIdEqualTo(repayId);
        MatchHistoryVO matchHistory = new MatchHistoryVO();
        matchHistory.setIsRecently(false);
        return matchHistoryVOMapper.updateByExampleSelective(matchHistory, example);
    }

    private MatchHistoryVO getMatchHistoryByMatchResult(FinanceLoanMatchVO result, String financeUserCode){
        MatchHistoryVO matchHistory = new MatchHistoryVO();
        matchHistory.setFinanceCode(result.getFinanceCode());
        matchHistory.setFinanceSplitId(result.getFinanceSplitId());
        matchHistory.setLoanCode(result.getLoanCode());
        matchHistory.setLoanExpireDate(result.getLoanExpireDate());
        matchHistory.setLoanStartDate(result.getLoanStartDate());
        matchHistory.setLoanRate(result.getLoanRate());
        matchHistory.setLoanUserCode(result.getLoanUserCode());
        matchHistory.setRepayId(result.getRepayId());
        matchHistory.setRepaySplitId(result.getRepaySplitId());
        matchHistory.setFinanceUserCode(financeUserCode);
        matchHistory.setAllotAmount(result.getAllotAmount());
        return matchHistory;
    }
}
