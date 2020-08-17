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
	public SellerEntity authenticate(String email, String password) {
		SellerEntity se=null;
		if(email == null)
			return se;
		if(password ==null)
			return se;
		List<SellerEntity> seList1=sr.findByEmailAndPassword(email,password);

		if(seList1.size()==1) {
			System.out.println("1");
			return se=seList1.get(0);
		}else {			
			System.out.println("2");
			return se;
		}
	}
}
