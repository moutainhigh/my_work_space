package com.ooteco.service;

import com.ooteco.entity.financialSale.model.FinancialSaleVO;

import java.util.List;

/**
 * Created by zk on 2017/7/18.
 */
public interface FinancialSaleVOService {
    List<FinancialSaleVO> findList();
}
