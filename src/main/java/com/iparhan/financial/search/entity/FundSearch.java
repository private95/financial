package com.iparhan.financial.search.entity;

/**
 * 搜索业务——基金信息查询
 * @author Iparhan
 *
 */
public class FundSearch {
	
	private String id;
	private String fund_shortName; //基金简称
	private String fundCompany;    //基金公司
	private Double nav;            //最新净值
	private Double cumulative_nav; //累计净值
	private Double topOneMonth;    //最新一个月
	private String price_date;     //最新净值日期
	
	
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
	public Double getNav() {
		return nav;
	}
	public void setNav(Double nav) {
		this.nav = nav;
	}
	public Double getCumulative_nav() {
		return cumulative_nav;
	}
	public void setCumulative_nav(Double cumulative_nav) {
		this.cumulative_nav = cumulative_nav;
	}
	public Double getTopOneMonth() {
		return topOneMonth;
	}
	public void setTopOneMonth(Double topOneMonth) {
		this.topOneMonth = topOneMonth;
	}
	public String getPrice_date() {
		return price_date;
	}
	public void setPrice_date(String price_date) {
		this.price_date = price_date;
	}
	@Override
	public String toString() {
		return "FundSearch [id=" + id + ", fund_shortName=" + fund_shortName + ", fundCompany=" + fundCompany + ", nav="
				+ nav + ", cumulative_nav=" + cumulative_nav + ", topOneMonth=" + topOneMonth + ", price_date="
				+ price_date + "]";
	}
	public FundSearch(String id, String fund_shortName, String fundCompany, Double nav, Double cumulative_nav,
			Double topOneMonth, String price_date) {
		super();
		this.id = id;
		this.fund_shortName = fund_shortName;
		this.fundCompany = fundCompany;
		this.nav = nav;
		this.cumulative_nav = cumulative_nav;
		this.topOneMonth = topOneMonth;
		this.price_date = price_date;
	}
	public FundSearch() {
		super();
		// TODO Auto-generated constructor stub
	}

}
