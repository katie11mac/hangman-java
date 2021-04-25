//I have neither given nor received any unauthorized aid on this assignment. 

import java.util.Scanner;

public class HangmanDriver {

	public static Scanner scan = new Scanner(System.in); // Global variable bc methods in this class use it 
	
	public static void main(String[] args) {

		System.out.println("Welcome to Hangman!"); 
		boolean playing = true; // Variable that determines whether they are playing the game or not
		
		// Loop that allows multiple games to be played in a row 
		while (playing == true) {
			Hangman game = new Hangman(); // Need this inside the while loop so that the game and its variables reset every time 
		
			// Setting the user up for the game and it's format 
			System.out.println();
			game.setWords();
		
			System.out.println("Generating your secret word...");
			String word = game.selectGameWord(); 
			
			System.out.println("Here is your word: ");
			System.out.println(game.getCurrentWord('-')); //'-' as argument bc it will not affect the way the word will first be displayed 
			
			game.showMan(game.getIncorrectGuesses().length());
			System.out.println("INCORRECT GUESSES: ");
			System.out.println(game.getIncorrectGuesses()); 
			
			boolean guessedWord = false; // Allows the player to continue guessing letters until they have guessed the word 
			boolean won = false; // Allows program to later determine and show corresponding messages if won 
			boolean lost = false; //Allows program to later determine and show corresponding messages if lost
			
			// Loop for entering guesses into hangman
			while (game.getIncorrectGuesses().length() < 10 && guessedWord == false) { 
				
				char c = getChoice(); // Checking if the user wants to enter a letter or word guess
				
				// User wants to guess a letter 
				if (c == 'L') {
					char g = getGuessL(); // Prompt user to guess letter, converts their guess to upper case
					System.out.println(); 
					
					// If letter guessed was in the chosen word
					if (word.indexOf(g) != -1) { 
						System.out.println("Correct");
						
						// Update displays printed out 
						System.out.println(game.getCurrentWord(g)); 
						game.updateIncorrectGuesses(g);
						game.showMan(game.getIncorrectGuesses().length());
						System.out.println("INCORRECT GUESSES: ");
						System.out.println(game.getIncorrectGuesses()); 
						
						// Checking if the user has guessed every letter in the array 
						if (game.getCurrentWord(g).indexOf('-') == -1) {
							System.out.println("You have guessed all the letters, so...");
							guessedWord = true; // Will exit the guessing loop 
							won = true; // Will allow the appropriate message to later be printed 
						}
					} else { // If letter guessed is not in the word 
						System.out.println(); 
						
						// Update displays printed out 
						System.out.println("Incorrect");
						System.out.println("There are no " + g + "s");
						System.out.println(game.getCurrentWord(g)); 
						game.updateIncorrectGuesses(g);
						game.showMan(game.getIncorrectGuesses().length());
						System.out.print("INCORRECT GUESSES: ");
						System.out.println(game.getIncorrectGuesses()); 
						
						// Display appropriate message if they used all their guesses 
						if (game.getIncorrectGuesses().length() == 10) 
							lost = true; 
							// Do not need to set guessedWord to false since the incorrectGuesses equaling 10 will already cause the loop to stop
					}
					
				}
				
				else { // User wants to enter a word (will run if user enters anything but a upper or lower cased L) 
					String w = getGuessW(); // Prompt the user to guess a word,, converts their word guess to upper case
					System.out.println(); 
					// Checking if the word is or is not the word of the game 
					if (w.equals(word)) {
						won = true;
					} else {
						lost = true;
					}
					guessedWord = true; // Will exit this current game no matter what 
					
				}
				
			}
			
			// Print appropriate message based on if the user won or lost 
			if (won == true) 
				System.out.println("YOU WON! The word was " + word + " :)");
			else if (lost == true)
				System.out.println("YOU LOST! The word we were looking for was " + word + " :(");
			
			// Ask the user if they want to play again 
			System.out.println();
			System.out.println("Would you like to play again? (y/n)");
			
			char playAgain = scan.nextLine().toUpperCase().charAt(0); // Only need to check the character they enter
			
			if (playAgain == 'Y') {
				System.out.println();
				System.out.println("Welcome to another round of Hangman!"); 
				playing = true; //Play another round
			} else if (playAgain == 'N') {
				System.out.println();
				System.out.println("Thank you for playing!"); 
				playing = false; //Don't play another round 
			}
		
		}
		
		scan.close(); 
		
	}
	
	/*
	 * Asks the player to choose to guess a letter or the entire word
	 */
	public static char getChoice() {
		// Prompt the user to enter their preference 
		System.out.println("Type L to guess a letter or W to guess a word: ");
		char choice = scan.nextLine().toUpperCase().charAt(0); 
		// .toUpperCase() to account for both upper and lower case letters 
		// .charAt(0) bc we only care about the first letter of their input 
		
		return choice; 
		
	}
	
	/*
	 * Prompts the user to guess a letter 
	 */
	public static char getGuessL() {
		System.out.println("Enter your guess (as a single letter): "); 
		char L = scan.nextLine().toUpperCase().charAt(0);
		// .toUpperCase() to account for both upper and lower case letters and our game word is stored as upper cased
		// .charAt(0) bc we only care about the first letter of their input 
		return L; 
	}
	
	/*
	 * Prompts the user to guess the entire word 
	 */
	public static String getGuessW() {
		System.out.println("Enter your guess (as a word): ");
		String W = scan.nextLine().toUpperCase().trim(); 
		// .toUpperCase() to account for both upper and lower case letters and our game word is stored as upper cased
		// .trim() to account for any spaces that the user might put at the end or beginning of their word guess 
		return W; 
	}

}
