package com.ooteco.service.biz;

import com.ooteco.dao.mapper.TLoanVOMapper;
import com.ooteco.entity.tloan.model.TLoanVO;
import com.ooteco.entity.tloan.model.TLoanVOExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service("tLoanVOServiceBiz")
public class TLoanVOServiceBiz {

    @Resource
    private TLoanVOMapper tLoanVOMapper;
    private TLoanVOExample example;
    private TLoanVOExample.Criteria criteria;

    public List<TLoanVO> getSpecialDateLoanRecords(Date date){
        initExample();
        criteria.andStartDateLessThanOrEqualTo(date)
                .andEndDateGreaterThanOrEqualTo(date);
        return tLoanVOMapper.selectByExample(example);
    }

    private void initExample(){
        example = new TLoanVOExample();
        criteria = example.createCriteria();
    }

}
