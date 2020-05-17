package com.bobo.service;

import java.util.List;

import com.bobo.entity.GoodsInfo;

public interface GoodsInfoService {
	public List<GoodsInfo> findGoodsInfoForBanner();
	public List<GoodsInfo> findGoodsInfoForIsRecommended();
}
