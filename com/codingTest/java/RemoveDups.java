package com.codingTest.java;

public class RemoveDups {

	public static void main(String[] args) {
		removeDups("apple");

	}

	private static void removeDups(String string) {
		String result = "";
		for(char s : string.toCharArray()){
			if(!result.contains(String.valueOf(s)))
				result += s;
		}
		System.out.println(result);
	}

}
