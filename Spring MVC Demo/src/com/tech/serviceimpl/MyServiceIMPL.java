package com.tech.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.Model.Student;
import com.tech.daoi.DaoI;
import com.tech.serviceI.MyService;

@Service
public class MyServiceIMPL implements MyService{

	@Autowired
	DaoI daoi;
	
	
	@Override
	public int saveData(Student s) {
		
		return daoi.saveData(s);
	}


	@Override
	public List<Student> getAllData() {
		
		return daoi.getAllData();
	}


	@Override
	public List<Student> getSingleData(String us, String pw) {
		
		return daoi.getSingleData(us, pw);
	}


	@Override
	public void deleteData(int id) {
		// TODO Auto-generated method stub
		
	}
	
	

}
