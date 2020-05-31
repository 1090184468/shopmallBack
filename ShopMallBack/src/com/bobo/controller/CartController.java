package com.bobo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bobo.entity.Cart;
import com.bobo.entity.User;
import com.bobo.service.CartService;
import com.bobo.util.JSONUtil;

import net.sf.json.JSONArray;

@RestController
public class CartController {
	
	@Autowired
	private CartService cartService;
	
	@RequestMapping("insertGoodsToCart")
	public String insertGoodsToCart(Cart cart) {
		int num = cartService.insertGoodsToCart(cart);
		if(num>0) {
			return "{msg:'插入成功'}";
		}else {
			return "{msg:'插入失败'}";
		}
	}
	
	@RequestMapping("getGoodsInfoByUserId")
	public String getGoodsInfoByUserId(Integer user_id) {

		return JSONUtil.returnJson(JSONArray.fromObject(cartService.getGoodsInfoByUserId(user_id)));
	}
	

	
}
