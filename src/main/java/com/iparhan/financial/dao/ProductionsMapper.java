package com.iparhan.financial.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.iparhan.financial.entity.Company;
import com.iparhan.financial.entity.Productions;

/**
 * 产品基本信息
 * @author Iparhan
 *参数列表：
 *productName            //产品名称
 *fundCompany            //基金公司
 *fundManage             //基金经理
 *broker                 //证券经纪商
 *advisor                //投资顾问
 *futuresBrokers         //期货经纪商
 *fundManager            //基金管理人
 *startPoint             //认购起点
 *custodian              //基金托管人
 *addPoint               //追加起点
 *agencey                //外包机构放
 *expression             //披露表示
 *closedPeriod           //封闭期
 *recordCode             //备案编号
 *productEsTime          //旗下产品成立时间
 *netValue               //最新净值
 *accumulatedNet         //累计净值
 *profitTisYear          //今年收益    *百分比%
 *accumulatedIncome      //累计收益
 *warnigLine             //预警线
 *stopLine               //止损线
 *beginScale             //初始规模       *万
 *existence              //存 续 期 限    *月
 *reward                 //业绩报酬
 *rate                   //认 购 费 率
 *redemptionRate         //赎 回 费 率
 *redemptionRateNote     //赎回费率说明
 *openDate               //开放日
 *
 *runningState           //运 行 状 态
 *isNote                 //是否伞行
 *level                  //星级等级
 */
@Mapper
public interface ProductionsMapper {
	
	 @Insert("insert into t_productions (productName,fundCompany,fundManage,broker,advisor,futuresBrokers,fundManager,startPoint,custodian,addPoint,agencey,expression,closedPeriod,recordCode,productEsTime,netValue,accumulatedNet,profitTisYear,accumulatedIncome,warnigLine,stopLine,beginScale,existence,reward,rate,redemptionRate,redemptionRateNote,openDate,runningState,isNote,level) values(#{productName},#{fundCompany},#{fundManage},#{broker},#{advisor},#{futuresBrokers},#{fundManager},#{startPoint},#{custodian},#{addPoint},#{agencey},#{expression},#{closedPeriod},#{recordCode},#{productEsTime},#{netValue},#{accumulatedNet},#{profitTisYear},#{accumulatedIncome},#{warnigLine},#{stopLine},#{beginScale},#{existence},#{reward},#{rate},#{redemptionRate},#{redemptionRateNote},#{openDate},#{runningState},#{isNote},#{level})")
	void insertProductions(Productions productions);
	 
	 //查询productions表：产品详情的信息
	 @Select("select * from t_productions where fundCompany=#{fundCompany}")
	 List<Productions> selectProdctionsDetail(@Param("fundCompany") String fundCompany);
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
