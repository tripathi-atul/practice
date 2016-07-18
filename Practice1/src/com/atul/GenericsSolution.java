package com.atul;


public class GenericsSolution {
	
	static <T> void printArray(T[] o){
	  for(T x : o){
			System.out.print(x);
		}
	}

	public static void main(String[] args) {
		
		Integer[] i = {1,2,3};
		String[] s = {"atul","abhay"};
		printArray(i);
		printArray(s);
	}

}
