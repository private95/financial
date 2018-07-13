package com.iparhan.financial.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.iparhan.financial.entity.Company;
import com.iparhan.financial.entity.CompanyTwo;
import com.iparhan.financial.entity.PrivateStock;

@Mapper
public interface CompanyTwoMapper {

	/*
	 * 发布信息企业信息插入
	 */
	/*@Insert("insert into t_spi_company (name,personName,recordCode,product_count,capitalMoney,address,company_id,establishTime,production,idea_company,corestrategy,"
			+ "nav,cumulative_nav,annualincome,cumulativeincome,key_manager_name,register_number,city,topOneMonth,"
			+ "top2018,topThreeMonth,top2017,topHalfYear,top2016,topOne,top2015,topTwo,top2014,topThree,top2013,topFive,top2012,topDate,top2011,tuser_id) "
			+ "values(#{name},#{personName},#{recordCode},#{product_count},#{capitalMoney},#{address},#{company_id},#{establishTime},#{production},#{idea_company},#{corestrategy},"
			+ "#{nav},#{cumulative_nav},#{annualincome},#{cumulativeincome},#{key_manager_name},#{register_number},#{city},"
			+ "#{topOneMonth},#{top2018},#{topThreeMonth},#{top2017},#{topHalfYear},#{top2016},#{topOne},#{top2015},#{topTwo},#{top2014},#{topThree},#{top2013},#{topFive},#{top2012},#{topDate},#{top2011},"
			+ "#{tuser_id})")*/
	@Insert("insert into t_spi_company (company_id,name,personName,address,recordCode,establishTime,product_count,corestrategy,nav,cumulative_nav,topOneMonth,topThreeMonth,topHalfYear,topOne,topTwo,topThree,topFive,topDate,top2018,top2017,top2016,top2015,top2014,top2013,top2012,top2011,"
			+ "capitalMoney,production,idea_company,"
			+ "annualincome,cumulativeincome,key_manager_name,register_number,city,fund_short_name,"
			+ "tuser_id) "
			+ "values(#{company_id},#{name},#{personName},#{address},#{recordCode},#{establishTime},#{product_count},#{corestrategy},#{nav},#{cumulative_nav},#{topOneMonth},#{topThreeMonth},#{topHalfYear},#{topOne},#{topTwo},#{topThree},#{topFive},#{topDate},#{top2018},#{top2017},#{top2016},#{top2015},#{top2014},#{top2013},#{top2012},#{top2011},"
			+ "#{capitalMoney},#{production},#{idea_company},"
			+ "#{annualincome},#{cumulativeincome},#{key_manager_name},#{register_number},#{city},#{fund_short_name},"
			+ "#{tuser_id})")
	void insertCompany(
			@Param("name") String name, 
			@Param("personName") String personName, 
			@Param("capitalMoney") String capitalMoney,
			@Param("address") String address, 
			@Param("company_id") String company_id,
			@Param("establishTime") String establishTime,
			@Param("recordCode") String recordCode,
			@Param("product_count") String product_count,
			@Param("production") String production,
			@Param("idea_company") String idea_company, 
			@Param("corestrategy") String corestrategy,
			@Param("nav") String nav,
			@Param("cumulative_nav") String cumulative_nav,
			@Param("annualincome") String annualincome,
			@Param("cumulativeincome") String cumulativeincome,
			@Param("key_manager_name") String key_manager_name,
			@Param("register_number") String register_number,
			@Param("city") String city, 
			
			@Param("topOneMonth") String topOneMonth,
			@Param("top2018") String top2018,
			@Param("topThreeMonth") String topThreeMonth,
			@Param("top2017") String top2017,
			@Param("topHalfYear") String topHalfYear,
			@Param("top2016") String top2016,
			@Param("topOne") String topOne,
			@Param("top2015") String top2015,
			@Param("topTwo") String topTwo,
			@Param("top2014") String top2014,
			@Param("topThree") String topThree,
			@Param("top2013") String top2013,
			@Param("topFive") String topFive,
			@Param("top2012") String top2012,
			@Param("topDate") String topDate,
			@Param("top2011") String top2011,
			
			@Param("fund_short_name") String fund_short_name,
			@Param("tuser_id") int tuser_id);
	
	
	@Insert("INSERT INTO `t_spi_privatestock` "
			+ "(`fund_shortName`, `fundCompany`, `nav`, `cumulative_nav`,"
			+ "`topOneMonth`, `topThreeMonth`,`topHalfYear`, `topOne`, `topTwo`, `topThree`, `topFive`, `top2018`, `top2017`, `top2016`, `top2015`, `top2014`, `top2013`, `top2012`,`top2011`, "
			+ "`price_date`, `company_id`, `annualized`, `sharpeatio`, `tuser_id`) "
			+ "VALUES (#{fund_shortName},#{fundCompany},#{nav},#{cumulative_nav},"
			+ "#{topOneMonth},#{topThreeMonth},#{topHalfYear},#{topOne},#{topTwo},#{topThree},#{topFive},#{top2018},#{top2017},#{top2016},#{top2015},#{top2014},#{top2013},#{top2012},#{top2011},"
			+ "#{price_date},#{company_id},#{annualized},#{sharpeatio},#{tuser_id})")
	void privatestock(
			@Param("fund_shortName") String fund_shortName, 
			@Param("fundCompany") String fundCompany, 
			@Param("nav") String nav, 
			@Param("cumulative_nav") String cumulative_nav, 
			
			@Param("topOneMonth") String topOneMonth,
			@Param("top2018") String top2018,
			@Param("topThreeMonth") String topThreeMonth,
			@Param("top2017") String top2017,
			@Param("topHalfYear") String topHalfYear,
			@Param("top2016") String top2016,
			@Param("topOne") String topOne,
			@Param("top2015") String top2015,
			@Param("topTwo") String topTwo,
			@Param("top2014") String top2014,
			@Param("topThree") String topThree,
			@Param("top2013") String top2013,
			@Param("topFive") String topFive,
			@Param("top2012") String top2012,
			@Param("top2011") String top2011,
			
			@Param("price_date") String price_date, 
			@Param("company_id") String company_id,
			@Param("annualized") String annualized, 
			@Param("sharpeatio") String sharpeatio,
			@Param("tuser_id") int tuser_id);

	 
	/**
	 * 用户手动插入的企业信息
	 * 
	 * @param companyTwo
	 * @return
	 */
	@Select("SELECT * FROM t_company")
	List<CompanyTwo> companysDelete();


	// 企业信息==了解详情
	@Select("SELECT * FROM `t_spi_company` WHERE id=#{id}")
	public Company getAllCompany(int id);

	// 根据查询的用户ID去查询该id发布的信息
	// 查询当前用户发布的信息
	@Select("SELECT t_spi_company.*,t_user.* FROM t_spi_company LEFT JOIN t_user ON t_spi_company.tuser_id=t_user.id WHERE t_user.id=#{id}")
	public List<Company> getCompantTwoById(String id);

	// 首页为您提供最新企业信息 查询所有企业信息的信息，按照降序排序 只显示最新的8条数据
	@Select("SELECT * FROM t_spi_company ORDER BY establishTime DESC LIMIT 6")
	public List<Company> getAllComByCumid();

	// 根据id删除用户发布过的信息
	@Delete("DELETE FROM t_spi_company WHERE id = #{id}")
	int deleteCompany(@Param("id") String id);

	// 首页条件查询---基金名称 按照创建时间降序排列
	@Select("SELECT * FROM `t_spi_privatestock` ORDER BY establishTime DESC")
	public List<PrivateStock> getProduction();

	// 首页条件查询---基金公司 按照创建时间降序排列
	@Select("SELECT * FROM `t_spi_privatestock` ORDER BY establishTime DESC")
	public List<PrivateStock> getProduction2();

	// 首页条件查询---最新净值 按照最新净值排列
	@Select("SELECT * FROM `t_spi_privatestock` ORDER BY nav DESC")
	public List<PrivateStock> getProduction3();

	// 首页条件查询---累计收益 按照累计收益降序排列
	@Select("SELECT * FROM `t_spi_privatestock` ORDER BY cumulativeincome DESC")
	public List<PrivateStock> getProduction4();

	// 首页条件查询---年化收益 按照年化收益降序排列
	@Select("SELECT * FROM `t_spi_privatestock` ORDER BY `annualized` DESC")
	public List<PrivateStock> getProduction5();

	// 首页条件查询---风险等级 按照风险等级降序排列
	@Select("SELECT * FROM `t_spi_privatestock` ORDER BY riskgrade DESC")
	public List<PrivateStock> getProduction6();


	


}
