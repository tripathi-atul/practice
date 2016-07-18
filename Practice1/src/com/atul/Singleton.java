package com.atul;

public class Singleton {
	private static Singleton object = null;
	
	private Singleton(){
		
	}
	
	public static Singleton createObject(){
		if(object == null){
		return new Singleton();
		}
		else
			return object;
	}

}
