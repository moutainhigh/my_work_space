package com.ooteco.entity.match.model.resp;

import java.util.List;

public class MatchInfo {

    public String financeCode;
    public List<MatchDetail> matchDetails;
    public boolean isMatch;

    public MatchInfo(String financeCode, List<MatchDetail> matchDetails){
        this.financeCode = financeCode;
        this.matchDetails = matchDetails;
        if(matchDetails != null)
            isMatch = true;
    }
}
