package com.ooteco.service.impl;

import com.ooteco.dao.mapper.TLoanVOMapper;
import com.ooteco.entity.tloan.model.TLoanVO;
import com.ooteco.entity.tloan.model.TLoanVOExample;
import com.ooteco.service.TLoanVOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zk on 2017/7/25.
 */
@Service("tLoanVOService")
public class TLoanVOServiceImpl implements TLoanVOService {
    @Autowired
    TLoanVOMapper tLoanVOMapper;

    @Override
    public List<TLoanVO> findIsNotAllocationCompleteLists(List<Integer> alreadyAllocation,Integer phase,Integer lmd) {
        TLoanVOExample example = new TLoanVOExample();
        TLoanVOExample.Criteria criteria = example.createCriteria();
        criteria.andIsAllocationCompleteEqualTo(0l);
        criteria.andPhaseGreaterThanOrEqualTo(phase);
        if(alreadyAllocation.size()>0)
            criteria.andIdNotIn(alreadyAllocation);
        example.setOrderByClause(" start_date");
        List<TLoanVO> tLoanVOs = tLoanVOMapper.selectByExample(example);
        if(tLoanVOs.size()<lmd){
            example = new TLoanVOExample();
            criteria = example.createCriteria();
            criteria.andIsAllocationCompleteEqualTo(0l);
            if(alreadyAllocation.size()>0)
                criteria.andIdNotIn(alreadyAllocation);
            example.setOrderByClause(" start_date");
            List<TLoanVO> tLoanVOList = tLoanVOMapper.selectByExample(example);
            int forCount = tLoanVOs.size();
            for(int i = 0;i<lmd-forCount;i++){
                tLoanVOs.add(tLoanVOList.get(i));
            }
        }else{
            tLoanVOs = tLoanVOs.subList(0,lmd);
        }
        return tLoanVOs;
    }

    @Override
    public void update(TLoanVO tLoanVO) {
        tLoanVOMapper.updateByPrimaryKey(tLoanVO);
    }
}
