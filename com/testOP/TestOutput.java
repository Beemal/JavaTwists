package com.testOP;


public class TestOutput {
	static int i;
	public static void main(String[] args) {
		/*int x = 9;
		if(x == 9){
			x = 8;
			System.out.println(x); // x = 8
		}*/

		/*int x = 1;
		int y = 0;
		while(++x<5) y++;
		System.out.println(y);  // y = 3 */
		
		boolean x = true;
		int a;
		if(x) a = x ? 1: 2; // a = condition ? exp1: exp2;
		else a = x ? 3: 4;
		System.out.println(a);  // x->true a = 1
								// x->false a = 4
	}

}
