package com.iparhan.financial.entityTime;

/**
 * 近一个月
 * @author iparhan
 *
 */
public class TopOneMonth {
	//收益情况
	private String fundTopOneMonth;   //本基金
	private String avarageTopOneMonth;  //同类平均
	private String csi300TopOneMonth;   //沪深300
	
	
	public String getFundTopOneMonth() {
		return fundTopOneMonth;
	}
	public void setFundTopOneMonth(String fundTopOneMonth) {
		this.fundTopOneMonth = fundTopOneMonth;
	}
	public String getAvarageTopOneMonth() {
		return avarageTopOneMonth;
	}
	public void setAvarageTopOneMonth(String avarageTopOneMonth) {
		this.avarageTopOneMonth = avarageTopOneMonth;
	}
	public String getCsi300TopOneMonth() {
		return csi300TopOneMonth;
	}
	public void setCsi300TopOneMonth(String csi300TopOneMonth) {
		this.csi300TopOneMonth = csi300TopOneMonth;
	}
	@Override
	public String toString() {
		return "TopOneMonth [fundTopOneMonth=" + fundTopOneMonth + ", avarageTopOneMonth=" + avarageTopOneMonth
				+ ", csi300TopOneMonth=" + csi300TopOneMonth + "]";
	}
	public TopOneMonth(String fundTopOneMonth, String avarageTopOneMonth, String csi300TopOneMonth) {
		super();
		this.fundTopOneMonth = fundTopOneMonth;
		this.avarageTopOneMonth = avarageTopOneMonth;
		this.csi300TopOneMonth = csi300TopOneMonth;
	}
	public TopOneMonth() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
