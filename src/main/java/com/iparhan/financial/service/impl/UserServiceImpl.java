package com.iparhan.financial.service.impl;

import com.iparhan.financial.dao.UserMapper;
import com.iparhan.financial.entity.User;
import com.iparhan.financial.service.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by mj on 2017/7/17.
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> query() {
        return userMapper.query();
    }

	public boolean usernameAndpassword(String user, String password) {
		int num = userMapper.usernameAndpassword(user, password);
		if(num>0){
			return true;
		}
		return false;
	}

	@Override
	public boolean register(String userid, String user, String password) {
		int num = userMapper.register(userid, user, password);
		if(num>0){
			return true;
		}
		return false;
	}
}
