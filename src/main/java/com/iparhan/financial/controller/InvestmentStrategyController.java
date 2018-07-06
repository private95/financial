package com.iparhan.financial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.iparhan.financial.dao.InvestmentStrategyMapper;
import com.iparhan.financial.entity.Company;

/*
 * 专项查询投资策略
 * */
@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
@RestController
public class InvestmentStrategyController {
	@Autowired
	private InvestmentStrategyMapper investmentStrategyMapper;

	/*
	 * 专项查询--投资策略--默认显示，企业名称
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/getCompanyName")
	public @ResponseBody List<Company> getCompanyName(Company company) {
		//System.out.println("参数接受" + company);
		// 1.先查询数据库
		List<Company> companies = investmentStrategyMapper.getCompanyName();
		//System.out.println("企业信息展现" + companies);
		return companies;
	}

	/*
	 * 专项查询--投资策略--核心人物
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/getCompanyPeople")
	public @ResponseBody List<Company> getCompanyPeople(Company company) {
		//System.out.println("参数接受" + company);
		// 1.先查询数据库
		List<Company> companies = investmentStrategyMapper.getCompanyPeople();
		//System.out.println("企业信息展现" + companies);
		return companies;
	}

	/*
	 * 专项查询--投资策略--代表产品
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/getCompanyProduct")
	public @ResponseBody List<Company> getCompanyProduct(Company company) {
		//System.out.println("参数接受" + company);
		// 1.先查询数据库
		List<Company> companies = investmentStrategyMapper.getCompanyProduct();
		//System.out.println("企业信息展现" + companies);
		return companies;
	}

	/*
	 * 专项查询--投资策略--产品数降序显示
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/getCompanyNumDesc")
	public @ResponseBody List<Company> getCompanyNumDesc(Company company) {
		//System.out.println("参数接受" + company);
		// 1.先查询数据库
		List<Company> companies = investmentStrategyMapper.getCompanyNumDesc();
		//System.out.println("企业信息展现" + companies);
		return companies;
	}

	/*
	 * 专项查询--投资策略--成立日期，降序显示
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/getCompanyTimeDesc")
	public @ResponseBody List<Company> getCompanyTimeDesc(Company company) {
		//System.out.println("参数接受" + company);
		// 1.先查询数据库
		List<Company> companies = investmentStrategyMapper.getCompanyTimeDesc();
		//System.out.println("企业信息展现" + companies);
		return companies;
	}

	/*
	 * 专项查询--投资策略--累计收益降序显示
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/getCompanyMoneyDesc")
	public @ResponseBody List<Company> getCompanyMoneyDesc(Company company) {
		//System.out.println("参数接受" + company);
		// 1.先查询数据库
		List<Company> companies = investmentStrategyMapper.getCompanyMoneyDesc();
		//System.out.println("企业信息展现" + companies);
		return companies;
	}
}
