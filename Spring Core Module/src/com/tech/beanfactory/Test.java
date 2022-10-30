package com.tech.beanfactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	
	public static void main(String[] args) {
		
		Resource r=new ClassPathResource("spring.xml");
		
		BeanFactory b=new XmlBeanFactory(r);
		
		 Welcome wel=  (Welcome) b.getBean("w");
		        wel.hello();
		
		
		
		
		
	}

}
