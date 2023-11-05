package com.java.paper;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Datatype {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> data = new ArrayList<String>();
		data.add(0, "byte");
		data.add(1, "short");
		data.add(2, "int");
		data.add(3, "long");
		data.add(4, "BigInteger");
//		System.out.println(data);

		Scanner sc = new Scanner(System.in);

		try {
			int a = sc.nextInt();

//		checkdata(a);

			if (-128 <= a && a <= 127) {
				System.out.println(data.get(0));
			} else if (-32768 <= a && a <= 32767) {
				System.out.println(data.get(1));
			} else if (-32768 <= a && a <= 32767) {
				System.out.println(data.get(2));
			} else if (-2147483648 <= a && a <= 2147483647) {
				System.out.println(data.get(3));
			} else
				System.out.println(data.get(4));

		}  catch (InputMismatchException e) { System.out.println(data.get(4));
			  System.out.println("InputMismatchException"); }
			 

		catch (Exception e) {
			System.out.println(data.get(4));
			System.out.println("Exception");
			e.printStackTrace();
		}

	}

}
