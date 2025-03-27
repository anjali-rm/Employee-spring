package com.as;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainEmployee {
	public static void main(String[] args) {
		ApplicationContext context= new AnnotationConfigApplicationContext("com.as");
		Employee employee=(Employee)context.getBean("myemp");
		System.out.println(employee);
	
	}
}
