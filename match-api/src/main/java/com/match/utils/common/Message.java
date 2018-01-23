package com.match.utils.common;


/**
 * 页面消息
 * @author Generated
 * @since 2017-02-28
 */
public class Message<A> {
	public static final String OK = "Ok";
	public static final String FAILED = "Failed";
	public static final String FAILED_NEEDLOGIN = "NeedLogin";
	public static final String FAILED_NOTFOUND  = "NotFound";
	
	private String code;// 编码
	
	private String result;// 结果
	
	private A data;// 数据
	
//	public Message() {
//		// 默认构造方法
//	}

//	/**
//	 * 
//	 * @deprecated 请使用完整的Message构造函数 Message(String, String, A)
//	 * @param code
//	 * @param result
//	 */
//	public Message(String code, String result) {
//		this.code = code;
//		this.result = result;
//	}
	
	public Message(String code, String result, A data) {
		this.code   = code;
		this.result = result;
		this.data   = data;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	
	@SuppressWarnings("unchecked")
	public A getData() {
		return data;
	}
	
	public void setData(A data) {
		this.data = data;
	}
	
	public static <T> Message<T> success(T data) {
		return new Message<T>(OK, "", data);
	}

	/**
	 * @param code
	 * @param result
	 * @return
	 */
	public static <T> Message<T> create(String code, String result) {
		return new Message<T>(code, result, null);
	}

	public static <T> Message<T> success() {
		return new Message<T>(OK, "操作成功!", null);
	}
	
	public static <T> Message<T> success(String msg) {
		return new Message <T>(OK, msg, null);
	}

	public static <T> Message <T> failure() {
		return new Message<T>(FAILED, "操作失败!", null);
	}
	
	public static <T> Message<T> failure(String msg) {
		return new Message<T>(FAILED, msg, null);
	}

//	public static <T> Message<T> failure(Exception ex) {
//		return failure("系统异常:"+ex.getMessage(),ex);
//	}
//
//	public static <T> Message <T> failure(String message, Exception ex) {
//		if(ex == null) {
//			return failure();
//		}
//		Message msg = failure(message);
//		try {
//			StringWriter sw = new StringWriter();
//			ex.printStackTrace(new PrintWriter(sw));
//			msg.setData(sw.toString());
//		} catch (Exception e) {
//		}
//		return msg;
//	}
}
