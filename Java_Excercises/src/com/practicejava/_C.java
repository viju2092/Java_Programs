package com.practicejava;

import java.util.ArrayList;
import java.util.List;

public class _C {

	private static int $;
	public static void main(String[] main) {
		// TODO Auto-generated method stub
	
		boolean keepGoing = true;
		int result = 15, i = 10;
		do
		{
			i--;
			if(i==8)
				keepGoing = false; result -=2;
		} while(keepGoing);
		
		System.out.println(result);
		
		/*
		int x1 = 50, x2 = 75;
		boolean b = x1 >= x2;
		if(b = true) System.out.println("Success");
		else System.out.println("Failure");
		
		
        
	
		String s1 = "Java";
		String s2 = "Java";
		StringBuilder sb1 = new StringBuilder();
		sb1.append("Ja").append("va");
		
		System.out.println(s1 == s2);  // True
		System.out.println(s1.equals(s2)); // True
		System.out.println();
		System.out.println(sb1.toString());
		System.out.println();
		System.out.println(s1);
		System.out.println(sb1.toString() == s2); // False
		System.out.println(sb1.toString().equals(s1)); // True
			
	
		boolean keepGoing = true;
		int count = 0, x = 3;
		while(++count < 3)
		{
			int y = (1 + 2 * count) % 3;
			switch(y)
			{
            default:
			case 0: x -= 1; break;
			case 1: x+=5;

			}
		}
		System.out.println(x); 
		
		System.out.print("a");
		try {
			System.out.print("b");
			throw new IllegalArgumentException();
		}
		catch(RuntimeException e)
		{
			System.out.print("c");
		}
		finally
		{
			System.out.print("d");
		}
		
		System.out.print("e");   
		
		int[] array = {6,9,8};
		List<Integer> list = new ArrayList<>();
		list.add(array[0]);
		list.add(array[2]);
		list.set(1,array[1]);
		list.remove(0);
		System.out.println(list);
		*/
		
	}
}
