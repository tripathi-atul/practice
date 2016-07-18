package com.atul;

import java.util.Random;

public class PublicClass extends Object {
	public static void main(String args[]) {
		Random number = new Random();
		System.out.println(number.nextInt());
		PrivateClass.method1();
		
		
	}

}
  class PrivateClass{
	  private int a;
	  public static void method1(){
		  
	  }
	public void method2(){
		
	}
}