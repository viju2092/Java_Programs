package com.practicejava;

public class Example3 {

	public static void main(String[] args) {

	String s1 = new String("Hello");
	String s2 = s1;
	
	if(s1 == s2) {
		System.out.println("==");
	}
	if (s1.equals(s2)) {
		System.out.println("equals");
	}
	
	String ta = "A ";
	ta = ta.concat("B ");
	String tb = "C ";
	ta = ta.concat(tb);
	ta.replace('C', 'D');
	ta = ta.concat(tb);
	System.out.println(ta);
	
	if(2 == 3)
		System.out.println("Hi 2 is equal to 3 in this case");
}
}
