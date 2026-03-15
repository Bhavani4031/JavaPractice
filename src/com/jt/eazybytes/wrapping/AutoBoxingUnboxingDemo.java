package com.jt.eazybytes.wrapping;

public class AutoBoxingUnboxingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//AutoBoxing
		Integer integer = 16;
		Character character = 'M';
		Boolean value = false;
		
		//Auto unboxing
		int num = integer;
		char m = character;
		boolean b = value;
		
		System.out.println(num);
		System.out.println(m);
		System.out.println(b);
	}

}
