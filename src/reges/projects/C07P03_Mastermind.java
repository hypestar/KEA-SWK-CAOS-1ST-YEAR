package reges.projects;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class C07P03_Mastermind {

	public static final int CODELENGTH = 4;
	public static int[] secretCode = new int[CODELENGTH];
	public static int[] guess = new int[CODELENGTH];
	public static boolean quit = false;
	public static boolean correctCode = false;
	public static int numOfGuesses = 0;
	public static ArrayList<Integer> statistics = new ArrayList<Integer>();

	public static void main(String[] args) {

		setNewSecretCode();
		//printSecretCode();
		System.out
		.println("enter a 4 digit number where XXXX where X is Between 1-5");
		System.out.println("enter q to quit.");

		do {
			newGuess();
			printGuess();
			checkGuess();

			if (correctCode) {
				System.out
				.println("Congratulations!! You've decrypted my secret code in " + numOfGuesses + " guesses");
				statistics.add(new Integer(numOfGuesses));
				numOfGuesses = 0;
				correctCode = false;
				setNewSecretCode();
				//printSecretCode();
			}

		} while (quit == false);
		printStatistics();

	}

	private static void printStatistics() {
		int numOfGames = statistics.size();
		int totalGuesses = 0;
		DecimalFormat df = new DecimalFormat("#.##");

		Collections.sort(statistics);//sort to find max and min
		int min = statistics.get(0).intValue();
		int max = statistics.get(numOfGames-1).intValue();

		if (numOfGames < 1)return; // more than one game is need to make statistics ;) 

		for (int i = 0;i < numOfGames;i++){
			totalGuesses += statistics.get(i).intValue();
		}
		
		double average = (double)totalGuesses/(double)numOfGames;

		System.out.println("You have decrypted my code " + numOfGames + " times.");
		System.out.println("Average \t= " + df.format(average) + " guesses");
		System.out.println("Best \t\t= " + min + " guesses");
		System.out.println("Worst \t\t= " + max + " guesses");
	}	
	// create an array with 4 random digits between 1-5
	public static void setNewSecretCode() {
		Random rand = new Random();

		for (int i = 0; i < 4; i++) {
			secretCode[i] = rand.nextInt(5) + 1;
		}

	}

	public static void newGuess() {
		Scanner console = new Scanner(System.in);

		String fourDigits = new String(console.next());
		// if input is q or Q then quit
		if (fourDigits.equalsIgnoreCase("q")){
			quit = true;
			return;
		}

		for (int i = 0; i < guess.length; i++) {
			guess[i] = Character.getNumericValue(fourDigits.charAt(i));
		}
		numOfGuesses++;
	}
	public static void checkGuess() {
		int[] copySecretCode = new int[CODELENGTH];

		for (int i = 0; i < CODELENGTH; i++) {
			copySecretCode[i] = secretCode[i];
		}


		//check for 100% correct digits
		int correctDigits = 0;
		for (int i = 0; i < CODELENGTH; i++) {
			if (guess[i] != 0 && guess[i] == copySecretCode[i]) {
				copySecretCode[i] = 0;
				guess[i] = 0;
				correctDigits++;
				System.out.print("\u2219");
			}
		}
		if (correctDigits == 4)correctCode = true;

		//Check for correct digits at the wrong positions
		for (int i = 0; i < CODELENGTH; i++) {
			for (int j = 0; j < CODELENGTH; j++) {
				if (guess[i] != 0 && guess[i] == copySecretCode[j]) {
					copySecretCode[j] = 0;
					guess[i] = 0;
					System.out.print("\u2218");
					break;
				}
			}
		}
		System.out.println();
	}
	public static void printSecretCode() {
		for (int n : secretCode) {
			System.out.print(n);
		}
	}
	public static void printGuess(){
		for (int n : guess) {
			System.out.print(n);
		}
	}
}
