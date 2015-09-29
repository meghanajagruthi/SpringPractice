package com.LifecycleCallBacks;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * This example demonstrates the functions that add logic while initializing a bean or destroying it
 *
 */
public class App 
{
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");
        context.registerShutdownHook();
		Triangle obj = (Triangle) context.getBean("triangle");
		obj.print();
	}
}

