package com.iparhan.financial.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import com.iparhan.financial.entity.DynamicRetra;

/**
 * 动态回撤
 * 
 * @author Iparhan 参数列表： date //日期 retraPercent ////回撤率
 *
 */
@Mapper
public interface DynamicRetraMapper {
	@Insert("insert into t_dynamicretra (date,retraPercent) values(#{date},#{retraPercent})")
	void insertDynamicRetra(DynamicRetra dynamicRetra);

}
