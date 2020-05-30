package com.bobo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bobo.entity.GoodsInfo;
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
	@RequestMapping("/updateOrderInfo")
	public String updateOrderInfo(OrderInfo o) {
		int num=orderInfoService.updateOrderInfo(o);
		if(num>0) {
			return  "{msg:'修改成功'}";
		}else {
			return  "{msg:'修改失败'}";
		}
	}
	
	@RequestMapping("/getGoodsByOid")
	public String getGoodsByOid(Integer o_id) {
		List<GoodsInfo> goodsinfos=orderInfoService.getGoodsInfoByOid(o_id);
		
		return JSONUtil.returnJson(JSONArray.fromObject(goodsinfos));
		
	}
}
