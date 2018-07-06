package com.iparhan.financial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iparhan.financial.dao.EvolutionMapper;
import com.iparhan.financial.entity.Evolution;

@RestController
public class EvolutionController {

	@Autowired
	private EvolutionMapper evolutionMapper;

	/*
	 * 个人风险评测数据存进数据库
	 */
	@RequestMapping(value = "/evolutionData")
	public void evolutionData(Evolution newarr) {
		// 接受数据
		System.out.println(newarr);

		// 存到数据库
		evolutionMapper.register(newarr);
	}

}
