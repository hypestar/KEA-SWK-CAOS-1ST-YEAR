package reges.chapter05;

import java.util.Random;

public class C05E06_MakeGuesses {

	public static void main(String[] args) {
		makeGuesses();
	}

	public static void makeGuesses() {
		Random rand = new Random();
		int guess;

		do {
			guess = rand.nextInt(50) + 1;
			System.out.println("guess = " + guess);
		} while (guess < 48);

	}

}
