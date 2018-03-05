package com.niit.DAO;

import java.util.List;

import com.niit.model.Category;
import com.niit.model.Supplier;

public interface SupplierDAO

{
	public boolean addSupplier(Supplier supplier);
	public Supplier getSupplier(int supplierId);
	public List<Supplier> getSuppliers();
	public boolean deleteSupplier(Supplier supplier);
	public boolean updateSupplier(Supplier supplier);
}
