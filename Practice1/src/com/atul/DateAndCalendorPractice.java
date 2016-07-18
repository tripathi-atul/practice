package com.atul;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;


public class DateAndCalendorPractice {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d.toString());
		
		/** Calendor */
		Calendar c = Calendar.getInstance();
		
		System.out.println(c);
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		
		
		/** Locale */
		Locale l = new Locale("Hindi");
		c= Calendar.getInstance(l);
		System.out.println(c);
		
		// TODO Auto-generated method stub

	}

}
