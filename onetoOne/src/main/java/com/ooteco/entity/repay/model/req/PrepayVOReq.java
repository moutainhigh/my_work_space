package com.ooteco.entity.repay.model.req;

import com.ooteco.entity.repay.model.PrepayVO;
import com.ooteco.entity.req.BaseReq;

public class PrepayVOReq extends BaseReq {

    private PrepayVO prepayVO;

    public PrepayVO getPrepayVO() {
        return prepayVO;
    }

    public void setPrepayVO(PrepayVO prepayVO) {
        this.prepayVO = prepayVO;
    }
}
