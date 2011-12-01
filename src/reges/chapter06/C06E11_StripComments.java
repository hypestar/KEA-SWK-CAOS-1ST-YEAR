package reges.chapter06;

import java.io.*;
import java.util.*;

public class C06E11_StripComments {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner input = new Scanner(new File(
				"/home/hypestar/workspace/KEA 1.Sem/assets/chapter6/C06E11_StripComments.java"));

		stripComments(input);

	}

	public static void stripComments(Scanner input) {
		String javaSourceFile = "";
		while (input.hasNextLine()) {
			javaSourceFile += input.nextLine() + "\n";
		}
		
		javaSourceFile = javaSourceFile.replaceAll("(/\\*([^*]|[\\r\\n]|(\\*+([^*/]|[\\r\\n])))*\\*+/)|(//.*)", "p"); //remove all comments
		System.out.print(javaSourceFile);
		
	}

}
