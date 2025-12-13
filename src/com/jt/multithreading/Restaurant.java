package com.jt.multithreading;

/*
 * Threads can be created by using two mechanisms:
 * 1. Extending the Thread class
 * 2. Implementing the Runnable interface
 * 
 */
public class Restaurant {

	public static void main(String[] args) {
				
		Thread t1 = new CookingTask("Biryani");
		Thread t2 = new CookingTask("Tandoori Chicken");
		Thread t3 = new CookingTask("Mutton fry");
		Thread t4 = new CookingTask("Fish pulusu");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}

class CookingTask extends Thread{
	private String task;
	
	CookingTask(String task) {
		this.task = task;
	}
	
	public void run() {
		System.out.println(task+ " is being prepared by " +Thread.currentThread().getName());
	}
}
