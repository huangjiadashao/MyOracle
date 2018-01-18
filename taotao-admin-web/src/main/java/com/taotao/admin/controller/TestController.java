package com.taotao.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taotao.admin.service.TestService;

@RestController
public class TestController {
	/**
	 * 注入服务代理对象
	 */
	@Autowired
	private TestService testService;
	
	@GetMapping("/date")
	public String queryCurrentDate(){
		System.out.println("接口代理对象: " + testService.queryCurrentDate());
		
		/**
		 * 调用方法查询数据
		 */
		return testService.queryCurrentDate();
	}

}
