package com.monkey.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.monkey.config.ServerSettings;
import com.monkey.model.User;

@RestController
public class GetHttpController {

	private Map<String, Object> params = new HashMap<>();
	
	/**
	 * 功能描述：测试restful协议，从路径中获取字段
	 * @param cityId
	 * @param userId
	 * @return
	 */
//	@RequestMapping(path="/{city_id}/{user_id}", method = RequestMethod.GET)
//	public Object findUser(@PathVariable("city_id") String cityId,
//							@PathVariable("user_id") String userId) {
//		params.clear();
//		params.put("CITYID", cityId);
//		params.put("USERID", userId);
//		
//		return params;
//	}
	
	/**
	 * 功能描述：测试GetMapping
	 * @param form
	 * @param size
	 * @return
	 */
	@GetMapping(value="/v1/page_user1")
	public Object pageUser(int form, int size) {
		params.clear();
		params.put("form", form);
		params.put("size", size);
		
		return params;
	}
	
	/**
	 * 功能描述：默认值，是否是必传参数
	 * @param form
	 * @param size
	 * @return
	 */
	@GetMapping(value="/v2/page_user2")
	public Object pageUser2(@RequestParam(defaultValue="0", name="page")int form, 
						int size) {
		params.clear();
		params.put("form", form);
		params.put("size", size);
		
		return params;
	}
	
	/**
	 * 功能描述：bean对象传递
	 * 注意： 1 注意需要制定http的content-type为application/json
	 *     	2 使用body传递数据
	 * @param user
	 * @return
	 */
	@GetMapping("/v1/save_user")
	public Object saveUser(@RequestBody User user) {
		params.clear();
		params.put("user", user);
		
		return params;
	}
	
	/**
	 * 功能描述：测试获取http头信息
	 * @param accessToken
	 * @param id
	 * @return
	 */
	@GetMapping("/v1/get_header")
	public Object getHeader(@RequestHeader("access_token") String accessToken, 
			String id) {
		params.clear();
		params.put("access_token", accessToken);
		params.put("id", id);
		
		return params;
	}
	
	/**
	 * 功能描述：使用HttpServletRequest来传递
	 * @param request
	 * @return
	 */
	@GetMapping("/v1/test_request")
	public Object testRequest(HttpServletRequest request) {
		params.clear();
		String id = request.getParameter("id");
		params.put("id", id);
		
		return params;
	}
	
	@Autowired
	private ServerSettings serverSettings;
	
	@GetMapping("/v1")
	public Object test_pro() {
		return serverSettings;
	}
	
	
}
