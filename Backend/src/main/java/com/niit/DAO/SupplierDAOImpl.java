package com.niit.DAO;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.model.Product;
import com.niit.model.Supplier;

@Repository("supplierDAO")
public class SupplierDAOImpl implements SupplierDAO

{
	@Autowired
SessionFactory sessionFactory;
	
	
	@Transactional
	public boolean addSupplier(Supplier supplier)
	{
		try
		{
		sessionFactory.getCurrentSession().save(supplier);
		return true;
		}
		catch(Exception e)
		{
		System.out.println("Exception Arised:"+e);
		return false;
		}
	}

	public Supplier getSupplier(int supplierId) 
	{
		Session session=sessionFactory.openSession();
		Supplier supplier=(Supplier)session.get(Supplier.class,supplierId);
		return supplier;
	}

	public List<Supplier> getSuppliers() 
	{
		Session session=sessionFactory.openSession(); 
		Query query=session.createQuery("from Supplier");
		List<Supplier> Supplier=query.list();
		return Supplier;	
	}

	@Transactional
	public boolean deleteSupplier(Supplier supplier)
	{
		try
		{
			sessionFactory.getCurrentSession().delete(supplier);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
			return false;
		}
	}

	public boolean updateSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		return false;
	}

}
