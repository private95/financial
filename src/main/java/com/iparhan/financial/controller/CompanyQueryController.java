package com.iparhan.financial.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.http.HttpRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.iparhan.financial.dao.CompanyTwoMapper;
import com.iparhan.financial.dao.PrivateStockMapper;
import com.iparhan.financial.entity.Company;
import com.iparhan.financial.entity.CompanyTwo;
import com.iparhan.financial.entity.PrivateStock;

/*
 * 我的发布信息
 */
@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
@RestController
public class CompanyQueryController {

	@Autowired
	private CompanyTwoMapper companyTwoMapper;

	/*
	 * 首页-为你提供最新企业信息
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/companyQuery")
	public List<Company> getComById(HttpServletRequest request) {
		List<Company> company = companyTwoMapper.getAllComByCumid();
		return company;
	}

	/*
	 * 页面根据用户登录时放入session的id进行查询此id用户发布的信息
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/companyTwosQuery")
	public List<Company> getCompantTwoById(HttpServletRequest request) {
		String id = (String) request.getSession().getAttribute("account");
		// 查询数据库
		List<Company> companyTwos = companyTwoMapper.getCompantTwoById(id);
		return companyTwos;
	}

	/*
	 * 首页条件查询---基金名称 按照创建时间降序排列
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/getProduction")
	public List<PrivateStock> getProduction(HttpServletRequest request) {
		// 查询数据库
		List<PrivateStock> companyTwos = companyTwoMapper.getProduction();
		return companyTwos;
	}

	/*
	 * 首页条件查询---基金公司 按照创建时间降序排列
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/getProduction2")
	public List<PrivateStock> getProduction2(HttpServletRequest request) {
		// 查询数据库
		List<PrivateStock> companyTwos = companyTwoMapper.getProduction2();
		return companyTwos;
	}

	/*
	 * 首页条件查询---最新净值 按照最新净值排列
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/getProduction3")
	public List<PrivateStock> getProduction3(HttpServletRequest request) {
		// 查询数据库
		List<PrivateStock> companyTwos = companyTwoMapper.getProduction3();
		return companyTwos;
	}

	/*
	 * 首页条件查询---累计收益 按照累计收益降序排列
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/getProduction4")
	public List<PrivateStock> getProduction4(HttpServletRequest request) {
		// 查询数据库
		List<PrivateStock> companyTwos = companyTwoMapper.getProduction4();
		return companyTwos;
	}

	/*
	 * 首页条件查询---年化收益 按照年化收益降序排列
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/getProduction5")
	public List<PrivateStock> getProduction5(HttpServletRequest request) {
//		System.out.println("首页条件查询---年化收益 按照年化收益降序排列");
		// 查询数据库
		List<PrivateStock> companyTwos = companyTwoMapper.getProduction5();
		return companyTwos;
	}

	/*
	 * 首页条件查询---风险等级 按照风险等级降序排列
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/getProduction6")
	public List<PrivateStock> getProduction6(HttpServletRequest request) {
//		System.out.println("首页条件查询---风险等级 按照风险等级降序排列");
		// 查询数据库
		List<PrivateStock> companyTwos = companyTwoMapper.getProduction6();
		return companyTwos;
	}

	/*
	 * 企业信息===了解详情
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/getAllCompany")
	public @ResponseBody Object getAllCompany(HttpServletRequest request) {
		// 获取页面传过来的基金id
		String id = request.getParameter("id");
//		System.out.println("获取基金id:" + id);
		Company company = companyTwoMapper.getAllCompany(new Integer(id));
		return company;
	}

	/**
	 * 我的发布信息删除 权限： 用户自己可删除
	 * 
	 * @param username
	 * @return
	 */
	@RequestMapping(value = "/companyDelete")
	public int deleteUserList(String id) {
		// 1.先查询数据 如果返回有数据就delete
//		System.out.println(id);
		int result = companyTwoMapper.deleteCompany(id);
		if (result == 0) {
			return 0;
		} else {
			return 1;
		}
	}
}
