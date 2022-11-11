package com.tech.serviceI;

import java.util.List;

import com.tech.Model.Student;


public interface MyService
{
  public int saveData(Student s);
  
  public List<Student>getAllData();
  
  public List<Student>getSingleData(String us,String pw);
  
  public void deleteData(int id);
  
  public Student editData(int id);
  
  public void updateData(Student stu);
}
