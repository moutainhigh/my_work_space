package com.ooteco.entity.finance.model.req;

import com.ooteco.entity.finance.model.FinanceVO;
import com.ooteco.entity.req.BaseReq;

public class FinanceVOReq extends BaseReq{

    private FinanceVO financeVO;

    public FinanceVO getFinanceVO() {
        return financeVO;
    }

    public void setFinanceVO(FinanceVO financeVO) {
        this.financeVO = financeVO;
    }
}
