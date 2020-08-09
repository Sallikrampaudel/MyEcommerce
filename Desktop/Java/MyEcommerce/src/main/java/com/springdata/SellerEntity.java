package com.springdata;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sellerdata")
public class SellerEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idsellerdata")
	int sellerid;
	@Column(name="fname")
	String fname;
	@Column(name="lname")
	String lname;
	@Column(name="email")
	String email;
	@Column(name="password")
	String password;
	
	
	public SellerEntity(int sellerid, String fname, String lname, String email, String password) {
		
		this.sellerid = sellerid;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
	}
	
	
	public SellerEntity(String email, String password) {
	
		this.email = email;
		this.password = password;
	}


	public SellerEntity() {
		
	}
	public int getSellerid() {
		return sellerid;
	}
	public void setSellerid(int sellerid) {
		this.sellerid = sellerid;
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

}
