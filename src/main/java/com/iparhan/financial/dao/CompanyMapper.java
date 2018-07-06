package com.iparhan.financial.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.iparhan.financial.entity.Company;
import com.iparhan.financial.entity.CompanyTwo;

@Mapper
public interface CompanyMapper {

	/*
	 * 插入的是理财百科自己的数据表和实体类
	 */
	/*
	 * @Insert("insert into t_spi_company (name,personName,capitalMoney,address,recordCode,establishTime,production,idea) "
	 * +
	 * "values(#{name},#{personName},#{capitalMoney},#{address},#{recordCode},#{establishTime},#{production},#{idea})")
	 * void insertCompany(CompanyTwo company);
	 */
	/*
	 * 企业的了解详情 首页--专项查询--企业信息--了解详情
	 */
	@Select("select * from t_spi_company where id=#{id}")
	public List<Company> getAllCompanyInfo(int id);

	/*
	 * 首页产品推荐，只显示两条数据
	 */
	@Select("SELECT	p.id,	p.fund_shortName,	p.fundCompany,	p.nav,	p.yearNav,	p.cumulative_nav,	c.corestrategy FROM 	t_spi_privatestock p, 	t_spi_company c WHERE 	p.company_id = c.company_id ORDER BY	cumulative_nav DESC, nav DESC LIMIT 2")
	List<Company> selectCompanyByTwo(Company company);

	/*
	 * 查询一个月以来的收益有数据的全部企业信息 思路：根据t_company表里面的数据根据topOneMonth字段来查询
	 */
	@Select("SELECT * from t_spi_company where topOneMonth != 0")
	List<Company> selectCompanyByOneMonth(Company company);

	/*
	 * 查询根据三个月以来的收益数据来查询
	 */
	@Select("SELECT * from t_spi_company where topThreeMonth != 0")
	List<Company> selectCompanyByThreeMonth(Company company);

	/*
	 * 根据半年的数据来查询全部数据
	 */
	@Select("SELECT * from t_spi_company where topHalfYear != 0")
	List<Company> selectCompanyBytopHalfYear(Company company);

	/*
	 * 根据一年以来的数据来查询全部数据
	 */
	@Select("SELECT * from t_spi_company where topOne != 0")
	List<Company> selectCompanyBytopOne(Company company);

	/*
	 * 两年以来的数据
	 */
	@Select("SELECT * from t_spi_company where topTwo != 0")
	List<Company> selectCompanyBytopTwo(Company company);

	/*
	 * 三年以来的数据
	 */
	@Select("SELECT * from t_spi_company where topThree != 0")
	List<Company> selectCompanyBytopThree(Company company);

	/*
	 * 5年以来的数据
	 */
	@Select("SELECT * from t_spi_company where topFive != 0")
	List<Company> selectCompanyBytopFive(Company company);

	/*
	 * 成立以来的数据
	 */
	@Select("SELECT * from t_spi_company where topDate != 0")
	List<Company> selectCompanyBytopDate(Company company);

	/*
	 * 2018的数据
	 */
	@Select("SELECT * from t_spi_company where top2018 != 0")
	List<Company> selectCompanyBytop2018(Company company);

	/*
	 * 2017的数据
	 */
	@Select("SELECT * from t_spi_company where top2017 != 0")
	List<Company> selectCompanyBytop2017(Company company);

	/*
	 * 2016的数据
	 */
	@Select("SELECT * from t_spi_company where top2016 != 0")
	List<Company> selectCompanyBytop2016(Company company);

	/*
	 * 2015的数据
	 */
	@Select("SELECT * from t_spi_company where top2015 != 0")
	List<Company> selectCompanyBytop2015(Company company);

	/*
	 * 2014的数据
	 */
	@Select("SELECT * from t_spi_company where top2014 != 0")
	List<Company> selectCompanyBytop2014(Company company);

	/*
	 * 2013的数据
	 */
	@Select("SELECT * from t_spi_company where top2013 != 0")
	List<Company> selectCompanyBytop2013(Company company);

	/*
	 * 2012的数据
	 */
	@Select("SELECT * from t_spi_company where top2012 != 0")
	List<Company> selectCompanyBytop2012(Company company);

	/*
	 * 2011的数据
	 */
	@Select("SELECT * from t_spi_company where top2011 != 0")
	List<Company> selectCompanyBytop2011(Company company);

	@Select("insert into")
	public int  uploadInformation(Company company);

}