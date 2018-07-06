package com.iparhan.financial.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import com.iparhan.financial.entityTime.TopTen;

/**
 * 十年以来的数据
 * @author Iparhan
 *参数列表：
 *fundTopTen        //本基金
 *avarageTopTen     //同类平均
 *csi300TopTen      //沪深300
 */
@Mapper
public interface TopTenMapper {
	
	@Insert("insert into t_topten (fundTopTen,avarageTopTen,csi300TopTen) "
			+ "values(#{fundTopTen},#{avarageTopTen},#{csi300TopTen})")
	void insertTopTen(TopTen topTen);

}
