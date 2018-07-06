package com.iparhan.financial.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import com.iparhan.financial.entityTime.TopOneMonth;

/**
 * 一个月以来的数据
 * @author Iparhan
 * 参数列表：
 * fundTopOneMonth     //本基金
 * avarageTopOneMonth  //同类平均
 * csi300TopOneMonth   //沪深300
 *
 */

@Mapper
public interface TopOneMonthMapper {
	
	@Insert("insert into t_toponemonth (fundTopOneMonth,avarageTopOneMonth,csi300TopOneMonth) "
			+ "values(#{fundTopOneMonth},#{avarageTopOneMonth},#{csi300TopOneMonth})")
	void insertTopOneMont(TopOneMonth topOneMonth);

}
