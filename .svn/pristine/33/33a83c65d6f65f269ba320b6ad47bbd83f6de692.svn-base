package com.iparhan.financial.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.iparhan.financial.entity.OverSeasFund;

@Mapper
public interface OverSeasFundMapper {
	
	/*
	 * 查询一个月以来的收益有数据的全部企业信息
	 * 思路：根据t_OverSeasFund表里面的数据根据topOneMonth字段来查询
	 */
	@Select("SELECT * FROM t_spi_overseasfund where topOneMonth !=  0")
	List<OverSeasFund> selectOverSeasFundByOneMonth (OverSeasFund OverSeasFund);
	
	/*
	 * 查询根据三个月以来的收益数据来查询
	 */
	@Select("SELECT * FROM t_spi_overseasfund where topThreeMonth !=  0")
	List<OverSeasFund> selectOverSeasFundByThreeMonth(OverSeasFund OverSeasFund);
	
	/*
	 * 根据半年的数据来查询全部数据
	 */
	@Select("SELECT * FROM t_spi_overseasfund where topHalfYear !=  0")
	List<OverSeasFund> selectOverSeasFundBytopHalfYear(OverSeasFund OverSeasFund);
	
	/*
	 * 根据一年以来的数据来查询全部数据
	 */
	@Select("SELECT * FROM t_spi_overseasfund where topOne !=  0")
	List<OverSeasFund> selectOverSeasFundBytopOne(OverSeasFund OverSeasFund);
	
	/*
	 * 两年以来的数据
	 */
	@Select("SELECT * FROM t_spi_overseasfund where topTwo !=  0")
	List<OverSeasFund> selectOverSeasFundBytopTwo(OverSeasFund OverSeasFund);
	
	/*
	 * 三年以来的数据
	 */
	@Select("SELECT * FROM t_spi_overseasfund where topThree !=  0")
	List<OverSeasFund> selectOverSeasFundBytopThree(OverSeasFund OverSeasFund);
	
	/*
	 * 5年以来的数据
	 */
	@Select("SELECT * FROM t_spi_overseasfund where topFive !=  0")
	List<OverSeasFund> selectOverSeasFundBytopFive(OverSeasFund OverSeasFund);
	
	/*
	 * 成立以来的数据
	 */
	@Select("SELECT * from t_spi_OverSeasFund where topDate != 0")
	List<OverSeasFund> selectOverSeasFundBytopDate(OverSeasFund OverSeasFund);
	
	/*
	 * 2018的数据
	 */
	@Select("SELECT * from t_spi_OverSeasFund where top2018 != 0")
	List<OverSeasFund> selectOverSeasFundBytop2018(OverSeasFund OverSeasFund);
	
	/*
	 * 2017的数据
	 */
	@Select("SELECT * from t_spi_OverSeasFund where top2017 != 0")
	List<OverSeasFund> selectOverSeasFundBytop2017(OverSeasFund OverSeasFund);
	
	/*
	 * 2016的数据
	 */
	@Select("SELECT * from t_spi_OverSeasFund where top2016 != 0")
	List<OverSeasFund> selectOverSeasFundBytop2016(OverSeasFund OverSeasFund);
	
	/*
	 * 2015的数据
	 */
	@Select("SELECT * from t_spi_OverSeasFund where top2015 != 0")
	List<OverSeasFund> selectOverSeasFundBytop2015(OverSeasFund OverSeasFund);
	
	/*
	 * 2014的数据
	 */
	@Select("SELECT * from t_spi_OverSeasFund where top2014 != 0")
	List<OverSeasFund> selectOverSeasFundBytop2014(OverSeasFund OverSeasFund);
	
	/*
	 * 2013的数据
	 */
	@Select("SELECT * from t_spi_OverSeasFund where top2013 != 0")
	List<OverSeasFund> selectOverSeasFundBytop2013(OverSeasFund OverSeasFund);
	
	/*
	 * 2012的数据
	 */
	@Select("SELECT * from t_spi_OverSeasFund where top2012 != 0")
	List<OverSeasFund> selectOverSeasFundBytop2012(OverSeasFund OverSeasFund);
	
	/*
	 * 2011的数据
	 */
	@Select("SELECT * from t_spi_OverSeasFund where top2011 != 0")
	List<OverSeasFund> selectOverSeasFundBytop2011(OverSeasFund OverSeasFund);

}
