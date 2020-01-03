package com.codesignal;

import java.util.Scanner;

public class HerbGarden {

	public static void main(String args[])
	{
	int temp = 0, flag = 1;
	Scanner sc = new Scanner(System.in);
	System.out.println("*#*#*#*#*#---------- Program to plant a Herb Garden ----------#*#*#*#*#*");
	System.out.println("Enter the size of the Array");
	int size = sc.nextInt();
	System.out.println("Enter the number of days");
	int days = sc.nextInt();
	int plants[] = new int[size];
	System.out.println("Enter the Array Elements");
	
	for(int i=0;i<plants.length;i++)
	{
	plants[i] = sc.nextInt();
	}

	int max = 0;

	while (flag<=days)
	{
	for(int j=0;j<plants.length;j++)
	{
	if(max<plants[j])
	{
	max = plants[j];
	temp += max/2;	
	plants[j] = max - temp;
	break;
	}
	}
    for(int k=0;k<plants.length;k++)
    {
    plants[k] += 2;
	}
	flag++;
	}
	
	System.out.println("The maximum number of leaves that can be harvested in " +days+ " days is " + temp);
	
	}
	
	
}
