package com.constructor.secondary;

public class Student
{
	private int sid;
	private String sname;
	
	private Address adrs;

	public Student(int sid, String sname, Address adrs)
	{
		
		this.sid = sid;
		this.sname = sname;
		this.adrs = adrs;
	}

	@Override
	public String toString() 
	{
		return "Student:sid=" + sid + ", sname=" + sname + ", " + adrs ;
	}
	
	

}
