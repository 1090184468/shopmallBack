package com.bobo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bobo.dao.GoodsTypeMapper;
import com.bobo.entity.GoodsInfo;
import com.bobo.entity.GoodsType;
import com.bobo.service.GoodsTypeService;

@Service
public class GoodsTypeServiceImpl implements GoodsTypeService {
	@Autowired
    private GoodsTypeMapper goodsTypeMapper;
	@Override
	public List<GoodsType> findGoodsTypeForDisplay() {
		// TODO Auto-generated method stub
		return goodsTypeMapper.findGoodsTypeForDisplay();
	}
	@Override
	public List<GoodsType> findAllGoodsTypes() {
		// TODO Auto-generated method stub
		return goodsTypeMapper.findAllGoodsTypes();
	}
}
