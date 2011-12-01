package reges.projects;

import java.util.ArrayList;
import java.util.Random;

public class GuessGame {
	private int guess;
	private int secretNum;
	private ArrayList<Integer> wrongGuesses = new ArrayList<Integer>();
	private int highestNum;
	private int lowestNum = 1;
	private boolean wrongGuess = true;



	GuessGame(int highestNum){
		this.highestNum = highestNum;


	}

	public boolean guessIsWrong(){
		return this.wrongGuess;
	}

	public void evalGuess(){
		if (guess != secretNum){
			wrongGuesses.add(new Integer(guess)); // remember wrong guess
		}else if (guess == secretNum) {
			wrongGuess = false;
		}
	}

	public void setSecretNum(int secretNum){
		this.secretNum = secretNum;
	}

	public void setHighestNum(int highestNum){
		this.highestNum = highestNum;
	}

	public void guess(){
		Random ranGen = new Random();

		while (true){
			guess = ranGen.nextInt(highestNum) + 1;
			if (isAValidGuess()){
				break;
			}	
		}

	}

	public void printGuess(){
		System.out.println("Computer: My guess is " + guess);		
	}


	public void hint(){
		if (guess < secretNum) {
			lowestNum = guess + 1; 	
		}else if (guess > secretNum) {
			highestNum = guess -1;
		}
	}

	public void printHint(){
		if (guess < secretNum) {
			System.out.println("HINT: the number is higher than " + guess);
		}else if (guess > secretNum) {
			System.out.println("HINT: the number is lower than " + guess);
		}
	}

	private boolean isAValidGuess(){

		if (!(guess <= lowestNum && guess >= highestNum)){
			return false; // the guess is not in range
		}


		if(!wrongGuesses.isEmpty()){
			for (int i = 0; i < wrongGuesses.size();i++){
				if (guess == wrongGuesses.get(i).intValue()){
					return false; // the guess is a dupe
				}
			}
		}

		return true;
	}

}