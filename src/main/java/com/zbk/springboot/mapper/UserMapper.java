package com.zbk.springboot.mapper;

import org.apache.ibatis.annotations.Param;

import com.zbk.springboot.entity.User;

public interface UserMapper {
	
	User findByUsername(@Param("username") String username);
	User findUserById(@Param("Id") String Id);

}
