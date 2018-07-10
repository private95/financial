package com.iparhan.financial.entityTime;

/**
 * 近两年
 * @author iparhan
 *
 */
public class TopTwo {
		//收益情况
		private String fundTopTwo;   //本基金
		private String avarageTopTwo;  //同类平均
		private String csi300TopTwo;   //沪深300
		
		//收益风险
		private String annualVolatilityTopTwo; //年华波动率
		private String maximumRetracementTopTwo; //最大回撤
		//进攻能力
		private String attackPercentTopTwo; //进攻能力  同类平均
		private String attackFundTopTwo;    //进攻能力  本基金
			
		//防守能力
		private String defensePercetTopTwo;  //防守能力 同类平均
		private String defenseFundTopTwo;    //防守能力   本基金
		
		
		
		public String getFundTopTwo() {
			return fundTopTwo;
		}
		public void setFundTopTwo(String fundTopTwo) {
			this.fundTopTwo = fundTopTwo;
		}
		public String getAvarageTopTwo() {
			return avarageTopTwo;
		}
		public void setAvarageTopTwo(String avarageTopTwo) {
			this.avarageTopTwo = avarageTopTwo;
		}
		public String getCsi300TopTwo() {
			return csi300TopTwo;
		}
		public void setCsi300TopTwo(String csi300TopTwo) {
			this.csi300TopTwo = csi300TopTwo;
		}
		public String getAnnualVolatilityTopTwo() {
			return annualVolatilityTopTwo;
		}
		public void setAnnualVolatilityTopTwo(String annualVolatilityTopTwo) {
			this.annualVolatilityTopTwo = annualVolatilityTopTwo;
		}
		public String getMaximumRetracementTopTwo() {
			return maximumRetracementTopTwo;
		}
		public void setMaximumRetracementTopTwo(String maximumRetracementTopTwo) {
			this.maximumRetracementTopTwo = maximumRetracementTopTwo;
		}
		public String getAttackPercentTopTwo() {
			return attackPercentTopTwo;
		}
		public void setAttackPercentTopTwo(String attackPercentTopTwo) {
			this.attackPercentTopTwo = attackPercentTopTwo;
		}
		public String getAttackFundTopTwo() {
			return attackFundTopTwo;
		}
		public void setAttackFundTopTwo(String attackFundTopTwo) {
			this.attackFundTopTwo = attackFundTopTwo;
		}
		public String getDefensePercetTopTwo() {
			return defensePercetTopTwo;
		}
		public void setDefensePercetTopTwo(String defensePercetTopTwo) {
			this.defensePercetTopTwo = defensePercetTopTwo;
		}
		public String getDefenseFundTopTwo() {
			return defenseFundTopTwo;
		}
		public void setDefenseFundTopTwo(String defenseFundTopTwo) {
			this.defenseFundTopTwo = defenseFundTopTwo;
		}
		public TopTwo(String fundTopTwo, String avarageTopTwo, String csi300TopTwo, String annualVolatilityTopTwo,
				String maximumRetracementTopTwo, String attackPercentTopTwo, String attackFundTopTwo,
				String defensePercetTopTwo, String defenseFundTopTwo) {
			super();
			this.fundTopTwo = fundTopTwo;
			this.avarageTopTwo = avarageTopTwo;
			this.csi300TopTwo = csi300TopTwo;
			this.annualVolatilityTopTwo = annualVolatilityTopTwo;
			this.maximumRetracementTopTwo = maximumRetracementTopTwo;
			this.attackPercentTopTwo = attackPercentTopTwo;
			this.attackFundTopTwo = attackFundTopTwo;
			this.defensePercetTopTwo = defensePercetTopTwo;
			this.defenseFundTopTwo = defenseFundTopTwo;
		}
		public TopTwo() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		
		
}
