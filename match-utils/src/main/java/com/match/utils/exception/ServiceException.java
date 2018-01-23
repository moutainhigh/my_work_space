package com.match.utils.exception;

/**
 * Created by waii on 2017/4/9.
 */
public class ServiceException extends RuntimeException {
    public static final String OK = "ok";



    private String code;

    public ServiceException(String code, String message) {
        super(message);
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
