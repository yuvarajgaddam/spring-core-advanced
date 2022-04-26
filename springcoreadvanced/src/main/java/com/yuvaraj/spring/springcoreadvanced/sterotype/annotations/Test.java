package com.yuvaraj.spring.springcoreadvanced.sterotype.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/yuvaraj/spring/springcoreadvanced/sterotype/annotations/stereoconfig.xml");
		Instructor i=(Instructor) ctx.getBean("inst");
		System.out.println(i);
		
		Instructor i2=(Instructor) ctx.getBean("inst");
		System.out.println(i2);
	
	}

}
