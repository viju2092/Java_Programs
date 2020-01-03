package com.whizlabs;

public class WhizTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int data[][] = {{1,3,5},{7,8}};
	out: for(int []a : data) {
		for(int i:a) {
		if(i == 7)
			continue;
		System.out.print(i+"");
		if(i==3)
			break;
		}
	}
		
	}

}
