package com.java.paper;

import java.util.Scanner;

//class Beach {
//
//	private int beachId;
//	private String beachName;
//	private String location;
//	private String beachType;
//	private int rating;
//	private int avgVisitorPerDay;
//	public int getBeachId() {
//		return beachId;
//	}
//	public void setBeachId(int beachId) {
//		this.beachId = beachId;
//	}
//	public String getBeachName() {
//		return beachName;
//	}
//	public void setBeachName(String beachName) {
//		this.beachName = beachName;
//	}
//	public String getLocation() {
//		return location;
//	}
//	public void setLocation(String location) {
//		this.location = location;
//	}
//	public String getBeachType() {
//		return beachType;
//	}
//	public void setBeachType(String beachType) {
//		this.beachType = beachType;
//	}
//	public int getRating() {
//		return rating;
//	}
//	public void setRating(int rating) {
//		this.rating = rating;
//	}
//	public int getAvgVisitorPerDay() {
//		return avgVisitorPerDay;
//	}
//	public void setAvgVisitorPerDay(int avgVisitorPerDay) {
//		this.avgVisitorPerDay = avgVisitorPerDay;
//	}
//	
//	public Beach(int beachId, String beachName, String location, String beachType, int rating, int avgVisitorPerDay) {
//		super();
//		this.beachId = beachId;
//		this.beachName = beachName;
//		this.location = location;
//		this.beachType = beachType;
//		this.rating = rating;
//		this.avgVisitorPerDay = avgVisitorPerDay;
//	}
//	
//	
//	
//}

public class Myclass {


	public static void main(String[] args) 
    {
        int n, sum = 0;
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter any integer you want to check:");
        n = s.nextInt();
        for(int i = 1; i < n; i++)
        {
            if(n % i == 0)
            {
                sum = sum + i;
            }
        }
        if(sum == n)
        {
            System.out.println("Given number is Perfect");
        }
        else
        {
            System.out.println("Given number is not Perfect");
        }    
    }
    int divisor(int x)
    {
       return x;
    }
}
