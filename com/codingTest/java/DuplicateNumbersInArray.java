package com.codingTest.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateNumbersInArray {

	public static void main(String[] args) {
		int[] array = new int[]{1,2,3,4,2,3};
		findDups(array);
		findDups2(array);

	}
	private static void findDups2(int[] integer) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i : integer){
			if(!map.containsKey(i)){
				map.put(i, 1);
			}else{
				map.put(i, map.get(i) + 1);
			}
		}
		// print the key whose value is greater than 1
		String result = "";
		for(Entry<Integer, Integer> entry : map.entrySet()){
			if(entry.getValue() > 1)
				result += " "+entry.getKey();
		}
		System.out.println(result);
	}

	private static void findDups(int[] array) {
		String result = "";
		for(int i = 0; i < array.length; i++){
			for(int j = i; j < array.length; j++){
				if(i != j)
				if(array[i] == array[j])
					result += " "+array[i];
			}
		}
		System.out.println(result);
	}

}
