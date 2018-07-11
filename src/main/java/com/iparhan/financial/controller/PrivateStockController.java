package com.iparhan.financial.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.iparhan.financial.dao.PrivateStockMapper;
import com.iparhan.financial.entity.Company;
import com.iparhan.financial.entity.PrivateCompany;
import com.iparhan.financial.entity.PrivateStock;
import com.iparhan.financial.service.PrivateStockService;
import com.iparhan.financial.until.Result;
import com.iparhan.financial.vo.responseVo.PrivateStockResponseVo;

@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
@RestController
public class PrivateStockController {

	@Autowired
	private PrivateStockMapper privateStockMapper;

	@Autowired
	private PrivateStockService privateStockService;

	/*
	 * 首页显示私募产品排行按照累计降序排行
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/DescPrivateStock")
	public @ResponseBody List<PrivateCompany> DescPrivateStock() {
		// 1.先查询数据库
		List<PrivateCompany> privateStocks = privateStockMapper.getAllPriByCumDesc();
		//System.out.println("私募产品排行信息显示" + privateStocks);
		//for (PrivateCompany privateCompany : privateStocks) {
		//	//System.out.println("夏普比率"+privateCompany.getSharpeatio());
		//	//System.out.println("一年评级"+privateCompany.getOneyearrating());
		//}
		// //System.out.println("公司名称" + privateStock.getCompany().getName());
		// 2.查询一个月以来的数据
		return privateStocks;
	}
	
	/*
	 * 多条件查询  
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/inputsearchdata")
	@ResponseBody
	public Result searchData(@Param("searchnum") String searchnum) {
		//多条件查询
		//System.out.println(searchnum);
		List<PrivateCompany> inputSearchData = privateStockMapper.inputSearchData(searchnum);
		//for (PrivateCompany privateCompany : inputSearchData) {
			//System.out.println(privateCompany.toString());
		//}
		//return inputSearchData;
		return Result.build(200, "查",inputSearchData);
	}
	
	
	@RequestMapping(value = "/inputsearchdatas")
	@ResponseBody
	public Result searchDatas(@Param("searchnums") String searchnum) {
		//多条件查询
		//System.out.println(searchnum);
		List<PrivateCompany> inputSearchData = privateStockMapper.inputSearchData(searchnum);
		//for (PrivateCompany privateCompany : inputSearchData) {
			//System.out.println(privateCompany.toString());
		//}
		//return inputSearchData;
		return Result.build(200, "查",inputSearchData);
	}
	
	@RequestMapping(value = "/smphselectData")
	@ResponseBody
	public Result smphselectData(@RequestParam("aaaaa") String searchnum) {
		List<Company> inputSearchData = privateStockMapper.selectSearchDatass(searchnum);
		return Result.build(200, "查",inputSearchData);
	}
	
	
	//查所有
	@RequestMapping(value = "/indexsmphselectData")
	@ResponseBody
	public List<Company> indexSmphselectData() {
		//多条件查询
		//System.out.println(searchnum+"-------------------------------------------");
		List<Company> inputSearchData = privateStockMapper.indexSmphselectData();
		//return inputSearchData;
		return inputSearchData;
	}
	
	
	@RequestMapping("/selectByCpId")
	@ResponseBody
	public Result selectByCpId(@RequestParam("cpId") Integer cpId) {
		List<Company> inputSearchData = privateStockMapper.selectBycpId(cpId);
		// for (Company company : inputSearchData) {
			//System.out.println(company.toString());
		//}
		return Result.build(200, "产品详情",inputSearchData );
	}
	
	
	/*
	 * 根据公司名称查询公司有多少基金
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/selectCompanyName")
	public @ResponseBody List<PrivateCompany> selectCompanyName(@Param("companyName") String companyName) {
		//System.out.println("传过来的公司名称是"+companyName);
		List<PrivateCompany> privateStocks = privateStockMapper.getProductCompanyName(companyName);
		//System.out.println("私募产品排行信息显示" + privateStocks);
		return privateStocks;
	}
	
	

	@RequestMapping("/getComptyIdShow")
	@ResponseBody
	public Result getComptyIdShow(@RequestParam("comptyId") String comptyId) {
		//System.out.println(comptyId);
		List<PrivateCompany> privateStocks = privateStockMapper.getComptyIdShow(comptyId);
		//for (PrivateCompany privateCompany : privateStocks) {
			//System.out.println(privateCompany.toString());
		//}
		return Result.build(200, "根据公司id查旗下基金", privateStocks);
	}
	
	

	/*
	 * 私募排名---详情（基金）
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/getPrivateStock")
	public @ResponseBody Object getPrivateStock(int id) {
		//System.out.println("获取基金id:" + id);
		PrivateStock privateStocks = privateStockMapper.getPrivateStock(id);
		return privateStocks;
	}
	// 

	/*
	 * 企业信息展现
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/topOneMonthPrivateStock")
	public @ResponseBody List<Company> companyTest(Company privateStock) {
		//System.out.println("参数接受" + privateStock);
		// 1.先查询数据库
		List<Company> privateStocks = privateStockMapper.selectPrivateStockByOneMonth(privateStock);
		//System.out.println("企业信息展现" + privateStocks);
		// 2.查询一个月以来的数据

		return privateStocks;
	}

	/*
	 * 根据三月以来的数据查询全部数据
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/topThreeMonthPrivateStock")
	public List<Company> topThreeMonth(Company privateStock) {
		// 1.先查询数据
		List<Company> privateStocks = privateStockMapper.selectPrivateStockByThreeMonth(privateStock);
		return privateStocks;
	}

	/*
	 * 根据半年的数据来查询全部的数据
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/topHalfYearPrivateStock")
	public List<Company> topHalfYear(Company privateStock) {
		// 1.查询数据库
		List<Company> privateStocks = privateStockMapper.selectPrivateStockBytopHalfYear(privateStock);
		return privateStocks;
	}

	/*
	 * 根据一年以来的数据查询全部的数据
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/topOnePrivateStock")
	public List<Company> topOne(Company privateStock) {
		// 1.先查询数据库
		List<Company> privateStocks = privateStockMapper.selectPrivateStockBytopOne(privateStock);
		return privateStocks;
	}

	/*
	 * 两年以来的数据
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/topTwoPrivateStock")
	public List<Company> topTwo(Company privateStock) {
		// 1.先查询数据
		List<Company> privateStocks = privateStockMapper.selectPrivateStockBytopTwo(privateStock);
		return privateStocks;
	}

	/*
	 * 三年以来的数据
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/topThreePrivateStock")
	public List<Company> topThree(Company privateStock) {
		// 1.查询数据
		List<Company> privateStocks = privateStockMapper.selectPrivateStockBytopThree(privateStock);
		return privateStocks;
	}

	/*
	 * 五年以来的数据
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/topFivePrivateStock")
	public List<Company> topFive(Company privateStock) {
		// 1.先查询数据库
		List<Company> privateStocks = privateStockMapper.selectPrivateStockBytopFive(privateStock);
		return privateStocks;
	}

	/*
	 * 成立以来的数据
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/topDatePrivateStock")
	public List<Company> topDate(Company privateStock) {
		// 1.先查询数据
		List<Company> privateStocks = privateStockMapper.selectPrivateStockBytopDate(privateStock);
		
		return privateStocks;
	}

	/*
	 * 2018的数据
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/top2018PrivateStock")
	public List<Company> top2018(Company privateStock) {
		// 1.先查询数据
		List<Company> privateStocks = privateStockMapper.selectPrivateStockBytop2018(privateStock);
		return privateStocks;
	}

	/*
	 * 2017的数据
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/top2017PrivateStock")
	public List<Company> top2017(Company privateStock) {
		// 1.先查询数据
		List<Company> privateStocks = privateStockMapper.selectPrivateStockBytop2017(privateStock);
		return privateStocks;
	}

	/*
	 * 2016的数据
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/top2016PrivateStock")
	public List<Company> top2016(Company privateStock) {
		// 1.先查询数据
		List<Company> privateStocks = privateStockMapper.selectPrivateStockBytop2016(privateStock);
		return privateStocks;
	}

	/*
	 * 2015的数据
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/top2015PrivateStock")
	public List<Company> top2015(Company privateStock) {
		// 1.先查询数据
		List<Company> privateStocks = privateStockMapper.selectPrivateStockBytop2015(privateStock);
		return privateStocks;
	}

	/*
	 * 2014的数据
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/top2014PrivateStock")
	public List<Company> top2014(Company privateStock) {
		// 1.先查询数据
		List<Company> privateStocks = privateStockMapper.selectPrivateStockBytop2014(privateStock);
		return privateStocks;
	}

	/*
	 * 2013的数据
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/top2013PrivateStock")
	public List<Company> top2013(Company privateStock) {
		// 1.先查询数据
		List<Company> privateStocks = privateStockMapper.selectPrivateStockBytop2013(privateStock);
		return privateStocks;
	}

	/*
	 * 2012的数据
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/top2012PrivateStock")
	public List<Company> top2012(Company privateStock) {
		// 1.先查询数据
		List<Company> companies = privateStockMapper.selectPrivateStockBytop2012(privateStock);
		return companies;
	}

	/*
	 * 2011的数据
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/top2011PrivateStock")
	public List<Company> top2011(Company privateStock) {
		// 1.先查询数据
		List<Company> privateStocks = privateStockMapper.selectPrivateStockBytop2011(privateStock);
		return privateStocks;
	}

	/**
	 * 添加或者删除我的基金收藏
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/isCollection")
	public PrivateStockResponseVo insertOrDeleteCollection(String state, String id, HttpServletRequest request) {
		return privateStockService.insertOrDeleteCollection(state, id, request);
	}

	/**
	 * 查询该用户的收藏的基金 
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/selectMyCollect")
	public PrivateStockResponseVo selectByTuserId(HttpServletRequest request) {
		return privateStockService.selectByTuserId(request);
	}
	
	//星级
	@RequestMapping("/smphselectDataOnx")
	@ResponseBody
	public Result smphselectDataOnx() {
		List<Company> inputSearchData = privateStockMapper.smphselectDataOnx();
		return Result.build(200, "smphselectDataOnx",inputSearchData);
	}
	
	@RequestMapping("/smphselectDataOn5")
	@ResponseBody
	public Result smphselectDataOn5() {
		List<Company> inputSearchData = privateStockMapper.smphselectDataOn5();
		return Result.build(200, "smphselectDataOnx",inputSearchData);
	}
	
	@RequestMapping("/smphselectDataOn4")
	@ResponseBody
	public Result smphselectDataOn4() {
		List<Company> inputSearchData = privateStockMapper.smphselectDataOn4();
		return Result.build(200, "smphselectDataOnx",inputSearchData);
	}
	
	@RequestMapping("/smphselectDataOn3")
	@ResponseBody
	public Result smphselectDataOn3() {
		List<Company> inputSearchData = privateStockMapper.smphselectDataOn3();
		return Result.build(200, "smphselectDataOnx",inputSearchData);
	}
	
	@RequestMapping("/smphselectDataOn2")
	@ResponseBody
	public Result smphselectDataOn2() {
		List<Company> inputSearchData = privateStockMapper.smphselectDataOn2();
		return Result.build(200, "smphselectDataOnx",inputSearchData);
	}
	
	@RequestMapping("/smphselectDataOn1")
	@ResponseBody
	public Result smphselectDataOn1() {
		List<Company> inputSearchData = privateStockMapper.smphselectDataOn1();
		return Result.build(200, "smphselectDataOnx",inputSearchData);
	}
	
	@RequestMapping("/smphselectDataOn0")
	@ResponseBody
	public Result smphselectDataOn0() {
		List<Company> inputSearchData = privateStockMapper.smphselectDataOn0();
		return Result.build(200, "smphselectDataOnx",inputSearchData);
	}
	//地区
	@RequestMapping("/smphselectDatadiqubj")
	@ResponseBody
	public Result smphselectDatadiqubj() {
		List<Company> inputSearchData = privateStockMapper.smphselectDatadiqubj();
		return Result.build(200, "smphselectDataOnx",inputSearchData);
	}
	@RequestMapping("/smphselectDatadiqush")
	@ResponseBody
	public Result smphselectDatadiqush() {
		List<Company> inputSearchData = privateStockMapper.smphselectDatadiqush();
		return Result.build(200, "smphselectDataOnx",inputSearchData);
	}
	@RequestMapping("/smphselectDatadiqugz")
	@ResponseBody
	public Result smphselectDatadiqugz() {
		List<Company> inputSearchData = privateStockMapper.smphselectDatadiqugz();
		return Result.build(200, "smphselectDataOnx",inputSearchData);
	}
	@RequestMapping("/smphselectDatadiqusz")
	@ResponseBody
	public Result smphselectDatadiqusz() {
		List<Company> inputSearchData = privateStockMapper.smphselectDatadiqusz();
		return Result.build(200, "smphselectDataOnx",inputSearchData);
	}
	
	@RequestMapping("/smphselectDatadiquqt")
	@ResponseBody
	public Result smphselectDatadiquqt() {
		List<Company> inputSearchData = privateStockMapper.smphselectDatadiquqt();
		return Result.build(200, "smphselectDataOnx",inputSearchData);
	}
	@RequestMapping("/smphselectDatatime2018")
	@ResponseBody
	public Result smphselectDatatime2018() {
		List<Company> inputSearchData = privateStockMapper.smphselectDatatime2018();
		return Result.build(200, "smphselectDataOnx",inputSearchData);
	}
	@RequestMapping("/smphselectDatatime2017")
	@ResponseBody
	public Result smphselectDatatime2017() {
		List<Company> inputSearchData = privateStockMapper.smphselectDatatime2017();
		return Result.build(200, "smphselectDataOnx",inputSearchData);
	}
	@RequestMapping("/smphselectDatatime2016")
	@ResponseBody
	public Result smphselectDatatime2016() {
		List<Company> inputSearchData = privateStockMapper.smphselectDatatime2016();
		return Result.build(200, "smphselectDataOnx",inputSearchData);
	}
	@RequestMapping("/smphselectDatatime2015")
	@ResponseBody
	public Result smphselectDatatime2015() {
		List<Company> inputSearchData = privateStockMapper.smphselectDatatime2015();
		return Result.build(200, "smphselectDataOnx",inputSearchData);
	}
	@RequestMapping("/smphselectDatatime2014")
	@ResponseBody
	public Result smphselectDatatime2014() {
		List<Company> inputSearchData = privateStockMapper.smphselectDatatime2014();
		return Result.build(200, "smphselectDataOnx",inputSearchData);
	}
	
	@RequestMapping("/smphselectDataqhgl")
	@ResponseBody
	public Result smphselectDataqhgl() {
		List<Company> inputSearchData = privateStockMapper.smphselectDataqhgl();
		return Result.build(200, "smphselectDataOnx",inputSearchData);
	}
	
	@RequestMapping("/smphselectDatatzcl")
	@ResponseBody
	public Result smphselectDatatzcl() {
		List<Company> inputSearchData = privateStockMapper.smphselectDatatzcl();
		return Result.build(200, "smphselectDataOnx",inputSearchData);
	}
	@RequestMapping("/smphselectDatamonery01")
	@ResponseBody
	public Result smphselectDatamonery01() {
		List<Company> inputSearchData = privateStockMapper.smphselectDatamonery01();
		return Result.build(200, "smphselectDataOnx",inputSearchData);
	}
	@RequestMapping("/smphselectDatamonery110")
	@ResponseBody
	public Result smphselectDatamonery110() {
		List<Company> inputSearchData = privateStockMapper.smphselectDatamonery110();
		return Result.build(200, "smphselectDataOnx",inputSearchData);
	}
	@RequestMapping("/smphselectDatamonery1020")
	@ResponseBody
	public Result smphselectDatamonery1020() {
		List<Company> inputSearchData = privateStockMapper.smphselectDatamonery1020();
		return Result.build(200, "smphselectDataOnx",inputSearchData);
	}
	@RequestMapping("/smphselectDatamonery2050")
	@ResponseBody
	public Result smphselectDatamonery2050() {
		List<Company> inputSearchData = privateStockMapper.smphselectDatamonery2050();
		return Result.build(200, "smphselectDataOnx",inputSearchData);
	}
	@RequestMapping("/smphselectDatamonery50")
	@ResponseBody
	public Result smphselectDatamonery50() {
		List<Company> inputSearchData = privateStockMapper.smphselectDatamonery50();
		return Result.build(200, "smphselectDataOnx",inputSearchData);
	}
	
	

}















