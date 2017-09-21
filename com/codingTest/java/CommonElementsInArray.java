package com.codingTest.java;

public class CommonElementsInArray {

	public static void main(String[] args) {
		int[] array1 = new int[]{1,2,3,4,5};
		int[] array2 = new int[]{4,5,6,7,8,9};
		findCommon(array1,array2);
	}

	private static void findCommon(int[] array1, int[] array2) {
		int[] result = new int[array1.length];
		for(int i = 0; i < array1.length; i++){
			for(int j = 0; j < array2.length; j++){
				if(array1[i] == array2[j])
					result[i] = array1[i];
			}
		}
		//display result
		for(int r: result){
			if(r != 0)
			System.out.print(r+" ");
		}
	}

}
