package reges.chapter04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class C04E12_GetGrade {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.#");
		Scanner console = new Scanner(System.in);
		int score;
		System.out.print("Enter the students score (0-100) : ");
		score = console.nextInt();
		System.out.print("The score equals the grade " + df.format(getGrade(score)));

	}
	
	public static double getGrade(int score){
		double grade = .0;
		
		if (score < 0){
			throw new IllegalArgumentException("score is less than zero. score = " + score);
		}else if (score >= 0 && score <= 59){
			grade = 0.0;
		}else if(score >= 60 && score <= 62){
			grade = 0.7;
		}else if (score >= 63 && score <= 95){
			grade = 0.1 * score - 5.5;  // f(score) = grade  -  f(score) = 0.1 * score - 5.5
		}else if (score >= 96 & score <= 100){
			grade = 4.0;
		}else if (score >= 101){
			throw new IllegalArgumentException("score larger than 100. score = " + score);
		}
		
		return grade;
	}

}
