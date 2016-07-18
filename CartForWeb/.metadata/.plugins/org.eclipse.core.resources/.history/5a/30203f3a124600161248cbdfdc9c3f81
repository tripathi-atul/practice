package com.atul;

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int testCase = sc.nextInt();
    for(int i = 0; i < testCase; i++) {
        int size = sc.nextInt();
        int[] array = new int[size];
        for(int k = 0; k<array.length; k++) {
            array[k] = sc.nextInt();
        }
		int count;
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int l = 0; l<size; l++) {
			if(map.containsKey(array[l])) {
				count = map.get(array[l]);
				count = count+1;
				map.put(array[l], count);
			}
			else
			{
				map.put(array[l], 1);
			}
		}
		
		for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
			if(entry.getValue() % 2 != 0) {
				System.out.println(entry.getKey());
			}
		}

	}
}
}
