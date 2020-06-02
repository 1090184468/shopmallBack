package com.bobo.dao;

import java.util.List;

import com.bobo.entity.GoodsInfo;
import com.bobo.entity.OrderInfo;

public interface OrderInfoMapper {
	public List<OrderInfo> getOrderInfo(OrderInfo o);
	
	public int updateOrderInfo(OrderInfo o);
	public List<GoodsInfo> getGoodsInfoByOid(int o_id);
	
	public OrderInfo getProduceOrderInfo(OrderInfo orderInfo);
}	
