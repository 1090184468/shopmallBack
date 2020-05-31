package com.bobo.service;

import java.util.List;
import java.util.Map;

import com.bobo.entity.Cart;
import com.bobo.entity.GoodsInfo;

public interface CartService {
	public int insertGoodsToCart(Cart cart);
	
	public List<Cart> getGoodsInfoByUserId(int user_id);
}
