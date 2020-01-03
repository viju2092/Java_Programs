package com.whizlabs.four;

import java.util.*;

public class Whizz_String {

	public static void main(String[] args) {

		double []dbls = {1.0f,2.1f,3.5f};
		dbls[1] = 10.5f;
		System.out.println(dbls[1] + dbls[2]);
		
		System.out.println();
		
		int []v = new int[5];
		v[2] = 7;
		System.out.println(v[1] + v[2]);
		Arrays.fill(v,1);
        for(int n:v)
        	System.out.print(n);
        
        String baskar[] = new String[4];
        System.out.println(baskar[2]);
        System.out.println();
        
        long index = 2;
        int [][]p = {{}, {1,2,3}, {3,5}};
        System.out.println(p[(int)index][1]);
		
	}

}
