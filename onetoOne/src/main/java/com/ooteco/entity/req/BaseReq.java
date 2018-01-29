package com.ooteco.entity.req;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by zhoukang on 2017/08/28.
 */
public class BaseReq implements Serializable {

    private static final long serialVersionUID = 1L;

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    @NotNull(message = "sign can't be null.")
    private String sign;

    @NotNull(message = "timeStamp can't be null.")
    private String timeStamp;

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }
}
