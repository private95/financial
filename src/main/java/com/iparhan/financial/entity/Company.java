package com.iparhan.financial.entity;

/**
 * 企业信息
 * 
 * @author iparhan
 *
 */
public class Company extends PrivateStock{
	// 关联基金
//	private PrivateStock privateStock;
//	
//	
//	public PrivateStock getPrivateStock() {
//		return privateStock;
//	}
//
//	public void setPrivateStock(PrivateStock privateStock) {
//		this.privateStock = privateStock;
//	}

	

	private String id;
	private String name; // 企业名称
	private String personName; // 核心人物名称
	private String capitalMoney; // 注册资金
	private String address; // 公司地址
	private String recordCode; // 备案编码
	private String establishTime; // 成立时间
	private String production; // 代表作品
	private String idea; // 投资理念
	private String idea_company; // 投资理念
	private Integer tuser_id;//用户id
	private String annualincome;
	
	
	// 新加的参数
	private String product_count; // 产品数目
	private String corestrategy; // 投资策略
	private String nav; // 最新净值
	private String price_date; // 日期
	private String cumulative_nav; // 累积净值

	// 时间曲线
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
	private String company_id;
	private String cumulativeincome;// 累计收益
	
	public String getCumulativeincome() {
		return cumulativeincome;
	}

	public void setCumulativeincome(String cumulativeincome) {
		this.cumulativeincome = cumulativeincome;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getRecordCode() {
		return recordCode;
	}

	public void setRecordCode(String recordCode) {
		this.recordCode = recordCode;
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

	public String getIdea() {
		return idea;
	}

	public void setIdea(String idea) {
		this.idea = idea;
	}

	public String getProduct_count() {
		return product_count;
	}

	public void setProduct_count(String product_count) {
		this.product_count = product_count;
	}

	public String getCorestrategy() {
		return corestrategy;
	}

	public void setCorestrategy(String corestrategy) {
		this.corestrategy = corestrategy;
	}

	public String getNav() {
		return nav;
	}
	public void setNav(String nav) {
		this.nav = nav;
	}

	public String getPrice_date() {
		return price_date;
	}

	public void setPrice_date(String price_date) {
		this.price_date = price_date;
	}

	public String getCumulative_nav() {
		return cumulative_nav;
	}
	public void setCumulative_nav(String cumulative_nav) {
		this.cumulative_nav = cumulative_nav;
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

	public String getCompany_id() {
		return company_id;
	}

	public void setCompany_id(String company_id) {
		this.company_id = company_id;
	}

	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getIdea_company() {
		return idea_company;
	}

	public void setIdea_company(String idea_company) {
		this.idea_company = idea_company;
	}

	 

	public Integer getTuser_id() {
		return tuser_id;
	}

	public void setTuser_id(Integer tuser_id) {
		this.tuser_id = tuser_id;
	}

 

	public String getAnnualincome() {
		return annualincome;
	}

	public void setAnnualincome(String annualincome) {
		this.annualincome = annualincome;
	}

	public Company(PrivateStock privateStock, String id, String name, String personName, String capitalMoney,
			String address, String recordCode, String establishTime, String production, String idea,
			String product_count, String corestrategy, String nav, String price_date, String cumulative_nav,
			String topOneMonth, String topThreeMonth, String topHalfYear, String topOne, String topTwo, String topThree,
			String topFive, String topDate, String top2018, String top2017, String top2016, String top2015,
			String top2014, String top2013, String top2012, String top2011, String company_id,String idea_company,Integer tuser_id,String annualincome,
			String cumulativeincome) {
		super();
		//this.privateStock = privateStock;
		this.id = id;
		this.name = name;
		this.personName = personName;
		this.capitalMoney = capitalMoney;
		this.address = address;
		this.recordCode = recordCode;
		this.establishTime = establishTime;
		this.production = production;
		this.idea = idea;
		this.idea_company = idea_company;
		this.tuser_id = tuser_id;
		this.product_count = product_count;
		this.corestrategy = corestrategy;
		this.nav = nav;
		this.price_date = price_date;
		this.cumulative_nav = cumulative_nav;
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
		this.company_id = company_id;
		//this.cumulativeincome = cumulativeincome;
	}

}
