package com.iparhan.financial.entityTime;

/**
 *  近十年来
 * @author iparhan
 *
 */
public class TopTen {
	//收益情况
	private String fundTopTen;   //本基金
	private String avarageTopTen;  //同类平均
	private String csi300TopTen;   //沪深300
	
	
	public String getFundTopTen() {
		return fundTopTen;
	}
	public void setFundTopTen(String fundTopTen) {
		this.fundTopTen = fundTopTen;
	}
	public String getAvarageTopTen() {
		return avarageTopTen;
	}
	public void setAvarageTopTen(String avarageTopTen) {
		this.avarageTopTen = avarageTopTen;
	}
	public String getCsi300TopTen() {
		return csi300TopTen;
	}
	public void setCsi300TopTen(String csi300TopTen) {
		this.csi300TopTen = csi300TopTen;
	}
	 
	public TopTen(String fundTopTen, String avarageTopTen, String csi300TopTen) {
		super();
		this.fundTopTen = fundTopTen;
		this.avarageTopTen = avarageTopTen;
		this.csi300TopTen = csi300TopTen;
	}
	public TopTen() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
