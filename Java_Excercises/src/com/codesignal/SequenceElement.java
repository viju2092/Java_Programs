package com.codesignal;

import java.util.ArrayList;
import java.util.Scanner;

public class SequenceElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int n=0,value=0,index=0,sum=0,temp=0;
	ArrayList<Integer> dataelem = new ArrayList<Integer>();
	Scanner sc = new Scanner(System.in);
	System.out.println("Program to find an Element from the Sequence");
	System.out.println("Enter the size of Array");
	int d = sc.nextInt();
	int data[] = new int[d];
	System.out.println("Enter the Array Elements");
	for(int h=0;h<data.length;h++)
	{
		data[h] = sc.nextInt();
	}
	
	System.out.println("Enter the value of n");
	n = sc.nextInt();
	for(int i=0;i<data.length;i++)
	{
		dataelem.add(data[i]);
	}
		
	if(dataelem.size() > n)
	{
		value = dataelem.get(n);
		System.out.println("The " + n + "th element from the Array is " +value);
	}
	else
	{
	int n1 = n+1;
	while(n1>=1)
	{
	for(int j=index;j<dataelem.size();j++)
	{
		sum += dataelem.get(j);
	}
	
	temp = sum % 10;
	dataelem.add(temp);
	index++;
	n1--;
	sum=0;
	}
	
	value = dataelem.get(n);
	System.out.println("The " + n + "th element from the Array is " +value);

	}
	
	}
}
