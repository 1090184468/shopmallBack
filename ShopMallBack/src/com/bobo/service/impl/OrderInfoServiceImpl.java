package com.bobo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bobo.dao.OrderInfoMapper;
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

}
