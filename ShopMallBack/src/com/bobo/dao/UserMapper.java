package com.bobo.dao;

import com.bobo.entity.User;


public interface UserMapper {
	public User findUserById(Integer id);
	public User findUserByUsernameAndPwd(User user);
	public int  insertUser(User user);
	public int findUserByUsername(String username);
	public int updateUser(User user);
}
