package com.practicejava;

import java.util.Date;

public class Example5 {

	public static void main(String[] args) {

	Date d1 = new Date(99,11,31);
	Date d2 = new Date(99,11,31);
	method(d1,d2);
	System.out.println("d1 is " + d1 + "\nd2 is " + d2);
	}
	public static void method(Date d1, Date d2) 
	{
			d2.setYear(100);
			d1 = d2;
	}
}
