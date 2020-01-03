package com.whizlabs;

public class WhizWhile {

	public static void main(String[] args) {

	int x = 0;
	String []animal = new String[3];
	
	do {
		animal[x] = "Cat";
		x++;
		
	}while(false);
	
	do {
		animal[x] = "Dog";
	
	} while(x>animal[x++].length());
	
	do {
		animal[x] = "Rat";
	
	} while(x>3);
	
	for(String s:animal) {
		System.out.print(s+"");
	}
	
	
	}

}
