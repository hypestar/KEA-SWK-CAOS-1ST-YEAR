package reges.chapter06;

import java.io.*;
import java.util.*;

public class C06E03_NegativeSum {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner input = new Scanner(new File(
				"/home/hypestar/workspace/KEA 1.Sem/assets/chapter6/C06E03_NegativeSum"));
		negativeSum(input);
	}

	public static void negativeSum(Scanner input){
		int sum = 0;
		int totalNum = 0;
		
		while(input.hasNextInt()){
			sum+= input.nextInt();
			totalNum++;
			if (sum < 0){
				System.out.print("sum of "+ sum + " after " + totalNum + " steps");
				break;
			}
		}
		if (sum > 0){			
			System.out.print("no negative sum");
		}
		
	}
}
