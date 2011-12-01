package reges.projects;

import java.util.*;

public class C03P01_XmasTree {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int segments, height;


		System.out.print("Enter the number of segments and press enter: ");
		segments = console.nextInt();
		System.out.print("Enter the segment height and press enter: ");
		height = console.nextInt();
		printTree(segments, height);

	}

	public static void printTree(int segments, int height){

		int spaces = 0;
		int lastSegmentLine = 0;
		int treeWidth = (segments + height - 1) * 2 - 1;

		//Segment loop/////////////////////////////////////////////
		for (int currentSegment = 1; currentSegment <= segments; currentSegment++){

			lastSegmentLine = currentSegment + height - 1;
			//Line loop
			for(int currentLine = currentSegment;currentLine <= lastSegmentLine;currentLine++){

				System.out.print("\t");//Indention

				spaces = (treeWidth - (currentLine * 2 - 1) ) / 2;
				//space loop
				for (int space = 1; space <= spaces; space++){
					System.out.print(" ");
				}

				//asterix loop
				for (int asterix = 1; asterix <= (currentLine * 2 - 1); asterix++){
					System.out.print("*");
				}

				System.out.println();		
			}
		}

		//Tree trunk/////////////////////////////////////////////
		for (int line = 1; line <= 2; line++){

			System.out.print("\t");//Indention

			//space loop
			for (int space = 1; space <= treeWidth/2; space++){
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}

		//Tree foot/////////////////////////////////////////////
		System.out.print("\t");//Indention
		//space loop
		for (int space = 1; space <= (treeWidth-7)/2; space++){
			System.out.print(" ");
		}
		System.out.print("*******");


	}
}
