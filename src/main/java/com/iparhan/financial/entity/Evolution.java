package com.iparhan.financial.entity;

/**
 * 风险评测实体类
 * @author Iparhan
 */
public class Evolution {
	
	private String id;
	private String isPrivateProduction;
	private String under300;
	private String over50;
	private String age;
	private String education;
	private String job;
	private String houseIncome;
	private String invest;
	private String strock_expreince;
	private String invest_expreince;
	private String yearOf_expreince;
	private String invest_target;
	private String plan_invest;
	private String invets_attuide;
	private String lastTwo;
	private String lastONe;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIsPrivateProduction() {
		return isPrivateProduction;
	}
	public void setIsPrivateProduction(String isPrivateProduction) {
		this.isPrivateProduction = isPrivateProduction;
	}
	public String getUnder300() {
		return under300;
	}
	public void setUnder300(String under300) {
		this.under300 = under300;
	}
	public String getOver50() {
		return over50;
	}
	public void setOver50(String over50) {
		this.over50 = over50;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getHouseIncome() {
		return houseIncome;
	}
	public void setHouseIncome(String houseIncome) {
		this.houseIncome = houseIncome;
	}
	public String getInvest() {
		return invest;
	}
	public void setInvest(String invest) {
		this.invest = invest;
	}
	public String getStrock_expreince() {
		return strock_expreince;
	}
	public void setStrock_expreince(String strock_expreince) {
		this.strock_expreince = strock_expreince;
	}
	public String getInvest_expreince() {
		return invest_expreince;
	}
	public void setInvest_expreince(String invest_expreince) {
		this.invest_expreince = invest_expreince;
	}
	public String getYearOf_expreince() {
		return yearOf_expreince;
	}
	public void setYearOf_expreince(String yearOf_expreince) {
		this.yearOf_expreince = yearOf_expreince;
	}
	public String getInvest_target() {
		return invest_target;
	}
	public void setInvest_target(String invest_target) {
		this.invest_target = invest_target;
	}
	public String getPlan_invest() {
		return plan_invest;
	}
	public void setPlan_invest(String plan_invest) {
		this.plan_invest = plan_invest;
	}
	public String getInvets_attuide() {
		return invets_attuide;
	}
	public void setInvets_attuide(String invets_attuide) {
		this.invets_attuide = invets_attuide;
	}
	public String getLastTwo() {
		return lastTwo;
	}
	public void setLastTwo(String lastTwo) {
		this.lastTwo = lastTwo;
	}
	public String getLastONe() {
		return lastONe;
	}
	public void setLastONe(String lastONe) {
		this.lastONe = lastONe;
	}
	@Override
	public String toString() {
		return "Evolution [id=" + id + ", isPrivateProduction=" + isPrivateProduction + ", under300=" + under300
				+ ", over50=" + over50 + ", age=" + age + ", education=" + education + ", job=" + job + ", houseIncome="
				+ houseIncome + ", invest=" + invest + ", strock_expreince=" + strock_expreince + ", invest_expreince="
				+ invest_expreince + ", yearOf_expreince=" + yearOf_expreince + ", invest_target=" + invest_target
				+ ", plan_invest=" + plan_invest + ", invets_attuide=" + invets_attuide + ", lastTwo=" + lastTwo
				+ ", lastONe=" + lastONe + "]";
	}
	public Evolution(String id, String isPrivateProduction, String under300, String over50, String age,
			String education, String job, String houseIncome, String invest, String strock_expreince,
			String invest_expreince, String yearOf_expreince, String invest_target, String plan_invest,
			String invets_attuide, String lastTwo, String lastONe) {
		super();
		this.id = id;
		this.isPrivateProduction = isPrivateProduction;
		this.under300 = under300;
		this.over50 = over50;
		this.age = age;
		this.education = education;
		this.job = job;
		this.houseIncome = houseIncome;
		this.invest = invest;
		this.strock_expreince = strock_expreince;
		this.invest_expreince = invest_expreince;
		this.yearOf_expreince = yearOf_expreince;
		this.invest_target = invest_target;
		this.plan_invest = plan_invest;
		this.invets_attuide = invets_attuide;
		this.lastTwo = lastTwo;
		this.lastONe = lastONe;
	}
	public Evolution() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
