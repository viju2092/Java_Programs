package my.school;

public class Hippo_Potamas {

	public static void main(String[] args) {

		Potamas pt = new Potamas("Beagle");
		Potamas ps = new Potamas("Great","Poodle");
		System.out.println(pt.getName() + ":" + pt.getBreed() + ":"
				+ ps.getName() + ":" + ps.getBreed());
	}

}
