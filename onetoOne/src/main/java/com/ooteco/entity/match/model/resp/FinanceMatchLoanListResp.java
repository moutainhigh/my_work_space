package com.ooteco.entity.match.model.resp;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FinanceMatchLoanListResp {

    private boolean hasSubsidy;
    @JsonFormat(pattern = "yyyyMMdd")
    private Date subsidyStartDate;
    @JsonFormat(pattern = "yyyyMMdd")
    private Date subsidyEndDate;
    private List<MatchResultResp> list;

    public boolean isHasSubsidy() {
        return hasSubsidy;
    }

    public void setHasSubsidy(boolean hasSubsidy) {
        this.hasSubsidy = hasSubsidy;
    }

    public Date getSubsidyStartDate() {
        return subsidyStartDate;
    }

    public void setSubsidyStartDate(Date subsidyStartDate) {
        this.subsidyStartDate = subsidyStartDate;
    }

    public Date getSubsidyEndDate() {
        return subsidyEndDate;
    }

    public void setSubsidyEndDate(Date subsidyEndDate) {
        this.subsidyEndDate = subsidyEndDate;
    }

    public List<MatchResultResp> getList() {
        return list;
    }

    public void setList(List<MatchResultResp> list) {
        this.list = list;
    }

    public Map<String, Object> getRespMap(){
        HashMap<String, Object> map = new HashMap<>();
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        map.put("hasSubsidy", hasSubsidy);
        if(hasSubsidy){
            map.put("subsidyStartDate",dateFormat.format(subsidyStartDate));
            map.put("subsidyEndDate",dateFormat.format(subsidyEndDate));
        }
        map.put("list", list);
        return map;
    }
}
