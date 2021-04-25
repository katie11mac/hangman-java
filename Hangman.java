//I have neither given nor received any unauthorized aid on this assignment. 

import java.util.Random;

public class Hangman {

	private int numwords = 10;
	private String[] words = new String[numwords];
	private String gameWord;
	private String dispWord = "-------";
	private char[] dispArr = dispWord.toCharArray();
	
	private String incorrectGuesses = ""; // Will hold the incorrect guesses of the game 
	
	
	/*
	 * Method to display the hangman given the number of body parts to show
	 * Player gets at most 10 turns. 
	 */
	public void showMan(int numParts)
	{

		if (numParts == 0){	
			System.out.println("________");
			System.out.println("|       |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("____");
		}
		if (numParts == 1){	
			System.out.println("________");
			System.out.println("|       |");
			System.out.println("|      ____");
			System.out.println("|     / .. \\");
			System.out.println("|    <   .  >");
			System.out.println("|     \\__^_/");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("____");
		}
		if (numParts == 2){	
			System.out.println("________");
			System.out.println("|       |");
			System.out.println("|      ____");
			System.out.println("|     / .. \\");
			System.out.println("|    <   .  >");
			System.out.println("|     \\__^_/");
			System.out.println("|        |");
			System.out.println("|        |");
			System.out.println("|        |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("____");
		}

		if (numParts == 3){	
			System.out.println("________");
			System.out.println("|       |");
			System.out.println("|      ____");
			System.out.println("|     / .. \\");
			System.out.println("|    <   .  >");
			System.out.println("|     \\__^_/");
			System.out.println("|        |");
			System.out.println("|      __|");
			System.out.println("|        |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("____");
		}
		if (numParts == 4){	
			System.out.println("________");
			System.out.println("|       |");
			System.out.println("|      ____");
			System.out.println("|     / .. \\");
			System.out.println("|    <   .  >");
			System.out.println("|     \\__^_/");
			System.out.println("|        |");
			System.out.println("|     o__|");
			System.out.println("|     	 |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("____");
			}
		if (numParts == 5){
			
			System.out.println("________");
			System.out.println("|       |");
			System.out.println("|      ____");
			System.out.println("|     / .. \\");
			System.out.println("|    <   .  >");
			System.out.println("|     \\__^_/");
			System.out.println("|        |");
			System.out.println("|     o__|__");
			System.out.println("|     	 |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("____");
			}
		if (numParts == 6){
			
			System.out.println("________");
			System.out.println("|       |");
			System.out.println("|      ____");
			System.out.println("|     / .. \\");
			System.out.println("|    <   .  >");
			System.out.println("|     \\__^_/");
			System.out.println("|        |");
			System.out.println("|     o__|__o");
			System.out.println("|     	 |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("____");
			}
		if (numParts == 7){
			
			System.out.println("________");
			System.out.println("|       |");
			System.out.println("|      ____");
			System.out.println("|     / .. \\");
			System.out.println("|    <   .  >");
			System.out.println("|     \\__^_/");
			System.out.println("|        |");
			System.out.println("|     o__|__o");
			System.out.println("|     	 |");
			System.out.println("|       /");
			System.out.println("|      /  ");
			System.out.println("|");
			System.out.println("|");
			System.out.println("____");
			}
			
		if (numParts == 8){
			
			System.out.println("________");
			System.out.println("|       |");
			System.out.println("|      ____");
			System.out.println("|     / .. \\");
			System.out.println("|    <   .  >");
			System.out.println("|     \\__^_/");
			System.out.println("|        |");
			System.out.println("|     o__|__o");
			System.out.println("|     	 |");
			System.out.println("|       / \\");
			System.out.println("|      /   \\");
			System.out.println("|");
			System.out.println("|");
			System.out.println("____");
			}
			
		if (numParts == 9){
				
			System.out.println("________");
			System.out.println("|       |");
			System.out.println("|      ____");
			System.out.println("|     / .. \\");
			System.out.println("|    <   .  >");
			System.out.println("|     \\__^_/");
			System.out.println("|        |");
			System.out.println("|     o__|__o");
			System.out.println("|     	 |");
			System.out.println("|       / \\");
			System.out.println("|      /   \\");
			System.out.println("|    O/    ");
			System.out.println("|");
			System.out.println("____");
		
		}
		if (numParts == 10){
			
		System.out.println("________");
		System.out.println("|       |");
		System.out.println("|      ____");
		System.out.println("|     / .. \\");
		System.out.println("|    <   .  >");
		System.out.println("|     \\__^_/");
		System.out.println("|        |");
		System.out.println("|     o__|__o");
		System.out.println("|     	 |");
		System.out.println("|       / \\");
		System.out.println("|      /   \\");
		System.out.println("|    O/     \\O");
		System.out.println("|");
		System.out.println("____");
		}
		
	}
	
	/*
	 * Sets the list of candidate words for the player to guess
	 */
	public void setWords()
	{
		
		words[0] = "notions";
		words[1] = "measure";
		words[2] = "product";
		words[3] = "foliage";
		words[4] = "garbage";
		words[5] = "minutes";
		words[6] = "chowder";
		words[7] = "recital";
		words[8] = "concoct";
		words[9] = "brownie";		
	}
	
	/*
	 * Returns the number of words to choose from
	 */
	public int getNumWords()
	{
		return numwords;
	}

	/*
	 * Returns the array of words
	 */
	public String[] getWords()
	{
		return words;
	}
	
	
	/*
	 * Retrieves and returns a random word from the list of words (words array) for the player to guess
	 */
	public String selectGameWord() {
		Random random = new Random(); 
		gameWord = words[random.nextInt(words.length)].toUpperCase();
		// .nextInt is inclusive of zero and exclusive of the parameter 
		// .toUpperCase() bc it is specified that the word should print in all upper case letters 
		return gameWord;
	}
	
	/*
	 * Returns the word with each letter that has been correctly guessed or a dash for each letter 
	 * that has not yet been guessed. Assumes that the guess has already been upper cased. 
	 */
	public String getCurrentWord(char guess) {
		
		// See if the selected word contains the guess inputed by the user by checking what's at each index 
		for (int i = 0; i < gameWord.length(); i++) {
			// Update the display of the word based on user's guess
			if (gameWord.charAt(i) == guess)
				dispArr[i] = guess;
			// Do not need to call the .toUpperCase() here bc the game word was converted to all upper case when it was chosen
			// and we are assuming that the guess has already been upper cased through one of the methods in the driver class
		}
		
		// Update dispWord String 
		dispWord = new String(dispArr);
		
		return dispWord; 
		// Returning a String seemed to make it easier when checking if the player had guessed all the letters in the word 
		
	}
	
	/*
	 * Returns the incorrect guesses so far
	 */
	public String getIncorrectGuesses() {
		return incorrectGuesses;
	}
	

	/*
	 * Updates the incorrect guesses so far 
	 * Assume that guess is already upper cased
	 */
	public void updateIncorrectGuesses(char guess) {

		// Check if the user's guess is not in the selected game word 
		if (gameWord.indexOf(guess) == -1) {
			
			// If there are no incorrect guesses yet add their guess
			if (incorrectGuesses.isEmpty() == true)
				incorrectGuesses += guess; 
			
			// If their guess is not already documented, then add it 
			else if (incorrectGuesses.indexOf(guess) == -1) {
				incorrectGuesses += guess; 
			}
		}
				
		
	}
	
}
