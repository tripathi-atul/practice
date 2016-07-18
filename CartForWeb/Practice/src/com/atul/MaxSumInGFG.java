package com.atul;

import java.util.*;
import java.lang.*;
import java.io.*;

class MaxSumInGFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		for(int i = 0; i < testCase; i++) {
		    int arrayLength = sc.nextInt();
		    int[] array = new int[arrayLength];
		    for(int j=0; j<arrayLength; j++) {
		        array[j] = sc.nextInt();
		    }
		    int dplength = array.length;
		int[] dp = new int[dplength];
		if(dplength == 0) {
			
			System.out.println(dp[0]);
		}
		else if(dplength == 1) {
			dp[0] = array[0];
			System.out.println(dp[0]);
			
		}
		else {
		    dp[0] = array[0];
			dp[1] = Math.max(array[0], array[1]);
			for(int k = 2; k <= dplength-1; k++) {
				dp[k] = Math.max(dp[k-1], Math.max(array[k],array[k]+dp[k-2]));
			}
			System.out.println(dp[dplength-1]);
				
			}

		}
	}
}