package com.whizlabs;

public class WhizFuzz {

	public static void main(String[] args) {

		Emp emp = new Emp("Livera", 22);
		System.out.print(emp.age + " ");
		updateAge(emp);
		System.out.print(emp.age);
	}
	
	public static void updateAge(Emp emp1) {
	//	emp1 = new Emp();
		emp1.age = 30;
	}

}
