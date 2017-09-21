package com.codingTest.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PrintDups {

	public static void main(String[] args) {
		printDups("apple");
		printDups("aeroplane");
		printDups("Compositions-c");
	}

	private static void printDups(String string) {
		Map<Character, Integer> map = new HashMap<>();
		for(char c : string.toLowerCase().toCharArray()){
			if(!map.containsKey(c)){
				map.put(c, 1);
			}else{
				map.put(c, map.get(c) + 1);
			}
		}
		// print the key whose value is greater than 1
		String result = "";
		for(Entry<Character, Integer> entry : map.entrySet()){
			if(entry.getValue() > 1)
				result += entry.getKey();
		}
		System.out.println(result);
		
	}

}
