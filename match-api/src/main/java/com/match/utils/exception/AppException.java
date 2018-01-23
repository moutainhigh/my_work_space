/*
 * Copyright (c) 2017 www.dashouyun.com All rights reserved.
 * 版权所有,未经许可不得任意复制与传播.
 */
package com.match.utils.exception;

/**
 * AppException
 * @author Generated
 * @since 2017-02-28
 */
public class AppException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	public AppException() {
		super();
	}
	
	public AppException(String message) {
		super(message);
	}
	
	public AppException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public AppException(Throwable cause) {
		super(cause);
	}
}
