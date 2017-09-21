package com.codingTest.java;

public class DeadLock {
	String str1 = " Java";
	String str2 = " DeadLock";
	
	Thread t1 = new Thread("My thread 1"){
		public void run(){
			while(true){
				synchronized (str1) {
					synchronized (str2) {
						System.out.println(str1 + str2);
					}
				}
			}
		}
	};
//	Deadlocks can occur in Java when the synchronized 
//	keyword causes the executing thread to block 
//	while waiting to get the lock, 
//	associated with the specified object.
	Thread t2 = new Thread("My thread 2"){
		public void run(){
			while(true){
				synchronized (str2) {
					synchronized (str1) {
						System.out.println(str2 + str1);
					}
				}
			}
		}
	};
	public static void main(String[] args) {
		DeadLock dl = new DeadLock();
		dl.t1.start();
		dl.t2.start();
	}
}
