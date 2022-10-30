package com.constructor.primitives;

public class Student {
	
	private int sid;
	private String sname;
	
	
	public Student(int sid, String sname) 
	{
		this.sid = sid;
		this.sname = sname;
	}
	
	public void Display()
	{
		System.out.println("Student Id="+sid);
		System.out.println("Student Name="+sname);
	}
	
	

}
