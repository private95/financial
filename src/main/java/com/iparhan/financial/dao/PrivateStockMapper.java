package com.iparhan.financial.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import com.iparhan.financial.entity.Company;
import com.iparhan.financial.entity.CompanyTwo;
import com.iparhan.financial.entity.PrivateCompany;
import com.iparhan.financial.entity.PrivateStock;

@Mapper
public interface PrivateStockMapper {

	/*
	 * 首页私募排行查询，按照累计排名，降序  查询公司表，基金表，两表关联为company_id
	 */
	@Select("SELECT `t_spi_company`.`name`,`t_spi_privatestock`.`fundCompany`,`t_spi_privatestock`.`id`,`t_spi_privatestock`.`fund_shortName`,`t_spi_privatestock`.`nav`,`t_spi_privatestock`.`cumulative_nav`,`t_spi_privatestock`.`topOneMonth`,`t_spi_privatestock`.annualized,`t_spi_privatestock`.sharpeatio,`t_spi_privatestock`.oneyearrating FROM `t_spi_company`,`t_spi_privatestock` WHERE `t_spi_company`.`company_id`=`t_spi_privatestock`.`company_id` ORDER BY `t_spi_privatestock`.cumulative_nav DESC")
	// list返回sql语句要查询的字段，是一个新建的实体
	public List<PrivateCompany> getAllPriByCumDesc();
	
	/*
	 * 多条件查询
	 */
	@Select("SELECT t_spi_company.*,t_spi_privatestock.* FROM t_spi_privatestock  INNER JOIN t_spi_company  ON t_spi_privatestock.company_id = t_spi_company.company_id WHERE concat(t_spi_company.`name`,t_spi_company.personName,t_spi_privatestock.fund_shortName,t_spi_privatestock.fund_shortName) LIKE '%${searchnum}%'")
	public List<PrivateCompany> inputSearchData(@Param("searchnum") String searchnum);
	
	/*
	 * 根据公司名称查询公司有多少基金
	 */
	@Select("SELECT `t_spi_company`.* FROM `t_spi_company` INNER JOIN `t_spi_privatestock` on `t_spi_company`.`company_id`=`t_spi_privatestock`.`company_id` where `name`=#{companyName}")
    public List<PrivateCompany> getProductCompanyName(@Param("companyName") String companyName);
	
	
	/**
	 * 产品详情
	 * @param cpId
	 * @return
	 */
	@Select("SELECT t_spi_company.*, t_spi_privatestock.* FROM t_spi_privatestock INNER JOIN t_spi_company ON "
			+ "t_spi_privatestock.company_id = t_spi_company.company_id WHERE t_spi_privatestock.id = #{cpId}")
	public List<Company> selectBycpId(@Param("cpId") Integer cpId);
	
	
	
	/*
	 * 首页-私募产品排行数据-详情页面 根据选中基金获取id,根据id,在详情页面获取数据
	 */
	@Select("select * from t_spi_privatestock where id=#{id}")
	public PrivateStock getPrivateStock(int id);

	// ====================================================================================
	/*
	 * 查询一个月以来的收益有数据的全部企业信息 思路：根据t_PrivateStock表里面的数据根据topOneMonth字段来查询
	 */
	@Select("SELECT t_spi_company.*, t_spi_privatestock.* FROM t_spi_privatestock INNER JOIN t_spi_company ON"
			+ " t_spi_privatestock.company_id = t_spi_company.company_id  ORDER BY t_spi_company.topOneMonth DESC limit 100")
	List<Company> selectPrivateStockByOneMonth(Company privateStock);

	/* 
	 * 查询根据三个月以来的收益数据来查询
	 */
	@Select("SELECT t_spi_company.*, t_spi_privatestock.* FROM t_spi_privatestock INNER JOIN t_spi_company ON t_spi_privatestock.company_id = t_spi_company.company_id  ORDER BY t_spi_company.topOneMonth DESC limit 100")
	List<Company> selectPrivateStockByThreeMonth(Company privateStock);

	/*
	 * 根据半年的数据来查询全部数据
	 */
	@Select("SELECT t_spi_company.*, t_spi_privatestock.* FROM t_spi_privatestock INNER JOIN t_spi_company ON "
			+ "t_spi_privatestock.company_id = t_spi_company.company_id  ORDER BY t_spi_company.topHalfYear DESC limit 100")
	List<Company> selectPrivateStockBytopHalfYear(Company privateStock);

	/*
	 * 根据一年以来的数据来查询全部数据
	 */
	@Select("SELECT t_spi_company.*, t_spi_privatestock.* FROM t_spi_privatestock INNER JOIN t_spi_company ON "
			+ "t_spi_privatestock.company_id = t_spi_company.company_id  ORDER BY t_spi_company.topOne DESC limit 100")
	List<Company> selectPrivateStockBytopOne(Company privateStock);

	/*
	 * 两年以来的数据
	 */
	@Select("SELECT t_spi_company.*, t_spi_privatestock.* FROM t_spi_privatestock INNER JOIN t_spi_company ON "
			+ "t_spi_privatestock.company_id = t_spi_company.company_id  ORDER BY t_spi_company.topTwo DESC limit 100")
	List<Company> selectPrivateStockBytopTwo(Company privateStock);

	/*
	 * 三年以来的数据
	 */
	@Select("SELECT t_spi_company.*, t_spi_privatestock.* FROM t_spi_privatestock INNER JOIN t_spi_company ON "
			+ "t_spi_privatestock.company_id = t_spi_company.company_id  ORDER BY t_spi_company.topThree DESC limit 100")
	List<Company> selectPrivateStockBytopThree(Company privateStock);

	/*
	 * 5年以来的数据
	 */
	@Select("SELECT t_spi_company.*, t_spi_privatestock.* FROM t_spi_privatestock INNER JOIN t_spi_company ON"
			+ " t_spi_privatestock.company_id = t_spi_company.company_id ORDER BY t_spi_company.topFive DESC limit 100")
	List<Company> selectPrivateStockBytopFive(Company privateStock);

	/*
	 * 成立以来的数据
	 */
	@Select("SELECT t_spi_company.*, t_spi_privatestock.* FROM t_spi_privatestock INNER JOIN t_spi_company ON "
			+ "t_spi_privatestock.company_id = t_spi_company.company_id ORDER BY t_spi_company.topDate DESC")
	List<Company> selectPrivateStockBytopDate(Company privateStock);

	/*
	 * 2018的数据
	 */
	@Select("SELECT t_spi_company.*, t_spi_privatestock.* FROM t_spi_privatestock INNER JOIN t_spi_company ON "
			+ "t_spi_privatestock.company_id = t_spi_company.company_id  ORDER BY t_spi_company.top2018 DESC limit 100")
	List<Company> selectPrivateStockBytop2018(Company privateStock);

	/*
	 * 2017的数据
	 */
	@Select("SELECT t_spi_company.*, t_spi_privatestock.* FROM t_spi_privatestock INNER JOIN t_spi_company ON "
			+ "t_spi_privatestock.company_id = t_spi_company.company_id  ORDER BY t_spi_company.top2017 DESC limit 100")
	List<Company> selectPrivateStockBytop2017(Company privateStock);

	/*
	 * 2016的数据
	 */
	@Select("SELECT t_spi_company.*, t_spi_privatestock.* FROM t_spi_privatestock INNER JOIN t_spi_company ON "
			+ "t_spi_privatestock.company_id = t_spi_company.company_id  ORDER BY t_spi_company.top2016 DESC limit 100")
	List<Company> selectPrivateStockBytop2016(Company privateStock);

	/*
	 * 2015的数据 t_spi_company.top2015 ORDER BY t_spi_company.top2015 DESC
	 */
	@Select("SELECT t_spi_company.*, t_spi_privatestock.* FROM t_spi_privatestock INNER JOIN t_spi_company ON "
			+ "t_spi_privatestock.company_id = t_spi_company.company_id  ORDER BY t_spi_company.top2015 DESC limit 100")
	List<Company> selectPrivateStockBytop2015(Company privateStock);

	/*
	 * 2014的数据
	 */
	@Select("SELECT t_spi_company.*, t_spi_privatestock.* FROM t_spi_privatestock INNER JOIN t_spi_company ON "
			+ "t_spi_privatestock.company_id = t_spi_company.company_id  ORDER BY t_spi_company.top2014 DESC limit 100")
	List<Company> selectPrivateStockBytop2014(Company privateStock);

	/*
	 * 2013的数据
	 */
	@Select("SELECT t_spi_company.*, t_spi_privatestock.* FROM t_spi_privatestock INNER JOIN t_spi_company ON "
			+ "t_spi_privatestock.company_id = t_spi_company.company_id  ORDER BY t_spi_company.top2013 DESC limit 100")
	List<Company> selectPrivateStockBytop2013(Company privateStock);

	/*
	 * 2012的数据
	 */
	@Select("SELECT t_spi_company.*, t_spi_privatestock.* FROM t_spi_privatestock INNER JOIN t_spi_company ON "
			+ "t_spi_privatestock.company_id = t_spi_company.company_id  ORDER BY t_spi_company.top2012 DESC limit 100")
	List<Company> selectPrivateStockBytop2012(Company privateStock);

	/*
	 * 2011的数据
	 */
	@Select("SELECT t_spi_company.*, t_spi_privatestock.* FROM t_spi_privatestock INNER JOIN t_spi_company ON "
			+ "t_spi_privatestock.company_id = t_spi_company.company_id  ORDER BY t_spi_company.top2011 DESC limit 100")
	List<Company> selectPrivateStockBytop2011(Company privateStock);
	
	
	@Update("UPDATE  t_spi_privatestock SET tuser_id = #{tuserId},is_collect =#{state}  where id = #{id}")
	void updatePrivateStock(@Param("tuserId")Integer tuserId, @Param("id")Integer id,@Param("state")String state);
	
	@Select("select * from t_spi_privatestock where tuser_id = #{tuserId} and is_collect = '1'")
	List<PrivateStock> selectByTuserId(@Param("tuserId")Integer tuserId);

	
	@Select("select * from t_spi_privatestock where company_id=#{conmtyId}")
	public List<PrivateCompany> getComptyIdShow(String comptyId);
	

}
