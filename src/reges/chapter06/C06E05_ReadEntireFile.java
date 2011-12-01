package reges.chapter06;

import java.io.*;
import java.util.*;

public class C06E05_ReadEntireFile {

	public static void main(String[] args) throws FileNotFoundException {
				
		Scanner input = new Scanner(new File(
				"/home/hypestar/workspace/KEA 1.Sem/assets/chapter6/C06E05_ReadEntireFile"));

		System.out.print(readEntireFile(input));
		
		
		
	}
	
	public static String readEntireFile(Scanner input){
		String contentOfFile = "";
		while(input.hasNextLine()){
			contentOfFile += input.nextLine() + "\n";
		}
		return contentOfFile;
	}

}
