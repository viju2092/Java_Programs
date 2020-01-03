package com.abstraction;

public abstract class EmployeeSuper {

	int per_hour=56,per_day=32;
	
	
	public int getPer_hour() {
		return per_hour;
	}


	public void setPer_hour(int per_hour) {
		this.per_hour = per_hour;
	}


	public int getPer_day() {
		return per_day;
	}


	public void setPer_day(int per_day) {
		this.per_day = per_day;
	}

	abstract void calculateSalary();
}
