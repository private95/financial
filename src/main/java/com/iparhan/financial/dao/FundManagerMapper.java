package com.iparhan.financial.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.iparhan.financial.entity.FundManager;

/**
 * 基金经理数据配置文件
 * @author Iparhan
 * 参数列表：
 * fundManagerName   //成员姓名
 * idea              //投资理念
 *
 */
@Mapper
public interface FundManagerMapper {
	
	@Insert("insert into t_fundmanager(fundManagerName,idea_fundManagerName) values(#{fundManagerName},#{idea_fundManagerName})")
	void insertFundManager(@Param("fundManagerName")String fundManagerName ,@Param("idea_fundManagerName")String idea_fundManagerName  );
	

}
