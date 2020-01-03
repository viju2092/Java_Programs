package org.codesignal;

import java.util.*;

public class Fibo {

	public static void main(String[] args) {

	Scanner inp = new Scanner(System.in);
	System.out.println("*^*^*^*^*^-----Program to print the Fibonacci Series for a Number-----^*^*^*^*^*");
	System.out.println("Enter the Number");
	int num = inp.nextInt();
	fibonacci(num);
	}
	
    public static int[] fibonacci(int n) {
    	
    int i=0,a=0,b=1,c=0,flag=0,val=0,q=0;
    ArrayList<Integer> fibonums = new ArrayList<Integer>();
    ArrayList<Integer> finalval = new ArrayList<Integer>();
    fibonums.add(b);
        
    while(c<n) {
     c=a+b;
     if(c>n) {
    	break;
     }
     fibonums.add(c);
     a=b;
     b=c;
    }

    System.out.println(fibonums);
    int j=fibonums.size()-1;
    finalval.add(fibonums.get(j));
    val = fibonums.get(fibonums.size()-1);
        
    for(int h=j;h>0;h--) {	   
     i=h-1;
     q = fibonums.get(i);
     flag = val + q;
     if(flag>n) {
    	continue;		
     }
     else {
    	finalval.add(q);
    	val=flag;
     }
    }
    	
//    	System.out.println(finalval);
    Collections.reverse(finalval);
    System.out.println(finalval);
    	
    int[] outarr = new int[finalval.size()];
    for(int m=0;m<finalval.size();m++) {
      outarr[m] = finalval.get(m);
    }
        
    return outarr;

    }
}
