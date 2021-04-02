package com.zbk.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zbk.springboot.entity.User;
import com.zbk.springboot.mapper.UserMapper;

@Service("UserService")
public class UserService {

	 @Autowired
	    UserMapper userMapper;
	    public User findByUsername(User user){
	        return userMapper.findByUsername(user.getUsername());
	    }
	    public User findUserById(String userId) {
	        return userMapper.findUserById(userId);
	    }
}
