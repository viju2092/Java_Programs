package org.gratis.ocap;

public interface Cricket {

	String cricket_tournament = "ODI";
	String ground_name = "MCG";
	
	public void teamName();
	default void teamCaptain() {
		System.out.println("Virat Kohli");
	}
}
