package com.ooteco.service.biz;

import com.ooteco.dao.mapper.LoanFullScaleVOMapper;
import com.ooteco.dao.mapper.ext.FinanceLoanMatchExtVOMapper;
import com.ooteco.dao.mapper.ext.LoanFullScaleExtVOMapper;
import com.ooteco.entity.finance.model.FinanceSplitVO;
import com.ooteco.entity.loan.model.LoanFullScaleVO;
import com.ooteco.entity.loan.model.LoanFullScaleVOExample;
import com.ooteco.entity.loan.model.LoanVO;
import com.ooteco.entity.loan.model.resp.LoanFullScaleDetail;
import com.ooteco.entity.loan.model.resp.LoanFullScaleResp;
import com.ooteco.entity.match.model.FinanceLoanMatchVO;
import com.ooteco.entity.match.model.resp.MatchDetail;
import com.ooteco.entity.match.model.resp.MatchResultResp;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service("loanFullScaleVOServiceBiz")
public class LoanFullScaleVOServiceBiz {

    @Resource
    private LoanFullScaleVOMapper loanFullScaleVOMapper;
    @Resource
    private LoanFullScaleExtVOMapper loanFullScaleExtVOMapper;
    @Resource
    private FinanceLoanMatchExtVOMapper financeLoanMatchExtVOMapper;
    @Resource
    private JHJFinanceRequestServiceBiz jhjFinanceRequestServiceBiz;

    public int insert(LoanVO loan){
        LoanFullScaleVO loanFullScale = new LoanFullScaleVO();
        loanFullScale.setLoanCode(loan.getLoanCode());
        loanFullScale.setAmount(loan.getLoanMoney());
        return loanFullScaleVOMapper.insertSelective(loanFullScale);
    }

    public List<LoanFullScaleResp> getLoanFullScaleResp(){
        List<String> fullScaleLoanCodes = getFullScaleLoans();
        List<LoanFullScaleResp> loanFullScalesResp = new ArrayList<>();
        for(String fullScaleCode : fullScaleLoanCodes){
            List<LoanFullScaleDetail> loanFullScaleDetails = financeLoanMatchExtVOMapper.getFullScaleLoanAllotDetails(fullScaleCode);
            loanFullScalesResp.add(new LoanFullScaleResp(fullScaleCode, loanFullScaleDetails));
        }
        if(fullScaleLoanCodes.size() > 0){
            updateFullScaleStatus(fullScaleLoanCodes);
        }
        return loanFullScalesResp;
    }


    public int updateFullScaleStatus(List<String> fullScaleLoanCodes){
        LoanFullScaleVOExample example = new LoanFullScaleVOExample();
        LoanFullScaleVOExample.Criteria criteria = example.createCriteria();
        criteria.andLoanCodeIn(fullScaleLoanCodes)
                .andIsFullEqualTo(false);
        LoanFullScaleVO prepareUpdateRecord = new LoanFullScaleVO();
        prepareUpdateRecord.setIsFull(true);
        return loanFullScaleVOMapper.updateByExampleSelective(prepareUpdateRecord, example);
    }

    public List<String> getFullScaleLoans(){
        return loanFullScaleExtVOMapper.getFullScaleLoans();
    }

    public List<LoanFullScaleVO> getLoanFullScaleVOListByIsFull(Date beginDate,Date endDate){
        LoanFullScaleVOExample example = new LoanFullScaleVOExample();
        LoanFullScaleVOExample.Criteria criteria = example.createCriteria();
        criteria.andIsFullEqualTo(true);
        criteria.andModifyDateBetween(beginDate,endDate);
        return loanFullScaleVOMapper.selectByExample(example);
    }

    public void notifyLoanFullScale(){
        List<LoanFullScaleResp> loanFullScalesResp = getLoanFullScaleResp();
        if(loanFullScalesResp.size() > 0){
            jhjFinanceRequestServiceBiz.notifyLoanFullScale(loanFullScalesResp);
        }
    }
}
