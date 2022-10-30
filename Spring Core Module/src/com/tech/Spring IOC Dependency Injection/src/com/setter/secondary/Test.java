package com.setter.secondary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) 
	{
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("springS.xml");
		
		                 Student s =(Student) ap.getBean("s");
		                 
		                 System.out.println("Student Id="+s.getSid());
		                 System.out.println("Student Name="+s.getSname());
		                 System.out.println("Student CityName="+s.getAddrs().getCityName());
		                 System.out.println("Student Area Name="+s.getAddrs().getAreaName());
		
	}

}
