package com.ooteco.controllers;

import com.ooteco.common.ResponseEntity;
import com.ooteco.entity.match.model.resp.FinanceMatchLoanListResp;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("test")
public class TestController {

    @RequestMapping("date_test")
    public ResponseEntity dateReturnTest(){
        FinanceMatchLoanListResp resp = new FinanceMatchLoanListResp();
        resp.setSubsidyEndDate(new Date());
        resp.setSubsidyStartDate(new Date());
        return ResponseEntity.success().addData("result",resp);
    }
}
