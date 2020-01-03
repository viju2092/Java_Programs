package com.singleinheritance;

public class Employee extends Person {

	 void SetData()
	{
		System.out.println("Lets get going");
	}
	 
	void SetData(int f, int c)
	{
		int tot = f+c;
		System.out.println(tot);
	}
}
