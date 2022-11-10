package com.tech.daoi;

import java.util.List;

import com.tech.Model.Student;

public interface DaoI {
	
	public int saveData(Student s);
	
	public List<Student>getAllData();
	
	public List<Student>getSingleData(String us,String pw);
	
	 public void deleteData(int id);

}
