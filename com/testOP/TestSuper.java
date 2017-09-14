package com.testOP;

class A{
	public int i;
	protected int j; // if it is private, it is invisible to sub class
}
class B extends A{
	void display(){
		super.j = super.i + 1;
		System.out.println(super.i+" - "+super.j);
	}
}
public class TestSuper {

	public static void main(String[] args) {
		B b = new B();
		b.i = 1;
		b.j = 2;
		b.display();
	}

}
