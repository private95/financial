package com.iparhan.financial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.iparhan.financial.dao.TopThreeYearsDao;
import com.iparhan.financial.entity.Company;
import com.iparhan.financial.entity.PrivateStock;

/**
 * 私募基金排名
 * 
 * @author Iparhan
 *
 */
@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
@RestController
public class TopThreeYearsController {

	/**
	 * 业务思路： 1.调用私募基金数据模块代码 2.查询全部数据 没有任何条件查询比较 难度:0颗星
	 */
	@Autowired
	private TopThreeYearsDao topThreeYearsDao;

	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/threeYears")
	public @ResponseBody List<PrivateStock> companyTest() {
		// 1.先查询数据库
		//两张表查询
		List<PrivateStock> privateStocks = topThreeYearsDao.query();
		System.out.println("私募基金排行无条件显示数据" + privateStocks);
		// 返回信息到页面
		return privateStocks;
	}
}
