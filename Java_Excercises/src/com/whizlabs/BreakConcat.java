package com.whizlabs;

public class BreakConcat {

    static String o = "";
	public static void main(String[] args) {

		z: for(int x=3;x<8;x++) {
			
			if (x == 4)
				continue;
			if(x == 4)
				break z;
			    o += x;
		}

	System.out.println(o);
	}

}
