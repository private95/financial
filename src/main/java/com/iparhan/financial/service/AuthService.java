package com.iparhan.financial.service;

import java.io.UnsupportedEncodingException;

import com.alibaba.fastjson.JSONObject;

public interface AuthService {

	//多个登录差不多都要共用这些方法，所以统一放到这个接口中
 
	    public abstract String getAccessToken(String code) throws Exception;
	    public abstract String getOpenId(String accessToken);
	    public abstract String refreshToken(String code);
	    public abstract String getAuthorizationUrl() throws UnsupportedEncodingException ;
	    public abstract JSONObject getUserInfo(String accessToken,String openId) throws Exception ;
 
}
