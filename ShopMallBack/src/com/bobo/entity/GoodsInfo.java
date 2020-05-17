package com.bobo.entity;

public class GoodsInfo {
	/****/
	private  Integer  goods_id;

	/****/
	private  String  goods_name;

	/****/
	private  String  goods_price;

	/****/
	private  Integer  goods_num;

	/****/
	private  String  goods_img_path;

	/****/
	private  String  goods_type;

	/****/
	private  String  goods_profile;

	/****/
	private  String  is_hot;

	/****/
	private  String  is_recommend;

	private  GoodsType goods_typeName;
	public Integer getGoods_id() {
		return goods_id;
	}

	public void setGoods_id(Integer goods_id) {
		this.goods_id = goods_id;
	}

	public String getGoods_name() {
		return goods_name;
	}

	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}

	public String getGoods_price() {
		return goods_price;
	}

	public void setGoods_price(String goods_price) {
		this.goods_price = goods_price;
	}

	public Integer getGoods_num() {
		return goods_num;
	}

	public void setGoods_num(Integer goods_num) {
		this.goods_num = goods_num;
	}

	public String getGoods_img_path() {
		return goods_img_path;
	}

	public void setGoods_img_path(String goods_img_path) {
		this.goods_img_path = goods_img_path;
	}

	public String getGoods_type() {
		return goods_type;
	}

	public void setGoods_type(String goods_type) {
		this.goods_type = goods_type;
	}

	public String getGoods_profile() {
		return goods_profile;
	}

	public void setGoods_profile(String goods_profile) {
		this.goods_profile = goods_profile;
	}

	public String getIs_hot() {
		return is_hot;
	}

	public void setIs_hot(String is_hot) {
		this.is_hot = is_hot;
	}

	public String getIs_recommend() {
		return is_recommend;
	}

	public void setIs_recommend(String is_recommend) {
		this.is_recommend = is_recommend;
	}

	public GoodsType getGoods_typeName() {
		return goods_typeName;
	}

	public void setGoods_typeName(GoodsType goods_typeName) {
		this.goods_typeName = goods_typeName;
	}

	@Override
	public String toString() {
		return "GoodsInfo [goods_id=" + goods_id + ", goods_name=" + goods_name + ", goods_price=" + goods_price
				+ ", goods_num=" + goods_num + ", goods_img_path=" + goods_img_path + ", goods_type=" + goods_type
				+ ", goods_profile=" + goods_profile + ", is_hot=" + is_hot + ", is_recommend=" + is_recommend
				+ ", goods_typeName=" + goods_typeName + "]";
	}
}
