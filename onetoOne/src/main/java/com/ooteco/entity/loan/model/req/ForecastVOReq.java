package com.ooteco.entity.loan.model.req;

import com.ooteco.entity.req.BaseReq;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Created by zk on 2017/8/29.
 */
public class ForecastVOReq extends BaseReq{
    @DateTimeFormat(pattern="yyyyMMdd")
    private Date repaymentDate;

    public Date getRepaymentDate() {
        return repaymentDate;
    }

    public void setRepaymentDate(Date repaymentDate) {
        this.repaymentDate = repaymentDate;
    }
}
