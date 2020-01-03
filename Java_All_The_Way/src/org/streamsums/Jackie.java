package org.streamsums;

import java.util.Scanner;

public class Jackie {

	public static void main(String args[]) {
		
    String rev = "";
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String to reverse");
    String str = sc.nextLine();
    
    for(int n=str.length()-1;n>=0;n--) {
    	rev = rev + str.charAt(n);
    }
    
    System.out.println("Reversed String is " + rev);
    
	}
}
