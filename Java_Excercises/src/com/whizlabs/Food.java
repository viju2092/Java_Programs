package com.whizlabs;

public class Food implements Cookable {

	/*
	Cookable c = new Cookable() {
	
	public void cook() {
		System.out.println("Food is being Cooked!!!!!!");
	}
	};
	*/
	public void cook() {
		System.out.println("Food is being Cooked!!!!!!");
	}
	
	public static void main(String args[]) {
		
		Food f = new Food();
		f.cook();
	}
}
