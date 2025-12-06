package com.jt.Practice;

import java.util.Scanner;
/*
 * A number-guessing game
 * program where the computer randomly selects a number, and the user has to guess it within a limited number of attempts
 */
public class NumberGuessingGame {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			int randomNum = 1 + (int)(100 * Math.random());
			boolean guessedCorrectly = false;	
			
			System.out.println("A number is choosen between 1 and 100");
			
			System.out.println("You have 5 attempts per round to guess correct number");
			
			while(!guessedCorrectly) {
					
				for(int i=0; i<5; i++) {
					System.out.println("Enter your guess");
					int guess = sc.nextInt();
						
					if(guess < randomNum) {
						System.out.println("The number is greater than " +guess);
					}
					else if (guess > randomNum) {
						System.out.println("The number is lesser than " +guess);
					}
					else if(guess == randomNum) {
						System.out.println("Congratulations! You guessed the correct number");
						guessedCorrectly = true;
						return;
					}
				}
				
				if(!guessedCorrectly) {
					System.out.println("You have used all 5 attempts.");		
					System.out.println("Do you want to continue guessing? (yes/no)" );
					String response = sc.next();
					if(response.equalsIgnoreCase("no")) {
						System.out.println("Oops! You lost the game.The correct number was " +randomNum);
						break;
					}
				}
			}
			sc.close();
		}
	}
}
