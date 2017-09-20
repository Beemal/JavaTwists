package com.codingTest.java;

public class Fibonacci {
		//print fibonacci series 1 1 2 3 5 8
	public static void main(String[] args) {
		printFibonacii(6);
		swap(1,2);          // swap without temp variable
		reverseNumber(7678);
		factorial(5);   // 5x4x3x2x1 = 120
		System.out.println(factorial2(5));
		sumOfDigits(123);
	}
	private static void sumOfDigits(int num) {
		int sum = 0;
		while(num > 0){
			sum += num % 10;  // 3 + 2 + 1
			num = num / 10;
		}
		System.out.println(sum);
	}
	private static int factorial2(int n) {
		if(n <= 1)       // base case
			return 1;
		return n * factorial2(n-1);
			
		}
	private static void factorial(int n) {
		int result = 1;
			while(n>1){
				result *= n; 
				n--;
			}
			System.out.println(result);
		}
	private static void reverseNumber(int num) {
		String result = "";
			while(num > 0){
				result += num%10;
				num = num/10;
			}
			System.out.println(result);
		}
	private static void swap(int i, int j) {
			i = i + j;   
			j = i - j;   
			i = i - j;    
			System.out.println(i+","+j);
	}
	private static void printFibonacii(int n) {
		String result = "";
		int a = 1, b = 1, c = 0;
		result += a+" "+b+" ";   // first 2 nums are already fibo
		int count = 2;
		while(n > count){ // to find fibo upto n
			c = a + b;
			result += c+" ";
			//swap 
			a = b;
			b = c;
			count++;
		}
		System.out.println(result);	
	}

}
