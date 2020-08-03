package com.mhy.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mhy.pojo.Iuser;
import com.mhy.service.IuserService;

@Controller
@RequestMapping("/login")
public class IuserController {

	@Autowired
	private IuserService ius;
	
	/**
	 * 登录
	 * @param iuser
	 * @param request
	 * @return
	 */
	@RequestMapping(value="go",method=RequestMethod.POST)
	public String login(Iuser iuser,HttpServletRequest request) {
		System.out.println(iuser.getUpad()+iuser.getUphone());
		if(iuser==null) {
			return "bxlogin";
		}
		iuser=ius.login(iuser);
		if (iuser!=null) {
			request.getSession().setAttribute("iuser", iuser);
		}
		return "main";
	}
	
	
}
