package com.niit.DAO;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.model.UserDetails;

public class UserDAOImpl implements UserDAO 
{

	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	public boolean addUser(UserDetails userdetails)
	{
		try
		{
		sessionFactory.getCurrentSession().save(userdetails);
		return true;
		}
		catch(Exception e)
		{
		System.out.println("Exception Arised:"+e);
		return false;
		}
	}

	@Transactional
	public boolean deleteUser(UserDetails userdetails)
	{
		try
		{
			sessionFactory.getCurrentSession().delete(userdetails);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
			return false;
		}
	}

	public boolean updateUser(UserDetails userdetails) 
	{
		try
		{
			sessionFactory.getCurrentSession().update(userdetails);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
			return false;
		}
	}

}
