package com.bobo.entity;

public class Cart {
	/****/
	private  Integer  user_id;

	/****/
	private  Integer  goods_id;

	/****/
	private  Integer  num;

	/****/
	private  String  add_time;

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public Integer getGoods_id() {
		return goods_id;
	}

	public void setGoods_id(Integer goods_id) {
		this.goods_id = goods_id;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public String getAdd_time() {
		return add_time;
	}

	public void setAdd_time(String add_time) {
		this.add_time = add_time;
	}

	@Override
	public String toString() {
		return "Cart [user_id=" + user_id + ", goods_id=" + goods_id + ", num=" + num + ", add_time=" + add_time + "]";
	}
    
	
	
}
