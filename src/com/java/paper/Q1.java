package com.java.paper;

import java.util.Scanner;

public class Q1 {
	
	static boolean checkPalin(String word)
	{
		int n = word.length();
		word = word.toLowerCase();
		for (int i=0; i<n; i++,n--)
		if (word.charAt(i) != word.charAt(n - 1))
			return false;	
		return true;
	}
	
	// Function to count palindrome words
	static int countPalindromes(String str , int in)
	{	
		// to check last word for palindrome
		str = str + " ";
		
		// to store each word
		String word = "";
		int count = 0;
		int ine = in;
		for (int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			
			// extracting each word
			if (ch != ' ')
				word = word + ch;
			else {
				if (checkPalin(word))
					count++;
				word = "";
			}
		}
		
		return count;
	}
			
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		String input1 = sc.nextLine();
		int input2 = sc.nextInt();
		
		System.out.println(
		countPalindromes(input1 , input2));
		
	}

	
}
