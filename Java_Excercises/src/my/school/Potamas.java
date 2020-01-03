package my.school;

public class Potamas extends Hippo {

	String breed;
	
	Potamas(String breed) {
		super("Shallow");
		this.breed = breed;
	}
	
	Potamas(String name, String breed) {
		super(name);
		this.breed = breed;
	}
	
	public String getBreed() {
	return breed;	
	}
}
