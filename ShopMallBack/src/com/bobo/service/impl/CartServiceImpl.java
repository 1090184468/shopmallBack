package com.bobo.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bobo.dao.CartMapper;
import com.bobo.entity.Cart;
import com.bobo.entity.GoodsInfo;
import com.bobo.service.CartService;
import com.bobo.service.GoodsInfoService;
@Transactional
@Service
public class CartServiceImpl implements CartService {

	@Autowired
	private CartMapper cartMapper;
	@Autowired
	private GoodsInfoService goodsInfoService;
	
	@Override
	public int insertGoodsToCart(Cart cart) {
		// TODO Auto-generated method stub
		int num=cartMapper.findCartByUserIdAndGoodsId(cart);
		GoodsInfo goodsInfo=new GoodsInfo();
		goodsInfo.setGoods_id(cart.getGoods_id());
		goodsInfo.setGoods_num(cart.getNum());
		goodsInfoService.updateGoodsInfoNum(goodsInfo);
		if(num>0) {
			return cartMapper.updateCartByUserIdAndGoodsId(cart);
		}else {
			return cartMapper.insertGoodsToCart(cart);
		}
		
		
	}

}
