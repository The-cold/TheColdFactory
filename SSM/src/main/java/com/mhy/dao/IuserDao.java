package com.mhy.dao;

import com.mhy.pojo.Iuser;

public interface IuserDao {
	/**
	 * 用户登录
	 * @param iuser
	 * @return
	 */
	public Iuser login(Iuser iuser);
}
