package com.bobo.entity;

public class Goods_Type {
	/****/
	private  Integer  id;

	/****/
	private  String  type;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Goods_Type [id=" + id + ", type=" + type + "]";
	}
	
	
}
