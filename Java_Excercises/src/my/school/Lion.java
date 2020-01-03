package my.school;

import my.city.Animal;

public class Lion extends Animal {

	public Lion() {
		this(7);
		System.out.println("This is Lion() Default Constructor");		
		
	}
	
	public Lion(int age) {
		super(age);
		System.out.println("The age of the Lion is " +age + " years");
		System.out.println("The Lion is Roaring!!!!!!!!!!!");
	}
	
	public static void main(String args[]) {
		Lion l = new Lion();
		Lion l2 = new Lion(5);
	}
}
