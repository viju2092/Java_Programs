package my.school;

import my.city.Bird;

public class BirdWatcher extends Bird {

	public void watchBird() {
			
		BirdWatcher bw = new BirdWatcher();
        bw.flyInAir();
        System.out.println(bw.text);		
	}
	
}
