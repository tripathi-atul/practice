package com.atul;

import java.util.HashMap;
import java.util.Map.Entry;

public class EvenAndOdd {

	public static void main(String[] args) {
		int[] array = {8,4,4,8,23};
		int count;
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i = 0; i<array.length; i++) {
			if(map.containsKey(array[i])) {
				count = map.get(array[i]);
				count = count+1;
				map.put(array[i], count);
			}
			else
			{
				map.put(array[i], 1);
			}
		}
		
		for(Entry<Integer,Integer> entry : map.entrySet()) {
			if(entry.getValue() % 2 != 0) {
				System.out.println(entry.getKey());
			}
		}

	}

}
