package com.ooteco.service.biz;


import com.ooteco.entity.financeProducts.model.FinanceProductsVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Service("FinanceSplitServiceBiz")
public class FinanceSplitServiceBiz {

    @Resource
    private FinanceProductsVOServiceBiz financeProductsVOServiceBiz;

    public BigDecimal splitRaiseAmount(Date date){
        List<FinanceProductsVO> records = financeProductsVOServiceBiz.getSpecialDateRecords(date);
        return splitSalesVolume(records);
    }

    public BigDecimal splitRedemptionAmount(Date date){
        List<FinanceProductsVO> records = financeProductsVOServiceBiz.getExpireRecords(date);
        return splitSalesVolume(records);
    }

    private BigDecimal splitSalesVolume(List<FinanceProductsVO> list){
        return list.stream()
                .map(r -> r.getSalesVolume() == null ? new BigDecimal(0) : r.getSalesVolume())
                .reduce((a,b) -> a.add(b))
                .orElse(new BigDecimal(0));
    }
}
