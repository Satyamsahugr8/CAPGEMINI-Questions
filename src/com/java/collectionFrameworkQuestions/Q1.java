package com.java.collectionFrameworkQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Car {
	private String name;
	private String carName;
	private double price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Car(String name, String carName, double price) {
		super();
		this.name = name;
		this.carName = carName;
		this.price = price;
	}
}

class CarImplementation {
	double sumOfPrices(List carList) {
		List <Car> carList1 = new ArrayList();
		carList1.addAll(carList);
		Double priceSum = 0.0;
		for (Car carobject : carList1) {
			priceSum = priceSum + carobject.getPrice();
		}
		return priceSum;
	}

//	List getCarList(List carList) {
//		List<Car> carName = new ArrayList();
//		carName.addAll(carList);
//		List<Car> carNameout = new ArrayList();
//		for (Car carobject1 : carName) {
//			if (carobject1.getPrice() > 25000) {
//				carNameout.add(carobject1.getCarName());
//			}
//		}
//		Car carNameout;
//	}
//
//	double maxPrice(List carList) {
//		double maxPrice = 0.0;
//		List<Car> carList1 = new ArrayList();
//		carList1.addAll(carList);
//		List <Integer> carPrice = new ArrayList();
//		for (Integer carelement : carPrice) {
//			carPrice.add((int) ((Car) carList1).getPrice());
//		}
//		maxPrice = Collections.max(carPrice);
//		return maxPrice;
//	}
	
	double maxPrice(List carList) {
		double maxPrice = 0.0;
		List <Car> carList1 = new ArrayList();
		carList1.addAll(carList);
		List carPrice = new ArrayList();
			for (Car car : carList1) {
				carPrice.add(car.getPrice());
			}
		maxPrice = (double) Collections.max(carPrice);
			return maxPrice;
		}
	
	List getCarList(List carList) {
		List <Car> carList1 = new ArrayList();
		carList1.addAll(carList);
		List carName = new ArrayList();
			for (Car car : carList1) {
				if (car.getPrice() > 25000) {
					carName.add(car.getCarName());
				}
			}
			return carName;
		}
	
	
	
	
}


public class Q1 {

	public static void main(String[] args) {
		List <Car> carList = new ArrayList();
		carList.add(new Car("Allen", "Alfa Romeo", 890000));
		carList.add(new Car("Ben", "Bugatti", 24000));
		carList.add(new Car("Cynthia", "Chrysler", 560000));
		CarImplementation ci = new CarImplementation();
		System.out.println(ci.sumOfPrices(carList));
		System.out.println(ci.getCarList(carList));
		System.out.println(ci.maxPrice(carList));

	}

}
