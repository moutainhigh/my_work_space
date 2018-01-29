package com.ooteco.service.biz;

import com.ooteco.dao.mapper.FinanceSplitVOMapper;
import com.ooteco.dao.mapper.PrepayVOMapper;
import com.ooteco.dao.mapper.ext.FinanceDayValueVOExtMapper;
import com.ooteco.dao.mapper.ext.FinanceSplitExtVOMapper;
import com.ooteco.entity.finance.model.FinanceSplitVO;
import com.ooteco.entity.match.model.FinanceLoanMatchVO;
import com.ooteco.entity.match.model.resp.MatchInfo;
import com.ooteco.entity.repay.model.PrepayVO;
import com.ooteco.entity.repay.model.RepaySplitVO;
import com.ooteco.entity.repay.model.RepayVO;
import com.ooteco.utils.DateUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service("prepayVOServiceBiz")
public class PrepayVOServiceBiz {

    @Resource
    private PrepayVOMapper prepayVOMapper;
    @Resource
    private RepayVOServiceBiz repayVOServiceBiz;
    @Resource
    private FinanceLoanMatchVOServiceBiz financeLoanMatchVOServiceBiz;
    @Resource
    private FinanceSplitVOMapper financeSplitVOMapper;
    @Resource
    private RepaySplitVOServiceBiz repaySplitVOServiceBiz;
    @Resource
    private FinanceVOServiceBiz financeVOServiceBiz;
    @Resource
    private FinanceDayValueVOExtMapper financeDayValueVOExtMapper;
    @Resource
    private JHJFinanceRequestServiceBiz jhjFinanceRequestServiceBiz;
    @Resource
    private LoanVOServiceBiz loanVOServiceBiz;
    @Resource
    private FinanceSplitExtVOMapper financeSplitExtVOMapper;
    @Resource
    private FinanceSplitVOServiceBiz financeSplitVOServiceBiz;

    @Transactional
    public List<MatchInfo> handlePrepay(PrepayVO prepay){
        int releasedFinanceCount = insertPrepayFinance(prepay.getRepaymentDate(), prepay.getLoanCode());
        insert(prepay);
        repayVOServiceBiz.updateRealRepayDate(prepay);
        repaySplitVOServiceBiz.updatePrepayLoanRecords(prepay);
        for(RepayVO repayVO : repayVOServiceBiz.findRepaymentList(prepay.getRepaymentDate(),prepay.getLoanCode())){
            //更新理财实际剩余额度
            financeDayValueVOExtMapper.update(prepay.getRepaymentDate(),repayVO.getRepaymentDate(),repayVO.getRealPrincipal());
        }
        financeLoanMatchVOServiceBiz.updatePrepayLoanMatchedFinance(prepay.getLoanCode(), prepay.getRepaymentDate());
        if(releasedFinanceCount > 0){
            List<FinanceSplitVO> releasedFinances = financeSplitVOServiceBiz.getPrepayLoanFinanceSplits(prepay.getLoanCode());
            List<MatchInfo> matchInfoList = financeLoanMatchVOServiceBiz.allotReleasedFinances(releasedFinances);
            return matchInfoList;
        }
        return null;
    }

    public int insert(PrepayVO prepayVO){
        return prepayVOMapper.insertSelective(prepayVO);
    }

    public int insertPrepayFinance(Date prepayDate, String loanCode){
        return financeSplitExtVOMapper.insertPrepayFinance(prepayDate, loanCode);
    }


    @Transactional
    public List<FinanceSplitVO> getReleasedFinance(PrepayVO prepay){
        List<FinanceLoanMatchVO> matchedResults = financeLoanMatchVOServiceBiz
                .getPrepayLoanMatchedFinance(prepay.getLoanCode(), prepay.getRepaymentDate());
        if(matchedResults == null)
            return null;
        List<FinanceSplitVO> releasedFinanceSplits = new ArrayList<>();
        FinanceSplitVO preFinanceSplit = null;
        for(int i=0; i<matchedResults.size(); i++){
            FinanceLoanMatchVO result = matchedResults.get(i);
            if(preFinanceSplit != null && preFinanceSplit.getFinanceCode().equals(result.getFinanceCode())){
                preFinanceSplit.setAmount(preFinanceSplit.getAmount().add(result.getAllotAmount()));
            }else{
                Date financeSplitStartDate = prepay.getRepaymentDate();
                if(result.getLoanStartDate().getTime() > prepay.getRepaymentDate().getTime()){
                    financeSplitStartDate = result.getLoanStartDate();
                }
                FinanceSplitVO financeSplit = new FinanceSplitVO();
                financeSplit.setProcess(2);
                financeSplit.setFinanceCode(result.getFinanceCode());
                financeSplit.setStartDate(financeSplitStartDate);
                financeSplit.setExpireDate(result.getLoanExpireDate());
                financeSplit.setPeriod(DateUtils.getDiffDays(financeSplit.getStartDate(), financeSplit.getExpireDate()));
                financeSplit.setAmount(result.getAllotAmount());
                financeSplit.setFinanceProductsId(result.getFinanceProductsId());
                if(i > 0){
                    releasedFinanceSplits.add(preFinanceSplit);
                    financeSplitVOMapper.insertSelective(preFinanceSplit);
                }
                preFinanceSplit = financeSplit;
            }
            if(i == matchedResults.size() - 1){
                releasedFinanceSplits.add(preFinanceSplit);
                financeSplitVOMapper.insertSelective(preFinanceSplit);
            }
        }
        return releasedFinanceSplits;
    }
}
