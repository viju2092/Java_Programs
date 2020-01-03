package com.whizlabs.p2;

public class WhizzStaticc {
	
	static {
		int x = -4;
		int z = 7;
		int c = x+z;
		System.out.println("This is Static Block 4 " + c);
	}
	
	
	static int x = 2;
	static int z;
	
	static {
		int x = 3;
		z = x;
		int y = x+z;
		System.out.println("This is Static Block 2 " + y);
	}

	
	public static void main(String[] args) {

		System.out.println(x);
		System.out.println(z);
		System.out.println(x+z);
	}

	static {
		//x = 4;
		//z = 7;
		System.out.println(x);
		System.out.println(z);
		int c = x+z;
		System.out.println("This is Static Block 1 " + c);
	}

	static {
		int x = 5;
		z = x;
		int c = x+z;
		System.out.println("This is Static Block 3 " + c);
	}
	
	
}
