package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ApplicationContext("applicationContext.xml");
		Employee e=(Employee)context.getBean("emp");
		e.display();

	}

}
