package com.bobo.service;

import java.util.List;
import java.util.Map;

import com.bobo.entity.GoodsInfo;
import com.bobo.entity.OrderInfo;

public interface OrderInfoService {
	public List<OrderInfo> getOrderInfo(OrderInfo o);
	public int updateOrderInfo(OrderInfo o);
	public List<GoodsInfo> getGoodsInfoByOid(int o_id);
	public int produceOrderInfo(Map<String,String> map, List<GoodsInfo> goodsInfos);
	public int produceOrderInfoForImmediate(Map<String,String> map, GoodsInfo goodsInfo);
	public int payOrderByOid(int o_id);
}
