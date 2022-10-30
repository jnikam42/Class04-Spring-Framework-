package com.constructor.primitives;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		
	ApplicationContext ap=new ClassPathXmlApplicationContext("springCP.xml");
	
	                   Student  stu=(Student)  ap.getBean("s");
	                            stu.Display();

	}

}
