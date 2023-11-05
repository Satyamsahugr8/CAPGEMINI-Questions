package com.java.practiceTest;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class CompanyJobRepository {
	static String getJobPrediction(int age,String highestQualification) throws NotEligibleException{
		if(age>5){
			if(age>=19 && (highestQualification!="B.E" || highestQualification!="PhD" ||highestQualification!="PhD"))
			{
			 throw new NotEligibleException("We do not have any job that matches your qualifications");
			}
			else if(age>=21 && highestQualification=="B.E")
			{
			return "We have openings for junior developer";
			}
			else if(age>=26 && (highestQualification=="M.S" || highestQualification=="PhD"))
			{
			return "We have openings for senior developer";
			}
			else{
					return "Sorry we have no openings for now";
				}
	   }
	   else{
		throw new NotEligibleException("You are underage for any job");
	}

}
	}

	public class Q4 {
	public static void main(String args[] ) throws NotEligibleException {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
//		Scanner sc = new scanner(System.in);
//		int age = sc.nextInt();
//		String highestQualification = sc.nextLine();
//		searchForJob(age,highestQualification);

//		String searchForJob(int age,String highestQualification){
//			if(age>=200 || age<=0){
//				throw new NotEligibleException("The age entered is not typical for a human being");
//			}
//			else
//				return CompanyJobRepository.getJobPrediction(age,highestQualification);
//			
//		}

	}
}

class NotEligibleException extends Exception {
	String msg;

	public NotEligibleException(String msg) {
		super(msg);
	}
}