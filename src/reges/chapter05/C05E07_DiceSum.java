package reges.chapter05;

import java.util.Random;
import java.util.Scanner;

public class C05E07_DiceSum {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		diceSum(console);
	}

	public static void diceSum(Scanner console){
		System.out.print("Desired dice sum: ");
		int sum = console.nextInt();
		int dice1, dice2, diceSum;
		int totalGuess = 0;
		Random rand = new Random();
		
		do {
			dice1 = rand.nextInt(6)+1;
			dice2 = rand.nextInt(6)+1;
			diceSum = dice1 + dice2;
			System.out.println(dice1 + " and " + dice2 + " = " + diceSum);
			totalGuess++;
			
		} while (!(sum == diceSum));
		
		System.out.println("total guesses = " + totalGuess);
		
		
	
}
}
