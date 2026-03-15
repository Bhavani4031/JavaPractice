package com.jt.eazybytes.wrapping;

public class BoxingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 16;
		
		//Boxing
		//Approach 1 - using the constructor
		Integer integerObj = new Integer(num);
		Double doubleObj = new Double(45.897);
		Long longObj = new Long("678574");
		
		//Boxing
		//Approach 2 - using valueOf() method
		Integer integerObj1 = Integer.valueOf(num);
		Double doubleObj1 = Double.valueOf("3.456");
		Long longObj1 = Long.valueOf("76584");
		
		//Parsing
		int value = Integer.parseInt("1234");
		System.out.println(value);
		
		//Unboxing
		int num1 = integerObj.intValue();
		double num2 = doubleObj.doubleValue();
		long num3 = longObj.longValue();
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);

	}

}
