package com.tech.admin.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.admin.model.Student;
import com.tech.admin.repository.Myrepo;
import com.tech.admin.serviceI.ServiceI;

@Service
public class ServiceImpl implements ServiceI
{
     
	@Autowired
	Myrepo r;
	 
	 
	@Override
	public String addStudent(Student stu) {
		
		r.save(stu);
		return "Student Data is Saved Successfully with Id="+stu.getSid();
	}


	@Override
	public String addStudents(List<Student> students) {
		r.saveAll(students);
		return "All Students Records Are Saved SuccessFully";
	}


	@Override
	public Student getStudent(String sid) {
	 Optional<Student> stu=	r.findById(sid);
	  
	 if(stu.isPresent())
	 {
		 return stu.get(); 
	 }
	 
		return null;
	}

}
