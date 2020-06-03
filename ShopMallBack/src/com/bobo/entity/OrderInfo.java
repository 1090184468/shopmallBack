package com.bobo.entity;

public class OrderInfo {
	/****/
	private  Integer  o_id;

	/****/
	private  String  o_receiver;

	/****/
	private  String  o_address;

	/****/
	private  String  o_phone;

	/****/
	private  Integer  o_user_id;

	/****/
	private  String  o_payState;

	/****/
	private  String o_date;

	/****/
	private  String  o_receiveState;

	/****/
	private  String  o_sendState;

	/****/
	private  String  o_isCancel;

	/****/
	private  String  o_changeState;

	
	private Integer orderIndex;
	private Integer orderSize;
	
	
	public Integer getOrderIndex() {
		return orderIndex;
	}

	public void setOrderIndex(Integer orderIndex) {
		this.orderIndex = orderIndex;
	}

	public Integer getOrderSize() {
		return orderSize;
	}

	public void setOrderSize(Integer orderSize) {
		this.orderSize = orderSize;
	}

	public Integer getO_id() {
		return o_id;
	}

	public void setO_id(Integer o_id) {
		this.o_id = o_id;
	}

	public String getO_receiver() {
		return o_receiver;
	}

	public void setO_receiver(String o_receiver) {
		this.o_receiver = o_receiver;
	}

	public String getO_address() {
		return o_address;
	}

	public void setO_address(String o_address) {
		this.o_address = o_address;
	}

	public String getO_phone() {
		return o_phone;
	}

	public void setO_phone(String o_phone) {
		this.o_phone = o_phone;
	}

	public Integer getO_user_id() {
		return o_user_id;
	}

	public void setO_user_id(Integer o_user_id) {
		this.o_user_id = o_user_id;
	}

	public String getO_payState() {
		return o_payState;
	}

	public void setO_payState(String o_payState) {
		this.o_payState = o_payState;
	}

	public String getO_date() {
		return o_date;
	}

	public void setO_date(String o_date) {
		this.o_date = o_date;
	}

	public String getO_receiveState() {
		return o_receiveState;
	}

	public void setO_receiveState(String o_receiveState) {
		this.o_receiveState = o_receiveState;
	}

	public String getO_sendState() {
		return o_sendState;
	}

	public void setO_sendState(String o_sendState) {
		this.o_sendState = o_sendState;
	}

	public String getO_isCancel() {
		return o_isCancel;
	}

	public void setO_isCancel(String o_isCancel) {
		this.o_isCancel = o_isCancel;
	}

	public String getO_changeState() {
		return o_changeState;
	}

	public void setO_changeState(String o_changeState) {
		this.o_changeState = o_changeState;
	}

	public OrderInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "OrderInfo [o_id=" + o_id + ", o_receiver=" + o_receiver + ", o_address=" + o_address + ", o_phone="
				+ o_phone + ", o_user_id=" + o_user_id + ", o_payState=" + o_payState + ", o_date=" + o_date
				+ ", o_receiveState=" + o_receiveState + ", o_sendState=" + o_sendState + ", o_isCancel=" + o_isCancel
				+ ", o_changeState=" + o_changeState + "]";
	}
	
	
}
