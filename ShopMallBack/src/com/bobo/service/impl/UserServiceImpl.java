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

	@Override
	public User findUserByUsernameAndPwd(User user) {
		// TODO Auto-generated method stub
		return userMapper.findUserByUsernameAndPwd(user);
	}

	@Override
	public int insertUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.insertUser(user);
	}

	@Override
	public int findUserByUsername(String username) {
		// TODO Auto-generated method stub
		return userMapper.findUserByUsername(username);
	}

	@Override
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.updateUser(user);
	}
}
