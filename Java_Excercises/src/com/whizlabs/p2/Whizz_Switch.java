package com.whizlabs.p2;

public class Whizz_Switch {

	public static void main(String[] args) {

       Integer i = 10;
       //Integer m = 4545;
       //Integer n = 443.33; Error
       //int b = 5.4;   Error
       //Double d = 10;   Error
       int ii = 10;
       Double d = 10.0;
       double dd = 10.0;
       
       String val1 = "Education";
       String val2 = "Education";
       StringBuilder val3 = new StringBuilder("Education");
       StringBuilder val4 = new StringBuilder("Magic");
       StringBuilder val5 = val3;
       StringBuilder val6 = new StringBuilder("Magic");
       
       String value1 = new String("Achieve");
       String value2 = new String("Achieve");
       String value4 = value1;
       String value3 = "Succeed";
       String value5 = "Motivate";
       String value6 = "Motivate";
       
       String value7 = new String("Aspire");
       StringBuilder value8 = new StringBuilder("Aspire");
       StringBuilder value9 = new StringBuilder("Aspire");
       StringBuilder value10 = new StringBuilder("Kites");
       
       System.out.print(i.equals(d) + " ");
       System.out.print(ii == dd);
       
       System.out.println();
       System.out.println(val1.equals(val2));   // true
       System.out.println(val1 == val2); // true
       
       System.out.println(val1.equals(val3));  // false
       //System.out.println(val1 == val3); Compilation Error
       
       System.out.println(val4.equals(val6));  // false
       System.out.println(val3 == val6);    // false
       
       System.out.println();
       System.out.println(value1.equals(value3));      // false
       System.out.println(value1 == value2);           // false
       System.out.println(value1 == value4);           // true
       System.out.println(value1 == value3);           // false
       System.out.println(value3 == value5);           // false
       System.out.println(value5 == value6);           // true
       System.out.println(value5.equals(value6));      // true
       System.out.println(value7.equals(value8));      //  false
       System.out.println(value8.equals(value9));      //  false
       System.out.println(value8.equals(value10));     // false
       System.out.println(val3.equals(val4));
	}

}
