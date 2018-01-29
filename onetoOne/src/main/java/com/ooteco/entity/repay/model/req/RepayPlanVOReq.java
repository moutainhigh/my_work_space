package com.ooteco.entity.repay.model.req;

import com.ooteco.entity.repay.model.RepayPlanVO;
import com.ooteco.entity.repay.model.RepayVO;
import com.ooteco.entity.req.BaseReq;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

public class RepayPlanVOReq extends BaseReq {

    public String getRepayPlan() {
        return repayPlan;
    }

    public void setRepayPlan(String repayPlan) {
        this.repayPlan = repayPlan;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    private String repayPlan;

    private String details;

//    private RepayPlanVO repayPlan;
//
//    @NotNull(message = "还款明细不能为空")
//    private List<RepayVO> details;
//
//    @Valid
//    public RepayPlanVO getRepayPlan() {
//        return repayPlan;
//    }
//
//    public void setRepayPlan(RepayPlanVO repayPlan) {
//        this.repayPlan = repayPlan;
//    }
//
//    @Valid
//    public List<RepayVO> getDetails() {
//        return details;
//    }
//
//    public void setDetails(List<RepayVO> details) {
//        this.details = details;
//    }
}
