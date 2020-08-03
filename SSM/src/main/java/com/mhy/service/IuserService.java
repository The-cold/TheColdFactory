package com.mhy.service;

import com.mhy.pojo.Iuser;

public interface IuserService {
	/**
	 * 用户登录
	 * @param iuser
	 * @return
	 */
	public Iuser login(Iuser iuser);
}
