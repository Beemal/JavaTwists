package com.codingTest.java;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// armStrong  = sum of cubes of digits of a number
		isArmStrong(153);  // 1x1x1 + 5x5x5 + 3x3x3
		isArmStrong(370);
		isArmStrong(100);
	}

	private static void isArmStrong(int n) {
		int num = n;
		int sum = 0; 
		
		while(n > 0){
			sum += (n % 10)*(n % 10)*(n % 10);
			n = n / 10;
		}
		String result = (sum == num) ? "Yes ArmStrong" : "Not an ArmStrong";
		System.out.println(result);
	}

}
