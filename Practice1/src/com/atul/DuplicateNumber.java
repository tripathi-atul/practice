package com.atul;

import java.util.ArrayList;
import java.util.Scanner;

public class DuplicateNumber {
	ArrayList<Integer>  ab = new ArrayList<Integer>();
	ArrayList<Integer> duplicates=new ArrayList<Integer>();
	
	public void throughArrayList(){
		
	}

	public static void main(String[] args) {
		DuplicateNumber abcd = new DuplicateNumber();
	
		int m = 0;
		
		System.out.println("Enter the number list");
		Scanner sc = new Scanner(System.in);
		String abc = sc.nextLine();
		String[] a =abc.split(" ");
		for(int i=0;i<=a.length-1;i++){
			abcd.ab.add(Integer.parseInt(a[i]));
		}
		
		for(int j=0;j<=abcd.ab.size()-2;j++){
			for(int k=j+1;k<=abcd.ab.size()-1;k++){
				if(abcd.ab.get(j) == abcd.ab.get(k)){
					abcd.duplicates.set(m,abcd.ab.get(j));
					m=m+1;
					
				}
				
				
			}
			
		}
		for(int i=0;i<abcd.duplicates.size()-1;i++)
		System.out.println(abcd.duplicates.get(i));

	}

}
