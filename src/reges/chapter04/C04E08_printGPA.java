package reges.chapter04;

import java.util.Scanner;

public class C04E08_printGPA {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		printGPA(console);
	}

	public static void printGPA(Scanner console) {
		String studentName;
		int scoreTotal = 0;
		int numOfScores = 0;
		double grade = .0;
		
		System.out.print("Enter a students record: ");
		studentName = console.next();
		numOfScores = console.nextInt();
		
		for (int i = 0; i < numOfScores; ++i) {
			scoreTotal += console.nextInt();
		}
		grade = (double)scoreTotal/numOfScores;
		System.out.print(studentName + "'s grade is " + grade);
		
	}
}
