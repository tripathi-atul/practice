package com.atul;

 enum EnumPract {
	BIG(8),MEDIUM(6),SMALL(4);
	private EnumPract(int ounces) {
		this.ounces = ounces;
		// TODO Auto-generated constructor stub
	}
	private int ounces;
	public int getOunces(){
		return ounces;
		
	}
}
 
 public class EnumPractice{
	 EnumPract size;
	 public static void main(String[] args){
		 EnumPractice practice = new EnumPractice();
		 practice.size = EnumPract.BIG;
		 
		 EnumPractice practice2 = new EnumPractice();
		 practice2.size = EnumPract.MEDIUM;
		 System.out.println(practice.size.getOunces());
		 System.out.println(practice2.size.getOunces());
		 
		 
		 
	 }
 }
