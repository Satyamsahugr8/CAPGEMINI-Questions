package com.java.adapt;

import java.util.Arrays;
import java.util.List;


class Annotation {
	int a;
}

public class Main {
	
	public static void main(String[] args) {
		Annotation a = new Annotation();
		a.a = 3;
		Annotation b = new Annotation();
		b.a = 3;
		Annotation c = new Annotation();
		c.a = 3;
		List<Annotation> str = Arrays.asList(a,b,c);
		System.out.println(str);
		
	}

}
