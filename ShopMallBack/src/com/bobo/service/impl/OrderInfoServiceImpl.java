package com.bobo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bobo.dao.OrderInfoMapper;
import com.bobo.entity.GoodsInfo;
import com.bobo.entity.OrderInfo;
import com.bobo.service.OrderInfoService;
@Service
public class OrderInfoServiceImpl implements OrderInfoService {
	
	@Autowired
	private OrderInfoMapper orderInfoMapper;
	@Override
	public List<OrderInfo> getOrderInfo(OrderInfo o) {
		// TODO Auto-generated method stub
		return orderInfoMapper.getOrderInfo(o);
	}
	@Override
	public int updateOrderInfo(OrderInfo o) {
		// TODO Auto-generated method stub
		return orderInfoMapper.updateOrderInfo(o);
	}
	@Override
	public List<GoodsInfo> getGoodsInfoByOid(int o_id) {
		// TODO Auto-generated method stub
		return orderInfoMapper.getGoodsInfoByOid(o_id);
	}

}
