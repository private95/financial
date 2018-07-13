package com.iparhan.financial.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iparhan.financial.dao.UserMapper;
import com.iparhan.financial.entity.User;
@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
@RestController
public class AccountController {

	@Autowired
	private UserMapper userMapper;

	// 用户进入页面
	// 账号资料显示--获取用户id，根据用户id查询该用户的所有数据，显示在页面上，并进行修改
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping("/selectUserById")
	public int selectAllUserInfo(HttpServletRequest request) {
		String id = request.getParameter("id");
		User user = userMapper.selectUserById(id);
		request.setAttribute("user", user);
		// 返回1代表用户获取到信息
		return 1;
	}

	
	//用户地址添加
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/updateUserInfo", method = RequestMethod.POST)
	public int updateUserInfo(User user) {
		int count = userMapper.updateUserInfo(user);
		// 如果count受影响行数为0，修改失败，返回0
		if (count > 0) {
			return 0;
		}
			// 否则返回1
			return 1;

		}
	/*
	 * 用户添加地址
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/accountUpdate", method = RequestMethod.POST)
	public int updateAdress(@Param("address") String address,@Param("username") String username,
			@Param("email") String email) {
		try {
			 int count = userMapper.updateAddress(address, username, email);
			 return count;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	/*
	 * 用
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/idCard", method = RequestMethod.POST)
	public int updateIdNumber(@Param("realName") String realName,@Param("idType") String idType,
			@Param("idNumber") String idNumber,HttpServletRequest request) {
			User user = (User) request.getSession().getAttribute("user");
			String username = user.getUsername();
		try {
			 int count = userMapper.updateRealName(realName, idType, idNumber, username);
			 return count;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	
	
	
}
