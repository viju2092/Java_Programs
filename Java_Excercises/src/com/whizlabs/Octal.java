package com.whizlabs;

public class Octal {

	int x = 013;
	public static void main(String[] args) {

	Octal oc = new Octal();
	oc.goOctal(22);
	
	}

	void goOctal(final int i) {
		System.out.println(i/x);
	}
}
