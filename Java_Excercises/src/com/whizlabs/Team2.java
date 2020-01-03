package com.whizlabs;

public class Team2{

	String jerseyColor = "Blue";
	
	void playerListTeam2() {
		System.out.println("List of team2 players");
	}

	void team2JerseyColor() {
		System.out.println("The Color is " + jerseyColor);
	}
	
    public static void main(String args[]) {
    	
    	Team1 c = new Team1();
    	c.gameLocation();
    }
}
