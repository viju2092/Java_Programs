package com.whizlabs;

import java.util.Arrays;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String[][] strings = {{"A","Z"}, {"C","D","S"}, {"L"}};
	Arrays.sort(strings);
	for(String []str:strings) {
		for(String s:str) {
			System.out.print(s);
		}
	}
	
	int x = 2;
	for(x = 0; x<3;x++)
		System.out.print(x);

	
	}

}
