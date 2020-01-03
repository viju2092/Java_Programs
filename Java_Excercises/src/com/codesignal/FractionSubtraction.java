package com.codesignal;

import java.util.Scanner;

public class FractionSubtraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	System.out.println("*#*#*#*#*#--------- Program to Implement Reduced Fraction Subtraction ----------*#*#*#*#*#");
	System.out.println("Enter the size of Array A");
	int size1 = sc.nextInt();
	System.out.println("Enter the size of Array B");
	int size2 = sc.nextInt();
	System.out.println("Enter the Array A Elements");
	int array1[] = new int[size1];
	for(int i=0;i<array1.length;i++)
	{
		array1[i] = sc.nextInt();
	}
	
	System.out.println("Enter the Array B Elements");
	int array2[] = new int[size2];
	for(int j=0;j<array2.length;j++)
	{
		array2[j] = sc.nextInt();
	}
	
	reducedfractionsub(array1,array2);
	}
	
	public static int[] reducedfractionsub(int arr1[],int arr2[])
	{
	int temp=0,temp1=0,temp2=0,temp3=0;
	int arr3[] = new int[2];
    if(arr1[1] != arr2[1])
    {
    	if(arr2[1] % arr1[1] == 0)
    	{
    		arr3[1] = arr2[1];
    		temp=arr3[1]/arr1[1];
    		temp1=temp*arr1[0];
    		temp2=arr3[1]/arr2[1];
    		temp3=temp2*arr2[0];
    		arr3[0]=temp1-temp3;
    		
    	}
    	if((arr2[1] % arr1[1] != 0) & (arr1[1] % arr2[1] != 0))
    	{
    		arr3[1] = arr2[1] * arr1[1];
    	    temp = arr3[1]/arr1[1];
    	    temp1 = temp*arr1[0];
    	    temp2 = arr3[1]/arr2[1];
    	    temp3 = temp2*arr2[0];
    	    arr3[0] = temp1-temp3;
    	    
    	}
    	if(arr1[1] % arr2[1] == 0)
    	{
    		arr3[1] = arr1[1];
    		temp=arr3[1]/arr1[1];
    		temp1=temp*arr1[0];
    		temp2=arr3[1]/arr2[1];
    		temp3=temp2*arr2[0];
    		arr3[0]=temp1-temp3;
    	}
    	
    }
    else
    {
    	arr3[0] = arr1[0] - arr2[0];
    	arr3[1] = arr2[1];
    }
	
    return arr3;
	}
}
