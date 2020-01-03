package my.school;

import my.city.Bird;

public class Gosling extends Bird {
	
	public void activity() {
		Bird br = new Bird();
		Gosling gos = new Gosling();
	    gos.flyInAir();
	    //br.flyInAir();  // does not compile
		br.nameOfBird();
		System.out.println(text);
	}
}
