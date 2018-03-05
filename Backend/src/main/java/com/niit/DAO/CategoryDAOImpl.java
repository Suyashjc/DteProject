package com.niit.DAO;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.niit.model.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO 
{

	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	public boolean addCategory(Category category) 
	{	
		try
		{
		sessionFactory.getCurrentSession().save(category);
		return true;
		}
		catch(Exception e)
		{
		System.out.println("Exception Arised:"+e);
		return false;
		}
	}

	//getCategory()
	public Category getCategory(int categoryId) 
	{
		Session session=sessionFactory.openSession();
		Category category=(Category)session.get(Category.class,categoryId);
		return category;
	}
	
	//listCategories()
	public List<Category> getCategories() 
	{
		Session session=sessionFactory.openSession(); 
		Query query=session.createQuery("from Category");
		List<Category> Category=query.list();
		return Category;
	}

	//deleteCategory()
	@Transactional
	public boolean deleteCategory(Category category)
	{
		try
		{
			sessionFactory.getCurrentSession().delete(category);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
			return false;
		}
		
	}

	//updateCategory()
	@Transactional
	public boolean updateCategory(Category category) 
	{

		try
		{
			sessionFactory.getCurrentSession().update(category);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
			return false;
		}
	}
	

	
	
	

}
