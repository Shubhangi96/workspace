package com.clients;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.classes.SpringHelloWorld;


public class HelloClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		SpringHelloWorld myBean=(SpringHelloWorld)context.getBean("HelloWorldBean");
		System.out.println(myBean.sayHello());
	}

}
