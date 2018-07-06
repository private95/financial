package com.iparhan.financial.entity;

/**
 * 历史分红
 * @author iparhan
 *
 */
public class Bonus {
	private String dateBonus;  //分红日期
	private String moneyBonus; //分红额度
	
	
	public String getDateBonus() {
		return dateBonus;
	}
	public void setDateBonus(String dateBonus) {
		this.dateBonus = dateBonus;
	}
	public String getMoneyBonus() {
		return moneyBonus;
	}
	public void setMoneyBonus(String moneyBonus) {
		this.moneyBonus = moneyBonus;
	}
	@Override
	public String toString() {
		return "Bonus [dateBonus=" + dateBonus + ", moneyBonus=" + moneyBonus + "]";
	}
	public Bonus(String dateBonus, String moneyBonus) {
		super();
		this.dateBonus = dateBonus;
		this.moneyBonus = moneyBonus;
	}
	public Bonus() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
