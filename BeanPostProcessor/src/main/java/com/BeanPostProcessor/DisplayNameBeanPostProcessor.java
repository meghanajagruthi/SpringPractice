package com.BeanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayNameBeanPostProcessor implements BeanPostProcessor{

	public Object postProcessAfterInitialization(Object bean, String arg1)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("After initialization of "+arg1 );
		return bean;
	}

	public Object postProcessBeforeInitialization(Object bean, String arg1)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Before initialization of "+arg1 );
		return bean;
	}

}
