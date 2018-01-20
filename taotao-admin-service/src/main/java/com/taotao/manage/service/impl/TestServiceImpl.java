package com.taotao.manage.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taotao.admin.mapper.TestMapper;
import com.taotao.admin.service.TestService;

@Service
public class TestServiceImpl implements TestService{
	/**
	 * 注入Mapper
	 */
	@Autowired
	private TestMapper testMapper;
	

	@Override
	public String queryCurrentDate() {
		//查询数据库当前时间
		return testMapper.queryCurrentDate();
	}
}
