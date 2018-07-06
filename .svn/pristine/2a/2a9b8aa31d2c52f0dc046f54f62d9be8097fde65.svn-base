package com.iparhan.financial.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import com.iparhan.financial.entity.IDMessage;
import com.iparhan.financial.entity.User;

/**
 * 实名制身份添加
 * 
 * @author Iparhan realName //真是姓名 IdType //证件类型 IdNumber //证件号
 *
 */
@Mapper
public interface IDMessageMapper {

	@Update("UPDATE t_user SET realName=#{realName}, IdType=#{IdType},IdNumber=#{IdNumber}")
	void updateIDCard(IDMessage idMessage);

	// ================================================
	// 获取当前登录的id
	@Select("select * from t_user where id=#{id}")
	public User selectUserByIDCard(@Param("id") int id);

	// 根据id修改用户身份验证
	@Update("UPDATE t_user SET realName=#{realName}, IdType=#{IdType},IdNumber=#{IdNumber}")
	public int UpdateUserIdCard(User user);

}
