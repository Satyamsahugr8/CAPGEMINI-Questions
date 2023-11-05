package com.java.shubham;

public class Customer {
	
	private int customerId;
	private String customerName;
	private int age;
	private String city;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Customer(int customerId, String customerName, int age, String city) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.age = age;
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", age=" + age + ", city="
				+ city + "]";
	}
	
	

}
