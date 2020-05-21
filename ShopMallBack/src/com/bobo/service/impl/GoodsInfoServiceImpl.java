package com.bobo.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bobo.dao.GoodsInfoMapper;
import com.bobo.entity.GoodsInfo;
import com.bobo.service.GoodsInfoService;


@Service
public class GoodsInfoServiceImpl implements GoodsInfoService {
	@Autowired
    private GoodsInfoMapper goodsInfoMapper;
	@Override
	public  List<GoodsInfo> findGoodsInfoForBanner() {
		// TODO Auto-generated method stub
		return goodsInfoMapper.findGoodsInfoForBanner();
	}

	@Override
	public  List<GoodsInfo> findGoodsInfoForIsRecommended() {
		// TODO Auto-generated method stub
		return goodsInfoMapper.findGoodsInfoForIsRecommended();
	}

	@Override
	public List<GoodsInfo> findGoodsInfoByGoodsName(Map<String, String> searchInfo) {
		// TODO Auto-generated method stub
		return goodsInfoMapper.findGoodsInfoByGoodsName(searchInfo);
	}

}
