package com.niit.test;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.niit.DAO.UserDAO;
import com.niit.model.UserDetails;

public class UserUnitTest 

{

	static UserDAO userDAO;
	
	@BeforeClass
	public static void executeFirst()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();

		userDAO=(UserDAO)context.getBean("userDAO");
	}
	
	@Test
	public void addUserTest()
	{
		UserDetails user=new UserDetails();
		user.setUsername("Suyashjc");
		user.setCustomerName("Suyash Chaudhari");;
		assertTrue("Problem in Supplier Insertion",userDAO.addUser(user));
	}
}
