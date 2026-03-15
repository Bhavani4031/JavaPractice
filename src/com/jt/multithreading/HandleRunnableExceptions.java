package com.jt.multithreading;

import java.io.FileNotFoundException;

class MyClass implements Runnable {
	
	public void run() {
		System.out.println("Runnable thread running");
		
		// Checked exception can't be thrown, Runnable must handle checked exception itself
		try {
			throw new FileNotFoundException();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//Explanation: The output shows that Runnable can't throw checked exceptions, FileNotFoundException in this case, to the callers, 
		//it must handle checked exceptions in the run() but RuntimeExceptions (thrown or auto-generated) are handled by the JVM automatically.

		//int i = 2 / 0;
		
		throw new NullPointerException();
		
	}
}

public class HandleRunnableExceptions {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new MyClass());
		t1.start();
	}

}
