package com.bobo.service;

import java.util.List;

import com.bobo.entity.GoodsInfo;
import java.util.Map;

public interface GoodsInfoService {
	public List<GoodsInfo> findGoodsInfoForBanner();
	public List<GoodsInfo> findGoodsInfoForIsRecommended();
	public List<GoodsInfo> findGoodsInfoByGoodsName(Map <String,String> searchInfo);
	
	public List<GoodsInfo> findGoodsInfoByType(String goods_type);
	
	public int updateGoodsInfoNum(GoodsInfo goodsInfo);
	public int assignGoodsInfoNum(GoodsInfo goodsInfo);
	public int addGoodsInfoNum(GoodsInfo goodsInfo);
}
