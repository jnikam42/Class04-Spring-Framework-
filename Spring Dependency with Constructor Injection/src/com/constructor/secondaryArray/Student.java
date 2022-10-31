package com.constructor.secondaryArray;

import java.util.Arrays;

public class Student {
	
	private int sid;
	private String sname;
	private MoNo[] mono;
	public Student(int sid, String sname, MoNo[] mono) {
		
		this.sid = sid;
		this.sname = sname;
		this.mono = mono;
	}
	@Override
	public String toString() {
		return "Student :sid=" + sid + ", sname=" + sname + ", mono=" + Arrays.toString(mono);
	}
	
	
	
	
	

}
