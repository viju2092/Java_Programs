package com.whizlabs;

public class Program3 {

	static Integer I;
	public static void main(String[] args) {

	String s;
	try {
		s = I.toString();
	}
	finally {
		try {
			int i= Integer.parseInt(args[0]);
		}
		catch(NumberFormatException E) {
			System.out.println("NumberFormat");
		}
		finally {
			System.out.println("Fin2");
		}
		
		System.out.println("Fin1 ");

	}
	
	
	
	}

}
