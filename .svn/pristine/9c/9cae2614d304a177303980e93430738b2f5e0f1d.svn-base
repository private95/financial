package com.iparhan.financial.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.iparhan.financial.entity.Historical;

@Mapper
public interface HistoricalMapper {

//	@Insert("insert into t_user (username,password,email) values(#{username},#{password},#{email})")
//	int register(@Param("username") String username, @Param("password") String password, @Param("email") String email);

	
	@Select("select * from historical_records where tuser_Id=#{userId} ORDER BY hid DESC LIMIT 8")
	public List<Historical> listHistricals(Integer userId);
	
	@Select("select * from historical_records  ORDER BY hid DESC LIMIT 8")
	 List<Historical> listHistrical();

//	@Insert("INSERT INTO `historical_records` (`hid`, `tuser_Id`, `company_Id`, `company_name`, `hist_time`) VALUES (23,#{tuser_Id},#{company_Id}, #{company_name},'')")
	@Insert("INSERT INTO `historical_records` (`tuser_Id`, `company_Id`, `company_name`,`hist_time`) VALUES (#{tuser_Id},#{company_Id},#{company_name},#{time})")
	 void addHistorcals(
			@Param("tuser_Id")Integer tuser_Id, 
			@Param("company_Id")Integer company_Id, 
			@Param("company_name")String company_name, 
			@Param("time") Date time
		 );

	@Insert("INSERT INTO `historical_records` (`company_Id`, `company_name`,`hist_time`) VALUES (#{company_Id}, #{company_name},#{time})")
	 void addHistorcal(
			@Param("company_Id") Integer company_Id, 
			@Param("company_name")String company_name, 	
			@Param("time") Date time
			);
}

