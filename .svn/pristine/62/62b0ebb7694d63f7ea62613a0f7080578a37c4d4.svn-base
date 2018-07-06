package com.iparhan.financial.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import com.iparhan.financial.entityTime.TopHalfYear;

/**
 * 半年以来的数据
 * @author Iparhan
 *参数列表：
 *fundTopHalfYear
 *avarageTopHalfYear
 *csi300TopHalfYear
 */
@Mapper
public interface TopHalfYearMapper {
	
	@Insert("insert into t_tophalfyear (fundTopHalfYear,avarageTopHalfYear,csi300TopHalfYear) "
			+ "values(#{fundTopHalfYear},#{avarageTopHalfYear},#{csi300TopHalfYear})")
	void insertTopHalfYear(TopHalfYear topHalfYear);

}
