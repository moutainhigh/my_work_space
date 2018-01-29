package com.ooteco.service.biz;


import com.ooteco.dao.mapper.FinanceLoanSplitVOMapper;
import com.ooteco.entity.split.model.FinanceLoanSplitVO;
import com.ooteco.entity.split.model.FinanceLoanSplitVOExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

@Service("financeLoanSplitVOServiceBiz")
public class FinanceLoanSplitVOServiceBiz {

    @Resource
    private FinanceLoanSplitVOMapper financeLoanSplitVOMapper;
    private FinanceLoanSplitVOExample example;
    private FinanceLoanSplitVOExample.Criteria criteria;

    public int insert(FinanceLoanSplitVO financeLoanSplitVO){
        return financeLoanSplitVOMapper.insertSelective(financeLoanSplitVO);
    }

    public int delete(Date date){
        return financeLoanSplitVOMapper.deleteByPrimaryKey(date);
    }

    private void initExample(){
        example = new FinanceLoanSplitVOExample();
        criteria = example.createCriteria();
    }

}
