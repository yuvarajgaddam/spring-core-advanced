package com.yuvaraj.spring.springcoreadvanced.injectinginterfaces;

public class OrderDAOImpl2 implements OrderDAO {

	@Override
	public void createOrder() {
		System.out.println("inside OrderDAOImpl2 implementation");
	}

}
