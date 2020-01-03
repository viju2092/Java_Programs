package my.school;

import my.city.Marsupial;

public class Kangaroo extends Marsupial {

	public boolean isBiped() {
		return true;
	}
	
	public void getKangarooDescription() {
		System.out.println("Kangaroo hops on two legs: " +isBiped());
	}
	
	public static void main(String[] args) {

	Kangaroo kan = new Kangaroo();
	kan.getMarsupialDescription();
	kan.getKangarooDescription();
		
	}

}
