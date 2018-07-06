package com.iparhan.financial.wechat.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.iparhan.financial.wechat.entity.WechatAccount;

/**
 * 微信登录数据交互中心
 * @author Iparhan
 *参数列表：
 *openid     //openId
 *nickname   //昵称
 *sex        //性别
 *province   //省份
 *city       //城市
 *country    //国家
 *headimgurl //头像
 */
@Mapper
public interface WechatAccountMapper {
	
	/**
	 * 微信用户查询
	 * @param appid
	 * @return
	 */
	@Select("select * from t_wechat where openid = #{openid}")
	WechatAccount queryByOpenId(String appid);
    
	
	/**
	 * 微信用户信息插入
	 * @param wechatAccount
	 */
    @Insert("insert into t_wechat (openid,nickname,sex,province,city,country,headimgurl) "
    		+ "values(#{openid},#{nickname},#{sex},#{province},#{city},#{country},#{headimgurl})")
    void insertWechatAccount(WechatAccount wechatAccount);

}
