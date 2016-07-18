package com.atul;

public class ExceptionHandling {
	
	void exceptionMethod1(){
	
		try{
			System.out.println("This needs to be printed");
			//throw new ArithmeticException();
			return;
		}
		catch(ArithmeticException e){
			e.printStackTrace();
			return;
			
		}
		finally {
			return;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionHandling eh = new ExceptionHandling();
		eh.exceptionMethod1();

	}

}
