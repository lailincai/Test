package com.atguigu.springboot.controller;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

/**
 * @author zhouwj@20190115
 */
//@Component
@Service
public class BeanContext implements ApplicationContextAware {

	private static ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		BeanContext.applicationContext = applicationContext;
	}

	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	@SuppressWarnings("unchecked")
	public static <T> T getBean(String name) throws BeansException {
		return (T) applicationContext.getBean(name);
	}

	public static <T> T getBean(Class<T> clz) throws BeansException {
		return (T) applicationContext.getBean(clz);
	}

	@SuppressWarnings("unchecked")
	public static <T> T getBeansOfType(Class<T> clz) throws BeansException {
		return (T) applicationContext.getBeansOfType(clz);
	}

	@SuppressWarnings("unchecked")
	public static <T> T getMyBean(String systemCode) throws BeansException {
		Object y =  applicationContext.getBean(systemCode + "Speak");
		System.out.println( y);
		System.out.println( y);
		return (T) applicationContext.getBean(systemCode + "Speak");
	}
}
