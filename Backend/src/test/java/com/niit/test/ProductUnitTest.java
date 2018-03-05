package com.niit.test;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.niit.DAO.ProductDAO;
import com.niit.model.Product;

public class ProductUnitTest 

{

	static ProductDAO productDAO;
	@BeforeClass
	public static void executeFirst()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		
		productDAO=(ProductDAO)context.getBean("productDAO");
	}
	@Test
	public void addProductTest()
	{
		Product product=new Product();
		product.setProductname("Shoes");
		product.setSupplierId(2313);
		assertTrue("Problem in Product Insertion",productDAO.addProduct(product));
	}
}
