package com.myecommerce.demo;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.springdata.SellerEntity;
import com.springdata.SellerRepository;



@RunWith(SpringRunner.class)
@SpringBootTest
public class JPATest {
	@Autowired
	SellerRepository sr;
	@Test
	public void validUidAndPwd() {
		List<SellerEntity> li=sr.findByEmailAndPassword("java@g.com", "paudel");
		assertEquals(1 , li.size());
	}
	@Test
	public void fname() {
		List<SellerEntity> li=sr.findByEmailAndPassword("java@g.com", "paudel");
		System.out.println(li);
		assertEquals("Salik", li);
		
	}
	
	@Test
	public void invalidUidAndPwd() {
		List<SellerEntity> li=sr.findByEmailAndPassword("asfqwe", "jaqtq");
		assertEquals(0 , li.size());
	}
	
	@Test
	public void CheckEmail() {
		List<SellerEntity> li=sr.findByEmail("tester@gmail.com");
		assertEquals(1,li.size());
	}
	
	@Test
	public void testCreateUser() {
		SellerEntity seller= new SellerEntity();
		
		seller.setFname("test1");
		seller.setLname("tester1");
		seller.setEmail("test11@gmail.com");	
		seller.setPassword("test123");
		sr.save(seller);
		List<SellerEntity>  seller1= sr.findByEmailAndPassword("test11@gmail.com","test123");
		assertEquals(1, seller1.size());
		
	}
}
