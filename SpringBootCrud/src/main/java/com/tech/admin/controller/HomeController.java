package com.tech.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tech.admin.model.Student;
import com.tech.admin.serviceI.ServiceI;



@RestController
@RequestMapping("/admin/controller")
public class HomeController 
{
	
	@Autowired
	ServiceI si;

	@PostMapping("/add/student")
	public String addStudent(@RequestBody Student stu)
	{
		
	    String id=	si.addStudent(stu);
		return id;
		
	}
	
	@PostMapping("/add/students")
	public String addStudents(@RequestBody List<Student> stus)
	{
		
	String msg=	si.addStudents(stus);
		return msg;
		
	}
	
	@GetMapping("/get/student/{sid}")
	public Student getStudent(@PathVariable String sid)
	{
	Student stu=	si.getStudent(sid);
		return stu;
		
	}
	
	
	
	
	
	
	
	
	
	
}
