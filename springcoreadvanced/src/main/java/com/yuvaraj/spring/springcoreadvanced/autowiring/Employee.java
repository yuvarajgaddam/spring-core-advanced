package com.yuvaraj.spring.springcoreadvanced.autowiring;

public class Employee {
	
	Employee(Address address){
		this.address=address;
	}

	private Address address;

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
