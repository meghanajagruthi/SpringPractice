package com.SpringBeanFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-servlet.xml");
 
		HelloWorld obj = (HelloWorld) context.getBean("helloBean");
		obj.printHello();
	}
}
