package com.codesignal;

import java.util.ArrayList;
import java.util.Scanner;

public class Josephus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int s=0,v=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Program to solve Josephus Problem");
	System.out.println("Enter the value of n");
	int n = sc.nextInt();
	System.out.println("Enter the value of k");
	int k = sc.nextInt();
	ArrayList<Integer> circleval = new ArrayList<Integer>();
	
	for(int i=1;i<=n;i++)
	{
		circleval.add(i);
	}
	
	System.out.println(circleval);
	
	for(int j=0;j<circleval.size();j++)
	{
	 if(s==circleval.size()-1)
	 {
		 j=0;
		 v=0;
		 circleval.remove(v);
		 s=0;
	 }
	 else
	 {
	 v=s+1;
	 circleval.remove(v);
	 s++;
	 }
	 
/*	 if(s==circleval.size()-1)
	 {
		 j=0;
		 circleval.remove(j);
		 break;
	 } */
	}
	
	System.out.println(circleval);
	
	}

}
