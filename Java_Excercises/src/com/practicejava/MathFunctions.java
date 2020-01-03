package com.practicejava;

public class MathFunctions {

	public static void addToInt(int x, int amountToAdd)
	{
		x = x + amountToAdd;
		//System.out.println(x);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 15, b = 10;
		MathFunctions.addToInt(a,b);
		System.out.println(a);
	}

}
