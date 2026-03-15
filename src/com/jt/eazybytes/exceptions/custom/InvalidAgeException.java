package com.jt.eazybytes.exceptions.custom;

public class InvalidAgeException extends Exception {

	public InvalidAgeException() {
		super();
	}
	
	public InvalidAgeException(String message) {
		super(message);
	}
}

//{0,1,0,8,9,7}
//{1,8,9,7,0,0}
