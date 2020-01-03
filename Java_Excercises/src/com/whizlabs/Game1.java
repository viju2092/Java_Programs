package com.whizlabs;

public class Game1 {

	public static void main(String[] args) {

		StringBuilder s = new StringBuilder("1Z0Vijju");
		String vs = new String("Datamodel");
		s.append("-808");
		System.out.print(s.length() + "");
		System.out.println(s.capacity());
		System.out.println(54);
		System.out.println();
		StringBuilder syd = new StringBuilder("Australia");
		StringBuilder syd1 = new StringBuilder("Australia");
		String aus = "Australia";
		String ind = new String(syd1);
		StringBuilder sb0 = new StringBuilder("SriLanka");
		String sb1 = "SriLanka";
		StringBuilder sb2 = new StringBuilder("SriLanka");
		String sb3 = sb1;
		String sb4 = "SriLanka";
		String sb5 = new String("South Africa");
		String sb6 = new String("South Africa");
		char c = 65;
		char v = 97;
		//byte b = 200;
		float f = 31.33f;
		//float vb = 45.33D;
		double dd = 665.34f;
		long n = 345;
		int d = (int) 031144L;
		int k = (short) 45;
		char m = 21;
		
	    //System.out.print(); Will not compile
		System.out.println(m);
		System.out.println(k);
		System.out.println(d);
		System.out.println(c + " " + v);
		//System.out.println(syd == aus);		
		System.out.println(syd.equals(aus));   // false
		System.out.println(aus.equals(syd));  // false
		System.out.println(syd.equals(syd1)); //false
		System.out.println(syd == syd1); // false
		
		System.out.println(syd.toString().equals(syd1.toString())); //true
		System.out.println(aus.equals(ind)); // true
		System.out.println(aus == ind); // false
		System.out.println(syd1.equals(ind)); //false
		System.out.println(sb0.equals(sb1)); // false
		System.out.println(sb0.equals(sb2)); // false
		System.out.println(sb1 == sb3); // true
		System.out.println(sb1.equals(sb3)); // true
		System.out.println(sb1.equals(sb4)); // true
		System.out.println(sb1 == sb4); // true
		System.out.println(sb5 == sb6);  //false
		System.out.println(sb5.equals(sb6)); // true

	}

}
