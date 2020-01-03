package com.codesignal;

import java.util.Scanner;

public class DigitDegree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int rem = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Program to define Digit Degree");
	System.out.println("Enter the Integer");
	int value = sc.nextInt();
	while(value>0)
	{
		rem += value % 10;
		value /= 10;
		if(rem>=10)
		{
			value = rem;
		}
				
	}
	}

}
