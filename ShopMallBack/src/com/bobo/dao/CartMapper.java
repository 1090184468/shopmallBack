package com.bobo.dao;

import java.util.Map;

import com.bobo.entity.Cart;

public interface CartMapper {
	public int insertGoodsToCart(Cart cart);
	public int findCartByUserIdAndGoodsId(Cart cart);
	public int updateCartByUserIdAndGoodsId(Cart cart);
}
