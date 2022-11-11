package com.tech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	   public String getAllData(@RequestParam("UserName")String us,@RequestParam("userPass")String pw,Model m)
	   {
		   if(us.equals("Admin") && pw.equals("tech"))
		   {
			   
			   System.out.println(us);
			   System.out.println(pw);
		       List<Student>studentlist=si.getAllData();
		 
		       m.addAttribute("data",studentlist );
		
		       return "success";
		
		   
//		 for(Student stu:studentlist)
//		 {
//			 System.out.println("Student Id:"+stu.getSid());
//			 System.out.println("Student Name:"+stu.getSname());
//			 System.out.println("Student Address"+stu.getAddrs());
//			 System.out.println("Student Username"+stu.getUserName());
//			 System.out.println("Student Password"+stu.getUserPass());
//		  }
		
		    }   
		  
		   
		   else if(us.equals(us) && pw.equals(pw))
		   {
			   List<Student>  studentData=si.getSingleData(us, pw);
			   
				 m.addAttribute("data",studentData);
				 return "success";
 
		   }
		   
		   else
		   {
		   return "index";
		   }
	 }
	
	   @RequestMapping("/delete")
	public String deleteData(@RequestParam ("rd")int id,Model m)
	{
		   System.out.println("Inside Delete method");
		si.deleteData(id);
         List<Student>stulist=si.getAllData();
         m.addAttribute("data",stulist);
		
	    return "success";
	
		
	}
	   
	@RequestMapping("/edit")
   public String editData(@RequestParam ("rd")int id,Model m)
   {
	   System.out.println("Inside Edit method");
	Student stu=si.editData(id);
	m.addAttribute("data",stu);
	return "update";
	   
   }
	
	@RequestMapping("/update")
	public String updateData(@ModelAttribute Student stu,Model m)
	{
		System.out.println("inside update");
		si.updateData(stu);
	     List<Student>list=si.getAllData();
		m.addAttribute("data",list);
		   
		return "success";
		
	}
	
	
	
	
	
	
	
	
	
}
