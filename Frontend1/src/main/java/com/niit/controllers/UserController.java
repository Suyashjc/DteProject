package com.niit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.DAO.UserDAO;
import com.niit.model.UserDetails;

@Controller
public class UserController
{
	
	@Autowired
	UserDAO userDAO;
	
	@RequestMapping(value="/Register")
	public String m3(Model m)
	{
	UserDetails userdetails=new UserDetails();
	m.addAttribute("userdetails",userdetails);
	return "Register";	
	}

	@RequestMapping(value="/InsertUser" , method = RequestMethod.POST)
	public String insertUser(@ModelAttribute("userdetails")UserDetails userdetails,Model m)
	{
		UserDetails userdetails1=new UserDetails();
		m.addAttribute(userdetails1);
		userDAO.addUser(userdetails);
		return"Home";
	}
}
