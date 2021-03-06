package com.bobo.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bobo.dao.CartMapper;
import com.bobo.dao.GoodsInfoMapper;
import com.bobo.dao.OrderInfoMapper;
import com.bobo.dao.UserMapper;
import com.bobo.entity.GoodsInfo;
import com.bobo.entity.OrderInfo;
import com.bobo.entity.User;
import com.bobo.service.OrderInfoService;
import com.bobo.service.UserService;
import com.bobo.util.TimeUtil;
@Service
public class OrderInfoServiceImpl implements OrderInfoService {
	
	@Autowired
	private OrderInfoMapper orderInfoMapper;
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private CartMapper cartMapper;
	@Autowired
	private GoodsInfoMapper goodsInfoMapper;
	@Override
	public List<OrderInfo> getOrderInfo(OrderInfo o) {
		// TODO Auto-generated method stub
		return orderInfoMapper.getOrderInfo(o);
	}
	@Override
	public int updateOrderInfo(OrderInfo o) {
		// TODO Auto-generated method stub
		return orderInfoMapper.updateOrderInfo(o);
	}
	@Override
	public List<GoodsInfo> getGoodsInfoByOid(int o_id) {
		// TODO Auto-generated method stub
		return orderInfoMapper.getGoodsInfoByOid(o_id);
	}
	@Override
	@Transactional
	public int produceOrderInfo(Map<String, String> map, List<GoodsInfo> goodsInfos) {
		// TODO Auto-generated method stub
		String user_id=map.get("user_id");
		User user=userMapper.findUserById(Integer.parseInt(user_id));
		OrderInfo orderInfo=new OrderInfo();
		orderInfo.setO_receiver(user.getUsername());
		orderInfo.setO_address(user.getUser_addr());
		orderInfo.setO_phone(user.getUser_phone());
		orderInfo.setO_user_id(Integer.parseInt(user_id));
		orderInfo.setO_payState("0");
		orderInfo.setO_date(TimeUtil.getDatetime("yyyy-MM-dd HH:mm:ss"));
		orderInfo.setO_receiveState("0");
		orderInfo.setO_sendState("0");
		orderInfo.setO_isCancel("0");
		orderInfo.setO_changeState("0");
		
		//生成新订单
		orderInfoMapper.getProduceOrderInfo(orderInfo);
		//删除购物车的商品
		cartMapper.deleteGoodsFromCart(map);
		Map<String,String> order_goods=new HashMap<String, String>();
		order_goods.put("o_id","");
		order_goods.put("goods_id", "");
		order_goods.put("num", "num");
		//插入到订单商品表
		for (GoodsInfo goodsInfo : goodsInfos) {
			order_goods.put("o_id", orderInfo.getO_id()+"");
			order_goods.put("goods_id", goodsInfo.getGoods_id()+"");
			order_goods.put("num", goodsInfo.getGoods_num()+"");
			orderInfoMapper.insertGoodsInfoToOrderInfo(order_goods);
		}
		
		return orderInfo.getO_id();
	}
	@Override
	public int produceOrderInfoForImmediate(Map<String, String> map, GoodsInfo goodsInfo) {
		String user_id=map.get("user_id");
		User user=userMapper.findUserById(Integer.parseInt(user_id));
		OrderInfo orderInfo=new OrderInfo();
		orderInfo.setO_receiver(user.getUsername());
		orderInfo.setO_address(user.getUser_addr());
		orderInfo.setO_phone(user.getUser_phone());
		orderInfo.setO_user_id(Integer.parseInt(user_id));
		orderInfo.setO_payState("0");
		orderInfo.setO_date(TimeUtil.getDatetime("yyyy-MM-dd HH:mm:ss"));
		orderInfo.setO_receiveState("0");
		orderInfo.setO_sendState("0");
		orderInfo.setO_isCancel("0");
		orderInfo.setO_changeState("0");
		
		//生成新订单
		orderInfoMapper.getProduceOrderInfo(orderInfo);
		//删除商品数量
		goodsInfoMapper.updateGoodsInfoNum(goodsInfo);
		Map<String,String> order_goods=new HashMap<String, String>();
		//插入到订单商品表
		order_goods.put("o_id", orderInfo.getO_id()+"");
		order_goods.put("goods_id", goodsInfo.getGoods_id()+"");
		order_goods.put("num", goodsInfo.getGoods_num()+"");
		orderInfoMapper.insertGoodsInfoToOrderInfo(order_goods);
		
		return orderInfo.getO_id();
	}
	@Override
	public int payOrderByOid(int o_id) {
		// TODO Auto-generated method stub
		return orderInfoMapper.payOrderByOid(o_id);
	}

}
