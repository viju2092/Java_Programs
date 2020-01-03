package com.whizlabs;

class Team1 extends Cricket {

	String stadium = "SCG";
	void playerListTeam1() {
		System.out.println("List of team1 players");
	}
	
	protected void tournamentName() {
		System.out.println("The tournament is going to be ODI Series");
	}
	
	protected void gameLocation() {
		System.out.println("The game is played at Mumbai Wankade Stadium!!!!!");
	}
	
	
	public String gameLocation(String country) {
		System.out.println("The game is played in " + country);
		return stadium;
	}

	/*
	public static void main(String args[])
	{
		Cricket t1 = new Cricket();
		t1.gameLocation();
	}
	//void jerseyColor();
    */
}
