package com.iparhan.financial.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.iparhan.financial.entity.Company;

/*
 * 浏览历史
 * 实现思路:当用户点击某一条基金信息的了解详情时，后台接收该条信息的id，查询id对应的公司名称
 * */
@Mapper
public interface BrowseHistoryMapper {
	// 根据用户点击详情id获取公司名称
	@Select("SELECT *  FROM `t__spi_company` WHERE id=#{id}")
	public Company getCompanyById(String id);

}