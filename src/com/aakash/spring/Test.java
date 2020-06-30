package com.aakash.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("springconfig.xml");
		Employee employee = (Employee)context.getBean("empBean");
		System.out.println(employee.toString());
	}

}
