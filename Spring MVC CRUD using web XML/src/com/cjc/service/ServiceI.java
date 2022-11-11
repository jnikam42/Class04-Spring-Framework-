package com.cjc.service;

import java.util.List;

import com.cjc.model.Student;

public interface ServiceI {
	public int saveData(Student s);
	public int logincheck(String us,String ps);
	public List<Student>singelData(String us,String pw);
	public List<Student>getAllData();
	public void deleteData(int id);
	public Student editData(int id);
	public void updateData(Student stu);

}
