package com.iparhan.financial.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iparhan.financial.dao.IDMessageMapper;
import com.iparhan.financial.entity.User;

/*
 * 用户修改身份验证信息
 * */
@RestController
public class IdCardController {

	@Autowired
	private IDMessageMapper idMessageMapper;

	// 获取id,去数据库进行比较
	@RequestMapping(value = "/idCard")
	public int idCard(HttpServletRequest request) {
		String id = request.getParameter("id");
		//System.out.println("用户id" + id);
		User user = idMessageMapper.selectUserByIDCard(new Integer(id));
		request.setAttribute("user", user);
		// 返回1代表用户获取到信息
		return 1;
	}

	// 修改操作
	@RequestMapping(value = "/updateUserIdCard", method = RequestMethod.POST)
	public int updateUserInfo(User user) {
		int count = idMessageMapper.UpdateUserIdCard(user);
		// 如果count受影响行数为0，修改失败，返回0
		if (count > 0) {
			return 0;
		}
		// 否则返回1
		return 1;
	}
}
