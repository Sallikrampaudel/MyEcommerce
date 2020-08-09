package com.myecommerce.demo;

import static org.junit.Assert.assertEquals;

import org.apache.struts2.StrutsSpringJUnit4TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.opensymphony.xwork2.ActionProxy;
import com.strut.SellerAction;


@RunWith(SpringRunner.class)
@SpringBootTest
public class StrutControllerTest extends StrutsSpringJUnit4TestCase<SellerAction>{
	@Test
    public void StrutsInvalidLoginTest() throws Exception {
        request.addParameter("email", "a");	// pass param to url
        request.addParameter("password", "a");
        ActionProxy proxy = getActionProxy("/authenticate"); // invoke url
        String result = proxy.execute();
        assertEquals("failure", result);        
    }
	@Test
	public void StrutsValidLogintest() throws Exception{
		request.addParameter("email", "java@g.com");
		request.addParameter("password", "paudel");
		ActionProxy proxy=getActionProxy("/authenticate");
		String result=proxy.execute();
		assertEquals("success", result);
	}
	@Test
	public void StrutsRegister() throws Exception{
		request.addParameter("fname", "java");
		request.addParameter("lname", "paudel");
		request.addParameter("email", "java@g.com");
		request.addParameter("password", "paudel");
		ActionProxy proxy=getActionProxy("/sellersignup");
		String result=proxy.execute();
		assertEquals("failure", result);
	}
}
