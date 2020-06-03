package com.bobo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	
	@RequestMapping("/produceOrderInfo")
	public String produceOrderInfo(Integer user_id,String goods_ids){
		String g_ids="(";
		String []goods_idAndNum=goods_ids.split(";");
		List<GoodsInfo> goodsInfos=new ArrayList<>();
		for(int i=0;i<goods_idAndNum.length;i++) {
			GoodsInfo goodsInfo=new GoodsInfo();
			goodsInfo.setGoods_id(Integer.parseInt(goods_idAndNum[i].split(",")[0]));
			goodsInfo.setGoods_num(Integer.parseInt(goods_idAndNum[i].split(",")[1]));
			goodsInfos.add(goodsInfo);
			if(i!=goods_idAndNum.length-1) {
				g_ids+=goods_idAndNum[i].split(",")[0]+",";
			}else {
				g_ids+=goods_idAndNum[i].split(",")[0]+")";
			}
		}
		Map <String,String> map=new HashMap<String, String>();
		map.put("user_id",user_id+"");
		map.put("goods_ids", g_ids);
		Integer o_id=orderInfoService.produceOrderInfo(map, goodsInfos);
		if(o_id>0) {
			return "{msg:'生成订单成功',o_id:"+o_id+"}";
		}else {
			return "{msg:'生成订单失败',o_id:'-1'}";
		}
	}
	@RequestMapping("/produceOrderInfoForImmediate")
	public String produceOrderInfoForImmediate(Integer user_id,String goods_ids){
		String g_ids="(";
		String []goods_idAndNum=goods_ids.split(";");
		GoodsInfo goodsInfo=new GoodsInfo();
		goodsInfo.setGoods_id(Integer.parseInt(goods_ids.split(",")[0]));
		goodsInfo.setGoods_num(Integer.parseInt(goods_ids.split(",")[1]));
		g_ids+=goods_ids.split(",")[0]+")";
		Map <String,String> map=new HashMap<String, String>();
		map.put("user_id",user_id+"");
		map.put("goods_ids", g_ids);
		Integer o_id=orderInfoService.produceOrderInfoForImmediate(map, goodsInfo);
		if(o_id>0) {
			return "{msg:'生成订单成功',o_id:"+o_id+"}";
		}else {
			return "{msg:'生成订单失败',o_id:'-1'}";
		}
	}
	@RequestMapping("/getOrderTotalPrice")
	public String getOrderTotalPrice(Integer o_id){
		List<GoodsInfo> goodsInfos=orderInfoService.getGoodsInfoByOid(o_id);
		double totalPrice=0;
		for (GoodsInfo goodsInfo : goodsInfos) {
			totalPrice+=goodsInfo.getGoods_num()*Double.parseDouble(goodsInfo.getGoods_price());
		}
		if(o_id>0) {
			return "{msg:'获取订单总价成功',totalPrice:"+totalPrice+"}";
		}else {
			return "{msg:'获取订单总价失败',totalPrice:'-1'}";
		}
	}
	@RequestMapping("/payOrderByOid")
	public String payOrderByOid(Integer o_id){
		int num=orderInfoService.payOrderByOid(o_id);
		if(num>0) {
			return "{msg:'付款成功'}";
		}else {
			return "{msg:'付款失败'}";
		}
	}
	
	
	
}
