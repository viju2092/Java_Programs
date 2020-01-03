package org.codesignal;

import java.util.*;

public class Threshold {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("Time Taken to surpass the threshold amount");
	System.out.println("Enter the amount to deposit");
	int dep = sc.nextInt();
	System.out.println("Enter the rate of interest");
	int rate = sc.nextInt();
	System.out.println("Enter the threshold value");
	int thd = sc.nextInt();
	double r=0,temp = 0;
	int count = 0;
	r = rate * 0.01;
	
	while(dep<thd) 
	{
		temp = dep * r;
		dep += temp;
		count++;
	}
	
	System.out.println("The time taken to pass the threshold amount is " + count);
	
	}

}
