package com.iparhan.financial.entityTime;

/**
 * 近三年
 * @author iparhan
 *
 */
public class TopThree {
	//收益情况
	private String fundTopThree;   //本基金
	private String avarageTopThree;  //同类平均
	private String csi300TopThree;   //沪深300
	
	//收益风险
	private String annualVolatilityTopThree; //年华波动率
	private String maximumRetracementTopThree; //最大回撤
	//进攻能力
	private String attackPercentTopThree; //进攻能力  同类平均
	private String attackFundTopThree;    //进攻能力  本基金
		
	//防守能力
	private String defensePercetTopThree;  //防守能力 同类平均
	private String defenseFundTopThree;    //防守能力   本基金
	
	
	
	public String getFundTopThree() {
		return fundTopThree;
	}
	public void setFundTopThree(String fundTopThree) {
		this.fundTopThree = fundTopThree;
	}
	public String getAvarageTopThree() {
		return avarageTopThree;
	}
	public void setAvarageTopThree(String avarageTopThree) {
		this.avarageTopThree = avarageTopThree;
	}
	public String getCsi300TopThree() {
		return csi300TopThree;
	}
	public void setCsi300TopThree(String csi300TopThree) {
		this.csi300TopThree = csi300TopThree;
	}
	public String getAnnualVolatilityTopThree() {
		return annualVolatilityTopThree;
	}
	public void setAnnualVolatilityTopThree(String annualVolatilityTopThree) {
		this.annualVolatilityTopThree = annualVolatilityTopThree;
	}
	public String getMaximumRetracementTopThree() {
		return maximumRetracementTopThree;
	}
	public void setMaximumRetracementTopThree(String maximumRetracementTopThree) {
		this.maximumRetracementTopThree = maximumRetracementTopThree;
	}
	public String getAttackPercentTopThree() {
		return attackPercentTopThree;
	}
	public void setAttackPercentTopThree(String attackPercentTopThree) {
		this.attackPercentTopThree = attackPercentTopThree;
	}
	public String getAttackFundTopThree() {
		return attackFundTopThree;
	}
	public void setAttackFundTopThree(String attackFundTopThree) {
		this.attackFundTopThree = attackFundTopThree;
	}
	public String getDefensePercetTopThree() {
		return defensePercetTopThree;
	}
	public void setDefensePercetTopThree(String defensePercetTopThree) {
		this.defensePercetTopThree = defensePercetTopThree;
	}
	public String getDefenseFundTopThree() {
		return defenseFundTopThree;
	}
	public void setDefenseFundTopThree(String defenseFundTopThree) {
		this.defenseFundTopThree = defenseFundTopThree;
	}
	public TopThree(String fundTopThree, String avarageTopThree, String csi300TopThree, String annualVolatilityTopThree,
			String maximumRetracementTopThree, String attackPercentTopThree, String attackFundTopThree,
			String defensePercetTopThree, String defenseFundTopThree) {
		super();
		this.fundTopThree = fundTopThree;
		this.avarageTopThree = avarageTopThree;
		this.csi300TopThree = csi300TopThree;
		this.annualVolatilityTopThree = annualVolatilityTopThree;
		this.maximumRetracementTopThree = maximumRetracementTopThree;
		this.attackPercentTopThree = attackPercentTopThree;
		this.attackFundTopThree = attackFundTopThree;
		this.defensePercetTopThree = defensePercetTopThree;
		this.defenseFundTopThree = defenseFundTopThree;
	}
	public TopThree() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
