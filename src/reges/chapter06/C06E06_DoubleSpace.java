package reges.chapter06;

import java.io.*;
import java.util.*;

public class C06E06_DoubleSpace {

	public static void main(String[] args) throws FileNotFoundException {
				
		Scanner input = new Scanner(new File(
				"/home/hypestar/workspace/KEA 1.Sem/assets/chapter6/C06E06_DoubleSpace-INPUT"));

		PrintStream output = new PrintStream("/home/hypestar/workspace/KEA 1.Sem/assets/chapter6/C06E06_DoubleSpace-OUTPUT");
		
		doubleSpace(input, output);
		
		
		
	}
	
	public static void doubleSpace(Scanner input, PrintStream output){
		String doubleSpaced = "";
		
		while(input.hasNextLine()){
			doubleSpaced += input.nextLine() + "\n\n";
			
		}
		output.print(doubleSpaced);
	}

}
