package com.iparhan.financial.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.iparhan.financial.entity.NewThreeFund;

@Mapper
public interface NewThreeFundMapper {
	
	/*
	 * 查询一个月以来的收益有数据的全部企业信息
	 * 思路：根据t_NewThreeFund表里面的数据根据topOneMonth字段来查询
	 */
	@Select("SELECT * FROM t_spi_newthree where topOneMonth !=  0")
	List<NewThreeFund> selectNewThreeFundByOneMonth (NewThreeFund NewThreeFund);
	
	/*
	 * 查询根据三个月以来的收益数据来查询
	 */
	@Select("SELECT * FROM t_spi_newthree where topThreeMonth !=  0")
	List<NewThreeFund> selectNewThreeFundByThreeMonth(NewThreeFund NewThreeFund);
	
	/*
	 * 根据半年的数据来查询全部数据
	 */
	@Select("SELECT * FROM t_spi_newthree where topHalfYear !=  0")
	List<NewThreeFund> selectNewThreeFundBytopHalfYear(NewThreeFund NewThreeFund);
	
	/*
	 * 根据一年以来的数据来查询全部数据
	 */
	@Select("SELECT * FROM t_spi_newthree where topOne !=  0")
	List<NewThreeFund> selectNewThreeFundBytopOne(NewThreeFund NewThreeFund);
	
	/*
	 * 两年以来的数据
	 */
	@Select("SELECT * FROM t_spi_newthree where topTwo !=  0")
	List<NewThreeFund> selectNewThreeFundBytopTwo(NewThreeFund NewThreeFund);
	
	/*
	 * 三年以来的数据
	 */
	@Select("SELECT * FROM t_spi_newthree where topThree !=  0")
	List<NewThreeFund> selectNewThreeFundBytopThree(NewThreeFund NewThreeFund);
	
	/*
	 * 5年以来的数据
	 */
	@Select("SELECT * FROM t_spi_newthree where topFive !=  0")
	List<NewThreeFund> selectNewThreeFundBytopFive(NewThreeFund NewThreeFund);
	
	/*
	 * 成立以来的数据
	 */
	@Select("SELECT * from t_spi_NewThreeFund where topDate != 0")
	List<NewThreeFund> selectNewThreeFundBytopDate(NewThreeFund NewThreeFund);
	
	/*
	 * 2018的数据
	 */
	@Select("SELECT * FROM t_spi_newthree where top2018 !=  0")
	List<NewThreeFund> selectNewThreeFundBytop2018(NewThreeFund NewThreeFund);
	
	/*
	 * 2017的数据
	 */
	@Select("SELECT * FROM t_spi_newthree where top2017 !=  0")
	List<NewThreeFund> selectNewThreeFundBytop2017(NewThreeFund NewThreeFund);
	
	/*
	 * 2016的数据
	 */
	@Select("SELECT * FROM t_spi_newthree where top2016 !=  0")
	List<NewThreeFund> selectNewThreeFundBytop2016(NewThreeFund NewThreeFund);
	
	/*
	 * 2015的数据
	 */
	@Select("SELECT * FROM t_spi_newthree where top2015 !=  0")
	List<NewThreeFund> selectNewThreeFundBytop2015(NewThreeFund NewThreeFund);
	
	/*
	 * 2014的数据
	 */
	@Select("SELECT * FROM t_spi_newthree where top2014 !=  0")
	List<NewThreeFund> selectNewThreeFundBytop2014(NewThreeFund NewThreeFund);
	
	/*
	 * 2013的数据
	 */
	@Select("SELECT * FROM t_spi_newthree where top2013 !=  0")
	List<NewThreeFund> selectNewThreeFundBytop2013(NewThreeFund NewThreeFund);
	
	/*
	 * 2012的数据
	 */
	@Select("SELECT * FROM t_spi_newthree where top2012 !=  0")
	List<NewThreeFund> selectNewThreeFundBytop2012(NewThreeFund NewThreeFund);
	
	/*
	 * 2011的数据
	 */
	@Select("SELECT * FROM t_spi_newthree where top2011 !=  0")
	List<NewThreeFund> selectNewThreeFundBytop2011(NewThreeFund NewThreeFund);

}
