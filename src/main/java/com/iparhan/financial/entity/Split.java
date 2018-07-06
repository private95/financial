package com.iparhan.financial.entity;

/**
 * 历史拆分
 * @author iparhan
 *
 */
public class Split {
	private String date;        //拆分日期
	private String proportion;  //比例
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getProportion() {
		return proportion;
	}
	public void setProportion(String proportion) {
		this.proportion = proportion;
	}
	@Override
	public String toString() {
		return "Split [date=" + date + ", proportion=" + proportion + "]";
	}
	public Split(String date, String proportion) {
		super();
		this.date = date;
		this.proportion = proportion;
	}
	public Split() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
