package com.whizlabs;

import my.city.WhizzClassy;

public class Whiz extends WhizzClassy {

	public static void main(String[] args) {

		int a[] = {1,2,053,4};
		int [][]b = {{1,2,4},{2,2,1},{0,43,2}};
		char ch = 0052;
		char v = '\u0071';
		System.out.print(a[3] == b[0][2]);
		System.out.println(" " + (a[2] == b[2][1]));
		System.out.println(ch);
		System.out.println(v);
		
		WhizzClassy wc = new WhizzClassy();
		wc.classyfunc("vijay");
		
	}

}
