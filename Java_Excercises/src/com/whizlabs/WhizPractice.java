package com.whizlabs;

public class WhizPractice {

	static int x = 10;
	public static void main(String[] args) {

		WhizPractice z = new WhizPractice();
	    //z.x = 5;
	    int y = x/z.x;
	    System.out.println(x);
	    System.out.println(z.x);
	    System.out.println(WhizPractice.x);	    
	    System.out.println("y = " + y);
	}

}
