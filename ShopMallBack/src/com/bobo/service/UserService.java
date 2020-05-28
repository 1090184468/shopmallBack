package com.bobo.service;

import com.bobo.entity.User;

public interface UserService {
	public User findUserById(Integer id); 
	public int findUserByUsername(String usernmae); 
	public User findUserByUsernameAndPwd(User user);
	public int  insertUser(User user);
	
	public int updateUser(User user);
}
