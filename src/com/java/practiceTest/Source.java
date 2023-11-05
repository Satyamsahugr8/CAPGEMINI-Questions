package com.java.practiceTest;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.Collectors;

class Candidated{
  //Write Your Code Here..

  private String name; 
  private int id; 
  private int age; 
  private String gender; 
  private String department; 
  private int yearOfJoining; 
  private double salary;

  public Candidated(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	} 

  public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getYearOfJoining() {
		return yearOfJoining;
	}
	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

     @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
                + department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
    }
}

//class Implementations{
//  //Write Your Code Here..
//	public static Map<String,Long> getCount(List<Candidate> list){
//		Map<String,Long> map;
//		return list.stream().map(a->a.getGender()).collect(Collectors.toMap(null, null)),list.stream().map(a->a.getGender()).count()); 
//	    map.put(maleFemale,personCount);
//	   return map;
//	   return list.stream().collect(Collectors.toMap(Candidate::getIsbn, Candidate::get));
//
//  }
//  
//	public static Map<String,Long> getAverageAge(List<Candidate> list){
//
//  }
//  
//	public static Map<String,Long> countCandidatesDepartmentWise(List<Candidate> list){
//
//  }
//  
//	public static Optional<Candidate> getYoungestCandidateDetails(List<Candidate> list){
//
//  }
//
//}

public class Source {
	public static void main(String args[] ) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
		List<Candidate> list = new ArrayList<>();
//  list.add(new Candidate(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
//  list.add(new Candidate(144, "Scarlet Jhonson", 28, "Male", "Product Development", 2014, 32500.0));
	}
}
