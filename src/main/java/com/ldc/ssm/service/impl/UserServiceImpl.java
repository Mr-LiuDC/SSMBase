package com.ldc.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ldc.ssm.dao.UserDao;
import com.ldc.ssm.entity.User;
import com.ldc.ssm.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	public int insertUser(User user) {
		return userDao.insertUser(user);
	}

}