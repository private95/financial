package com.iparhan.financial.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.iparhan.financial.entity.Evolution;

@Mapper
public interface EvolutionMapper {
	
	/**
	 * 个人风险评测
	 * @param username
	 * @param password
	 * @param email
	 * @return
	 */
	@Insert("insert into t_evolution (isPrivateProduction,under300,over50,age,education,job,houseIncome,invest,strock_expreince,invest_expreince,yearOf_expreince,invest_target,plan_invest,invets_attuide,lastTwo,lastONe) values(#{isPrivateProduction},#{under300},#{over50},#{age},#{education},#{job},#{houseIncome},#{invest},#{strock_expreince},#{invest_expreince},#{yearOf_expreince},#{invest_target},#{plan_invest},#{invets_attuide},#{lastTwo},#{lastONe})")
    void register(Evolution evolution);

}
