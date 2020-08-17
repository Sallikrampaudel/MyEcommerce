package com.myecommerce.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.spring.SellerBean;
import com.springdata.SellerEntity;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringModelTest {
	public SellerBean seller;
	
	@Autowired
	public void setSeller(SellerBean seller) {
		this.seller = seller;
	}
	@Test
	public void SpringInvalidLoginTest() throws Exception {
		SellerEntity res= seller.authenticate("a", "a");
		System.out.println(res);
		assertNotNull(res);
	}
//	@Test
//	public void SpringInvalidLoginTestnullUid() throws Exception {
//		SellerEntity res= seller.authenticate(null, "a");
//		assertEquals(null, res);
//	}
//	@Test
//	public void SpringInvalidLoginTestnullpwd() throws Exception {
//		SellerEntity res= seller.authenticate("a", null);
//		assertEquals(null, res);
//	}
//	@Test
//	public void SpringInvalidLoginTestnullpwdAndUid() throws Exception {
//		SellerEntity res= seller.authenticate(null, null);
//		assertEquals(null, res);
//	}
//	@Test
//	public void SpringValidLoginTest() throws Exception {
//		SellerEntity res= seller.authenticate("java@g.com", "paudel");
//		assertEquals(true, res);
//	}
//
//	//test case - correct userid , wrong password = false
//	@Test
//	public void SpringValidUidAndInvalidPwd() throws Exception {
//		SellerEntity res=seller.authenticate("java@g.com","jane123");
//		assertEquals(false, res);
//	}
//	
//	//test case - wrong userid, correct password = false
//	@Test
//	public void SpringInValidUidAndValidPwd() throws Exception {
//		SellerEntity res=seller.authenticate("abc","paudel");
//		assertEquals(null, res);
//	}
//	@Test
//	public void SpringRegisterwithUsedEmail() throws Exception {
//		boolean res=seller.register("abc","xyz","java@g.com","paudel");
//		assertEquals(null, res);
//	}
//	@Test
//	public void SpringRegisterwithNewEmail() throws Exception {
//		boolean res=seller.register("abc","xyz","som@g.com","paudel");
//		assertEquals(true, res);
//	}
//	
}
