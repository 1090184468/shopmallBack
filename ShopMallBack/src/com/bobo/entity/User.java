package com.bobo.entity;

public class User {
	/**
	 * 用户id
	 * */
	private  Integer  user_id;

	/**
	 * 用户名 
	 **/
	private  String  username;

	/**
	 * 用户密码
	 * */
	private  String  password;

	/**
	 * 用户类型
	 * */
	private  Integer  user_type;

	/**
	 * 用户手机号码
	 * */
	private  String  user_phone;

	/**
	 * 用户收货地址
	 * */
	private  String  user_addr;

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getUser_type() {
		return user_type;
	}

	public void setUser_type(Integer user_type) {
		this.user_type = user_type;
	}

	public String getUser_phone() {
		return user_phone;
	}

	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}

	public String getUser_addr() {
		return user_addr;
	}

	public void setUser_addr(String user_addr) {
		this.user_addr = user_addr;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", username=" + username + ", password=" + password + ", user_type="
				+ user_type + ", user_phone=" + user_phone + ", user_addr=" + user_addr + "]";
	}
	
	
}
