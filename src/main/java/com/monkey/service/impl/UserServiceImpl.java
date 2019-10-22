package com.monkey.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.monkey.daoobj.UserDaoBase;
import com.monkey.mapper.UserMapper;
import com.monkey.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public int add(UserDaoBase user) {
		userMapper.insert(user);
		int id = user.getId();
		return id;
	}

	@Override
	public List<UserDaoBase> getAll() {
		return userMapper.getAll();
	}

	@Override
	public UserDaoBase getUserById(int id) {
		return userMapper.findUserById(id);
	}

	@Override
	public int update(UserDaoBase user) {
		return userMapper.update(user);
	}

	@Override
	public int delete(int id) {
		return userMapper.delete(id);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED, isolation=Isolation.DEFAULT)
	public int addAccount(UserDaoBase user) {
		int result = userMapper.insert(user);
		int i = 5 / 0;
		return result;
	}

}
