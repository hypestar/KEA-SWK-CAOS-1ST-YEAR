package reges.chapter06;

import java.io.*;
import java.util.*;

public class C06E12_PrintDuplicates {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner input = new Scanner(new File(
		"/home/hypestar/workspace/KEA 1.Sem/assets/chapter6/C06E12_PrintDuplicates"));

		printDuplicates(input);

	}

	public static void printDuplicates(Scanner input) {
		int wordCount = 1;
		String currentWord = "";
		String nextWord = "";
		Scanner line;

		while (input.hasNextLine()) {

			line = new Scanner(input.nextLine());
			currentWord = line.next();

			while (line.hasNext()) {
				nextWord = line.next();

				if (currentWord.equals(nextWord)) {
					wordCount++;
				}

				if (!(currentWord.equals(nextWord))) {
					if (wordCount > 1) {
						System.out.print(currentWord + "*" + wordCount + " ");
					}
					wordCount = 1;
					currentWord = nextWord;
				}
			}

			if (wordCount > 1) {
				System.out.print(currentWord + "*" + wordCount + " ");
				wordCount = 1;
			}
			System.out.println();
		}
	}
}
