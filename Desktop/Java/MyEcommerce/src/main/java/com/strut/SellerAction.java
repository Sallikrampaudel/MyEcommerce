package com.strut;


import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.spring.SellerBean;
import com.springdata.SellerEntity;

public class SellerAction extends ActionSupport implements SessionAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String fname;
	private String lname;
	private String email;
	private String password;
	private String rpassword;
	private String button;
	
	public String getButton() {
		return button;
	}

	public void setButton(String button) {
		this.button = button;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getRpassword() {
		return rpassword;
	}

	public void setRpassword(String rpassword) {
		this.rpassword = rpassword;
	}

	@Autowired
	public SellerBean seller;
	private SessionMap<String, Object> sessionMap;
	
	Map<String, Object> session;

	public String register() {
		boolean B = seller.register(fname, lname, email, password);
		if (B == true) {
			
			return "success";
		} else {
			return "failure";
		}
	}

	public String authenticate() {
		SellerEntity B = seller.authenticate(email, password);
		System.out.println(B);
		
		if (B != null) {
			System.out.println(B.getFname());
			this.sessionMap = (SessionMap<String, Object>) ActionContext.getContext().getSession();
			sessionMap.put("val", B.getFname());
			return "success";
		} else {
		
			return "failure";
		}
	}

	public String logout(){  
	    if(sessionMap!=null){  
	        sessionMap.invalidate();  
	    }  
	    return "success";  
	}  
	
	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		this.session=session;
	}

}
