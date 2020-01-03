package com.practicejava;

public class Deer {

	public Deer() {
		System.out.print("Deer");
	}
	
	public Deer(int age) {
		System.out.print("DeerAge");
	}
	
	private boolean hasHorns() {
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deer deer = new Reindeer(5);
		System.out.println(","+deer.hasHorns());
	}

}
