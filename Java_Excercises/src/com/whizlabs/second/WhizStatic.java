package com.whizlabs.second;

public class WhizStatic {

	static int x;
	public static void main(String[] args) {

		WhizStatic w1 = new WhizStatic();
		WhizStatic w2 = new WhizStatic();
		WhizStatic w3 = new WhizStatic();
		w1.methodd();
		w2.methodd();
		w3.methodd();
	}
	
	public void methodd() {
		
		while(++x < 3) {
			System.out.print("A");
		}
	}

}
