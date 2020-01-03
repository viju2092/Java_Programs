package com.whizlabs.p2;

interface Inter {

	public default void print() {
		
		System.out.print("I");
	}
	
	static void method() {
			
		System.out.print("Static");
	}
}
