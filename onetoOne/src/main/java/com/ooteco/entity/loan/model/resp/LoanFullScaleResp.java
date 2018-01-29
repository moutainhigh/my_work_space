package com.ooteco.entity.loan.model.resp;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ooteco.entity.match.model.resp.MatchResultResp;
import com.ooteco.utils.DateUtils;

import java.util.*;

public class LoanFullScaleResp {

    public String loanCode;
    public String soldOutTime;
    public List<LoanFullScaleDetail> list;

    public LoanFullScaleResp(String loanCode, List<LoanFullScaleDetail> list){
        this.soldOutTime = DateUtils.getTimeStamp();
        this.loanCode = loanCode;
        this.list = list;
    }
}
