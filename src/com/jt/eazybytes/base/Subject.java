package com.jt.eazybytes.base;

public abstract class Subject {

	public int marks;
	public static int MIN_MARKS = 35;
	
	public int totalMarks() {
		return 100;
	}
	
	public abstract void teach();
}
