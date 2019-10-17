package com.monkey.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
	/**
	 * 空值不返回
	 */
	@JsonInclude(Include.NON_NULL)
	private String name;
	
	/**
	 * 此字段忽略，不返回
	 */
	@JsonIgnore
	private String telphone;
	
	private int age;
	
	/**
	 * 字段别名，返回的名称
	 */
	@JsonProperty("account")
	private String email;
	
	/**
	 * 设置时间的格式
	 */
	@JsonFormat(pattern="yyyy-MM-dd hh:mm:ss", locale="zh", timezone="GMT+8")
	private Date createTime;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelphone() {
		return telphone;
	}

	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public User(String name, String telphone, int age, String email, Date createTime) {
		super();
		this.name = name;
		this.telphone = telphone;
		this.age = age;
		this.email = email;
		this.createTime = createTime;
	}
}
