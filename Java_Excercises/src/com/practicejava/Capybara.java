package com.practicejava;

public class Capybara extends Mammal {

	public boolean hasFur()
	{
		return true;
	}
	
	public static void main(String[] args) {
	
		System.out.println(new Capybara().hasFur());
		//Mammal ma = new Capybara();
		//System.out.println(ma.hasFur());
		
	}

}
