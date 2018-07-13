package com.iparhan.financial.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.iparhan.financial.dao.CompanyMapper;
import com.iparhan.financial.dao.HistoricalMapper;
import com.iparhan.financial.entity.Company;
import com.iparhan.financial.entity.Historical;
import com.iparhan.financial.entity.User;
import com.iparhan.financial.until.Result;
import com.sun.mail.handlers.handler_base;

/**
 * 企业信息展现
 * 
 * @author Iparhan
 */
@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
@RestController
public class CompanyController {

	@Autowired
	private CompanyMapper companyMapper;

	
	@Autowired
	private HistoricalMapper historicalMapper;
	/*
	 * 企业---了解详情 
	 * 如果前端没有调用接口，测试时候路径后面+/getAllCompanyInfo？id=2 
	 * 代表查询id=2的企业全部数据
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/getAllCompanyInfo")
	public @ResponseBody List<Company> getAllCompanyInfo(HttpServletRequest request) {
		// 获取选中的企业数据id
		String id = request.getParameter("id");
		// 1.先查询数据库
		List<Company> companies = companyMapper.getAllCompanyInfo(new Integer(id));
		return companies;
	}

	
	
	@RequestMapping("showCompanyInfo")
	@ResponseBody
	public Result showCompanyInfo(@RequestParam("cid") Integer company_Id,HttpServletRequest request) {
		HttpSession session = request.getSession();
		List<Company> companies = companyMapper.getAllCompanyInfo(company_Id);
		String company_name = null;
		Date time = new Date();
		for (Company c : companies) {
			company_name = c.getName();
		}
		if(session.getAttribute("user")!=null) {
			User user = (User) session.getAttribute("user");
			Integer tuser_Id =  Integer.parseInt(user.getId());
			historicalMapper.addHistorcals(tuser_Id,company_Id,company_name,time);
		}else {
			historicalMapper.addHistorcal(company_Id,company_name,time);
		}
		
		return Result.build(200, "公司信息",companies);
	}
	
	/*
	 * 首页产品推荐，仅显示两条数据
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/selectCompanyByTwo")
	public @ResponseBody List<Company> selectCompanyByTwo(Company company) {
		// 1.先查询数据库
		List<Company> companies = companyMapper.selectCompanyByTwo(company);
		// 2.查询一个月以来的数据
		return companies;
	}

	/*
	 * 首页--专项查询--企业名称
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/topOneMonth")
	public @ResponseBody List<Company> companyTest(Company company) {
		List<Company> companies = companyMapper.selectCompanyByOneMonth(company);
		return companies;
	}

	/*
	 * 根据三月以来的数据查询全部数据
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/topThreeMonth")
	public List<Company> topThreeMonth(Company company) {
		List<Company> companies = companyMapper.selectCompanyByThreeMonth(company);
		return companies;
	}

	/*
	 * 根据半年的数据来查询全部的数据
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/topHalfYear")
	public List<Company> topHalfYear(Company company) {
		List<Company> companies = companyMapper.selectCompanyBytopHalfYear(company);
		return companies;
	}

	/*
	 * 根据一年以来的数据查询全部的数据
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/topOne")
	public List<Company> topOne(Company company) {
		// 1.先查询数据库
		List<Company> companies = companyMapper.selectCompanyBytopOne(company);
		return companies;
	}

	/*
	 * 两年以来的数据
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/topTwo")
	public List<Company> topTwo(Company company) {
		// 1.先查询数据
		List<Company> companies = companyMapper.selectCompanyBytopTwo(company);
		return companies;
	}

	/*
	 * 三年以来的数据
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/topThree")
	public List<Company> topThree(Company company) {
		// 1.查询数据
		List<Company> companies = companyMapper.selectCompanyBytopThree(company);
		return companies;
	}

	/*
	 * 五年以来的数据
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/topFive")
	public List<Company> topFive(Company company) {
		// 1.先查询数据库
		List<Company> companies = companyMapper.selectCompanyBytopFive(company);
		return companies;
	}

	/*
	 * 成立以来的数据
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/topDate")
	public List<Company> topDate(Company company) {
		// 1.先查询数据
		List<Company> companies = companyMapper.selectCompanyBytopDate(company);
		return companies;
	}

	/*
	 * 2018的数据
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/top2018")
	public List<Company> top2018(Company company) {
		// 1.先查询数据
		List<Company> companies = companyMapper.selectCompanyBytop2018(company);
		return companies;
	}

	/*
	 * 2017的数据
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/top2017")
	public List<Company> top2017(Company company) {
		// 1.先查询数据
		List<Company> companies = companyMapper.selectCompanyBytop2017(company);
		return companies;
	}

	/*
	 * 2016的数据
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/top2016")
	public List<Company> top2016(Company company) {
		// 1.先查询数据
		List<Company> companies = companyMapper.selectCompanyBytop2016(company);
		return companies;
	}

	/*
	 * 2015的数据
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/top2015")
	public List<Company> top2015(Company company) {
		// 1.先查询数据
		List<Company> companies = companyMapper.selectCompanyBytop2015(company);
		return companies;
	}

	/*
	 * 2014的数据
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/top2014")
	public List<Company> top2014(Company company) {
		// 1.先查询数据
		List<Company> companies = companyMapper.selectCompanyBytop2014(company);
		return companies;
	}

	/*
	 * 2013的数据
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/top2013")
	public List<Company> top2013(Company company) {
		// 1.先查询数据
		List<Company> companies = companyMapper.selectCompanyBytop2013(company);
		return companies;
	}

	/*
	 * 2012的数据
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/top2012")
	public List<Company> top2012(Company company) {
		// 1.先查询数据
		List<Company> companies = companyMapper.selectCompanyBytop2012(company);
		return companies;
	}

	/*
	 * 2011的数据
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/top2011")
	public List<Company> top2011(Company company) {
		// 1.先查询数据
		List<Company> companies = companyMapper.selectCompanyBytop2011(company);
		return companies;
	}

	
	
	
	
}
