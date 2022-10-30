package com.setter.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class MyClass {
	
	private List mylist;
	private Set myset;
	private Map mymap;
	public List getMylist() {
		System.out.println("List...."+mylist);
		return mylist;
	}
	public void setMylist(List mylist) {
		this.mylist = mylist;
	}
	public Set getMyset() {
		System.out.println("Set..."+myset);
		return myset;
	}
	public void setMyset(Set myset) {
		this.myset = myset;
	}
	public Map getMymap() {
		
		System.out.println("Map...."+mymap);
		return mymap;
	}
	public void setMymap(Map mymap) {
		this.mymap = mymap;
	}
	
	
	

}
