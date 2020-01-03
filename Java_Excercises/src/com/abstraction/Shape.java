package com.abstraction;

public abstract class Shape {

	float area;
	void disp()
	{
		System.out.println("The shape is displayed");
	}
	void Disp_Circle(float d)
	{
		area= (float) (3.14 * d * d);
		System.out.println("The area of the circle is " +area);
	}
}
