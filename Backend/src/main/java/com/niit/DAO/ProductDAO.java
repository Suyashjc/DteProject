package com.niit.DAO;

import java.util.List;

import com.niit.model.Category;
import com.niit.model.Product;

public interface ProductDAO
{
	public boolean addProduct(Product product);
	public Product getProduct(int productId);
	public List<Product> getProducts();
	public boolean deleteProduct(Product products);
	public boolean updateProduct(Product products);
}
