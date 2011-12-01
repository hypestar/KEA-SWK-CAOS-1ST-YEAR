package reges.chapter03;

import java.util.*;

public class C03E10_Scientific {

	public static void main(String[] args) {
		double base;
		int exp;
		Scanner console = new Scanner(System.in);
		
		System.out.print("Enter the base number (double) : ");
		base = console.nextDouble(); 
		System.out.print("Enter the exponent (int) : ");
		exp = console.nextInt(); 
		System.out.print(base + "^" + exp + " = " + scientific(base, exp));
	}
	
	public static double scientific(double base, int exp){
		double result = 1; 
		
		for (int i = 1; i <= Math.abs(exp); i++){
			result *= 10;
		}
		
		if (exp < 1){ // if it's negative exponent
			result = 1/result;
		}
			
		
		result = result * base;
		return result;
		
	}

}
