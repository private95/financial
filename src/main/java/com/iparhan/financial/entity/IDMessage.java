package com.iparhan.financial.entity;

/**
 * 身份资料
 * @author iparhan
 *
 */
public class IDMessage {
	private String realName;   //真实姓名
	private String IdType;     //ID类型
	private String IdNumber;   //ID号
	
	
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getIdType() {
		return IdType;
	}
	public void setIdType(String idType) {
		IdType = idType;
	}
	public String getIdNumber() {
		return IdNumber;
	}
	public void setIdNumber(String idNumber) {
		IdNumber = idNumber;
	}
	@Override
	public String toString() {
		return "IDMessage [realName=" + realName + ", IdType=" + IdType + ", IdNumber=" + IdNumber + "]";
	}
	public IDMessage(String realName, String idType, String idNumber) {
		super();
		this.realName = realName;
		IdType = idType;
		IdNumber = idNumber;
	}
	public IDMessage() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
