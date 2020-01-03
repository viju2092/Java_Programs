package com.whizlabs.four;

public class TinTin {
	
	public static void main(String args[]) {
	
		StringBuilder sb = new StringBuilder("Java");
		sb.insert(0, "The latest").append("version is").append(" 1.7")
		.delete(27, 28).append("8").substring(4);
		
		System.out.println(sb);
		
		int y = -10;
		int x = y++ + --y + y++ + --y;
		System.out.println("x = " + x + " and y = " + y);
		
		int v = -8;
		int c = 3;
		System.out.println(v/c);
	}
		
}
