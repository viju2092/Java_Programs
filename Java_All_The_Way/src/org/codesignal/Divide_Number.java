package org.codesignal;

import java.util.*;

public class Divide_Number {

	public static void main(String[] args) {

	int temp=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("#*#*#*#*#*Program to Count the Divisors between Two Numbers*#*#*#*#*#");
	ArrayList<Integer> factors = new ArrayList<Integer>();
	System.out.println("Enter the value of K");
	int k = sc.nextInt();
    System.out.println("Enter the value of L"); 
    int l = sc.nextInt();
    System.out.println("Enter the value of R"); 
    int r = sc.nextInt();
    
    for(int m=l;m<=r;m++) {
    factors.clear();
	for(int i=1;i<=m/2;i++) {
		if(m % i == 0) {
			factors.add(i);
		}
	}	
	factors.add(m);
	if(factors.size() == k) {
		temp++;
		factors.clear();
		continue;
		
	}
    }
    
	System.out.println("The are " + temp + " numbers with " + k + " divisors");
		
	}

}
