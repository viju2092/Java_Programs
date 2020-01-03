package com.codesignal;

import java.util.Scanner;

public class SwapEnough {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	System.out.println("Is One Swap Enough to Achieve Palindrome");
	System.out.println("Enter the String");
	String data = sc.next();
	//char[] datachars = data.toCharArray();
	isOneSwapEnough(data);
	}
	
	public static boolean isOneSwapEnough(String datavar)
	{
		char temp;
		char[] datavarchars = datavar.toCharArray();
		String rev = "";
		int len = datavar.length();

	    for(int k =len-1;k>=0;k--)
	    { 
	      rev = rev + datavar.charAt(k);
	    }
	 
	    if(datavar.equals(rev))
	    {
	       return true; 
	    	//System.out.println("True");
	    	
	    }
	    else
	    {
	    	for(int i=0;i<datavarchars.length;)
	    	{
	    		for(int j=1;j<datavarchars.length;)
	    		{
	    		temp = datavarchars[i];
	    		datavarchars[i] = datavarchars[j];
	    		datavarchars[j] = temp;
	    		
		        String modifiedString = new String(datavarchars);
	    	    if(modifiedString.equals(rev))
	    	    {
                    return true;
	    	    	
	    	    }
	    	    j++;
	    		}
	    	 i++;   
	    	}
	    }
	return false;	
	}


}
