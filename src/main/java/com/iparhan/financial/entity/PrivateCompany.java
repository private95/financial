package com.iparhan.financial.entity;

public class PrivateCompany {
	// 公司名称，基金显示

	private String name;//公司名称
	private String fundCompany;//基金公司
	private int id;
	private String fund_shortName;//基金简称
	public PrivateCompany() {
		super();
		// TODO Auto-generated constructor stub
	}

	private Double nav;	 //最新净值
	private Double cumulative_nav;//累计净值
	private Double topOneMonth;//一个月以来
	private Double annualized;//年化收益
	private Double sharpeatio;//夏普利率
	private int oneyearrating;//一年评级
	private String company_id; //公司编号

	public PrivateCompany(String name, String fundCompany, int id, String fund_shortName, Double nav,
			Double cumulative_nav, Double topOneMonth, Double annualized, Double sharpeatio, int oneyearrating,
			String company_id) {
		super();
		this.name = name;
		this.fundCompany = fundCompany;
		this.id = id;
		this.fund_shortName = fund_shortName;
		this.nav = nav;
		this.cumulative_nav = cumulative_nav;
		this.topOneMonth = topOneMonth;
		this.annualized = annualized;
		this.sharpeatio = sharpeatio;
		this.oneyearrating = oneyearrating;
		this.company_id = company_id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFundCompany() {
		return fundCompany;
	}

	public void setFundCompany(String fundCompany) {
		this.fundCompany = fundCompany;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFund_shortName() {
		return fund_shortName;
	}

	public void setFund_shortName(String fund_shortName) {
		this.fund_shortName = fund_shortName;
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

	public Double getAnnualized() {
		return annualized;
	}

	public void setAnnualized(Double annualized) {
		this.annualized = annualized;
	}

	public Double getSharpeatio() {
		return sharpeatio;
	}

	public void setSharpeatio(Double sharpeatio) {
		this.sharpeatio = sharpeatio;
	}

	public int getOneyearrating() {
		return oneyearrating;
	}

	public void setOneyearrating(int oneyearrating) {
		this.oneyearrating = oneyearrating;
	}

	public String getCompany_id() {
		return company_id;
	}

	public void setCompany_id(String company_id) {
		this.company_id = company_id;
	}

}
