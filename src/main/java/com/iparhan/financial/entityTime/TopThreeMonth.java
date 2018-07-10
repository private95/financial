package com.iparhan.financial.entityTime;

/**
 * 近三个月
 * @author iparhan
 *
 */
public class TopThreeMonth {
	//收益情况
	private String fundTopThreeMonth;   //本基金
	private String avarageTopThreeMonth;  //同类平均
	private String csi300TopThreeMonth;   //沪深300
	
	
	public String getFundTopThreeMonth() {
		return fundTopThreeMonth;
	}
	public void setFundTopThreeMonth(String fundTopThreeMonth) {
		this.fundTopThreeMonth = fundTopThreeMonth;
	}
	public String getAvarageTopThreeMonth() {
		return avarageTopThreeMonth;
	}
	public void setAvarageTopThreeMonth(String avarageTopThreeMonth) {
		this.avarageTopThreeMonth = avarageTopThreeMonth;
	}
	public String getCsi300TopThreeMonth() {
		return csi300TopThreeMonth;
	}
	public void setCsi300TopThreeMonth(String csi300TopThreeMonth) {
		this.csi300TopThreeMonth = csi300TopThreeMonth;
	}
	public TopThreeMonth(String fundTopThreeMonth, String avarageTopThreeMonth, String csi300TopThreeMonth) {
		super();
		this.fundTopThreeMonth = fundTopThreeMonth;
		this.avarageTopThreeMonth = avarageTopThreeMonth;
		this.csi300TopThreeMonth = csi300TopThreeMonth;
	}
	public TopThreeMonth() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
