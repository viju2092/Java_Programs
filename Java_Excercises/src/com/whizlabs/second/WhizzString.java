package com.whizlabs.second;

import java.util.ArrayList;

public class WhizzString {

	public static void main(String[] args) {

	//int myarray[5] = {1,2,3,4,5};
	
	char c[] = {'a','b','c'};
	String cd = "abcdef".substring(4);
	String s1 = new String(c);
	System.out.println(s1);
	s1 +=cd;
	System.out.print(s1);
	System.out.println(16 >>> 3);
	ArrayList<String> list = new ArrayList<>();
	list.add("dog");
	list.add("cat");
	list.add("frog");
	int i = 7;
	int j = 7;
	int k = 7;
	System.out.println(list.contains("cat"));
	System.out.println(list.indexOf("cat"));
	//while((i = 12)!= 5) {}
	//while(i) {}
    //while(i = 5) {}
	do
		System.out.print(i++ + " ");
	while(i<50);
	
	System.out.println();
	
	do
	{
	System.out.print(i++ + "");
	i++;
	i++;
	i++;
	}while(i<50);
	
	StringBuilder s = new StringBuilder("VijayJava");
	s.append(34.5);
	s.append(45677);
	
	
	}

}
