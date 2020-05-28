package com.bobo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bobo.entity.OrderInfo;
import com.bobo.service.OrderInfoService;
import com.bobo.util.JSONUtil;

import net.sf.json.JSONArray;

@RestController
public class OrderInfoController {
	
	@Autowired
	private OrderInfoService orderInfoService;
	
	@RequestMapping("/getOrderByCondition")
	public String getOrderByCondition(OrderInfo o) {
		return JSONUtil.returnJson(JSONArray.fromObject(orderInfoService.getOrderInfo(o)));
	}
	
}
