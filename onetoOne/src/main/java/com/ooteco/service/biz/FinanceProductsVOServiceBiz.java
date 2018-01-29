package com.ooteco.service.biz;

import com.ooteco.dao.mapper.FinanceProductsVOMapper;
import com.ooteco.entity.financeProducts.model.FinanceProductsVO;
import com.ooteco.entity.financeProducts.model.FinanceProductsVOExample;
import com.ooteco.utils.DateUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service("financeProductsVOServiceBiz")
public class FinanceProductsVOServiceBiz {

    @Resource
    private FinanceProductsVOMapper financeProductsVOMapper;
    private FinanceProductsVOExample example;
    private FinanceProductsVOExample.Criteria criteria;

    public List<FinanceProductsVO> getSpecialDateRecords(Date date){
        initExample();
        criteria.andCarryInterestDateLessThanOrEqualTo(date)
                .andExpireDateGreaterThanOrEqualTo(date);
        return financeProductsVOMapper.selectByExample(example);
    }

    public List<FinanceProductsVO> getExpireRecords(Date date){
        initExample();
        criteria.andExpireDateEqualTo(DateUtils.addDays(date, -1));
        return financeProductsVOMapper.selectByExample(example);
    }

    public void initExample(){
        example = new FinanceProductsVOExample();
        criteria = example.createCriteria();
    }
}
