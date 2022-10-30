package com.setter.primitivearray;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("springPA.xml");
		
		                Student stu=(Student) ap.getBean("s");
		                
		                System.out.println("Studenyt Id="+stu.getSid());
		                System.out.println("Student Name="+stu.getSname());
		                
		                String mono[]=stu.getMono();
		                
		                for(int i=0;i<mono.length;i++)
		                {
		                	System.out.println("Student Mobile No="+mono[i]);
		                }
		                   
		
	}

}
