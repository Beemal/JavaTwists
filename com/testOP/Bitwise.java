package com.testOP;

public class Bitwise {

	public static void main(String[] args) {
		int x = 11&9;  
		// 11 -> 1011
		// 9 ->  1001
		// &  -->1001  equvalent to 9 i.e x=9;
		
		int y = x ^ 3; 
		// ^ ==> same bit - 0, diff bit - 1 
		// y = 1001 ^ 0011 = 1010
		
		System.out.println(y | 12);
					//  1010 | 1100 = 1110 =-> 14
	}

}
