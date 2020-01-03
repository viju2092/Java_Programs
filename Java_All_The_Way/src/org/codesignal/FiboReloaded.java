package org.codesignal;

import java.util.Scanner;

public class FiboReloaded {

	public static void main(String[] args) {

	Scanner inp = new Scanner(System.in);
	System.out.println("*^*^*^*^*^-----Program to print the Fibonacci Series for a Number-----^*^*^*^*^*");
	System.out.println("Enter the Number");
	int num = inp.nextInt();
	fibon(num);
	}

	public static int[] fibon(int n) {
	    int f[] = new int[20];
	    for(int i = 0; i < 20; i++){
	        if(i < 2) f[i] = i;
	        else f[i] = f[i - 1] + f[i - 2];
	    }
	    int r[] = new int[20];
	    int cnt = 0;
	    for(int i = 19; i > 0; i--){
	        if(f[i] <= n){
	            r[cnt++] = f[i];
	            n -= f[i];
	        }
	    }
	    int res[] = new int[cnt];
	    for(int i = 0; i < cnt; i++){
	        res[i] = r[cnt - 1 - i];
	    }
	    return res;
	}
}
