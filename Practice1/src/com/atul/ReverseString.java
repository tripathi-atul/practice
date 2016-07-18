package com.atul;

public class ReverseString {

	String rv="";
	public String reverseMethod(String st){
	rv = rv + st.charAt(st.length()-1);
	reverseMethod(rv);
	return rv;
	}  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseString rs = new ReverseString();
		System.out.println(rs.reverseMethod("atul"));

	}

}
