package com.bobo.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bobo.service.GoodsInfoService;
import com.bobo.service.GoodsTypeService;
import com.bobo.service.UserService;

import net.sf.json.JSON;
import net.sf.json.JSONArray;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	@Autowired
	private GoodsTypeService goodsTypeService;
	@Autowired
	private GoodsInfoService goodsInfoService;
	
	@RequestMapping("/UserLogin")
	public String userLogin(String id) {
		System.out.println(666);
		return "登录成功";
	}
	@RequestMapping(value="/home")
	public String home(HttpServletResponse response) {
		JSONArray goodsInfoBanner=JSONArray.fromObject(goodsInfoService.findGoodsInfoForBanner());
		JSONArray goodsInfoRecommand=JSONArray.fromObject(goodsInfoService.findGoodsInfoForIsRecommended());
		JSONArray goodsType=JSONArray.fromObject(goodsTypeService.findGoodsTypeForDisplay());
		return "{code:200,msg:'请求成功',result:{"
				+ "goodsInfoBanner:"+goodsInfoBanner+","
				+"goodsInfoRecommand:"+goodsInfoRecommand+","
				+"goodsType:"+goodsType
				+ "}}";
	}
}
