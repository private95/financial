package com.iparhan.financial.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.iparhan.financial.entity.FOFFund;

@Mapper
public interface FOFFundMapper {

	/*
	 * 查询FOF基金全部数据
	 */
	@Select("SELECT * FROM t_spi_foffund")
	List<FOFFund> queryFOFFund(FOFFund fofFund);

}
