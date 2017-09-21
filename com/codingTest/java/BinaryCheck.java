package com.codingTest.java;

import java.math.BigInteger;

public class BinaryCheck {

	public static void main(String[] args) {
		checkBinary(1010);
		checkBinary(101030);
		checkBinary(1111001);
	}

	private static void checkBinary(int n) {
		boolean binary = true;
		while(n > 0){
			if(n % 10 > 1){
				binary = false;
				break;
			}
			n = n/10;
		}
		System.out.println(binary);
		
	}

}
