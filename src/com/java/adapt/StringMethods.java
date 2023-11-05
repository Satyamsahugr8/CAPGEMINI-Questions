package com.java.adapt;

public class StringMethods {

	public int convertToInt(StringPlay sp, String str) {
		sp.convert = Integer.parseInt(str);
		return sp.convert;
	}

	public int getMax(StringPlay sp, String str, char ch) {
		int b = 0;
		for(int a = 0; a<str.length()-1; a++) {
			char c = str.charAt(a);
			if(c == ch) {
				b++;
			}
			
		}
//		System.out.println(b);
		sp.max = b;
		return sp.max;

	}

	public static void main(String[] args) {

		StringPlay sp = new StringPlay();
		StringMethods sm = new StringMethods();

		sm.convertToInt(sp, "122324");
		System.out.println(sp.convert);

		sm.getMax(sp, "this is love and love is fuck", 'i');
		System.out.println(sp.max);

	}
}
