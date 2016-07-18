package com.atul;

public class EnhancedForLoop {
	int[] a = {12,3,4,5,6}; 
	
	void method1(){
		
		for(int k: a){
			System.out.println(k);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnhancedForLoop ep = new EnhancedForLoop();
		ep.method1();
	}
}
