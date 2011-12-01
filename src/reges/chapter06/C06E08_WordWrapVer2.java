package reges.chapter06;

import java.io.*;
import java.util.*;

public class C06E08_WordWrapVer2 {

	public static final int LINEWIDTH = 60; 

	public static void main(String[] args) throws FileNotFoundException {

		
		Scanner input = new Scanner(new File("/home/hypestar/workspace/KEA 1.Sem/assets/chapter6/C06E08_WordWrapVer2"));
		wordWrap(input);
	
	}

	public static void wordWrap(Scanner input) throws FileNotFoundException {
		StringBuffer wrapped = new StringBuffer();
		String line = "";
		while (input.hasNextLine()) {
			line = input.nextLine();
			if (line.length() < LINEWIDTH) {
				wrapped.append(line + "\n");
			} else {
				while (line.length() > LINEWIDTH) {
					wrapped.append(line.substring(0, LINEWIDTH+1) + "\n");
					line = line.substring(LINEWIDTH+1);
				}
			}
		}
		input.close();
		PrintStream output = new PrintStream(new File("/home/hypestar/workspace/KEA 1.Sem/assets/chapter6/C06E08_WordWrapVer2"));
		output.print(wrapped.toString());
	}

}
