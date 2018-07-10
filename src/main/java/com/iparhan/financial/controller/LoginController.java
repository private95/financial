package com.iparhan.financial.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.iparhan.financial.dao.UserMapper;
import com.iparhan.financial.entity.User;
import com.iparhan.financial.until.MD5Utils;
import com.iparhan.financial.until.Result;

/**
 * 登录功能
 * 
 * @author iparhan
 *
 */
@Controller
@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
@RestController
public class LoginController {

	@Autowired
	private UserMapper userMapper;

	/*
	 * 登录方法
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/loginDemo", method = RequestMethod.POST)
	public @ResponseBody int loginDemo(User user,  HttpServletRequest request) throws NullPointerException {
//		System.out.println("接受登录使用的前端发来的用户名和密码" + user.getUsername() + user.getPassword());
		HttpSession session = request.getSession();
		//验证邮箱的正则表达式
		 String regex = "\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*";
		 if(user.getUsername().matches(regex)) {
			 user.setEmail(user.getUsername());
		 }
		 user.setPassword(MD5Utils.md5Password(user.getPassword()));
		User userinfo = userMapper.isLogin(user);
		if (userinfo != null && userinfo.getUsername() != null) {
			session.setAttribute("user", userinfo);
			request.getSession().setAttribute("account", userinfo.getId());
			return 1;
		} else {
			return 0;
		}
	}

	/*
	 * 判断用户是否已经登录
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/loginCheck", method = RequestMethod.POST)
	public int checkLogin(@Param("account") String username,HttpServletRequest request) {
		/*
		 * 点击免费发布信息的时候会有一个用户是否登录过的判断 接受前端发来的数据 如果有数据就说明有人在登录 返回关于这用户的所有信息 否则返回 数字 0
		 * 让用戶先登录
		 */
		HttpSession session = request.getSession();
//		System.out.println("用于判断先看这用户有没有在数据库" + username);
		User user = (User) session.getAttribute("user");
//		System.out.println("userSession::::::::"+session.getAttribute("user"));
		// 1.先判断接受的参数有没有值
		if (user == null) {
			//System.err.println("空空");
			return 0;
		} else {
			// 查询发布过去的
			//System.out.println("no " + user.getUsername());
			return 1;
		}
	}
	
	/*
	 * 根据用户id修改密码
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/modifypassword", method = RequestMethod.POST)
	public int updatePassword(@Param("NowPwd") String NowPwd,@Param("NewPwd") String NewPwd,
			HttpServletRequest request) {
		/*
		 * 先判断旧密码是否正确
		 * 然后根据用户id修改用户密码
		 */
//		System.out.println("旧的密码" + NowPwd);
//		System.out.println("新的密码"+NewPwd);
		String userId = (String) request.getSession().getAttribute("account");
//		System.out.println("用户的id是"+userId);
		User user = userMapper.selectUserById(userId);
//		System.out.println(user.getPassword()+"--------------");
		if (MD5Utils.md5Password(NowPwd).equals(user.getPassword())) {
			userMapper.updateUserPwd(MD5Utils.md5Password(NewPwd), userId);
			return 12345679;
		}else {
			return 000000000;
		}
		
	}
	
	/**
	 * 退出登录
	 */
	@RequestMapping("/exitLogon")
	@ResponseBody
	public Result exitLogin(HttpServletRequest request) {
		 HttpSession session = request.getSession(false);//防止创建Session  
	        if(session == null){  
	            return Result.build(200, "清除登录");
	        }  
	        session.removeAttribute("user");  
	        return Result.build(200, "清除登录");
	}


}
