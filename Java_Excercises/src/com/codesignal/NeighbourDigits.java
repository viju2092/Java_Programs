package com.codesignal;

import java.util.*;

public class NeighbourDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int rem=0,temp=0,a=0,b=0,k=0,p = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Program to Swap the Neighbouring Digits of a Number");
	System.out.println("Enter the Number");
	int num = sc.nextInt();
	ArrayList<Integer> revdigitnums = new ArrayList<Integer>();
	ArrayList<Integer> digitnums = new ArrayList<Integer>();
	ArrayList<Integer> swappednums = new ArrayList<Integer>();
	while(num>0)
	{
		rem = num % 10;
		revdigitnums.add(rem);
		num /= 10;
		/*
		if(num == 1)
		{
			revdigitnums.add(num);
		}
		*/
	}
	
	for(int i = revdigitnums.size()-1;i>=0;i--)
	{
		digitnums.add(revdigitnums.get(i));
	}
	
	System.out.println(digitnums);
	
	for(int j=0;j<=digitnums.size()-2;j+=2)
	{
		k=j+1;
		a= digitnums.get(j);
		b = digitnums.get(k);
		temp = digitnums.get(j);
		a = digitnums.get(k);
		b = temp;
		swappednums.add(a);
		swappednums.add(b);
	}
	System.out.println(swappednums);
	
	int[] newarr = new int[swappednums.size()];
	for(int h:swappednums)
	{
		newarr[p++] = h; 
	}
	
	for(Integer mynum:newarr)
	{
		System.out.print(mynum);
	}
	}
}
