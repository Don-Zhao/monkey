package com.monkey.service;

import java.util.List;

import com.monkey.daoobj.UserDaoBase;

public interface UserService {

	public int add(UserDaoBase user);
	
	public List<UserDaoBase> getAll();
	
	public UserDaoBase getUserById(int id);
	
	public int update(UserDaoBase user);
	
	public int delete(int id);
	
	public int addAccount(UserDaoBase user);
}
