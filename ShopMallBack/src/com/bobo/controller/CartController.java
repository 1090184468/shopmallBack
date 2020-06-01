package com.bobo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bobo.entity.Cart;
import com.bobo.entity.GoodsInfo;
import com.bobo.entity.User;
import com.bobo.service.CartService;
import com.bobo.util.JSONUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@RestController
public class CartController {
	
	@Autowired
	private CartService cartService;
	
	@RequestMapping("/insertGoodsToCart")
	public String insertGoodsToCart(Cart cart) {
		int num = cartService.insertGoodsToCart(cart);
		if(num>0) {
			return "{msg:'插入成功'}";
		}else {
			return "{msg:'插入失败'}";
		}
	}
	
	@RequestMapping("/getGoodsInfoByUserId")
	public String getGoodsInfoByUserId(Integer user_id) {

		return JSONUtil.returnJson(JSONArray.fromObject(cartService.getGoodsInfoByUserId(user_id)));
	}
	
	@RequestMapping("/updateGoodsInfoByUserId")
	public String updateGoodsInfoByUserId(Cart cart) {
		if(cartService.updateGoodsInfoByUserId(cart)>1) {
			return "{msg:修改成功}";
		}else {
			return "{msg:修改失败}";
		}
	}
	@RequestMapping("/deleteGoodsInfoFromCartByUserId")
	public String deleteGoodsInfoFromCartByUserId(Integer user_id,String goods_ids) {
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
		cartService.deleteGoodsInfoFromCartByUserId(map, goodsInfos);
		return "{msg:修改成功}";
	}
	
	
}
