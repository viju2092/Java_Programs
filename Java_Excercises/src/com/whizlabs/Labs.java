package com.whizlabs;

public class Labs {

	static int x = 1;
	public static void main(String[] args) {

		int[] nums = {0,1,2,3,4};
		for(int x:nums) {
			System.out.print(x);
			continue;
			//System.out.print(x + Labs.x);
		}
		System.out.println("This is so good");
	}

}
