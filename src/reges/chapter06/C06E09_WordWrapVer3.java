package reges.chapter06;

import java.io.*;
import java.util.*;

public class C06E09_WordWrapVer3 {

	public static final int LINEWIDTH = 60;

	public static void main(String[] args) throws FileNotFoundException {

		Scanner input = new Scanner(new File(
		"/home/hypestar/workspace/KEA 1.Sem/assets/chapter6/C06E09_WordWrapVer3"));
		wordWrap(input);

	}

	public static void wordWrap(Scanner input) throws FileNotFoundException {
		StringBuffer wrappedFile = new StringBuffer();
		StringBuffer wrapLine = new StringBuffer();
		Scanner line;
		String nextWord = "";

		while (input.hasNextLine()) {
			line = new Scanner(input.nextLine());

			while (line.hasNext()){

				nextWord = line.next();


				if(wrapLine.length() + 1 + nextWord.length() < LINEWIDTH){
					wrapLine.append(nextWord + " ");
				}else {
					wrappedFile.append(wrapLine + "\n");
					wrapLine.setLength(0);//clear the buffer
					wrapLine.append(nextWord + " ");
				}
			}
		}
		input.close();
		PrintStream output = new PrintStream(new File("/home/hypestar/workspace/KEA 1.Sem/assets/chapter6/C06E09_WordWrapVer3-TEST"));
		output.print(wrappedFile.toString());
	}
}

