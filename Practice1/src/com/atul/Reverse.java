package com.atul;

import java.nio.CharBuffer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reverse {
	String s1="";
	
	
	private void stringReverse(String stringToReverse){
		for(int i=stringToReverse.length()-1; i>=0; i--){
			s1= s1+stringToReverse.charAt(i);
		}
		System.out.println("Reversed String" + s1);
		
	}

	public static void main(String[] args) {
		String stringToReverse = "Atul tripathi";
		String s = "snapdeal";
		Reverse rv = new Reverse();
		rv.stringReverse(stringToReverse);
	/*	Pattern p = Pattern.compile("\\ap");
        Matcher m = p.matcher(s);*/
		boolean k=Pattern.matches("ap",s);
		System.out.println(k);
        
	}

}
 