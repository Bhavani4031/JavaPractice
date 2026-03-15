package com.jt.eazybytes;

import java.io.CharArrayWriter;
import java.io.IOException;

public class StringMutableDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Approach 1
		
		StringBuilder sb = new StringBuilder();
		sb.append("World");
		sb.insert(0, "Hello ");
		sb.deleteCharAt(4);
		sb.insert(4, 'o');
		sb.setLength(5);
		sb.reverse();
		String str1 = sb.toString();
		
		//Approach 1
		
		StringBuffer sb1 = new StringBuffer();
		sb1.append("World");
		sb1.insert(0, "Hello ");
		sb1.deleteCharAt(4);
		sb1.insert(4, 'o');
		sb1.setLength(5);
		sb1.reverse();
		String str2 = sb1.toString();
				
		//Approach 3
		
		CharArrayWriter cw = new CharArrayWriter();
		cw.write("Hello");
		cw.write("World");
		String str3 = cw.toString();
		
		String input = "mom";
		
		StringBuilder sb2 = new StringBuilder(input);
		sb2.reverse();
		String reversedString = sb2.toString();
		
		if(input.equals(reversedString)) {
			System.out.println(input+ " is a Palindrome");
		}
		else {
			System.out.println(input+ " is not a Palindrome");
		}
	}

}
