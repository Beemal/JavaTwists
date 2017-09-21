package com.codingTest.java;

public class FloydsTriangle {

	public static void main(String[] args) {
		// construct Floyds Triangle of n numbers
		floydTriangle(5);
		// how many number of rows , here n = rows = 5

	}

	private static void floydTriangle(int n) {
		int num = 1;
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(num+++" ");
			}
			System.out.println(" ");
		}
		
	}

}
