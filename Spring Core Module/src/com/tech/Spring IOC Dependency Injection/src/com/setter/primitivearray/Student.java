package com.setter.primitivearray;

public class Student {
	
	private int sid;
	private String sname;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	private String mono[];
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String[] getMono() {
		return mono;
	}
	public void setMono(String[] mono) {
		this.mono = mono;
	}

}
