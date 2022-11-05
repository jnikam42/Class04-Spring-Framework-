package com.tech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tech.Model.Student;
import com.tech.serviceI.MyService;

@Controller
public class HomeController {
	
	
	
	@Autowired
	MyService si;
	
	
	@RequestMapping("/reg")
	public String saveData(@ModelAttribute  Student s)
	{
	
	       int id=   si.saveData(s);
	
	       if(id >0)
	       {
	    	 return "index";  
	       }
	       else
	       {
	    	   return "Register";
	       }
		
		
	}

}
