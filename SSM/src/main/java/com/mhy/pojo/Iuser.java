package com.mhy.pojo;

import java.io.Serializable;

/**
 * 普通会员实体类
 * @author Administrator
 *
 */
public class Iuser implements Serializable {
	private Integer userid;
	private String uname;
	private String upad;
	private String uphone;
	private Integer utype;
	
	
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpad() {
		return upad;
	}
	public void setUpad(String upad) {
		this.upad = upad;
	}
	public String getUphone() {
		return uphone;
	}
	public void setUphone(String uphone) {
		this.uphone = uphone;
	}
	public Integer getUtype() {
		return utype;
	}
	public void setUtype(Integer utype) {
		this.utype = utype;
	}
	
	
	
}
