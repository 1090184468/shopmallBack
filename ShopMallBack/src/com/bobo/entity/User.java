package com.bobo.entity;

public class User {
	private String id;
	private String t_name;
	private String t_age;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getT_name() {
		return t_name;
	}
	public void setT_name(String t_name) {
		this.t_name = t_name;
	}
	public String getT_age() {
		return t_age;
	}
	public void setT_age(String t_age) {
		this.t_age = t_age;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", t_name=" + t_name + ", t_age=" + t_age + "]";
	}
	
	
}
