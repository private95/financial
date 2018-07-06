package com.iparhan.financial.entityTime;

/**
 * 成立以来
 * @author 14861
 *
 */
public class TopTime {
	private String fundTopTime;   //本基金
	private String avarageTopTime;  //同类平均
	private String csi300TopTime;   //沪深300
	//收益风险
	private String annualVolatilityTopTime; //年华波动率
	private String maximumRetracementTopTime; //最大回撤
	//进攻能力
	private String attackPercentTopTime; //进攻能力  同类平均
	private String attackFundTopTime;    //进攻能力  本基金
	
	//防守能力
	private String defensePercetTopTime;  //防守能力 同类平均
	private String defenseFundTopTime;    //防守能力   本基金
	
	
	public String getFundTopTime() {
		return fundTopTime;
	}
	public void setFundTopTime(String fundTopTime) {
		this.fundTopTime = fundTopTime;
	}
	public String getAvarageTopTime() {
		return avarageTopTime;
	}
	public void setAvarageTopTime(String avarageTopTime) {
		this.avarageTopTime = avarageTopTime;
	}
	public String getCsi300TopTime() {
		return csi300TopTime;
	}
	public void setCsi300TopTime(String csi300TopTime) {
		this.csi300TopTime = csi300TopTime;
	}
	public String getAnnualVolatilityTopTime() {
		return annualVolatilityTopTime;
	}
	public void setAnnualVolatilityTopTime(String annualVolatilityTopTime) {
		this.annualVolatilityTopTime = annualVolatilityTopTime;
	}
	public String getMaximumRetracementTopTime() {
		return maximumRetracementTopTime;
	}
	public void setMaximumRetracementTopTime(String maximumRetracementTopTime) {
		this.maximumRetracementTopTime = maximumRetracementTopTime;
	}
	public String getAttackPercentTopTime() {
		return attackPercentTopTime;
	}
	public void setAttackPercentTopTime(String attackPercentTopTime) {
		this.attackPercentTopTime = attackPercentTopTime;
	}
	public String getAttackFundTopTime() {
		return attackFundTopTime;
	}
	public void setAttackFundTopTime(String attackFundTopTime) {
		this.attackFundTopTime = attackFundTopTime;
	}
	public String getDefensePercetTopTime() {
		return defensePercetTopTime;
	}
	public void setDefensePercetTopTime(String defensePercetTopTime) {
		this.defensePercetTopTime = defensePercetTopTime;
	}
	public String getDefenseFundTopTime() {
		return defenseFundTopTime;
	}
	public void setDefenseFundTopTime(String defenseFundTopTime) {
		this.defenseFundTopTime = defenseFundTopTime;
	}
	@Override
	public String toString() {
		return "TopTime [fundTopTime=" + fundTopTime + ", avarageTopTime=" + avarageTopTime + ", csi300TopTime="
				+ csi300TopTime + ", annualVolatilityTopTime=" + annualVolatilityTopTime
				+ ", maximumRetracementTopTime=" + maximumRetracementTopTime + ", attackPercentTopTime="
				+ attackPercentTopTime + ", attackFundTopTime=" + attackFundTopTime + ", defensePercetTopTime="
				+ defensePercetTopTime + ", defenseFundTopTime=" + defenseFundTopTime + "]";
	}
	public TopTime() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TopTime(String fundTopTime, String avarageTopTime, String csi300TopTime, String annualVolatilityTopTime,
			String maximumRetracementTopTime, String attackPercentTopTime, String attackFundTopTime,
			String defensePercetTopTime, String defenseFundTopTime) {
		super();
		this.fundTopTime = fundTopTime;
		this.avarageTopTime = avarageTopTime;
		this.csi300TopTime = csi300TopTime;
		this.annualVolatilityTopTime = annualVolatilityTopTime;
		this.maximumRetracementTopTime = maximumRetracementTopTime;
		this.attackPercentTopTime = attackPercentTopTime;
		this.attackFundTopTime = attackFundTopTime;
		this.defensePercetTopTime = defensePercetTopTime;
		this.defenseFundTopTime = defenseFundTopTime;
	}
	
	
 
	
}
