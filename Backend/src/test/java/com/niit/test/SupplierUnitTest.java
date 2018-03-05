package com.niit.test;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.niit.DAO.SupplierDAO;
import com.niit.model.Supplier;

public class SupplierUnitTest 

{

	static SupplierDAO supplierDAO;
	
	@BeforeClass
	public static void executeFirst()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		
		supplierDAO=(SupplierDAO)context.getBean("supplierDAO");
	}
	
	@Test
	public void addSupplierTest()
	{
		Supplier supplier=new Supplier();
		supplier.setSupplierName("Shoes");
		supplier.setSupplierId(2313);
		assertTrue("Problem in Supplier Insertion",supplierDAO.addSupplier(supplier));
	}
}
