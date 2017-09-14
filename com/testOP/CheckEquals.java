package com.testOP;

class AB{
	int i,j;
	AB(){
		i=1; j=3;
	}
}
public class CheckEquals {
	public static void main(String[] args) {
		AB obj1 = new AB();
		AB obj2 = new AB();
		System.out.println(obj1.equals(obj2));  //false
	}
}
