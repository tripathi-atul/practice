package com.atul;

import java.util.Scanner;


public class NumberIsPosiNegDec {
	
	static void fractionOfNumbers(int  limit, float[] arrayElements){
		float noOfZeroes = 0;
		float noOfPositives = 0;
		float noOfNegatives = 0;
		for (int i=0; i<limit; i++){
			if(Math.signum(arrayElements[i]) == 0){
				noOfZeroes =noOfZeroes+1;
			}
			else if(Math.signum(arrayElements[i]) < 0){
				noOfNegatives = noOfNegatives+1;
			}
			else
				noOfPositives = noOfPositives+1;
		}
		System.out.println(noOfPositives/limit);
		System.out.println(noOfNegatives/limit);
		System.out.println(noOfZeroes/limit);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int limit;
		limit = sc.nextInt();
		float[] arrayElements = new float[limit];
		for(int i=0; i<limit; i++){
			arrayElements[i] = sc.nextInt();
		}
		fractionOfNumbers(limit,arrayElements);

	}

}
