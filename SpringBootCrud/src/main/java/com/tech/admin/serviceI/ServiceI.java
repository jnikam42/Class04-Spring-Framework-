package com.tech.admin.serviceI;



import java.util.List;

import com.tech.admin.model.Student;


public interface ServiceI {
	
	 public String addStudent(Student stu);
	
     public	String addStudents(List<Student> students);
     
     public Student  getStudent(String sid);
	
	

}
