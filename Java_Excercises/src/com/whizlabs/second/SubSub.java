package com.whizlabs.second;

public class SubSub extends Sup {

	SubSub() {
		s += "subsub";
	}
	public static void main(String[] args) {

		System.out.println(new SubSub().s);
	}

}
