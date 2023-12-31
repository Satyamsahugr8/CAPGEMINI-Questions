package com.java.collectionFrameworkQuestions;

import java.util.*;

// ?

class Employee {
	private String name;
	private String designation;
	private float salary;

	public Employee(String name, String designation, float salary) {
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
}

class Company {
	ArrayList el = new ArrayList<>();

	public ArrayList uniqueDesignation() {
		ArrayList d = new ArrayList<>();
		Iterator it = el.iterator();
		while (it.hasNext()) {
			Employee value = (Employee) it.next();
			if (!d.contains(value.getDesignation()))
				d.add(value.getDesignation());
		}
		Collections.sort(d);
		return d;
	}

	String updateSalart(String designation, float addSalary) {
		Iterator it = el.iterator();
		while (it.hasNext()) {
			Employee cr = (Employee) it.next();
			if (cr.getDesignation().equals(designation)) {
				cr.setSalary(cr.getSalary() + addSalary);
				return "Salary updated";
			}
		}
		return "no designation found";
	}
}

class Check {
	public static void main(String[] args) {
		Company obj = new Company();
		obj.el.add(new Employee("Steve", "Manager", 20000));
		obj.el.add(new Employee("bob", "Developer", 15000));
		obj.el.add(new Employee("alice", "Developer", 15000));
		System.out.println(obj.uniqueDesignation());
		System.out.println(obj.updateSalart("Developer", 500));
	}
}