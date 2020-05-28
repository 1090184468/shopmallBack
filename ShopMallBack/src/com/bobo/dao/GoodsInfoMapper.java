package com.bobo.dao;

import java.util.List;

import com.bobo.entity.GoodsInfo;
import java.util.Map;

public interface GoodsInfoMapper {
	public List<GoodsInfo> findGoodsInfoForBanner();
	public List<GoodsInfo> findGoodsInfoForIsRecommended();
	public List<GoodsInfo> findGoodsInfoByGoodsName(Map<String, String> searchInfo);
	
	public List<GoodsInfo> findGoodsInfoByType(String goods_type);
	public int updateGoodsInfoNum(GoodsInfo goodsInfo);
}
