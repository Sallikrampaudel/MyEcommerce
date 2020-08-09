package com.myecommerce.demo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({JPATest.class, StrutControllerTest.class
	, SpringModelTest.class})
class MyEcommerceApplicationTests {
	

}
