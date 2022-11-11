package com.cjc.DaoI;

import java.util.List;

import com.cjc.model.Student;

public interface HomeDaoI {
	public int saveData(Student s);
	public int logincheck(String us,String ps);
	public List<Student>singleData(String us,String ps);
	public List<Student>getAllData();
	public void deleteData(int id);
    public Student editData(int id);
    public void updateData(Student stu);
}
