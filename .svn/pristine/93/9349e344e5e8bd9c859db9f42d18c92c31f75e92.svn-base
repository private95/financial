package com.iparhan.financial.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import com.iparhan.financial.entity.HistoricalNet;

/**
 * 历史净值
 * @author Iparhan
 *参数列表:
 *unitNet
 *topNetValue
 *topNetValueNO
 *ratio
 *changePercent
 *endTime
 */
@Mapper
public interface HistoricalNetMapper {
	@Insert("insert into t_historicalnet (unitNet,topNetValue,topNetValueNO,ratio,changePercent,endTime) "
			+ "values(#{unitNet},#{topNetValue},#{topNetValueNO},#{topNetValueNO},#{ratio},#{changePercent},#{endTime})")
	void insertHistoricalNet(HistoricalNet historicalNet);
}
