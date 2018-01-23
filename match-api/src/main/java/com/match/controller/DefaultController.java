package com.match.controller;

import com.match.dao.LoanChannelDao;
import com.match.domain.LoanChannel;
import com.match.service.LoanChannelService;
import com.match.utils.common.Message;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(value = "/")
public class DefaultController {

    @Resource
    private LoanChannelService loanChannelService;

    @RequestMapping(value ="/test",method = RequestMethod.GET,produces="application/json")
    public @ResponseBody Message<List<LoanChannel>> test() {
        //如要返回错误信息,原因, Service层调用 throw new ServiceException("","");
        return Message.success(loanChannelService.findAll());
    }



}
