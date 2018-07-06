package com.iparhan.financial.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iparhan.financial.dao.PrivateStockMapper;
import com.iparhan.financial.entity.PrivateStock;
import com.iparhan.financial.service.PrivateStockService;
import com.iparhan.financial.until.CommonConstant;
import com.iparhan.financial.vo.responseVo.PrivateStockResponseVo;

/**
 * Date 2018-5-23 11:37:10
 * @author SunDawang
 *
 */
@Service
@Transactional
public class PrivateStockServiceImpl implements PrivateStockService {
	
	@Autowired
	private PrivateStockMapper privateStockMapper;
	
	private final Logger logger = LoggerFactory.getLogger(PrivateStockServiceImpl.class);  
	/**
	 * 添加或者删除我的基金收藏
	 */
	@Override
	public PrivateStockResponseVo insertOrDeleteCollection(String state,String id, HttpServletRequest request) {
		//	state ： 0代表未收藏  1代表已收藏
		logger.info("state: "+state+" id:"+id);
		PrivateStockResponseVo responseVo = new PrivateStockResponseVo();
//		String tuserId = (String)request.getSession().getAttribute(CommonConstant.ACCOUNT);
		String tuserId = "8";
		if(StringUtils.isBlank(tuserId)) {
			responseVo.fail("请先登录！");
			return responseVo;
		}
		if(CommonConstant.STATED.equals(state)) {
			//如果未收藏，收藏它
			privateStockMapper.updatePrivateStock(Integer.parseInt(tuserId), Integer.parseInt(id),CommonConstant.STATED);
			responseVo.success("收藏成功！");
		}else {
			//如果已收藏，则取消收藏
			privateStockMapper.updatePrivateStock(Integer.parseInt(tuserId), Integer.parseInt(id),CommonConstant.STATE);
			responseVo.success("取消收藏成功！");
		}
		return responseVo;
		
	}
	
	/**
	 * 查询该用户的收藏的基金
	 */
	@Override
	public PrivateStockResponseVo selectByTuserId(HttpServletRequest request) {
		PrivateStockResponseVo responseVo = new PrivateStockResponseVo();
//		String tuserId = (String)request.getSession().getAttribute(CommonConstant.ACCOUNT);
		String tuserId = "8";
		if(StringUtils.isBlank(tuserId)) {
			responseVo.fail("请先登录！");
			return responseVo;
		}
		List<PrivateStock> list = privateStockMapper.selectByTuserId(Integer.parseInt(tuserId));
		responseVo.success("查询成功！", list.hashCode()+"", list);
		return responseVo;
	}
	
	
}
