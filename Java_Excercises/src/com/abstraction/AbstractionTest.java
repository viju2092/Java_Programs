package com.abstraction;

public class AbstractionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
	EmployeeSuper fulltime = new Fulltime_Employee();
	EmployeeSuper hourly = new Hourly_Employee();
	
	fulltime.calculateSalary();
	hourly.calculateSalary();
	*/
	Shape rect = new Rectangle();
	Shape cir = new Circle();
	Shape tri = new Triangle();
	rect.disp();
	cir.disp();
//	cir.Disp_Circle(7.2);
	tri.disp();
	
	}

}
