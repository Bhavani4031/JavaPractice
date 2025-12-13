package com.jt.multithreading;

public class RestaurantRunnable {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new CookingTask1("Pasta"));
		Thread t2 = new Thread(new CookingTask1("Burger"));
		Thread t3 = new Thread(new CookingTask1("KFC"));
		Thread t4 = new Thread(new CookingTask1("Pizza"));
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}

class CookingTask1 implements Runnable{
	private String task;
	
	CookingTask1(String task) {
		this.task = task;
	}
	
	public void run() {
		System.out.println(task+ " is being prepared by " +Thread.currentThread().getName());
	}
}
