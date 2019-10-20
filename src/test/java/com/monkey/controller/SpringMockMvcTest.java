package com.monkey.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.monkey.MonkeyApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=MonkeyApplication.class)
@AutoConfigureMockMvc
public class SpringMockMvcTest {

	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void apiTest() throws Exception {
		MvcResult mockResult = mockMvc.perform(MockMvcRequestBuilders.get("/hello"))
				.andExpect(MockMvcResultMatchers.status().isOk()).andReturn();
		System.out.println(mockResult.getResponse().getContentAsString());
	}
	
//	@Test
//	public void apiTest2() throws Exception {
//		MvcResult mockResult = mockMvc.perform(MockMvcRequestBuilders.get("/hello123"))
//				.andExpect(MockMvcResultMatchers.status().isOk()).andReturn();
//		System.out.println(mockResult.getResponse().getContentAsString());
//	}
}
