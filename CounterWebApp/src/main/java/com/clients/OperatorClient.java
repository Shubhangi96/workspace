package com.clients;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.classes.SpringHelloWorld;
import com.interfaces.OperatorI;


public class OperatorClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("beans2.xml");
		OperatorI myBean=(OperatorI)context.getBean("operateId");// gets same object ->singleton class pattern by default.
		System.out.println(myBean.operate(12,13));
		System.out.println(myBean.hashCode());
		
		OperatorI myBean1=(OperatorI)context.getBean("operateId");
		System.out.println(myBean1.operate(12,13));
		System.out.println(myBean1.hashCode());
	}

}
