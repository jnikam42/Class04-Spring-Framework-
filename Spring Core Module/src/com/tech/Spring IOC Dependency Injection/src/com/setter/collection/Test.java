package com.setter.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("springC.xml");
		               MyClass m=(MyClass)ap.getBean("m");
		               
		               m.getMylist();
		               m.getMyset();
		               m.getMymap();
		             

	}

}
