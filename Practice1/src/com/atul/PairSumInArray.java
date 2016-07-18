package com.atul;

import java.util.Arrays;
import java.util.HashSet;

public class PairSumInArray {
	
	public void findPairInArray(int a[]){
		HashSet<Integer> hashSet= new HashSet<Integer>();
		for (int arrayElement : a){
			hashSet.add(arrayElement);
		}
		Object[] newArray = hashSet.toArray();
		for(int i=0;i<newArray.length;i++){
			System.out.println(newArray[i]);
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PairSumInArray psia = new PairSumInArray();
		HashSet<Integer> hashSet= new HashSet<Integer>();
		int arrayOfIntegers[] = {1,4,2,7,3,6,5,2,9};
		psia.findPairInArray(arrayOfIntegers);
	

	}

}
