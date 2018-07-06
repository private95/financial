package com.iparhan.financial.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import com.iparhan.financial.entityTime.TopTwo;


/**
 * 两年以来的数据
 * @author Iparhan
 *参数列表：
 *fundTopTwo               //本基金
 *avarageTopTwo            //同类平均
 *csi300TopTwo             //沪深300
 *annualVolatilityTopTwo   //年华波动率
 *maximumRetracementTopTwo //最大回撤
 *attackPercentTopTwo      //进攻能力  同类平均
 *attackFundTopTwo         //进攻能力  本基金
 *defensePercetTopTwo      //防守能力 同类平均
 *defenseFundTopTwo        //防守能力   本基金
 */
@Mapper
public interface TopTwoMapper {
	
	@Insert("insert into t_toptwo (fundTopTwo,avarageTopTwo,csi300TopTwo,annualVolatilityTopTwo,maximumRetracementTopTwo"
			+ "attackPercentTopTwo,attackFundTopTwo,defensePercetTopTwo,defenseFundTopTwo) "
			+ "values(#{fundTopTwo},#{avarageTopTwo},#{csi300TopTwo},#{annualVolatilityTopTwo},#{maximumRetracementTopTwo}"
			+ "#{attackPercentTopTwo},#{attackFundTopTwo},#{defensePercetTopTwo},#{defenseFundTopTwo})")
	void insertTopTwo(TopTwo topTwo);

}
