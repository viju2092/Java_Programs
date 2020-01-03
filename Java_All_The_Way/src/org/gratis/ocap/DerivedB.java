package org.gratis.ocap;

public class DerivedB extends DerivedA {

	public void test() {
		System.out.println("DerivedB ");
	}
	
	public static void main(String[] args) {

	   Base b1 = new DerivedB();
	   Base b2 = new DerivedA();
	   Base b3 = new DerivedB();
	   b1 = (Base) b3;
	   DerivedA b4 = (DerivedB) b3;
	   b1.test();
	   b4.test();
	   
	}

}
