package com.practicejava;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Example6 implements HasTail{

	public static void main(String[] args) {

	String date = LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE_TIME);
	System.out.println(date);
	}

	@Override
	public int getTailLength() {
		// TODO Auto-generated method stub
		return 0;
	}

}
