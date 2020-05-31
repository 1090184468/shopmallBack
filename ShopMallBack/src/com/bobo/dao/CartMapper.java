package com.bobo.dao;

import java.util.List;
import java.util.Map;

import com.bobo.entity.Cart;
import com.bobo.entity.GoodsInfo;

public interface CartMapper {
	public int insertGoodsToCart(Cart cart);
	public int findCartByUserIdAndGoodsId(Cart cart);
	public int updateCartByUserIdAndGoodsId(Cart cart);
	
	public List<Cart> getGoodsInfoByUserId(int user_id);
}
