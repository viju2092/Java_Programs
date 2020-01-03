package my.city;

import my.school.*;

public class School extends Classroom {

	static String namee;
	static int agu;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Classroom room = new Classroom();
		room.setName("Vijay");
		namee = room.getName();
        room.setAge(27);
        agu = room.getAge();
        System.out.println("My name is " + namee + " and my age is " + agu);

	}

}
