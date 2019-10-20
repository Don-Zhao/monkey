package com.monkey.controller;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.monkey.MonkeyApplication;

import junit.framework.TestCase;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=MonkeyApplication.class) 
public class SpringBootTestDemo {
	@Test
	public void testOne() {
		System.out.println("test hello 1");
		TestCase.assertEquals(1, 1);
	}
	
	@Test
	public void testTwo() {
		System.out.println("test hello 2");
		TestCase.assertEquals(1, 1);
	}
	
	
	@Before
	public void before() {
		System.out.println("Before test");
	}
	
	@After
	public void after() {
		System.out.println("After test");
	}
}
