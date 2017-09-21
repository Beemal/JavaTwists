package com.codingTest.java;

public class MissingNumber {
	
	public static void main(String[] args) {
		int[] array = {7,5,6,1,4,2};
		int[] array2={5,3,1,2};
		System.out.println(findMissingNumber(array));
		System.out.println(findMissingNumber(array2));
	}
	
	//Missing number = Expected Sum - Actual Sum 
	private static int findMissingNumber(int[] array) {
		int result = 0;
		int actualSum = 0, expectedSum = 0;
		int length = array.length;
		for(int i = 0; i < length; i++){
			actualSum += array[i];
		}
		int n = length + 1;
		expectedSum = (n * (n + 1)/2);
		result = expectedSum - actualSum;
		return result;
	}
}
