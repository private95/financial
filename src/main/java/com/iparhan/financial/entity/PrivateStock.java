package com.iparhan.financial.entity;

public class PrivateStock {
	/*
	 * // 关联公司表 private Company company;
	 * 
	 * public Company getCompany() { return company; }
	 * 
	 * public void setCompany(Company company) { this.company = company; }
	 */
	private String id;
	private String fund_shortName; // 基金简称
	private String fundCompany; // 基金公司
	private Double nav; // 最新净值
	private Double cumulative_nav; // 累积净值
	private Double cumulativeincome;// 累计收益
	private Double yearNav; // 年化率
	private Double sharperPercent; // 夏普比率
	private int profit_col5; // 一年评级
	private String establishTime;// 成立日期
	private int riskgrade;// 风险等级
	// 时间曲线
//	private Double topOneMonth;
//	private Double topThreeMonth;
//	private Double topHalfYear;
//	private Double topOne;
//	private Double topTwo;
//	private Double topThree;
//	private Double topFive;
//	// private Double topDate;
//	private Double top2018;
//	private Double top2017;
//	private Double top2016;
//	private Double top2015;
//	private Double top2014;
//	private Double top2013;
//	private Double top2012;
//	private Double top2011;
	private String company_id;
	// 用户id
	private Integer tuser_id;
	// 是否收藏 0,未收藏 1,已收藏
	private String is_collect;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFund_shortName() {
		return fund_shortName;
	}
	public void setFund_shortName(String fund_shortName) {
		this.fund_shortName = fund_shortName;
	}
	public String getFundCompany() {
		return fundCompany;
	}
	public void setFundCompany(String fundCompany) {
		this.fundCompany = fundCompany;
	}
//	public Double getNav() {
//		return nav;
//	}
//	public void setNav(Double nav) {
//		this.nav = nav;
//	}
//	public Double getCumulative_nav() {
//		return cumulative_nav;
//	}
//	public void setCumulative_nav(Double cumulative_nav) {
//		this.cumulative_nav = cumulative_nav;
//	}
//	public Double getCumulativeincome() {
//		return cumulativeincome;
//	}
//	public void setCumulativeincome(Double cumulativeincome) {
//		this.cumulativeincome = cumulativeincome;
//	}
	public Double getYearNav() {
		return yearNav;
	}
	public void setYearNav(Double yearNav) {
		this.yearNav = yearNav;
	}
	public Double getSharperPercent() {
		return sharperPercent;
	}
	public void setSharperPercent(Double sharperPercent) {
		this.sharperPercent = sharperPercent;
	}
	public int getProfit_col5() {
		return profit_col5;
	}
	public void setProfit_col5(int profit_col5) {
		this.profit_col5 = profit_col5;
	}
	public String getEstablishTime() {
		return establishTime;
	}
	public void setEstablishTime(String establishTime) {
		this.establishTime = establishTime;
	}
	public int getRiskgrade() {
		return riskgrade;
	}
	public void setRiskgrade(int riskgrade) {
		this.riskgrade = riskgrade;
	}
//	public Double getTopOneMonth() {
//		return topOneMonth;
//	}
//	public void setTopOneMonth(Double topOneMonth) {
//		this.topOneMonth = topOneMonth;
//	}
//	public Double getTopThreeMonth() {
//		return topThreeMonth;
//	}
//	public void setTopThreeMonth(Double topThreeMonth) {
//		this.topThreeMonth = topThreeMonth;
//	}
//	public Double getTopHalfYear() {
//		return topHalfYear;
//	}
//	public void setTopHalfYear(Double topHalfYear) {
//		this.topHalfYear = topHalfYear;
//	}
//	public Double getTopOne() {
//		return topOne;
//	}
//	public void setTopOne(Double topOne) {
//		this.topOne = topOne;
//	}
//	public Double getTopTwo() {
//		return topTwo;
//	}
//	public void setTopTwo(Double topTwo) {
//		this.topTwo = topTwo;
//	}
//	public Double getTopThree() {
//		return topThree;
//	}
//	public void setTopThree(Double topThree) {
//		this.topThree = topThree;
//	}
//	public Double getTopFive() {
//		return topFive;
//	}
//	public void setTopFive(Double topFive) {
//		this.topFive = topFive;
//	}
//	public Double getTop2018() {
//		return top2018;
//	}
//	public void setTop2018(Double top2018) {
//		this.top2018 = top2018;
//	}
//	public Double getTop2017() {
//		return top2017;
//	}
//	public void setTop2017(Double top2017) {
//		this.top2017 = top2017;
//	}
//	public Double getTop2016() {
//		return top2016;
//	}
//	public void setTop2016(Double top2016) {
//		this.top2016 = top2016;
//	}
//	public Double getTop2015() {
//		return top2015;
//	}
//	public void setTop2015(Double top2015) {
//		this.top2015 = top2015;
//	}
//	public Double getTop2014() {
//		return top2014;
//	}
//	public void setTop2014(Double top2014) {
//		this.top2014 = top2014;
//	}
//	public Double getTop2013() {
//		return top2013;
//	}
//	public void setTop2013(Double top2013) {
//		this.top2013 = top2013;
//	}
//	public Double getTop2012() {
//		return top2012;
//	}
//	public void setTop2012(Double top2012) {
//		this.top2012 = top2012;
//	}
//	public Double getTop2011() {
//		return top2011;
//	}
//	public void setTop2011(Double top2011) {
//		this.top2011 = top2011;
//	}
	public String getCompany_id() {
		return company_id;
	}
	public void setCompany_id(String company_id) {
		this.company_id = company_id;
	}
	public Integer getTuser_id() {
		return tuser_id;
	}
	public void setTuser_id(Integer tuser_id) {
		this.tuser_id = tuser_id;
	}
	public String getIs_collect() {
		return is_collect;
	}
	public void setIs_collect(String is_collect) {
		this.is_collect = is_collect;
	}
	@Override
	public String toString() {
		return "PrivateStock [id=" + id + ", fund_shortName=" + fund_shortName + ", fundCompany=" + fundCompany
				+ ", nav=" + nav + ", cumulative_nav=" + cumulative_nav + ", cumulativeincome=" + cumulativeincome
				+ ", yearNav=" + yearNav + ", sharperPercent=" + sharperPercent + ", profit_col5=" + profit_col5
				+ ", establishTime=" + establishTime + ", riskgrade=" + riskgrade + ", company_id=" + company_id
				+ ", tuser_id=" + tuser_id + ", is_collect=" + is_collect + "]";
	}
	
	
	

	

}
