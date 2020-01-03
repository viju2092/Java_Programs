package com.whizlabs;

public class WhizException {

	public static void main(String[] args) {
		
		print();
	}
	
	static void print() {
		
		try {
		   throw new NullPointerException();	
		}
		catch(ClassCastException e) {
			System.out.print("Class Cast");
		}
		finally {
			System.out.println("Final");
		}
		
		System.out.print("OCAJP");
	}

}
