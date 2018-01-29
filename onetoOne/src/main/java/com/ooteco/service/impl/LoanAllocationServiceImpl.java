package com.ooteco.service.impl;

import com.ooteco.dao.mapper.LoanAllocationMapper;
import com.ooteco.entity.loanAllocation.model.LoanAllocation;
import com.ooteco.service.LoanAllocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zk on 2017/7/26.
 */
@Service("loanAllocationService")
public class LoanAllocationServiceImpl implements LoanAllocationService{
    @Autowired
    LoanAllocationMapper loanAllocationMapper;
    @Override
    public void insert(LoanAllocation loanAllocation) {
        loanAllocationMapper.insert(loanAllocation);
    }
}
