package reges.chapter06;

import java.io.*;
import java.util.*;

public class C06E07_WordWrap {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner input = new Scanner(new File(
				"/home/hypestar/workspace/KEA 1.Sem/assets/chapter6/C06E07_WordWrap"));

		wordWrap(input);

	}

	public static void wordWrap(Scanner input) {
		String line = "";
		while (input.hasNextLine()) {
			line = input.nextLine();
			if (line.length() < 60) {
				System.out.println(line);
			} else {
				while (line.length() > 60) {
					System.out.println(line.substring(0, 61));
					line = line.substring(61);
				}
				System.out.println(line);
			}
		}
	}

}
