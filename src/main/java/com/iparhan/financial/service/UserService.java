package com.iparhan.financial.service;

import java.util.List;

import com.iparhan.financial.entity.User;

public interface UserService {
	 public List<User> query();

	 boolean register(String userid,String user,String password);

	 public boolean usernameAndpassword(String user, String password);
	    
}
