package com.codingTest.java;

public class PrintWithoutLoop {

	public static void main(String[] args) {
		print(10);
		// print 1 to 10 without loop
	}
	public static int i = 1;
	private static void print(int n) {
		if(i <= n){
			System.out.print(" "+i++);
			print(n);
		}
		
	}
}
