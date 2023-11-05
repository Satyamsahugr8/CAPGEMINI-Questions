package com.java.paper;

import java.util.Scanner;

public class AvinashQues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int n = sc.nextInt();
		int sum = 0;
		sum = sum + a;
		for (int i=1;i<n;i++) {
			sum = sum + a;
			for(int j=1;j<i+1;j++) {
				sum = (int) (sum + a*Math.pow(10,j));
//				System.out.println(sum);
			}
		}
		System.out.println(sum);
		
		
	}

}
