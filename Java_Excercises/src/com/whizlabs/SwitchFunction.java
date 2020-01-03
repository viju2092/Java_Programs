package com.whizlabs;

public class SwitchFunction {

	public static void main(String[] args) {

		final int x = 4;
		final int y = 2;
		
		switch('v') {
		
		case x : { System.out.print("A"); }
		case 1 : System.out.print("B");
		default : System.out.print("default"); break;
		case 'v' : {System.out.print("Bingo");} 
		case y: System.out.print("C");
		}
	}

}
