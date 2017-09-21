package com.codingTest.java;

public class FactorOfNumber {

	public static void main(String[] args) {
		findFactors(6);
		findFactors(24);
		findFactors(23);
	}

	private static void findFactors(int n) {
		String result = "";
		for(int i = 1; i <= n; i++){
			if(n % i == 0)
				result += " "+i;
		}
		System.out.println(result);
	}

}
