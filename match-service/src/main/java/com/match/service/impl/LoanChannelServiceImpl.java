package com.match.service.impl;

import com.match.dao.LoanChannelDao;
import com.match.domain.LoanChannel;
import com.match.service.LoanChannelService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("loanChannelService")
public class LoanChannelServiceImpl implements LoanChannelService{

    @Resource
    private LoanChannelDao loanChannelDao;

    @Override
    public List<LoanChannel> findAll() {
        return loanChannelDao.selectEntryList(new LoanChannel());
    }
}
