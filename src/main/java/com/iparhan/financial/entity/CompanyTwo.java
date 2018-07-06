package com.iparhan.financial.entity;

public class CompanyTwo {
	private int id;
	private String name; // 企业名称
	private String product_count; // 产品数目
	private String personName; // 核心人物
	private String capitalMoney; // 投资资金 万元为单位
	private String address; // 所在地区
	private String company_id; // 公司编码
	private String recordCode; // 备案编码
	private String establishTime; // 成立日期
	private String production; // 代表作品
	private String idea_company; // 投资理念
	
	
	
	private String nav;//最新净值
	private String cumulative_nav;//累计净值
	private String annualincome;//今年收益
	private String cumulativeincome;//累计收益
	private String key_manager_name;//投资顾问
 
	private String topOneMonth;
	private String topThreeMonth;
	private String topHalfYear;
	private String topOne;
	private String topTwo;
	private String topThree;
	private String topFive;
	private String topDate;
	private String top2018;
	private String top2017;
	private String top2016;
	private String top2015;
	private String top2014;
	private String top2013;
	private String top2012;
	private String top2011;
	
	
	private String corestrategy; // 投资策略
	private String fund_shortName;//产品民称
	
	private String fundCompany;//基金公司
	private String annualized;//年化率
	private String sharpeatio;//夏普利率
	private String price_date;//日期

	private int tuser_id;// 用户id,查询我的发布
	
	
	
	
	public String getPrice_date() {
		return price_date;
	}

	public void setPrice_date(String price_date) {
		this.price_date = price_date;
	}

	public String getNav() {
		return nav;
	}

	public void setNav(String nav) {
		this.nav = nav;
	}

	public String getCumulative_nav() {
		return cumulative_nav;
	}

	public void setCumulative_nav(String cumulative_nav) {
		this.cumulative_nav = cumulative_nav;
	}

	public String getAnnualincome() {
		return annualincome;
	}

	public void setAnnualincome(String annualincome) {
		this.annualincome = annualincome;
	}

	public String getCumulativeincome() {
		return cumulativeincome;
	}

	public void setCumulativeincome(String cumulativeincome) {
		this.cumulativeincome = cumulativeincome;
	}

	public String getKey_manager_name() {
		return key_manager_name;
	}

	public void setKey_manager_name(String key_manager_name) {
		this.key_manager_name = key_manager_name;
	}

	public String getTopOneMonth() {
		return topOneMonth;
	}

	public void setTopOneMonth(String topOneMonth) {
		this.topOneMonth = topOneMonth;
	}

	public String getTopThreeMonth() {
		return topThreeMonth;
	}

	public void setTopThreeMonth(String topThreeMonth) {
		this.topThreeMonth = topThreeMonth;
	}

	public String getTopHalfYear() {
		return topHalfYear;
	}

	public void setTopHalfYear(String topHalfYear) {
		this.topHalfYear = topHalfYear;
	}

	public String getTopOne() {
		return topOne;
	}

	public void setTopOne(String topOne) {
		this.topOne = topOne;
	}

	public String getTopTwo() {
		return topTwo;
	}

	public void setTopTwo(String topTwo) {
		this.topTwo = topTwo;
	}

	public String getTopThree() {
		return topThree;
	}

	public void setTopThree(String topThree) {
		this.topThree = topThree;
	}

	public String getTopFive() {
		return topFive;
	}

	public void setTopFive(String topFive) {
		this.topFive = topFive;
	}

	public String getTopDate() {
		return topDate;
	}

	public void setTopDate(String topDate) {
		this.topDate = topDate;
	}

	public String getTop2018() {
		return top2018;
	}

	public void setTop2018(String top2018) {
		this.top2018 = top2018;
	}

	public String getTop2017() {
		return top2017;
	}

	public void setTop2017(String top2017) {
		this.top2017 = top2017;
	}

	public String getTop2016() {
		return top2016;
	}

	public void setTop2016(String top2016) {
		this.top2016 = top2016;
	}

	public String getTop2015() {
		return top2015;
	}

	public void setTop2015(String top2015) {
		this.top2015 = top2015;
	}

	public String getTop2014() {
		return top2014;
	}

	public void setTop2014(String top2014) {
		this.top2014 = top2014;
	}

	public String getTop2013() {
		return top2013;
	}

	public void setTop2013(String top2013) {
		this.top2013 = top2013;
	}

	public String getTop2012() {
		return top2012;
	}

	public void setTop2012(String top2012) {
		this.top2012 = top2012;
	}

	public String getTop2011() {
		return top2011;
	}

	public void setTop2011(String top2011) {
		this.top2011 = top2011;
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

	public String getAnnualized() {
		return annualized;
	}

	public void setAnnualized(String annualized) {
		this.annualized = annualized;
	}

	public String getSharpeatio() {
		return sharpeatio;
	}

	public void setSharpeatio(String sharpeatio) {
		this.sharpeatio = sharpeatio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
 
	public String getCorestrategy() {
		return corestrategy;
	}

	public void setCorestrategy(String corestrategy) {
		this.corestrategy = corestrategy;
	}

	public String getRecordCode() {
		return recordCode;
	}

	public void setRecordCode(String recordCode) {
		this.recordCode = recordCode;
	}

	public int getTuser_id() {
		return tuser_id;
	}

	public void setTuser_id(int tuser_id) {
		this.tuser_id = tuser_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

 

	public String getProduct_count() {
		return product_count;
	}

	public void setProduct_count(String product_count) {
		this.product_count = product_count;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getCapitalMoney() {
		return capitalMoney;
	}

	public void setCapitalMoney(String capitalMoney) {
		this.capitalMoney = capitalMoney;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCompany_id() {
		return company_id;
	}

	public void setCompany_id(String company_id) {
		this.company_id = company_id;
	}

	public String getEstablishTime() {
		return establishTime;
	}

	public void setEstablishTime(String establishTime) {
		this.establishTime = establishTime;
	}

	public String getProduction() {
		return production;
	}

	public void setProduction(String production) {
		this.production = production;
	}

	public String getIdea_company() {
		return idea_company;
	}

	public void setIdea_company(String idea_company) {
		this.idea_company = idea_company;
	}

	 
    
	@Override
	public String toString() {
		return "CompanyTwo [id=" + id + ", name=" + name + ", product_count=" + product_count + ", personName="
				+ personName + ", capitalMoney=" + capitalMoney + ", address=" + address + ", company_id=" + company_id
				+ ", recordCode=" + recordCode + ", establishTime=" + establishTime + ", production=" + production
				+ ", idea_company=" + idea_company + ", corestrategy=" + corestrategy + ", price_date=" + price_date
				+ ", nav=" + nav + ", cumulative_nav=" + cumulative_nav + ", annualincome=" + annualincome
				+ ", cumulativeincome=" + cumulativeincome + ", key_manager_name=" + key_manager_name + ", topOneMonth="
				+ topOneMonth + ", topThreeMonth=" + topThreeMonth + ", topHalfYear=" + topHalfYear + ", topOne="
				+ topOne + ", topTwo=" + topTwo + ", topThree=" + topThree + ", topFive=" + topFive + ", topDate="
				+ topDate + ", top2018=" + top2018 + ", top2017=" + top2017 + ", top2016=" + top2016 + ", top2015="
				+ top2015 + ", top2014=" + top2014 + ", top2013=" + top2013 + ", top2012=" + top2012 + ", top2011="
				+ top2011 + ", fund_shortName=" + fund_shortName + ", fundCompany=" + fundCompany + ", annualized="
				+ annualized + ", sharpeatio=" + sharpeatio + ", tuser_id=" + tuser_id + "]";
	}

	public CompanyTwo(int id, String name, String product_count, String personName, String capitalMoney, String address,
			String company_id, String recordCode, String establishTime, String production, String idea_company,
			String corestrategy, String price_date, String nav, String cumulative_nav, String annualincome,
			String cumulativeincome, String key_manager_name, String topOneMonth, String topThreeMonth,
			String topHalfYear, String topOne, String topTwo, String topThree, String topFive, String topDate,
			String top2018, String top2017, String top2016, String top2015, String top2014, String top2013,
			String top2012, String top2011, String fund_shortName, String fundCompany, String annualized,
			String sharpeatio, int tuser_id) {
		super();
		this.id = id;
		this.name = name;
		this.product_count = product_count;
		this.personName = personName;
		this.capitalMoney = capitalMoney;
		this.address = address;
		this.company_id = company_id;
		this.recordCode = recordCode;
		this.establishTime = establishTime;
		this.production = production;
		this.idea_company = idea_company;
		this.corestrategy = corestrategy;
		this.price_date = price_date;
		this.nav = nav;
		this.cumulative_nav = cumulative_nav;
		this.annualincome = annualincome;
		this.cumulativeincome = cumulativeincome;
		this.key_manager_name = key_manager_name;
		this.topOneMonth = topOneMonth;
		this.topThreeMonth = topThreeMonth;
		this.topHalfYear = topHalfYear;
		this.topOne = topOne;
		this.topTwo = topTwo;
		this.topThree = topThree;
		this.topFive = topFive;
		this.topDate = topDate;
		this.top2018 = top2018;
		this.top2017 = top2017;
		this.top2016 = top2016;
		this.top2015 = top2015;
		this.top2014 = top2014;
		this.top2013 = top2013;
		this.top2012 = top2012;
		this.top2011 = top2011;
		this.fund_shortName = fund_shortName;
		this.fundCompany = fundCompany;
		this.annualized = annualized;
		this.sharpeatio = sharpeatio;
		this.tuser_id = tuser_id;
	}

	public CompanyTwo() {
		super();
		// TODO Auto-generated constructor stub
	}

}
