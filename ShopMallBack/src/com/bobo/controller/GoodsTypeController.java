package com.bobo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bobo.entity.GoodsType;
import com.bobo.service.GoodsTypeService;

import net.sf.json.JSONArray;

@RestController
public class GoodsTypeController {
	@Autowired
	private GoodsTypeService goodsTypeService;
	
	
	@RequestMapping("/allGoodsType")
	public String allGoodsType(){
		List<GoodsType> findAllGoodsTypes = goodsTypeService.findAllGoodsTypes();
		return "{allGoodsType:"+JSONArray.fromObject(findAllGoodsTypes).toString()+"}";
	}
}
