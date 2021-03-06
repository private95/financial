package com.iparhan.financial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 项目所有页面的跳转
 * 
 * @author iparhan
 *
 */
@Controller
public class ForwardController {

	/**
	 * 首页
	 * 
	 * @return
	 */
	@RequestMapping("/")
	// @ResponseBody //字符串格式
	public String index() {
		//System.out.println("跳转到首页");
		return "index";
	}

	/**
	 * 登录
	 * 
	 * @return
	 */
	@RequestMapping(value = "/login")
	public String login() {
		//System.out.println("跳转到登录页面");
		return "login_page";
	}

	/**
	 * 注册_跳转
	 */
	@RequestMapping(value = "/register")
	public String register() {
		//System.out.println("跳转到注册页面");
		return "register";
	}

	/**
	 * 产品推荐
	 * 
	 * @return
	 */
	@RequestMapping(value = "/recommend_march")
	public String recommandProduct() {
		//System.out.println("跳转到产品推荐页面");
		return "recommend_march";
	}

	/*
	 * FOF基金
	 */
	@RequestMapping(value = "/recommend_fof")
	public String recommend_fof() {
		//System.out.println("跳转到FOF基金");
		return "recommend_fof";
	}

	/*
	 * 货币基金
	 */
	@RequestMapping(value = "/recommend_currency")
	public String recommend_currency() {
		//System.out.println("跳转到货币基金");
		return "recommend_currency";
	}

	/*
	 * 股票基金
	 */
	@RequestMapping(value = "/recommend_stock")
	public String recommend_stock() {
		//System.out.println("跳转到股票基金");
		return "recommend_stock";
	}

	/*
	 * 产品详情
	 */

	@RequestMapping(value = "/details")
	public String detail() {
		return "/details";

	}

	/**
	 * 私募排行
	 * 
	 * @return
	 */
	@RequestMapping(value = "/ranking_offering")
	public String ranking_offering() {
		//System.out.println("跳转到私募排行");
		return "ranking_offering";
	}

	/*
	 * 海外基金
	 */
	@RequestMapping(value = "/ranking_overseas")
	public String ranking_overseas() {
		//System.out.println("跳转到海外基金");
		return "ranking_overseas";
	}

	/*
	 * 单账户产品
	 */
	@RequestMapping(value = "/ranking_product")
	public String ranking_product() {
		//System.out.println("跳转到单账户产品");
		return "ranking_product";
	}

	/*
	 * 新三板
	 */
	@RequestMapping(value = "/ranking_sampan")
	public String ranking_sampan() {
		//System.out.println("跳转到新三板");
		return "ranking_sampan";
	}

	/**
	 * 企业信息
	 * 
	 * @return
	 */
	@RequestMapping(value = "/enterprise_information")
	public String enterprise_information() {
		//System.out.println("跳转到发布信息");
		return "enterprise_information";
	}

	/*
	 * 企业详情页面
	 */
	@RequestMapping(value = "/business_details")
	public String business_details() {
		//System.out.println("跳转到企业详情页面");
		return "business_details";
	}

	/**
	 * 发布信息 release_information
	 */

	@RequestMapping(value = "/release_information")
	public String release_information() {
		//System.out.println("跳转到发布信息");
		return "release_information";
	}

	/*
	 * 发布信息表单
	 */
	@RequestMapping(value = "/free_release")
	public String free_release() {
		//System.out.println("发布信息表单提交");
		return "free_release";
	}

	/**
	 * 专项查询
	 */
	@RequestMapping(value = "/special_inquiry")
	public String special_inquiry() {
		//System.out.println("跳转到专项查询");
		return "special_inquiry";
	}

	/**
	 * 个人中心
	 * 
	 * @return
	 */
	@RequestMapping(value = "/personal")
	public String personal() {
		//System.out.println("跳转到个人中心页面");
		return "/personal";
	}

	/**
	 * 风险评测
	 * 
	 * @return
	 */
	@RequestMapping(value = "/evaluation")
	public String evaluation() {
		//System.out.println("跳转到风险评测");
		return "evaluation";
	}

	/**
	 * 微信第三方登录
	 */
	@RequestMapping(value = "/wechatLogin")
	public String wechatLogin() {
		//System.out.println("跳转到微信登录");
		return "wechatLogin";
	}

	/**
	 * 后台用户管理系统
	 */
	/*
	 * 首页
	 */
	@RequestMapping(value = "/adminIndex")
	public String adminIndex() {
		//System.out.println("跳转到后台页面的首页");
		return "/admin/index";

	}

	/*
	 * 用户管理页面
	 * 
	 * @RequestMapping(value ="/adminUser") public String adminUser(){ return
	 * "/admin/tables";
	 * 
	 * }
	 */

	/*
	 * 后台管理登陆
	 */
	@RequestMapping(value = "/adminLogin")
	public String adminLogin() {
		return "/admin/login";

	}

	/*
	 * 后台管理注册
	 */
	@RequestMapping(value = "/adminRegister")
	public String adminRegister() {
		return "/admin/register";

	}

	/*
	 * 后台管理重置密码
	 */
	@RequestMapping(value = "/adminForgotPassword")
	public String adminForgotPassword() {
		return "/admin/forgot-password";

	}

	/*
	 * 企业信息
	 */

	@RequestMapping(value = "/companyDetail")
	public String companyDetail() {
		return "companyDetail";

	}

}
