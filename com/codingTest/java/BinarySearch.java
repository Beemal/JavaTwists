package com.codingTest.java;

public class BinarySearch {

	public static void main(String[] args) {
		// array is sorted and we have to find 4 in array
		binarySearch(new int[]{1,2,3,4,5}, 4);
		binarySearch(new int[]{1,2,3,4,5}, 6);
		binarySearch(new int[]{1,2,2,3,4,5}, 8);
	}

	private static void binarySearch(int[] array, int key) {
		boolean found = false;
		int start = 0;
		int end = array.length - 1;
		while(start <= end){
			int mid = (start + end) / 2;
			if(key == array[mid])
				found = true;
			if(key > array[mid])
				start += mid;
			else
				end -= mid; 
		}
		System.out.println(found ? "Item Found" : "Item Not Found");
	}

}
