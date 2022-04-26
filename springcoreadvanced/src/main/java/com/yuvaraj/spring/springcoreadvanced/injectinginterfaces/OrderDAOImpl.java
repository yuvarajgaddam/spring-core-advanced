package com.yuvaraj.spring.springcoreadvanced.injectinginterfaces;

public class OrderDAOImpl implements OrderDAO {

	@Override
	public void createOrder() {
		System.out.println("Inside OrderDAO");
	}

}
