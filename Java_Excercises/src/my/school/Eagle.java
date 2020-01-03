package my.school;

import my.city.Bird;

public class Eagle extends Bird {

	public int fly(int h) {
		System.out.println("Bird is flying at " + h + " meters");
		return h;
	}
}
