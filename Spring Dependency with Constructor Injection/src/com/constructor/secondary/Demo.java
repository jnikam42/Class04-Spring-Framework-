package com.constructor.secondary;

public class Demo {
	
	int id=101;
	String name="Ram";
	
	Demo()
	{
		System.out.println("Constructor....");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("main Start");
		
		Demo d=new Demo();
	}
	
	

}
