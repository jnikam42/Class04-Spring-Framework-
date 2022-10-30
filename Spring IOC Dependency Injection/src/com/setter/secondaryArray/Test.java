package com.setter.secondaryArray;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ap=new ClassPathXmlApplicationContext("springSA.xml");
		               Student stu=(Student)ap.getBean("s");
		               
		          System.out.println("Student Id="+stu.getSid());
		          System.out.println("Student Name="+stu.getSname());
		          MoNo []s=stu.getMono();
		          System.out.println("Student Mobile Noumbers");
		          for(int i=0;i<s.length;i++)
		          {
		        	  System.out.println(s[i].getMobno());
		          }
		      

	}

}
