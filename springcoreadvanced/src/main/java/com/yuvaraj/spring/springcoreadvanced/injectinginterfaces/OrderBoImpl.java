package com.yuvaraj.spring.springcoreadvanced.injectinginterfaces;

public class OrderBoImpl implements OrderBO {

	private OrderDAO o;

	

	public OrderDAO getO() {
		return o;
	}



	public void setO(OrderDAO o) {
		this.o = o;
	}



	@Override
	public void placeOrder() {
		System.out.println("Inside order Bo");
		o.createOrder();

	}

}
