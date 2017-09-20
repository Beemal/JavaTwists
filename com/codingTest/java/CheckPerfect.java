package com.codingTest.java;

public class CheckPerfect {

	public static void main(String[] args) {
		checkPerfect(6);
		checkPerfect(100);
		
	}
	private static void checkPerfect(int n) {
		int sum = 0;
		for(int i = 1; i < n; i++){
			if(n % i == 0)
				sum += i;
		}
		String result = sum == n ? "perfect": "not perfect";
		System.out.println(result);
	}

}
