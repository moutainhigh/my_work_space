package com.ooteco.entity.match.model.resp;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MatchResp {

    public String financeCode;
    public List<MatchDetail> matchDetails;

    public MatchResp(){

    }

    public MatchResp(String financeCode, List<MatchDetail> matchDetails){
        this.financeCode = financeCode;
        this.matchDetails = matchDetails;
    }

    public Map<String, Object> getParamMap(){
        Map<String, Object> param = new HashMap<>();
        param.put("financeCode", financeCode);
        param.put("matchDetails", matchDetails);
        return param;
    }
}
