package com.java.Aryan;

import java.util.ArrayList;
import java.util.Scanner;

public class Source {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[][] userDetails = new String[5][3];

		for (int x = 0; x < 5; x++) {
			for (int y = 0; y < 3; y++) {
				userDetails[x][y] = sc.next();
			}
		}

		ArrayList<Integer> arrlist = new ArrayList<>(5);

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 1; j++) {
				int k = Integer.parseInt(userDetails[i][j]);
				arrlist.add(k);
			}
		}
		arrlist.sort((i1, i2) -> -i2.compareTo(i1));

		for (int i = 0; i < 5; i++) {
			int current = arrlist.get(i);
			String s = String.valueOf(current);
			for (int k = 0; k < 5; k++) {
				if (s.equals(userDetails[k][0])) {
					for (int t = 0; t < 3; t++) {
						System.out.println(userDetails[k][t]);
					}
				}
			}
		}
	}
}
