package com.bobo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bobo.service.GoodsInfoService;
import com.bobo.util.JSONUtil;

import net.sf.json.JSONArray;

@RestController
public class GoodsInfoController {
	
	@Autowired
	private GoodsInfoService goodsInfoService;
	
	@RequestMapping(value="/searchGoodsInfo")
	public String searchGoodsInfo(String search_goods_name,String is_price_down,String goodsIndex,String goodsSize) {
		Map<String,String> searchInfo=new HashMap<String,String>();
		searchInfo.put("searchGoodsName", search_goods_name);
		searchInfo.put("isPriceDown",is_price_down);
		searchInfo.put("goodsIndex", goodsIndex);
		searchInfo.put("goodsSize",goodsSize);
		return JSONUtil.returnJson(JSONArray.fromObject(goodsInfoService.findGoodsInfoByGoodsName(searchInfo)));
	}
	@RequestMapping(value="/searchGoodsInfoByGoodsType")
	public String searchGoodsInfo(String goods_type) {
		
		
		return JSONUtil.returnJson(JSONArray.fromObject(goodsInfoService.findGoodsInfoByType(goods_type)));
	}
	
}
