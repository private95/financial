package com.iparhan.financial.search.dao;


import java.util.List;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.solr.client.solrj.SolrQuery;

import com.iparhan.financial.admin.entity.SearchResult;
import com.iparhan.financial.entity.Company;
import com.iparhan.financial.search.entity.CompanySearch;

/**
 * 搜索业务思路：
 * 1.精确查询                                             东龙鲟业北京发展有限公司
 * 2.一级模糊查询                                      %东龙鲟业%
 * 3.二级模糊查询                                      %东%
 * 4.三级联机多条件模糊查询                   %东龙% or %鲟业% or %公司% or %北京%
 * @author Iparhan
 *
 */
@Mapper
public interface CompanySearchDao {
	
	
//	@Select("<script>"+"SELECT * from t__spi_company where establishTime  LIKE CONCAT(CONCAT('%', #{establishTime}), '%')"+"</script>")

	@Select("<script>"+"SELECT * FROM t__spi_company where "
			+ "name LIKE CONCAT(CONCAT('%', #{name}), '%')"
			+ "OR personName like CONCAT(CONCAT('%', #{name}), '%') "
			+ "OR production  like CONCAT(CONCAT('%', #{name}), '%')"+"</script>")
	List<CompanySearch> companySearchToMany(@Param("name") String name);
		
	/*
	 * 精确查询
	 */
	@Select("SELECT * FROM t__spi_company where name = #{name}")
	List<CompanySearch> companySearch(@Param("name") String name);
	
	/*
	 * 一级模糊查询
	 */
	@Select("SELECT * FROM t__spi_company WHERE `name` like CONCAT('%',#{name},'%') ")
	//@Select("SELECT * FROM t__spi_company")
	List<CompanySearch> companySearchLevelOne(@Param("name") String name);
	
	/*
	 * 二级模糊查询  
	 */
	@Select("SELECT * FROM t__spi_company WHERE `name` like '#{name}%'")
	List<CompanySearch> companySearchsLevelTwo(@Param("name") String name);
	
	/*
	 * 
	 * 
	 * 
	 * 
	 * 二级模糊查询相反
	 */
	@Select("SELECT * FROM t__spi_company WHERE `name` like '%#{name}'")
	List<CompanySearch> companySearchsLevelTwo2(@Param("name") String name);
	

	 
	/*
	 * 根据核心人物来查询  模糊查询
	 */
	@Select("SELECT * FROM t__spi_company WHERE `personName` like CONCAT('%',#{name},'%')")
	List<CompanySearch> companySearchsPerson(@Param("name") String name);
	
	/*
	 * 根据核心人物查询  精确查询
	 */
	@Select("SELECT * FROM t__spi_company WHERE personName = #{name}")
	List<CompanySearch> companySearchsPersonNormal(@Param("name") String name);
	
	/*
	 * 根据地址精确查询
	 */
	@Select("SELECT * FROM t__spi_company WHERE address like CONCAT('%',#{name},'%')")
	List<CompanySearch> companySearchsAddress(@Param("name") String name);
	
	/*
	 * 根据基金查询  基金(产品)
	 */
	@Select("SELECT * FROM t__spi_company WHERE production like CONCAT('%',#{production},'%')")
	List<CompanySearch> companySearchsProduction(@Param("production") String production);
	

	@Select("select * from t__spi_company a ,t__spi_privatestock b\n" + 
			"where a.company_id = b.company_id ")
	List<CompanySearch> getCompanySearchList();
	




}
