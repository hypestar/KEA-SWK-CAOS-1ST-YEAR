package reges.projects;

import java.util.ArrayList;
import java.util.Scanner;

public class C05P04 {

	public static void main(String[] args) {

		GuessGame gg = new GuessGame(1000);
		gg.setSecretNum(1000);


		while(gg.guessIsWrong()){
			gg.guess();
			gg.evalGuess();

			gg.printGuess();
			if (gg.guessIsWrong()){
				gg.hint();
				gg.printHint();
			}
		}


	}



}

