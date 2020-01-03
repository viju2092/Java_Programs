package com.whizlabs.p2;

public class WhizzPrimitive {

	public static void main(String[] args) {

		Integer v = 70;
		Double db = 70.0;
		Integer n = 60;
		Integer m = 70;
		Long xx = 80L;
		
		int f = 4;
		int t = 70;
		double c = 2.0;
		long r = 4;
		long o = 70;
		double z = 4.0;
		double w = 70;
		long h = 80L;
		int l = 5;
		int y = 70;
		
		System.out.println(v.equals(db));            // false
		System.out.println(v.equals(n));             // false
		System.out.println(v.equals(m));             // true
		//System.out.println(v == db);      Compilation Error
		
		System.out.println();
		
		System.out.println(f == c);         // false
		System.out.println(f == r);        //  true
		System.out.println(f == z);        // true
		System.out.println(f == l);        // false
		System.out.println(f == h);        // false
		
		System.out.println();
		
		System.out.println(v == y);            // true
		System.out.println(v == w);            //  true
		System.out.println(v.equals(w));       // false
		System.out.println(v.equals(o));       // false 
		System.out.println(db == t);           // true
		System.out.println(db.equals(t));      // false
		System.out.println(xx.equals(h));      // true
		System.out.println(m.equals(c));       //false
		
	}

}
