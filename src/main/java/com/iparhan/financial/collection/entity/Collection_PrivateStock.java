package com.iparhan.financial.collection.entity;

public class Collection_PrivateStock {
	private String id;
	private String fund_shortName;
	private String nav;  //最新净值
	private String cumulative_nav; //累计净值
	private Double topOneMonth; //近一个月
	private Double top2018;     //2018的情况
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
	public Double getTopOneMonth() {
		return topOneMonth;
	}
	public void setTopOneMonth(Double topOneMonth) {
		this.topOneMonth = topOneMonth;
	}
	public Double getTop2018() {
		return top2018;
	}
	public void setTop2018(Double top2018) {
		this.top2018 = top2018;
	}
	@Override
	public String toString() {
		return "Collection_PrivateStock [id=" + id + ", fund_shortName=" + fund_shortName + ", nav=" + nav
				+ ", cumulative_nav=" + cumulative_nav + ", topOneMonth=" + topOneMonth + ", top2018=" + top2018 + "]";
	}
	public Collection_PrivateStock(String id, String fund_shortName, String nav, String cumulative_nav,
			Double topOneMonth, Double top2018) {
		super();
		this.id = id;
		this.fund_shortName = fund_shortName;
		this.nav = nav;
		this.cumulative_nav = cumulative_nav;
		this.topOneMonth = topOneMonth;
		this.top2018 = top2018;
	}
	public Collection_PrivateStock() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
