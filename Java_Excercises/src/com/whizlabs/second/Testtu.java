package com.whizlabs.second;

public class Testtu {
	
	public static void main(String args[]) {
	StringBuilder s = new StringBuilder(10 + 2 + "ABC" + 4 + 5); 
    StringBuilder g = s.delete(3, 6);
	System.out.println(g);
    s.append(g); 
    System.out.println(s);
    System.out.println();
    
    StringBuilder sb1 = new StringBuilder("123456");
    sb1.subSequence(2, 4);
    sb1.deleteCharAt(3);
    sb1.reverse();
    System.out.println(sb1);
    
    }
} 


