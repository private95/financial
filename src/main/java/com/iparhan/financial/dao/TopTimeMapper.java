package com.iparhan.financial.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import com.iparhan.financial.entityTime.TopTime;

/**
 * 成立以来的数据
 * @author iparhan
 *
 *参数列表：
 *fundTopTime                     //本基金
 *avarageTopTime                  //同类平均
 *csi300TopTime                   //沪深300
 *annualVolatilityTopTime         //年华波动率
 *maximumRetracementTopTime       //最大回撤
 *attackPercentTopTime            //进攻能力  同类平均
 *attackFundTopTime               //进攻能力  本基金
 *defensePercetTopTime            //防守能力 同类平均
 *defenseFundTopTime              //防守能力   本基金
 */
@Mapper
public interface TopTimeMapper {
	
	@Insert("insert into t_toptime (fundTopTime,avarageTopTime,csi300TopTime,annualVolatilityTopTime"
			+ "maximumRetracementTopTime,attackPercentTopTime,attackFundTopTime,defensePercetTopTime,defenseFundTopTime) "
			+ "values(#{fundTopTime},#{avarageTopTime},#{csi300TopTime},#{annualVolatilityTopTime},#{maximumRetracementTopTime},#{attackPercentTopTime}"
			+ "#{attackFundTopTime},#{defensePercetTopTime},#{defenseFundTopTime})")
	void insertTopTime(TopTime topTime);
}
