package com.codingTest.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class SortMapByValue {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("101", "bimal");
		map.put("10", "anjan");
		map.put("202", "angel");
		
		
		sortByKey(map);
	}

	private static void sortByKey(Map<String, String> map) {
		System.out.println("Map before Sorting----");
		for(Map.Entry<String, String> entry : map.entrySet()){
			System.out.println(entry.getKey()+" - "+entry.getValue());
		}
		
		Map<String, String> treeMap = new TreeMap<>(map);
		System.out.println("Map after sorting by keys---");
		for(Entry<String, String> s:treeMap.entrySet()){
			System.out.println(s.getKey()+" - "+s.getValue());
		}
		sortByValue(treeMap);
	}

	private static void sortByValue(Map<String, String> treeMap) {
		Comparator<Entry<String, String>> comparator = new Comparator<Map.Entry<String,String>>() {
			@Override
			public int compare(Entry<String, String> o1, Entry<String, String> o2) {
				return (o1.getValue()).compareTo((o2.getValue()));
			}
		};
		
		List<Entry<String, String>> list = new ArrayList<Entry<String, String>>(treeMap.entrySet());
		Collections.sort(list, comparator);
		
		System.out.println("Sorted by value--");
		for(Entry<String, String> s: list){
			System.out.println(s.getKey()+" - "+s.getValue());
		}
	}
}
