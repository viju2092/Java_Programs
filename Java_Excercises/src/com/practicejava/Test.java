package com.practicejava;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
	  int number = 1;
	  String letters = "abc";
	  number(number);
	  letters = letters(letters);
	  System.out.println(number + letters);
	}
	
	public static int number(int number)
	{
		number++;
        return number;
	}
	
	public static String letters(String letters)
	{
		letters +="d";
		return letters;
	}

}
