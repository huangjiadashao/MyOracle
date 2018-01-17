package cn.itcast.springboot.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.itcast.springboot.pojo.Notice;
import cn.itcast.springboot.service.NoticeService;

/**
 * 分页查询控制类
 * @author Administrator
 *
 */
@RestController
public class pageController {
	/**
	 * 注入service接口
	 */
	@Autowired
	private NoticeService noticeService;
	
	/**
	 * 查询所有数据
	 */
	@GetMapping("/findAll")
	public List<Notice> findAll(){
		return noticeService.findAll();
	}
	
	/** 
	 * 跳转分页查询公告页面 
	 */
	@GetMapping("/show")
	public String show(){
		return "html/notice.html";
	}
	
	
	/**
	 * 分页查询公告
	 */
	@GetMapping("/findByPage")
	public Map<String, Object> findByPage(@RequestParam(value="page",
			defaultValue="1",required=false)Integer page,
			@RequestParam(value="rows",
			defaultValue="15",required=false)Integer rows){	
			
			return noticeService.findByPage((page - 1) * rows, rows);
	}	
}











