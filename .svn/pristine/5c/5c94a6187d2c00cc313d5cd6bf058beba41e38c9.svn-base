package com.iparhan.financial.admin.controller;

import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.iparhan.financial.admin.dao.AdminUserDao;
import com.iparhan.financial.admin.entity.AdminUser;
import com.iparhan.financial.admin.entity.AdminUserList;
import com.iparhan.financial.until.FinancialResult;

/**
 * 理财百科后台管理系统交互业务部分
 * @author iparhan
 *
 */
@CrossOrigin(origins = "*", maxAge = 3600)   //使用于前端的跨域
@RestController
public class AdminUserController {
	
	@Autowired
	private AdminUserDao adminUserDao;
	
	/*
	 * 管理员注册业务
	 */
	@CrossOrigin(origins = "*", maxAge = 3600)   //使用于前端的跨域
	@RequestMapping(value ="/adminRegisterData")
	public int adminRegisterData(@Param("username")String username,
								 @Param("password")String password ,
								 @Param("job")String job,
								 @Param("email")String email ) {
		//接受前端发过来的数据
		System.out.println("管理员注册信息输出"+username + password + job + email);
		 
		//先查询之前有没有注册过同一个账号
		String usernameFormDB = adminUserDao.adminCheck(username);
		//如果管理员用户表有数据的话 那就说明不能再重复注册
		if(usernameFormDB != null) {
			System.out.println("不好意思就算是管理员也不能重复注册");
			return 0;	
		}else {
			//数据保存到数据库	
			adminUserDao.registerAdmin(username, password, job, email);
			return 1;
		}

	}
	
	/*
	 * 管理员登录
	 */
	@CrossOrigin(origins = "*", maxAge = 3600)   //使用于前端的跨域
	@RequestMapping(value ="/adminLoginData")
	public int adminLoginData(@Param("username")String username,
			 				  @Param("password")String password) {
		
		//先输出接受到的数据
		System.out.println("管理员登录"+ username + password);
		
		//根据用户名查询密码 如果有数据 就说明是登录可以成功 否则一律失败
		String resultLogin = adminUserDao.adminLogin(username,password);
		System.out.println("用户名密码");
		if(resultLogin != null) {
			return 1;
		}else{
			System.out.println("您还没有注册");
			return 0;
		}

	}
	
	/**
	 * 后台管理页面显示用户列表信息
	 * @return
	 */
	@CrossOrigin(origins = "*", maxAge = 3600)   //使用于前端的跨域
	@RequestMapping(value ="/userList")
	public List<AdminUserList> adminUsers(){
		//根据数据库的信息无条件查询全部数据
		List<AdminUserList> adminUserLists = adminUserDao.adminUserList();
		return adminUserLists;
		
	}
	
	
	/*
	 * 删除用户信息
	 */
	@RequestMapping(value ="/deleteUserList")
	public int deleteUserList(String username) {
		//1.先查询数据 如果返回有数据就delete
		String email = adminUserDao.email(username);
		if(email != null) {
			String result = adminUserDao.deleteUser(username);
			if (result == null) {
				return 1;	
			}else {
				return 0;
			}
			
		}else {
			System.out.println("系统崩溃");
		}
		return 0;
		
	}
	

	
}
