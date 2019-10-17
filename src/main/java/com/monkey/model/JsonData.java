package com.monkey.model;

import java.io.Serializable;

public class JsonData implements Serializable{

	private static final long serialVersionUID = 1L;

	/** 状态码  0 成功 -1 失败*/
	private int code;
	
	/** 结果 */
	private Object data;
	
	/** 错误信息 */
	private String message;

	public JsonData(Object data) {
		super();
		this.code = 0;
		this.data = data;
	}

	public JsonData(Object data, String message) {
		super();
		this.code = -1;
		this.data = data;
		this.message = message;
	}



	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
