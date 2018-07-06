package com.iparhan.financial.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.iparhan.financial.entity.Company;
import com.iparhan.financial.entity.PrivateStock;;

@Mapper
public interface TopThreeYearsDao {
	/*
	 * 查询私募表中所有数据 并以累计收益降序
	 */
	@Select("SELECT * FROM t__spi_privatestock order by cumulativeincome desc")
	List<PrivateStock> query();
	
	/*
	 * 排行表和公司表联查
	 */
	@Select("select * from t__spi_privatestock  INNER JOIN t__spi_company  on t__spi_privatestock.company_id=t__spi_company.company_id ORDER BY t__spi_privatestock.cumulativeincome DESC")
	List<Company> twotablequery();
	
}
