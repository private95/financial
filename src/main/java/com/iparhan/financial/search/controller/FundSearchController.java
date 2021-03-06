package com.iparhan.financial.search.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.iparhan.financial.search.dao.FundSearchMapper;
import com.iparhan.financial.search.entity.FundSearch;

/**
 * 理财百科搜索业务——基金信息查询
 * 
 * @author Iparhan
 */
@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
@RestController
public class FundSearchController {

	@Autowired
	private FundSearchMapper fundSearchMapper;

	/*
	 * 基金信息查询
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/fundSearch")
	public List<FundSearch> fundSearchs(String name) {
		// //System.out.println("从前端接受的数据，搜索企业信息"+fund_shortName);
		// 查询数据库
		List<FundSearch> fundSearchs = fundSearchMapper.queryFundSearchVague(name);

		// 返回给前端
		return fundSearchs;

	}

	/*
	 * 基金信息模糊查询
	 */
	public List<FundSearch> fundSearchsAvgue(String fund_shortName) {
		return null;

	}

}
