package com.iparhan.financial.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import com.iparhan.financial.entity.Split;

/**
 * 历史拆分
 * @author Iparhan
 *date       //日期
 *proportion //额度
 */
@Mapper
public interface SplitMapper {
	
	@Insert("insert into t_split (date,proportion) values(#{date},#{proportion})")
	void insertSplit(Split split);
}
