package com.iparhan.financial.entityTime;

/**
 * 近一年来
 * @author iparhan
 *
 */
public class TopOne {
	//收益情况
	private String fundTopOne;     //本基金
	private String avarageTopOne;  //同类平均
	private String csi300TopOne;   //沪深300
			
	//收益风险
	private String annualVolatilityTopOne; //年华波动率
	private String maximumRetracementTopOne; //最大回撤
	//进攻能力
	private String attackPercentTopOne; //进攻能力  同类平均
	private String attackFundTopOne;    //进攻能力  本基金
				
	//防守能力
	private String defensePercetTopOne;  //防守能力 同类平均
	private String defenseFundTopOne;    //防守能力   本基金
	
	
	public String getFundTopOne() {
		return fundTopOne;
	}
	public void setFundTopOne(String fundTopOne) {
		this.fundTopOne = fundTopOne;
	}
	public String getAvarageTopOne() {
		return avarageTopOne;
	}
	public void setAvarageTopOne(String avarageTopOne) {
		this.avarageTopOne = avarageTopOne;
	}
	public String getCsi300TopOne() {
		return csi300TopOne;
	}
	public void setCsi300TopOne(String csi300TopOne) {
		this.csi300TopOne = csi300TopOne;
	}
	public String getAnnualVolatilityTopOne() {
		return annualVolatilityTopOne;
	}
	public void setAnnualVolatilityTopOne(String annualVolatilityTopOne) {
		this.annualVolatilityTopOne = annualVolatilityTopOne;
	}
	public String getMaximumRetracementTopOne() {
		return maximumRetracementTopOne;
	}
	public void setMaximumRetracementTopOne(String maximumRetracementTopOne) {
		this.maximumRetracementTopOne = maximumRetracementTopOne;
	}
	public String getAttackPercentTopOne() {
		return attackPercentTopOne;
	}
	public void setAttackPercentTopOne(String attackPercentTopOne) {
		this.attackPercentTopOne = attackPercentTopOne;
	}
	public String getAttackFundTopOne() {
		return attackFundTopOne;
	}
	public void setAttackFundTopOne(String attackFundTopOne) {
		this.attackFundTopOne = attackFundTopOne;
	}
	public String getDefensePercetTopOne() {
		return defensePercetTopOne;
	}
	public void setDefensePercetTopOne(String defensePercetTopOne) {
		this.defensePercetTopOne = defensePercetTopOne;
	}
	public String getDefenseFundTopOne() {
		return defenseFundTopOne;
	}
	public void setDefenseFundTopOne(String defenseFundTopOne) {
		this.defenseFundTopOne = defenseFundTopOne;
	}
	 
	public TopOne(String fundTopOne, String avarageTopOne, String csi300TopOne, String annualVolatilityTopOne,
			String maximumRetracementTopOne, String attackPercentTopOne, String attackFundTopOne,
			String defensePercetTopOne, String defenseFundTopOne) {
		super();
		this.fundTopOne = fundTopOne;
		this.avarageTopOne = avarageTopOne;
		this.csi300TopOne = csi300TopOne;
		this.annualVolatilityTopOne = annualVolatilityTopOne;
		this.maximumRetracementTopOne = maximumRetracementTopOne;
		this.attackPercentTopOne = attackPercentTopOne;
		this.attackFundTopOne = attackFundTopOne;
		this.defensePercetTopOne = defensePercetTopOne;
		this.defenseFundTopOne = defenseFundTopOne;
	}
	public TopOne() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
