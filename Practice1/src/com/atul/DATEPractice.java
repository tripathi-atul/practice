package com.atul;

import java.util.Calendar;
import java.util.Date;

public class DATEPractice {
	
	  public static Date getCurrentDate() {
	        Calendar now = Calendar.getInstance();
	        now.set(now.get(Calendar.YEAR), now.get(Calendar.MONTH), now.get(Calendar.DAY_OF_MONTH), now.get(Calendar.HOUR_OF_DAY), 0, 0);
	        now.set(Calendar.MILLISECOND, 0);
	        return now.getTime();
	    }

	public static void main(String[] args) {
		System.out.println(DATEPractice.getCurrentDate());
		Calendar c = Calendar.getInstance();
		System.out.println(c.getTime());
		// TODO Auto-generated method stub

	}

}
