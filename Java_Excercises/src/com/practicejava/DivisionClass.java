package com.practicejava;

public class DivisionClass {


	static public void divide(int a, int b) {
	try {
		int c = a/b;
	}
	catch(Exception e) {
		e.printStackTrace();
		System.out.print("Exception ");
	}
	finally {
		System.out.println("Finally");
	}
	
	}
	
	public static void main(String[] args) {
	divide(4,0);
	}

}
