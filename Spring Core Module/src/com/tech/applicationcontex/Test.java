package com.tech.applicationcontex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) 
	{
		ApplicationContext ap=new ClassPathXmlApplicationContext("spring.xml");
		
		                Welcome wel =(Welcome)  ap.getBean("A");
		                        System.out.println("First Call.."+wel);
		                        
		                 Welcome wel1=(Welcome)ap.getBean("A"); 
		                 System.out.println("Second Call..."+wel1);
		
		                 Welcome wel2=(Welcome)ap.getBean("A"); 
		                 System.out.println("Third Call..."+wel2);
		
		
	}

}
