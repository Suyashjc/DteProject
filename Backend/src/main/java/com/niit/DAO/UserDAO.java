package com.niit.DAO;

import com.niit.model.UserDetails;

public interface UserDAO 

{
	public boolean addUser(UserDetails userdetails);
	public boolean deleteUser(UserDetails userdetails);
	public boolean updateUser(UserDetails userdetails);
	
}
