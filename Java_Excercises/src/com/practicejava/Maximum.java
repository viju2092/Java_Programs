package com.practicejava;

import java.util.Scanner;

public class Maximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	System.out.println("Program to Print the Largest Element from the Array");
    int arr[] = {43,41,25,11,17};
    int max = arr[0];
    
    System.out.print("The array elements are ");
    for(int p=0;p<arr.length;p++)
    {
    	System.out.print(arr[p] + " ");
    }
    
    System.out.println();
    for(int b=0;b<arr.length;b++)
    {
    	if(arr[b] > max)
    	{
    	  max = arr[b];	
    	}
    }
    System.out.println(max);
	}

}
