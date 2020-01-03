package com.whizlabs;

public class InfiniteLiteral {

	public static void main(String[] args) {

	Double d1 = 0.0/0.0;
	//System.out.println(Double.isNaN() + "");
	System.out.println(d1.isNaN());
	System.out.println(d1.isInfinite());
	}

}
