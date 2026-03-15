package com.jt.eazybytes.exceptions;

import java.util.logging.Logger;

public class ArrayIndexOutOfBoundExceptionHandlingDemo {

	private static Logger logger = Logger.getLogger(ArrayIndexOutOfBoundExceptionHandlingDemo.class.getName());
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] nums = {1, 2, 3, 4, 5};
			System.out.println(nums[5]);
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			logger.severe("Invalid array index. Please provide valid index and try again");
			//System.out.println("Invalid array index. Please provide valid index and try again");
			//ex.printStackTrace();
		}
	}

}
