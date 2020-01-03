package com.practicejava;

import java.util.ArrayList;
import java.util.List;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	StringBuilder s1 = new StringBuilder("Java");
	String s2 = "Love";
	s1.append(s2);
	
	System.out.println(s1);
	s1.substring(4);	
	System.out.println(s1);
	int foundAt = s1.indexOf(s2);
	System.out.println(foundAt);
	
	
	String s = "Hello";
	//String t = "Hello";
	String t = new String(s);
	//StringBuilder v1 = new StringBuilder("Hello");
	if ("Hello".equals(s)) System.out.println("one");
	if (t == s) System.out.println("two");
	if (t.equals(s)) System.out.println("three");
	if ("Hello" == s) System.out.println("four");
	if ("Hello" == t) System.out.println("five");

	
	String numbers = "012345678";
	System.out.println(numbers.substring(1, 3));
	System.out.println(numbers.substring(7, 7));
	System.out.println(numbers.substring(7));
	
	String a = "";
	a += 2;
	a +='c';
	a += false;
	System.out.println(a);
	if ( a == "2cfalse") System.out.println("==");
	if ( a.equals("2cfalse")) System.out.println("equals");

/*    int total = 0;
	StringBuilder letters = new StringBuilder("abcdefg");
	total += letters.substring(1, 2).length();
	total += letters.substring(6, 6).length();
	total += letters.substring(6, 5).length();
	System.out.println(total); */

	int f = 0;
	char[]c =  new char[2];
	int length = c.length;
	ArrayList<Integer> data = new ArrayList<Integer>();
	ArrayList<Integer> value = new ArrayList<Integer>(data);
	ArrayList<Integer> newlist = new ArrayList<Integer>(data);
	//ArrayList<String> datval = new ArrayList<>();
	System.out.println(newlist);
	
	data.add(3);
	data.add(4);
	data.add(-3);
	data.add(null);
	
	value.add(3);
	value.add(4);
	value.add(-3);
	value.clear();
	System.out.println(data);
	System.out.println(value);
	//value.remove(0);
	System.out.println(newlist);
    if(data == value) System.out.println("Wow that's amazing");
    System.out.println("Not quite impressive");
	
	f = "vijay".length();
	System.out.println(f);
	
    StringBuilder b = new StringBuilder("rumble");
	b.append("4").deleteCharAt(3).delete(3, b.length() - 1);
	System.out.println(b);
	
	int array1[] = {4,5,6,2,3,-1};
	int array2[] = {4,5,6,2,3,-1};
	System.out.println(array1 == array2);
	
	Integer i = new Integer(50);
	int n = i;
	System.out.println(i == n);
	}
}
