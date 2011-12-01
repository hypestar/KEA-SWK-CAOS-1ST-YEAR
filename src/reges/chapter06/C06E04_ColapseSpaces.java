package reges.chapter06;

import java.io.*;
import java.util.*;

public class C06E04_ColapseSpaces {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner input = new Scanner(new File(
				"/home/hypestar/workspace/KEA 1.Sem/assets/chapter6/C06E04_ColapseSpaces"));
		collapseSpaces(input);
	}

	public static void collapseSpaces(Scanner input){
		Scanner line;
		
		while(input.hasNextLine()){
			line = new Scanner(input.nextLine());
			while(line.hasNext()){
				System.out.print(line.next() + " ");	
			}
			System.out.println();
		}
		
	}
}
