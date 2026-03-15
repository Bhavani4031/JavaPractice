package com.jt.multithreading;

class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println("Thread class running " +Thread.currentThread().getName());
	}
}
public class MultipleInvocations {

	public static void main(String[] args) {
		
		MyThread t1 = new MyThread();
		t1.start();
		//t1.start(); // throws java.lang.IllegalThreadStateException
		
		t1.run();
		t1.run();
	}
}
