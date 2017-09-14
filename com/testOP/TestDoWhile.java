package com.testOP;

public class TestDoWhile {

	public static void main(String[] args) {
		int i = 0, j = 2;
		do{
			i = ++i;  // equivalent of i value ++i (no effect)
			j--;
		}while(j>0);
		System.out.println(i);

	}

}
