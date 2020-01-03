package com.whizlabs.p2;

import java.util.Arrays;

public class PracticeWhizz {

	public static void main(String args[]) {
		/*
	    int[] []bitts = new int[5][];
	    bitts[0] = new int[] {4,6};
		bitts[1] = new int[] {7-2,5-7,1+3};
		bitts[2] = new int[]{1,3};
	    bitts[4] = new int[] {3,2,1,11};
	    
	    
	    for(int[] a: bitts)
			for(int x:a)
				System.out.println(x + " ");
        */
		int[] data = {2,-1,4,5,3,9-11,10/5};
		int[] neg = new int[4];
		for(int v:neg)
			System.out.print(v + " ");
		
		System.out.println();
		
		int[][] negtwo = new int[4][3]; 
		negtwo[0][0] = 7;
		negtwo[0][1] = 9;
		negtwo[0][2] = 2;
		
		negtwo[1] = new int[] {8,9,1};
		negtwo[2] = new int[] {-2,-9};

		
		
		for(int[] l: negtwo)
			for(int n:l)
				System.out.print(n + " ");
		//Arrays.sort(data);
        //System.out.println(data.toString());
        //System.out.println(data);
		//for(int m:data)
			//System.out.print(Arrays.binarySearch(data, -1));
			
	}

}
