package com.bobo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bobo.dao.UserMapper;
import com.bobo.entity.User;
import com.bobo.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
    private UserMapper userMapper;
	
	public User findUserById(Integer id) {
		return userMapper.findUserById(id);
	}
}
