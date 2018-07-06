package com.iparhan.financial.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import com.iparhan.financial.entity.Bonus;


/**
 * 历史分红
 * @author Iparhan
 *参数列表:
 *dateBonus
 *moneyBonus
 */
@Mapper
public interface BonusMapper {
	
	@Insert("insert into  (dateBonus,moneyBonus) values(#{dateBonus},#{moneyBonus})")
	void insertBonus(Bonus bonus);
}
