package com.practicejava;

import java.util.*;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> bunnies = new ArrayList<>();
		bunnies.add("long ear");
		bunnies.add("floppy");
		bunnies.add("hoppy");
		
		System.out.println(bunnies);
		
		bunnies.removeIf(s -> s.charAt(0) != 'h');
		
		System.out.println(bunnies);
	}

}
