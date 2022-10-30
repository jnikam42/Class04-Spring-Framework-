package com.lazyandEagerwithBeanFactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Test {

	public static void main(String[] args)
	{
		System.out.println("Main Start");
		
		//BeanFactory bean=new XmlBeanFactory(new ClassPathResource("spring.xml"));
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("spring.xml");
		System.out.println("..After Bean");
		
		 Welcome wel=(Welcome)ap.getBean("A");
		         wel.hello();

	}

}
