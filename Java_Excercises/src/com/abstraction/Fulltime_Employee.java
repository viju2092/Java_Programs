package com.abstraction;

public class Fulltime_Employee extends EmployeeSuper {

	@Override
	void calculateSalary() {
		// TODO Auto-generated method stub
		
		System.out.println("The Fulltime Employee salary is " + 500/per_day);
	}

}
