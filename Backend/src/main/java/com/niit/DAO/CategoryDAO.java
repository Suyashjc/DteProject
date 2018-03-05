package com.niit.DAO;

import com.niit.model.Category;

import java.util.List;

public interface CategoryDAO 
{
	public boolean addCategory(Category category);
	public Category getCategory(int categoryId);
	public List<Category> getCategories();
	public boolean deleteCategory(Category category);
	public boolean updateCategory(Category category);
}