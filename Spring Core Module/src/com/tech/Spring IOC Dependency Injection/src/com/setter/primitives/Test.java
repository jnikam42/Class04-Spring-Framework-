package com.setter.primitives;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) 
	{
		ApplicationContext ap=new ClassPathXmlApplicationContext("springp.xml");
		                   
		               Student stu=(Student) ap.getBean("s");
		               
		               System.out.println("Student ID="+stu.getSid());
		               System.out.println("Student Name="+stu.getSname());
	}

}
