package com.iparhan.financial.admin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.iparhan.financial.admin.entity.AdminUser;
import com.iparhan.financial.admin.entity.AdminUserList;
import com.iparhan.financial.until.FinancialResult;

@Mapper
public interface AdminUserDao {
	
	
	@Select("SELECT * FROM t_user;")
	List<AdminUserList> adminUserList();
	
	/*
	 * 管理员信息插入到数据库
	 */
	@Insert("insert into t_admin_user (username,password,job,email) values(#{username},#{password},#{job},#{email})")
    int registerAdmin(@Param("username")String username,@Param("password")String password,@Param("job")String job ,@Param("email")String email);
	
	
	/*
	 * 管理信息查询
	 * 条件：根据用户名查询其他信息
	 */
	@Select("SELECT username from t_admin_user WHERE username  = #{username} limit 1")
	String adminCheck(@Param("username")String username);
	
	
	/*
	 * 管理员登录
	 */
	@Select("SELECT password from t_admin_user WHERE username = #{username} AND password = #{password} limit 1;")
	String adminLogin(@Param("username")String username,@Param("password")String password);
	
	/*
	 * 根据用户名删除用户
	 */
	@Select("DELETE FROM t_user WHERE username  = #{username}")
	String deleteUser(@Param("username")String username);
	
	/*
	 * 根据用户名查询邮箱
	 */
	@Select("SELECT email FROM t_user WHERE username = #{username}")
	String email(@Param("username") String username);
	
	
	
	
}
