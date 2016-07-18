package com.atul;

import java.io.*;
import java.util.*;

public class Solution1 {

    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
        int size;
        size = sc.nextInt();
        int[][] arrayElements = new int[size][size];
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                arrayElements[i][j] = sc.nextInt();
            }
        }
        calculateSum(arrayElements,size);
    }

	private static void calculateSum(int[][] arrayElements,int size) {
		int sumForLeftDiagonal = 0;
		int sumForRightDiagonal = 0;
		int i=0;
		int j=0;
		int k=0;
		int l=size-1;
		do{
			sumForLeftDiagonal = sumForLeftDiagonal + arrayElements[i][j];
			i=i+1;j=j+1;
		}while(i<size);
		
		do{
			
			sumForRightDiagonal = sumForRightDiagonal + arrayElements[k][l];
			k=k+1;l=l-1;
		}while(k<size);
		
	  System.out.println(sumForLeftDiagonal - sumForRightDiagonal);
			
				
			
		}
	}