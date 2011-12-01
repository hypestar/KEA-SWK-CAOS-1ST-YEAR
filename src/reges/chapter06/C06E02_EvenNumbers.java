package reges.chapter06;

import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

public class C06E02_EvenNumbers {

	public static void main(String[] args) throws FileNotFoundException {
		int sum = 0;
		int numOfEven = 0;
		int totalNum = 0;
		int currentNum;
		DecimalFormat df = new DecimalFormat("#.##");
		
		Scanner input = new Scanner(new File(
				"/home/hypestar/workspace/KEA 1.Sem/assets/chapter6/C06E02_EvenNumbers"));

		while (input.hasNext()) {
			currentNum = input.nextInt();
			if (currentNum % 2 == 0) {
				numOfEven++;
			}
			totalNum++;
			sum += currentNum;
		}
		
		double evenPercent = (double)numOfEven / (double)totalNum * 100.0;
		System.out.println(totalNum + " numbers, sum = " + sum);
	System.out.print(numOfEven + " evens (" + df.format(evenPercent) + "%)");
		
	}

}
