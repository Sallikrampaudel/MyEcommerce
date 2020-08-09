package com.strut;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.spring.SellerBean;

public class SellerAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String fname;
	private String lname;
	private String email;
	private String password;
	private String rpassword;

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

	@Autowired
	public SellerBean seller;

	public String register() {
		boolean B = seller.register(fname, lname, email, password);
		if (B == true) {
			return "success";
		} else {
			return "failure";
		}
	}

	public String authenticate() {
		boolean B = seller.authenticate(email, password);
		if (B == true) {
			return "success";
		} else {
			return "failure";
		}
	}

	public String getRpassword() {
		return rpassword;
	}

	public void setRpassword(String rpassword) {
		this.rpassword = rpassword;
	}

}
