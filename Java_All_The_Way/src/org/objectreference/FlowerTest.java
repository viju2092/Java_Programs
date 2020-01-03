package org.objectreference;

public class FlowerTest {

	public static void main(String[] args) {

		Flower f1 = new SunFlower();
		Flower f2 = new Lotus();
		Lotus l1 = new Rose();
		Rose r1 = (Rose) l1;
		r1.lotustree();
		
		Lotus l3 = new Lotus(); 
		SunFlower sf = (SunFlower) l3; 
		l3.lotustree();
		 
	}

}
