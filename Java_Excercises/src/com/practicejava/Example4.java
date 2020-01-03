package com.practicejava;

public class Example4 {

	public static void main(String[] args) {

		int a = 10; 
        int b = 20; 
        int[][] arr = new int[4][];
  
        if (++a <= 10 && --b < 20) {}
        System.out.println("Output of && operator: " + "a = " + a + " b = " + b); 
        System.out.println("-------------"); 
  
        a = 10; 
        b = 20; 
        if (++a <= 10 & --b < 20) {}
        System.out.println("Output of & operator: " + "a = " + a + " b = " + b); 
    
	}

}
