package com.jt.multithreading;

//Thread class implementation
class MyThread1 extends Thread {
	@Override
	public void run() {
		System.out.println("Thread class Running");
	}
}

//Runnable interafce implementation
class MyThread2 implements Runnable {
	@Override
	public void run() {
		System.out.println("Runnable thread running");
	}
}

public class UsingThreadClassAndRunnableInterface {

	public static void main(String[] args) {

		//create and start Thread class thread
		MyThread1 t1 = new MyThread1();
		t1.start();
		
		//create and start Runnable interface thread 
		MyThread2 t = new MyThread2();
		Thread t2 = new Thread(t);
		t2.start();
		t2.start();
		
		try {
			t1.join(); //wait for t1
			t2.join(); //wait for t2
		}
		catch(InterruptedException ex) {
			ex.printStackTrace();
		}
	}

}
