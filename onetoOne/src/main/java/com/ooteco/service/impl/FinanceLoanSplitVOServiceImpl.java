package com.ooteco.service.impl;

import com.ooteco.entity.split.model.FinanceLoanSplitVO;
import com.ooteco.service.FinanceLoanSplitVOService;
import com.ooteco.service.biz.FinanceLoanSplitVOServiceBiz;
import com.ooteco.service.biz.SplitServiceBiz;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;

@Service("financeLoanSplitVOService")
public class FinanceLoanSplitVOServiceImpl implements FinanceLoanSplitVOService{

    @Resource
    private FinanceLoanSplitVOServiceBiz financeLoanSplitVOServiceBiz;
    @Resource
    private SplitServiceBiz splitServiceBiz;

    @Override
    @Transactional
    public void insert(Date date) {
        FinanceLoanSplitVO  record = splitServiceBiz.split(date);
        financeLoanSplitVOServiceBiz.delete(date);
        financeLoanSplitVOServiceBiz.insert(record);
    }
}
