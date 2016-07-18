package com.atul;

import java.util.Scanner;

public class IfElseCheck {
	int  factorial = 1;
	

	public int getFactorial() {
		return factorial;
	}

	public static void main(String[] args) {
		IfElseCheck ifs = new IfElseCheck();
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		ifs.returnCheck(i);
		System.out.println(ifs.getFactorial());


	}

	private  void returnCheck(int number){
		factorial = factorial * number;
		if(number == 1)
		return;
		returnCheck(number -1);
		

	}

}
