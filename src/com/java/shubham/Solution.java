package com.java.shubham;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

	public static double calculateAverageAgeOfCustomersByList(List<Customer> customers) {
		return customers.stream().collect(Collectors.averagingInt(p -> p.getAge()));
	}

	public static void findCustomerByGivenCityByList(List<Customer> customers, String findCity) {
		String noCustomer = "No Such Customer Found";
		List<Customer> c = customers.stream().filter(customer -> {
			return customer.getCity().equals(findCity);
		}).collect(Collectors.toList());
		boolean ans = c.isEmpty();
		if (ans != true) {
			for (Customer s : c) {
				System.out.println(s.getCustomerId());
				System.out.println(s.getCustomerName());
				System.out.println(s.getAge());
				System.out.println(s.getCity());
			}
		} else
			System.out.println(noCustomer);
	}

	public static void main(String[] args) {

//		//input1
//		Customer c1 = new Customer(63, "Adam", 55, "Chicago");
//		Customer c2 = new Customer(54, "Brain", 50, "Dallas");
//		Customer c3 = new Customer(33, "Charles", 70, "Atlanta");
//		Customer c4 = new Customer(46, "David", 65, "Denver");
//
//		List<Customer> customers1 = Arrays.asList(c1, c2, c3, c4);
////		Customer [] customers11 = {c1, c2, c3, c4};
//		String city1 = "Atlanta";
//		
//		System.out.println(calculateAverageAgeOfCustomersByList(customers1));
//		findCustomerByGivenCityByList(customers1,city1);

		// input2
		Customer c11 = new Customer(63, "Adam", 55, "Chicago");
		Customer c22 = new Customer(54, "Brain", 50, "Dallas");
		Customer c33 = new Customer(33, "Charles", 70, "Atlanta");
		Customer c44 = new Customer(47, "Diana", 35, "Denver");

		List<Customer> customers2 = Arrays.asList(c11, c22, c33, c44);
//		Customer [] customers22 = {c11, c22, c33, c44}; 
		String city2 = "Raleigh";

		System.out.println(calculateAverageAgeOfCustomersByList(customers2));
		findCustomerByGivenCityByList(customers2, city2);

	}

}
