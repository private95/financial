package com.iparhan.financial.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.taglibs.standard.lang.jstl.test.beans.PublicInterface2;

import com.iparhan.financial.entity.User;
import java.util.List;

/**
 * Created by iparhan date:2018年4月3日 address：Beijing
 * 
 */

@Mapper
public interface UserMapper {
	/*
	 * 查询用户表全部数据
	 */
	@Select("select * from t_user")
	List<User> query();

	/*
	 * 查询用户表的全部用户名
	 */
	@Select("select username from t_user")
	List<User> queryName();

	/*
	 * 登录需要的查询
	 */
	@Select("select password from t_user where username = #{username}")
	String queryByName(String username);

	@Select("select count(*) from t_user where name=#{username} and password=#{password}")
	int usernameAndpassword(@Param("username") String username, @Param("password") String password);

	@Insert("insert into t_user (username,password,email) values(#{username},#{password},#{email})")
	int register(@Param("username") String username, @Param("password") String password, @Param("email") String email);

	// ============================================================================================================
	// 登录
	@Select("SELECT `id`,`username` FROM t_user WHERE (`username`=#{username} AND `password`=#{password}) OR (email = #{email} AND password = #{password})")
	public User isLogin(User user);

	// 注册之前查询该用户名是否被使用过
	@Select("SELECT COUNT(1) FROM  t_user WHERE username=#{username}")
	public int getName(@Param("username") String username);

	// 注册之前查询该用户的邮箱是否被使用过
	@Select("select count(1) from t_user where email=#{email}")
	public int getEmail(@Param("email") String email);

	// 如果用户未注册过，注册并添加数据到数据库
	@Insert("insert into t_user (username,password,email) values(#{username},#{password},#{email})")
	int insertUser(@Param("username") String username, @Param("password") String password,
			@Param("email") String email);

	// 账户资料
	// 根据当前登录用户id查询用户信息
	@Select("select * from t_user where id=#{id}")
	public User selectUserById(@Param("id") String id);

	// 修改用户信息
	@Update("UPDATE t_user SET realName=#{realName}, IdType=#{IdType},IdNumber=#{IdNumber}")
	public int updateUserInfo(User user);
	
	/*
	 * 获取用户信息,根据id修改用户密码
	 */
	@Update("UPDATE t_user SET PASSWORD=#{password} WHERE id=#{id}")
	public int updateUserPwd(@Param("password") String password, @Param("id") String id);
	
	/*
	 *根据用户名称去查询邮箱 
	 */
	@Select("select email from t_user where username=#{username}")
	public String queryByUserName(String username);
	
	/*
	 * 重置密码
	 */
	@Update("update t_user set password=#{password} where username=#{username} and email=#{email}")
	public int updateUserPassword(@Param("password") String password,@Param("username") String username,@Param("email") String email);
	
	/*
	 * 根据用户姓名和邮箱去修改用户的地址
	 */
	@Update("update t_user SET address =#{address} where username  =#{username} and email =#{email}")
	public int updateAddress(@Param("address") String address,@Param("username") String username,
			@Param("email") String email);
	
	/*
	 * 添加用户的真实姓名和身份证编号
	 */
	@Update("update t_user set realName=#{realName},idType=#{idType},idNumber=#{idNumber} where username =#{username}")
	public int updateRealName(@Param("realName") String realName,@Param("idType") String idType,@Param("idNumber") String idNumber,@Param("username") String username);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
