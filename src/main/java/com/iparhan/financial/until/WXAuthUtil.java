package com.iparhan.financial.until;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class WXAuthUtil {
	 	public static final String APPID="wx1611abf6bf19751a";
	    public static final String APPSECRET ="6266b5f319af20980809899cb42e6a8d";
	    private static final String TOKEN = "immco";
	    public static JSONObject doGetJson(String url) throws ClientProtocolException, IOException {
	        JSONObject jsonObject =null;
	        @SuppressWarnings({ "deprecation", "resource" })
			DefaultHttpClient client = new DefaultHttpClient();
	        HttpGet httpGet =new HttpGet(url);
	        HttpResponse response =  client.execute(httpGet);
	        HttpEntity entity =response.getEntity();
	        if(entity!=null)
	        {
	            //把返回的结果转换为JSON对象
	            String result =EntityUtils.toString(entity, "UTF-8");
	            System.out.println(result);
	            jsonObject =JSON.parseObject(result);
	        }
	        
	        return jsonObject;
	    }
}
