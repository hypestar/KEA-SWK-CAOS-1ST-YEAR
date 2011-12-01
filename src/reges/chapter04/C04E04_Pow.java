package reges.chapter04;

import java.util.Scanner;


public class C04E04_Pow {

	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int base, exp;
		
		System.out.print("Enter the base number : ");
		base = console.nextInt(); 
		System.out.print("Enter the exponent(non-negative) : ");
		exp = console.nextInt();
		System.out.print(base + "^" + exp + " = " + pow(base, exp));

	}
		
		
	
	
	public static double pow(int base, int exp){
		double result = 1;
		
		
		for (int i = 0; i < exp; i++ ){
			result *= base;
			
		}
		return result;
		
	}

}
