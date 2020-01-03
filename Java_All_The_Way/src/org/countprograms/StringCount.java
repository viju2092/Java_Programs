package org.countprograms;
import java.util.Scanner;

public class StringCount {

	public static void main(String[] args) {

		int count = 0;
		Scanner sc = new Scanner(System.in);
    	count = summ(-5);
    	System.out.println("The sum till x is " + count);
	}
	
	public static int summ(int x) {
		
		int tot = 0;
		for(int b = 1;b<=x;b++) {
			tot += b;
		}
		return tot;
		
		
	}

}
