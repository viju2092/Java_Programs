package com.codesignal;

import java.util.ArrayList;
import java.util.Scanner;

public class ReduceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int temp=0;
	Scanner inp = new Scanner(System.in);
	System.out.println("Program to Reduce a given String");
	System.out.println("Enter the String");
	String str = inp.next();
	ArrayList<Character> convstr = new ArrayList<Character>();
	char[] strchar = str.toCharArray();
	for(char val:strchar)
	{
        convstr.add(val);
	}
		
	System.out.println(convstr);
	
	temp = convstr.size()-1;
	for(int i=0;i<convstr.size();)
	{
		if(convstr.size() == 1)
		{
			System.out.println(convstr);
			break;
		}
		if(convstr.get(i) == convstr.get(temp))
		{
			convstr.remove(temp);
			convstr.remove(i);
			i=0;
			temp-=2;
		}
		if(convstr.get(i) != convstr.get(temp))
		{
			System.out.println(convstr);
			break;
		}
	}
	
	String result = "";
	for(char c: convstr)
	{
		result +=c;
	}

	System.out.println(result.toString());
	
/*	
	String newstr[] = new String[convstr.size()];
	Object[] objarr = convstr.toArray();
	int h=0;
	for(Object obj:objarr)
	{
		newstr[h++] = (String)obj;
	}
	
	System.out.println(newstr.toString());
	*/
	}

}


/*
 * String reduceString(String inputString) {

    int temp=0;
    ArrayList<Character> convstr = new ArrayList<Character>();
	char[] strchar = inputString.toCharArray();
	for(char val:strchar)
	{
        convstr.add(val);
	}
    
    boolean ans = convstr.isEmpty();
    temp = convstr.size()-1;
    for(int i=0;i<convstr.size();)
	{
		if(convstr.size() == 1)
		{
			//System.out.println(convstr);
            convstr.clear();
			break;
		}
        
		if(convstr.get(i) == convstr.get(temp))
		{
			convstr.remove(temp);
			convstr.remove(i);
			i=0;
			temp-=2;
		}
        if(convstr.get(i) != convstr.get(temp))
		{
			System.out.println(convstr);
			break;
		}
	}
    
    if(convstr.isEmpty())
    {
        return "";
    }

    String result = "";
	for(char c: convstr)
	{
		result +=c;

	}
    
    return result.toString();
    

}

 */

