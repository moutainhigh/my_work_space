package com.ooteco.service.impl;

import com.ooteco.dao.mapper.FinancialSaleVOMapper;
import com.ooteco.entity.financialSale.model.FinancialSaleVOExample;
import com.ooteco.entity.financialSale.model.FinancialSaleVO;
import com.ooteco.service.FinancialSaleVOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zk on 2017/7/18.
 */
@Service("financialSaleVOService")
public class FinancialSaleVOServiceImpl implements FinancialSaleVOService {

    @Autowired
    private FinancialSaleVOMapper financialSaleVOMapper;

    @Override
    public List<FinancialSaleVO> findList() {
        FinancialSaleVOExample example = new FinancialSaleVOExample();
        example.setOrderByClause(" create_time");
        return financialSaleVOMapper.selectByExample(example);
    }
}
