package com.whizlabs.p2;

public class WhizzExample {

	public static void main(String[] args) {

	/*
       int array[][] = {{3,2,1},{5,4,2},{0,8,7}};
       
       outer: for(int x=0,k=0;x<3;x++) {
    	   System.out.println();
    	   k=0;
    	   inner: while(true) {
    		   System.out.print(array[x][k++] + " ");
                 if(k==3)
                	 //continue outer;
                     break inner;
    	   }
       }
      
	
		int x = 1;
		int y = 10;
		if(3 == y) {
			System.out.println(y);
		} else {
			System.out.println(x);
		}
		*/
		
		final int y = 2;
		final int x = -1;
		
		switch(y) {
		
		case -1 : { System.out.print("A"); 
		switch(x+y) {
		
		case 18: System.out.print("B");
		case -1: System.out.print("V");
		case y: System.out.print("C");  break;
		case -3: System.out.print("D");
		case 0: System.out.print("E");
		
		}
		}
		case 12: System.out.print("B");
		default: System.out.print("default"); break;
		case y: { System.out.print("C");
        switch(x+y) {
		
		case 1: System.out.print("B");
		case -1: System.out.print("V");
		case y: System.out.print("C");
		case -3: System.out.print("D");
		case 0: System.out.print("E"); break;
		default: System.out.print("N");
		
		}
		}
		case -3: System.out.print("D");
		case 5: System.out.print("F");
		case 6: System.out.print("Q");
		case -x: System.out.print("8");break;
		case -5: System.out.print("F");
		}
		
	}

}
