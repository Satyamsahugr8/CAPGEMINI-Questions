package com.java.DoSelect;

import java.util.Scanner;

// AB3C12092022 = "AB3CDDMMYYYY"

public class StringMirror {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		StringMirror a = new StringMirror();
		a.getImage(input);
//		getImage(input);
	}

	private void getImage(String input) {
		StringBuffer sb = new StringBuffer();
		sb.append(input);
		System.out.println(input + "|" + sb.reverse());
	}
}