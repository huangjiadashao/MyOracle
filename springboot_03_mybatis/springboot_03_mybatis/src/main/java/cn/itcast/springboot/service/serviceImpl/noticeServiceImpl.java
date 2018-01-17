package cn.itcast.springboot.service.serviceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import cn.itcast.springboot.mapper.NoticeMapper;
import cn.itcast.springboot.pojo.Notice;
import cn.itcast.springboot.service.NoticeService;

/**
 * service接口实现类
 * @author Administrator
 *
 */
@Service
@Transactional
public class noticeServiceImpl implements NoticeService{
	/**
	 * 注入mapper接口
	 */
	@Autowired
	private NoticeMapper noticeMapper;
	
	@Override
	public List<Notice> findAll() {
		//调用方法,返回结果集
		return noticeMapper.findAll();
	}

	@Override
	public Map<String, Object> findByPage(Integer page, Integer rows) {
		//创建Map集合封装返回的数据
		Map<String, Object> map = new HashMap<>();
		
		//调用service层接口,查询返回数据,统计查询
		Long count = noticeMapper.count();
		
		//压入map
		map.put("total", count);
		
		//分页查询
		List<Notice> byPage = noticeMapper.findByPage(page, rows);
		
		//压栈
		map.put("rows", byPage);
		
		
		return map;
	}

}
