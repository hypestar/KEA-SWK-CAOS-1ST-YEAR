package reges.chapter04;

import java.util.Scanner;

public class C04E02_Rep1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s;
		int rep;
		
		Scanner console = new Scanner(System.in);
		System.out.print("Enter a string : ");
		s = console.nextLine();
    	System.out.print("Enter the number of repetitions :");
    	rep = console.nextInt();
		System.out.print(rep1(s, rep));

	}

	public static String rep1(String s, int rep){
		String orgString = new String(s);
		
		
		for (int i = 1; i < rep; i++){
			s = s + orgString;
		}
		return s;	
	}
}
