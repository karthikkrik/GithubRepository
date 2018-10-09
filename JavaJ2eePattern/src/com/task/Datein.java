package com.task;

import java.util.Calendar;

public class Datein {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String str[] = args[0].split("-");
			int year = Integer.parseInt(str[2]);
			
			Calendar c  = Calendar.getInstance();
			int currentyear = c.get(Calendar.YEAR);//YEAR is a static field in calendar class
			int age = currentyear - year;
		System.out.println("age of the person is:" +age+"years");
	}

}
