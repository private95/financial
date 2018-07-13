package com.iparhan.financial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.iparhan.financial.dao.NewThreeFundMapper;
import com.iparhan.financial.entity.NewThreeFund;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
public class NewThreeFundController {

	@Autowired
	private NewThreeFundMapper NewThreeFundMapper;

	/*
	 * 企业信息展现
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/topOneMonthNewThreeFund")
	public @ResponseBody List<NewThreeFund> companyTest(NewThreeFund NewThreeFund) {
		//System.out.println("参数接受" + NewThreeFund);
		// 1.先查询数据库
		List<NewThreeFund> NewThreeFunds = NewThreeFundMapper.selectNewThreeFundByOneMonth(NewThreeFund);
		//System.out.println("企业信息展现" + NewThreeFunds);
		// 2.查询一个月以来的数据

		return NewThreeFunds;
	}

	/*
	 * 根据三月以来的数据查询全部数据
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/topThreeMonthNewThreeFund")
	public List<NewThreeFund> topThreeMonth(NewThreeFund NewThreeFund) {
		// 1.先查询数据
		List<NewThreeFund> NewThreeFunds = NewThreeFundMapper.selectNewThreeFundByThreeMonth(NewThreeFund);
		return NewThreeFunds;

	}

	/*
	 * 根据半年的数据来查询全部的数据
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/topHalfYearNewThreeFund")
	public List<NewThreeFund> topHalfYear(NewThreeFund NewThreeFund) {
		// 1.查询数据库
		List<NewThreeFund> NewThreeFunds = NewThreeFundMapper.selectNewThreeFundBytopHalfYear(NewThreeFund);
		return NewThreeFunds;
	}

	/*
	 * 根据一年以来的数据查询全部的数据
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/topOneNewThreeFund")
	public List<NewThreeFund> topOne(NewThreeFund NewThreeFund) {
		// 1.先查询数据库
		List<NewThreeFund> NewThreeFunds = NewThreeFundMapper.selectNewThreeFundBytopOne(NewThreeFund);
		return NewThreeFunds;
	}

	/*
	 * 两年以来的数据
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/topTwoNewThreeFund")
	public List<NewThreeFund> topTwo(NewThreeFund NewThreeFund) {
		// 1.先查询数据
		List<NewThreeFund> NewThreeFunds = NewThreeFundMapper.selectNewThreeFundBytopTwo(NewThreeFund);
		return NewThreeFunds;
	}

	/*
	 * 三年以来的数据
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/topThreeNewThreeFund")
	public List<NewThreeFund> topThree(NewThreeFund NewThreeFund) {
		// 1.查询数据
		List<NewThreeFund> NewThreeFunds = NewThreeFundMapper.selectNewThreeFundBytopThree(NewThreeFund);
		return NewThreeFunds;
	}

	/*
	 * 五年以来的数据
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/topFiveNewThreeFund")
	public List<NewThreeFund> topFive(NewThreeFund NewThreeFund) {
		// 1.先查询数据库
		List<NewThreeFund> NewThreeFunds = NewThreeFundMapper.selectNewThreeFundBytopFive(NewThreeFund);
		return NewThreeFunds;
	}

	/*
	 * 成立以来的数据
	 * 
	 * @CrossOrigin(origins = "*", maxAge = 3600) //使用于前端的跨域
	 * 
	 * @RequestMapping(value ="/topDateNewThreeFund") public List<NewThreeFund>
	 * topDate(NewThreeFund NewThreeFund){ //1.先查询数据 List<NewThreeFund>
	 * NewThreeFunds = NewThreeFundMapper.selectNewThreeFundBytopDate(NewThreeFund);
	 * return NewThreeFunds; }
	 */

	/*
	 * 2018的数据
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/top2018NewThreeFund")
	public List<NewThreeFund> top2018(NewThreeFund NewThreeFund) {
		// 1.先查询数据
		List<NewThreeFund> NewThreeFunds = NewThreeFundMapper.selectNewThreeFundBytop2018(NewThreeFund);
		return NewThreeFunds;
	}

	/*
	 * 2017的数据
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/top2017NewThreeFund")
	public List<NewThreeFund> top2017(NewThreeFund NewThreeFund) {
		// 1.先查询数据
		List<NewThreeFund> NewThreeFunds = NewThreeFundMapper.selectNewThreeFundBytop2017(NewThreeFund);
		return NewThreeFunds;
	}

	/*
	 * 2016的数据
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/top2016NewThreeFund")
	public List<NewThreeFund> top2016(NewThreeFund NewThreeFund) {
		// 1.先查询数据
		List<NewThreeFund> NewThreeFunds = NewThreeFundMapper.selectNewThreeFundBytop2016(NewThreeFund);
		return NewThreeFunds;
	}

	/*
	 * 2015的数据
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/top2015NewThreeFund")
	public List<NewThreeFund> top2015(NewThreeFund NewThreeFund) {
		// 1.先查询数据
		List<NewThreeFund> NewThreeFunds = NewThreeFundMapper.selectNewThreeFundBytop2015(NewThreeFund);
		return NewThreeFunds;
	}

	/*
	 * 2014的数据
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/top2014NewThreeFund")
	public List<NewThreeFund> top2014(NewThreeFund NewThreeFund) {
		// 1.先查询数据
		List<NewThreeFund> NewThreeFunds = NewThreeFundMapper.selectNewThreeFundBytop2014(NewThreeFund);
		return NewThreeFunds;
	}

	/*
	 * 2013的数据
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/top2013NewThreeFund")
	public List<NewThreeFund> top2013(NewThreeFund NewThreeFund) {
		// 1.先查询数据
		List<NewThreeFund> NewThreeFunds = NewThreeFundMapper.selectNewThreeFundBytop2013(NewThreeFund);
		return NewThreeFunds;
	}

	/*
	 * 2012的数据
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/top2012NewThreeFund")
	public List<NewThreeFund> top2012(NewThreeFund NewThreeFund) {
		// 1.先查询数据
		List<NewThreeFund> companies = NewThreeFundMapper.selectNewThreeFundBytop2012(NewThreeFund);
		return companies;
	}

	/*
	 * 2011的数据
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/top2011NewThreeFund")
	public List<NewThreeFund> top2011(NewThreeFund NewThreeFund) {
		// 1.先查询数据
		List<NewThreeFund> NewThreeFunds = NewThreeFundMapper.selectNewThreeFundBytop2011(NewThreeFund);
		return NewThreeFunds;
	}

}
