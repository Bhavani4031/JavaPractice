package com.jt.eazybytes.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedExceptionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(InputStreamReader isr = new InputStreamReader(System.in);
				BufferedReader bf = new BufferedReader(isr);) {			
			System.out.println("Enter the input: ");
			String input = bf.readLine();
			System.out.println("the input entered is: " +input);
		}catch(IOException ex) {
			ex.printStackTrace();
		}		
		
	}
	
	public void fileRead() {
		try {
			FileReader filereader = new FileReader("C:\\Users\\Desktop\\file.txt");
		}
		catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}
	}

}
