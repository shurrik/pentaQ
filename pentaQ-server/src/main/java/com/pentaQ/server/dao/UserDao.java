package com.pentaQ.server.dao;

import java.util.List;

import com.pentaQ.model.User;

public interface UserDao {
	
	int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

	List<User> getAllUsers();
}
