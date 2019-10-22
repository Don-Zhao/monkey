package com.monkey.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monkey.daoobj.UserDaoBase;
import com.monkey.service.UserService;

@RestController
@RequestMapping("/mybatis")
public class MyBatisController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/add")
	public Object add() {
		UserDaoBase user = new UserDaoBase();
		user.setUsername("wangqian");
		user.setPassword("wangqian");
		user.setEmail("wangqian@qq.com");
		int id = userService.add(user);
		
		return user;
	}
	
	@RequestMapping("/all")
	public Object getAll() {
		return userService.getAll();
	}
	
	@RequestMapping("/getUserById")
	public Object getUserById() {
		return userService.getUserById(3);
	}
	
	@RequestMapping("/update")
	public Object update() {
		UserDaoBase user = new UserDaoBase();
		user.setUsername("zhou.shan");
		user.setPassword("zhoushan");
		user.setEmail("zhoushan@qq.com");
		user.setId(4);
		return userService.update(user);
	}
	
	@RequestMapping("/delete")
	public Object delete() {
		return userService.delete(7);
	}
	
	@RequestMapping("/account")
	public Object addAccount() {
		UserDaoBase user = new UserDaoBase();
		user.setUsername("heng.yaya");
		user.setPassword("hengyaya");
		user.setEmail("hengyaya@qq.com");
		return userService.addAccount(user);
	}
}
