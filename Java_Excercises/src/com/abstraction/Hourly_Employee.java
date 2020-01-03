package com.abstraction;

public class Hourly_Employee extends EmployeeSuper{

	@Override
	void calculateSalary() {
		// TODO Auto-generated method stub
		
		System.out.println("The hourly Employee salary is " + 100/per_hour);
	}

}
