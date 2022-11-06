package com.tech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	   @RequestMapping("/log")
	   public String getAllData(@RequestParam("UserName")String us,@RequestParam("userPass")String pw)
	   {
		   if(us.equals("Admin") && pw.equals("tech"))
		   {
		 List<Student>studentlist=si.getAllData();
		 for(Student stu:studentlist)
		 {
			 System.out.println("Student Id:"+stu.getSid());
			 System.out.println("Student Name:"+stu.getSname());
			 System.out.println("Student Address"+stu.getAddrs());
			 System.out.println("Student Username"+stu.getUserName());
			 System.out.println("Student Password"+stu.getUserPass());
		  }
		
		   }   
		  
		   
		   else if(us.equals(us) && pw.equals(pw))
		   {
			 List<Student>  studentData=si.getSingleData(us, pw);
			 {
				 for(Student stu:studentData)
				 {
					 System.out.println("Student Id:"+stu.getSid());
					 System.out.println("Student Name:"+stu.getSname());
					 System.out.println("Student Address"+stu.getAddrs());
					 System.out.println("Student Username"+stu.getUserName());
					 System.out.println("Student Password"+stu.getUserPass());
				  }
				
			 }
		   }
		   return "index";
	   }
	
	
	

}
