package com.codingTest.java;

public class BubbleSort {

	public static void main(String[] args) {
		sort(new int[]{5,4,3,2,1});
		//bubble sort - sorting an array
	}

	private static void sort(int[] array) {
		int temp = 0;
		for(int i = 0; i < array.length; i++){
			for(int j = 1; j < array.length ; j++){
				if(array[j-1] > array[j]){
					//swap
					temp = array[j-1];
					array[j-1] = array[j];
					array[j] = temp;
				}
			}
		}
		for(int i: array){
			System.out.print(i+" ");
		}
	}

}
