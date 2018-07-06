package com.iparhan.financial.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import com.iparhan.financial.entityTime.TopOne;

/**
 * 一年来的数据
 * @author Iparhan
 * 
 * 
 * 参数列表：
 * fundTopOne                 //本基金
 * avarageTopOne              //同类平均
 * csi300TopOne               //沪深300
 * annualVolatilityTopOne     //年华波动率
 * maximumRetracementTopOne   //最大回撤
 * attackPercentTopOne        //进攻能力  同类平均
 * attackFundTopOne           //进攻能力  本基金
 * defensePercetTopOne        //防守能力 同类平均
 * defenseFundTopOne          //防守能力   本基金
 * 
 */
@Mapper
public interface TopOneMapper {
	@Insert("insert into t_topone (fundTopOne,avarageTopOne,csi300TopOne,annualVolatilityTopOne,maximumRetracementTopOne,attackPercentTopOne"
			+ "attackFundTopOne,defensePercetTopOne,defenseFundTopOne) "
			+ "values(#{fundTopOne},#{avarageTopOne},#{csi300TopOne},#{annualVolatilityTopOne},#{maximumRetracementTopOne}"
			+ "#{attackPercentTopOne},#{attackFundTopOne},#{defensePercetTopOne},#{defenseFundTopOne})")
	void insertTopOne(TopOne topOne);
	

}
