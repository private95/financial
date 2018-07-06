package com.iparhan.financial.search.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import com.iparhan.financial.search.entity.FundSearch;

/**
 * 理财百科搜索业务——基金查询
 * @author Iparhan
 *
 */
@Mapper
public interface FundSearchMapper {
	

	/*
	 * 根据用户名查询企业全部信息  精确查询
	 */
    @Select("SELECT * FROM t__spi_privatestock WHERE fund_shortName = #{name}")
    List<FundSearch> queryFundSearch(@Param("name")String name);
    
    
    /*
     * 根据基金名称模糊查询
     */
    @Select("SELECT * FROM t__spi_privatestock WHERE fund_shortName  LIKE CONCAT('%',#{name},'%')")
    List<FundSearch> queryFundSearchVague(@Param("name")String name);
}
