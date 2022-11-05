package com.tech.serviceimpl;

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
	
	

}
