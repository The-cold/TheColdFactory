package com.mhy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mhy.dao.IuserDao;
import com.mhy.pojo.Iuser;
import com.mhy.service.IuserService;

@Service
public class IuserServiceImpl implements IuserService {

	@Autowired
	private IuserDao iud;
	
	public Iuser login(Iuser iuser) {
		
		return iud.login(iuser);
	}

}
