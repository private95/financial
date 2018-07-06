package com.iparhan.financial.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.iparhan.financial.entity.User;

/*
 * 找回密码
 * */
@Mapper
public interface ForgetPasswordMapper {

	/*
	 * 根据用户名和邮箱查询数据
	 */
	@Select("SELECT username ,password,email FROM t_user where  username = #{username} and email = #{email};")
	User selectForGetPassword(@Param("username") String username, @Param("email") String email);

	// 根据用户id修改密码
	@Update("UPDATE t_user set password = #{password} WHERE id = #{id}")
	int updateUser(@Param("password") String password, @Param("id") int id);
}
