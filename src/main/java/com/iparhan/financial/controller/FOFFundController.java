package com.iparhan.financial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.iparhan.financial.dao.FOFFundMapper;
import com.iparhan.financial.entity.FOFFund;

/**
 * FOF基金信息展现
 * 
 * @author Iparhan
 *
 */
@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
@RestController
public class FOFFundController {

	/**
	 * 业务思路： 1.调用数据模块 2.无条件查询 难度：0颗星
	 */

	@Autowired
	private FOFFundMapper fofFundMapper;

	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/fofFundQuery")
	public @ResponseBody List<FOFFund> fofFundQuery(FOFFund fofFund) {

		// 查询全部数据 无条件方式
		List<FOFFund> fofFunds = fofFundMapper.queryFOFFund(fofFund);
		return fofFunds;

	}
}
