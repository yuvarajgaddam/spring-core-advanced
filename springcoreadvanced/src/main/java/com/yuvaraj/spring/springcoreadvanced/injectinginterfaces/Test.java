package com.yuvaraj.spring.springcoreadvanced.injectinginterfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/yuvaraj/spring/springcoreadvanced/injectinginterfaces/interfaceconfig.xml");

		OrderBO o=(OrderBO)ctx.getBean("bo");
		o.placeOrder();
	}

}
