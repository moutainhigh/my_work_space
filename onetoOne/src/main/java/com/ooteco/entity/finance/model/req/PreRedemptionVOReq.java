package com.ooteco.entity.finance.model.req;

import com.ooteco.entity.finance.model.PreRedemptionVO;
import com.ooteco.entity.req.BaseReq;

public class PreRedemptionVOReq extends BaseReq {

    private PreRedemptionVO preRedemptionVO;

    public PreRedemptionVO getPreRedemptionVO() {
        return preRedemptionVO;
    }

    public void setPreRedemptionVO(PreRedemptionVO preRedemptionVO) {
        this.preRedemptionVO = preRedemptionVO;
    }
}
