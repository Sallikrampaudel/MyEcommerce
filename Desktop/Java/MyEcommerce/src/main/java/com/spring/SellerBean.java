package com.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.springdata.SellerEntity;
import com.springdata.SellerRepository;


@Service
@Scope("session")
public class SellerBean {
	public ArrayList<SellerEntity> seGroup;
	
	@Autowired
	public SellerRepository sr;
	public boolean register(String fname, String lname, String email, String password) {
		SellerEntity se=new SellerEntity();
		se.setFname(fname);
		se.setLname(lname);
		se.setEmail(email);
		se.setPassword(password);
		List<SellerEntity> seList1=sr.findByEmail(email);
		if(seList1.size()==1) {
			return false;
		}else {
			sr.save(se);
			return true;
		}
		
	}
	public boolean authenticate(String email, String password) {
		if(email == null)
			return false;
		if(password ==null)
			return false;
		List<SellerEntity> seList=sr.findByEmailAndPassword(email,password);
		if(seList.size() ==0)
			return false;
		if(seList.size() == 1)
			return true;
		
		return false;
	}
}
