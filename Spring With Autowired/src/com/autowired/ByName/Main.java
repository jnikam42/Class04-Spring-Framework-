package com.autowired.ByName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
	
    ApplicationContext ap=new ClassPathXmlApplicationContext("springABN.xml"); 
                              
                     Student s=(Student)  ap.getBean("s");
                     
                     System.out.println("Student Rollno="+s.getRollno());
                     System.out.println("Student Name="+s.getSname());
                     System.out.println("Student Adderess:Areaname="+s.getAddrs()
                     .getAreaName()+", CityName= "+s.getAddrs().getCityName());
                     
       
    
	}

}
