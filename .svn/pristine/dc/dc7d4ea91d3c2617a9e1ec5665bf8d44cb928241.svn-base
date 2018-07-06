package com.iparhan.financial.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import com.iparhan.financial.entityTime.TopThree;

/**
 * 三年以来的数据
 * @author Iparhan
 *参数列表:
 *fundTopThree                   //本基金
 *avarageTopThree                //同类平均
 *csi300TopThree                 //沪深300
 *annualVolatilityTopThree       //年华波动率
 *maximumRetracementTopThree     //最大回撤
 *attackPercentTopThree          //进攻能力  同类平均
 *attackFundTopThree             //进攻能力  本基金
 *defensePercetTopThree          //防守能力 同类平均
 *defenseFundTopThree            //防守能力   本基金
 */
@Mapper
public interface TopThreeMapper {
	
	@Insert("insert into t_topthree (fundTopThree,avarageTopThree,csi300TopThree,annualVolatilityTopThree,maximumRetracementTopThree"
			+ "attackPercentTopThree,attackFundTopThree,defensePercetTopThree,defenseFundTopThree) "
			+ "values(#{fundTopThree},#{avarageTopThree},#{csi300TopThree},#{annualVolatilityTopThree}，#{maximumRetracementTopThree},#{attackPercentTopThree}"
			+ "#{attackFundTopThree},#{defensePercetTopThree},#{defenseFundTopThree})")
	void insertTopThree(TopThree topThree);

}
