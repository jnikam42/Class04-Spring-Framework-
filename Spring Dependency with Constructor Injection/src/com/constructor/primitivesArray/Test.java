
package com.constructor.primitivesArray;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("springCPA.xml");
		               Student s=(Student)ap.getBean("s");
		               
		               System.out.println(s);//get the mobile numbers one by one
		
	}

}
