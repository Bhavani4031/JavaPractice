package com.jt.eazybytes.exceptions;

import java.util.logging.Logger;

public class MultipleCatchDemo {

	private static Logger logger = Logger.getLogger(MultipleCatchDemo.class.getName());
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "Madan";
		
		try {
			System.out.println(input.toUpperCase());
			String subString = input.substring(1, 10);
		}
		catch(NullPointerException ex) {
			logger.severe("A NullPointerException occured. Please check your data");
		}
		catch(StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException ex) {
			logger.severe("A StringIndexOutOfBoundsException occured. Please check your string data");			
		}
		//catch(ArrayIndexOutOfBoundsException ex) {
		//	logger.severe("A ArrayIndexOutOfBoundsException occured. Please check your string data");			
		//}
		catch(Exception ex) {
			logger.severe("A Exception occured. Please check your program");			
		}
	}

}
