package com.iparhan.financial.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * 账户信息更新
 * 
 * @author Iparhan username //用户名 email //email address //通讯地址
 */
@Mapper
public interface AccountMapper {
	// 修改账户信息
	@Update("UPDATE t_user SET username=#{username}, email=#{email},address=#{address}")
	void updateUser(@Param("username") String username, @Param("email") String email, @Param("address") String address);
}
