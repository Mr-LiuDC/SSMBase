package com.ldc.ssm.dao;

import com.ldc.ssm.entity.User;

/**
 * @description: UserDao接口类
 * @date: Created on 2016年11月20日
 * @author: Mr.LiuDC
 * @email: decai.liu@hpe.com
 *
 */
public interface UserDao {
	/**
	 * 添加新用户
	 * 
	 * @return
	 */
	public int insertUser(User user);
	
}
