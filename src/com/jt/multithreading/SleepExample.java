package com.jt.multithreading;

class MyThread3 implements Runnable {
	
	public void run() {
		try {
			for(int i=0; i<5; i++) {
				System.out.print(i+ " ");
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
public class SleepExample extends Thread {

	public void run() {
		try {
			for(int i=10; i>5; i--) {
				System.out.print(i+ " ");
				Thread.sleep(1000);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws InterruptedException {
				
		Thread t1 = new Thread(new MyThread3());
		t1.start();	
		
		t1.join();
		
		SleepExample t2 = new SleepExample();
		t2.start();
		
	}
}
