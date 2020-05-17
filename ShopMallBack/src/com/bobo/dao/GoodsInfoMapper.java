package com.bobo.dao;

import java.util.List;

import com.bobo.entity.GoodsInfo;

public interface GoodsInfoMapper {
	public List<GoodsInfo> findGoodsInfoForBanner();
	public List<GoodsInfo> findGoodsInfoForIsRecommended();
}
