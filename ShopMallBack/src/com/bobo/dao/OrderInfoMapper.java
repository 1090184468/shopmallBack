package com.bobo.dao;

import java.util.List;
import java.util.Map;

import com.bobo.entity.GoodsInfo;
import com.bobo.entity.OrderInfo;

public interface OrderInfoMapper {
	public List<OrderInfo> getOrderInfo(OrderInfo o);
	
	public int updateOrderInfo(OrderInfo o);
	public List<GoodsInfo> getGoodsInfoByOid(int o_id);
	
	public int getProduceOrderInfo(OrderInfo orderInfo);
	
	public int insertGoodsInfoToOrderInfo(Map<String,String> map);
	
	public int payOrderByOid(int o_id);
	
	
}	
