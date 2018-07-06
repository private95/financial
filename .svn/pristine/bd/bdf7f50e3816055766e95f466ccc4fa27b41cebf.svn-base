package com.iparhan.financial.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import com.iparhan.financial.entityTime.TopThreeMonth;

/**
 * 三个月以来的数据
 * @author Iparhan
 *参数列表：
 *fundTopThreeMonth     //本基金
 *avarageTopThreeMonth  //同类平均
 *csi300TopThreeMonth   //沪深300
 */
@Mapper
public interface TopThreeMonthMapper {
	
	@Insert("insert into t_topthreemonth (fundTopThreeMonth,avarageTopThreeMonth,csi300TopThreeMonth) "
			+ "values(#{fundTopThreeMonth},#{avarageTopThreeMonth},#{csi300TopThreeMonth})")
	void insertTopThreeMonth(TopThreeMonth topThreeMonth);
}
