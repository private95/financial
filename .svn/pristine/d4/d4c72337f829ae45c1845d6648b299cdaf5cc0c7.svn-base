package com.iparhan.financial.controller;

import java.util.List;

import javax.jws.soap.SOAPBinding.Use;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iparhan.financial.dao.ForgetPasswordMapper;
import com.iparhan.financial.dao.UserMapper;
import com.iparhan.financial.entity.User;

/**
 * 忘记密码
 * 
 * @author Iparhan
 *
 */
@RestController
public class ForGotPasswordController {

	@Autowired
	private ForgetPasswordMapper forgetPasswordMapper;

	@Autowired
	private UserMapper userMapper;

	@RequestMapping(value = "/authentication")
	public int forgetPassword(String username, String email) {
//		////System.out.println("进入忘记密码页面");
//		////System.out.println("输出接受到的数据" + username + email);
		// 1.先根据用户名和邮箱查询数据 如果有响应的数据就说明是合法用户
		User users = forgetPasswordMapper.selectForGetPassword(username, email);
//		//System.out.println("输出数据" + users);
		if (users != null) {
			return 1;
		} else {
			return 0;
		}

	}

	/**
	 * 验证成功后重置密码
	 * 
	 * @return
	 */
	@RequestMapping(value = "/resetPassword")
	public int restPassword(String username, int password, int repassword) {
		// 1.接受用户输入的新信息
//		//System.out.println("输出用户输入的新用户名信息" + username + password + repassword);
		// 2.更新到数据库 把原来的旧密码代替
		try {
			forgetPasswordMapper.updateUser(username, password);
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return 0;
	}

	/*
	 * 用户登录成功后修改密码 
	 * password:用户新输入的密码
	 * pwds:用户输入的旧密码
	 * pwd:用户的原来密码，与pwds进行对比使用
	 */
	@RequestMapping(value = "/updatePassword")
	public int updatePassword(HttpServletRequest request, String password, String pwds) {
		String id = request.getParameter("id");
//		//System.out.println("获取当前登录用户id:" + id);
		// 根据用户id查询该用户的密码
		User user = userMapper.selectUserById(id);
		// 如果用户输入的密码和本身密码相同，执行修改
//		//System.out.println("输出用户输入的新密码password" + password);
//		//System.out.println("用户输入的旧密码pwds：" + pwds);
		// 1.接受用户输入的新密码
		// 2.更新到数据库 把原来的旧密码代替
		////System.out.println("获取用户密码：" + user.getPassword());
		if (user.getPassword().trim().equals(pwds)) {
			////System.out.println("输入密码与旧密码相同，可以进行修改!");
			int i = userMapper.updateUserPwd(id, password);
			////System.out.println("返回受影响行数：" + i);
			if (i > 0) {
				////System.out.println("修改密码成功，新密码为：" + password);
				// 修改成功返回1，强制退出重新登录。
				return 1;
			} else {
				////System.out.println("修改失败");
				// 修改失败，返回0
				return 0;
			}
		} else {
			return 0;
		}
	}
}
