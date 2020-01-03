package com.whizlabs.second;

public class WhizMainn {

	public static int getVal() {
		return 100;
	}
	
	public static void main(String[] args) {
	final int num = 10;
	final int num2 = 20;
	//final int data = 3;
	switch(num) {
	
	case 10*3: System.out.println(2);
	case num: System.out.println(3);
	case 10/3: System.out.println(4);
	case num2: System.out.println(5);
	case 2: System.out.println(5);
	
	break;
	default: System.out.println("default");
	
	}
	
	}

}
