package com.bobo.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bobo.entity.User;
import com.bobo.service.GoodsInfoService;
import com.bobo.service.GoodsTypeService;
import com.bobo.service.UserService;
import com.bobo.util.UserTokenUtil;

import net.sf.json.JSON;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	@Autowired
	private GoodsTypeService goodsTypeService;
	@Autowired
	private GoodsInfoService goodsInfoService;
	
	@RequestMapping("updateUser")
	public String updateUser(User user) {
		int num = userService.updateUser(user);
		if(num>0) {
			return "{msg:'修改成功'}";
		}else {
			return "{msg:'修改失败'}";
		}
	}
	
	@RequestMapping("/UserLogin")
	public String userLogin(User user) {
		User findUser=userService.findUserByUsernameAndPwd(user);
		
		if(findUser==null) {
			return "{msg:'用户名或密码错误'}";
		}
		else {
			UserTokenUtil.setUserSession(findUser.getUser_id()+"");
			return "{msg:'验证正确',user:"+JSONObject.fromObject(findUser)+"}";
		}
		
	}
	@RequestMapping("/UserRegister")
	public String userRegister(User user) {
		int count=userService.findUserByUsername(user.getUsername());
		if(count>0) {
			return "{msg:'此用户名已存在'}";
		}
		int i=userService.insertUser(user);
		if(i==0) {
			return "{msg:'注册失败'}";
		}else {
			UserTokenUtil.setUserSession(user.getUser_id()+"");
			return "{msg:'注册成功',user:"+JSONObject.fromObject(user)+"}";
		}
		
	}
	@RequestMapping(value="/home")
	public String home(HttpServletResponse response) {
		JSONArray goodsInfoBanner=JSONArray.fromObject(goodsInfoService.findGoodsInfoForBanner());
		JSONArray goodsInfoRecommand=JSONArray.fromObject(goodsInfoService.findGoodsInfoForIsRecommended());
		JSONArray goodsType=JSONArray.fromObject(goodsTypeService.findGoodsTypeForDisplay());
		return "{code:200,msg:'请求成功',result:{"
				+ "goodsInfoBanner:"+goodsInfoBanner+","
				+"goodsInfoRecommand:"+goodsInfoRecommand+","
				+"goodsType:"+goodsType
				+ "}}";
	}
}
