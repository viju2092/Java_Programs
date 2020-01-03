package org.objectreference;

public class Magicmania {

	public static void main(String[] args) {

		Magic m = new Magic("f");
		// changeReference(m);
		modifyReference(m);
	}

	
	  public static void changeReference(Magic a) { 
      Magic b = new Magic("b"); 
      a = b; 
      }
	 

	public static void modifyReference(Magic c) {
		c.setAttribute("c");
	}
}
