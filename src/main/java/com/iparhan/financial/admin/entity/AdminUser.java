package com.iparhan.financial.admin.entity;

public class AdminUser {
	
	private String id;
	private String username;
	private String password;
	private String job;
	private String email;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "AdminUser [id=" + id + ", username=" + username + ", password=" + password + ", job=" + job + ", email="
				+ email + "]";
	}
	public AdminUser(String id, String username, String password, String job, String email) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.job = job;
		this.email = email;
	}
	public AdminUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
