package com.iparhan.financial.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import com.iparhan.financial.entityTime.TopFive;

/**
 * 五年以来的数据
 * @author Iparhan
 *参数列表：
 *fundTopFive                    //本基金
 *avarageTopFive                 //同类平均
 *csi300TopFive                  //沪深300
 *annualVolatilityTopFive        //年华波动率
 *maximumRetracementTopFive      //最大回撤
 *attackPercentTopFive           //进攻能力  同类平均
 *attackFundTopFive              //进攻能力  本基金
 *defensePercetTopFive           //防守能力 同类平均
 *defenseFundTopFive             //防守能力   本基金
 */
@Mapper
public interface TopFiveMapper {
	
	@Insert("insert into t_topfive (fundTopFive,avarageTopFive,csi300TopFive,annualVolatilityTopFive,maximumRetracementTopFive"
			+ "attackPercentTopFive,attackFundTopFive,defensePercetTopFive,defenseFundTopFive) "
			+ "values(#{fundTopFive},#{avarageTopFive},#{csi300TopFive}，#{annualVolatilityTopFive}，#{maximumRetracementTopFive}"
			+ "#{attackPercentTopFive}，#{attackFundTopFive}，#{defensePercetTopFive}，#{defenseFundTopFive})")
	void insertTopFive(TopFive topFive);

}
