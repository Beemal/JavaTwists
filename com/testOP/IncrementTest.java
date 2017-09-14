package com.testOP;

public class IncrementTest {

	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		for(int z = 0; z < 5; z++){
			if((++i>2) && (++j>2)){
				i++;
			}
		}
		System.out.println(i+" - "+j);
	}

}
